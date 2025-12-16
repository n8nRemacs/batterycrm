package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39362s0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashSet f389714a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final HashSet f389715b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private int f389716c;

    public C39362s0(@j.N Context context) {
        this.f389716c = a(context);
    }

    public final void a(@j.N Configuration configuration) {
        int i12 = configuration.orientation;
        if (i12 != this.f389716c) {
            Iterator it = this.f389714a.iterator();
            while (it.hasNext()) {
                ((InterfaceC39383z0) it.next()).a();
            }
            this.f389716c = i12;
        }
    }

    public final void b() {
        Iterator it = this.f389715b.iterator();
        while (it.hasNext()) {
            ((InterfaceC39365t0) it.next()).a();
        }
    }

    public final void b(@j.N InterfaceC39365t0 interfaceC39365t0) {
        this.f389715b.remove(interfaceC39365t0);
    }

    public final void a() {
        Iterator it = this.f389715b.iterator();
        while (it.hasNext()) {
            ((InterfaceC39365t0) it.next()).b();
        }
    }

    public final void a(@j.N InterfaceC39365t0 interfaceC39365t0) {
        this.f389715b.add(interfaceC39365t0);
    }

    private static int a(@j.N Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
