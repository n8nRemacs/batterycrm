package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class xm implements rg {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f391770a = 0;

    static {
        new xm(com.yandex.mobile.ads.embedded.guava.collect.p.i());
    }

    public xm(List<vm> list) {
        com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
    }

    private static final xm a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new xm(parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : sg.a(vm.f390911s, parcelableArrayList));
    }
}
