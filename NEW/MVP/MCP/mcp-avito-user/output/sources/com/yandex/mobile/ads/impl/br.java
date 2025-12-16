package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class br {
    @j.P
    public static vq a(@j.N com.yandex.mobile.ads.nativeads.u uVar) {
        List<vq> listC = uVar.c();
        if (listC == null) {
            return null;
        }
        for (vq vqVar : listC) {
            if (xp.b(3).equals(vqVar.c())) {
                return vqVar;
            }
        }
        return null;
    }
}
