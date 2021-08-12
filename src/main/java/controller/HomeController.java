package controller;

import models.HocVien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CRUDHocVien;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    CRUDHocVien crudHocVien = new CRUDHocVien();

    @RequestMapping("/show")
    public String home(HttpServletRequest request) {
        request.setAttribute("list", crudHocVien.list);
        return "/WEB-INF/Show.jsp";
    }

    @GetMapping("/create")
    public String createShow(HttpServletRequest request) {
        return "/WEB-INF/Create.jsp";
    }

    @GetMapping("/edit")
    public String editShow(HttpServletRequest request) {
        int index = Integer.parseInt(request.getParameter("index"));
        request.setAttribute("hocvien", crudHocVien.list.get(index));
        return "/WEB-INF/Edit.jsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("index") int index) {
//        int index = Integer.parseInt(request.getParameter("index"));
//        crudHocVien.delete(index);
//        request.setAttribute("list", crudHocVien.list);
        crudHocVien.delete(index);
        return "redirect:/show";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute HocVien hocVien) {
        crudHocVien.add(hocVien);
        return "redirect:/show";
    }
//    public String create(HttpServletRequest request) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String ten = request.getParameter("ten");
//        String ngaySinh = request.getParameter("ngaysinh");
//        String diaChi = request.getParameter("diachi");
//        String sdt = request.getParameter("sdt");
//        String email = request.getParameter("email");
//        int phongHoc = Integer.parseInt(request.getParameter("phonghoc"));
//        HocVien hocVien = new HocVien(id, ten, ngaySinh, diaChi, sdt, email, phongHoc);
//        crudHocVien.add(hocVien);
//        request.setAttribute("list", crudHocVien.list);
//
//        return "/WEB-INF/Show.jsp";
//    }

    @PostMapping("/edit")
//    public String edit(HttpServletRequest request) {
//        int index = Integer.parseInt(request.getParameter("index"));
//        int id = Integer.parseInt(request.getParameter("Id"));
//        String ten = request.getParameter("name");
//        String ngaySinh = request.getParameter("dayeOfBirth");
//        String diaChi = request.getParameter("address");
//        String sdt = request.getParameter("sdt");
//        String email = request.getParameter("email");
//        int phongHoc = Integer.parseInt(request.getParameter("phongHoc"));
//        HocVien hocVien = new HocVien(id, ten, ngaySinh, diaChi, sdt, email, phongHoc);
//        crudHocVien.edit(index, hocVien);
//        request.setAttribute("list", crudHocVien.list);
//        return "/WEB-INF/Show.jsp";
////    }

    public String edit(@ModelAttribute HocVien hocVien, @RequestParam("index") int index) {
//        ModelAndView modelAndView = new ModelAndView("/WEB-INF/Show.jsp");
//        crudHocVien.edit(index, hocVien);
//        modelAndView.addObject("list", crudHocVien.list);
//        return modelAndView;
//    }
        crudHocVien.edit(index, hocVien);
        return "redirect:/show";
    }
}
