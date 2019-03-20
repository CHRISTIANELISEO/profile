package com.prof.com.profile.com.prof.com.profile.impl;

import com.prof.com.profile.com.prof.com.profile.dto.ProfileUserDto;

import java.util.List;

public interface InterfaceProf {
    List<String> getlist();

    int savedata(ProfileUserDto prof);
}
