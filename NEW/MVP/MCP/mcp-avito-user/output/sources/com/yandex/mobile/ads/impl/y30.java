package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.xc1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class y30 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final List<xc1.a> f391903b = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final z30 f391904a = new z30();

    public class a extends ArrayList<xc1.a> {
        public a() {
            add(xc1.a.f391685b);
            add(xc1.a.f391686c);
            add(xc1.a.f391691h);
        }
    }

    public final void a(@j.N FrameLayout frameLayout) {
        this.f391904a.a(frameLayout);
    }

    public final void a(@j.N xc1 xc1Var, @j.N FrameLayout frameLayout) {
        this.f391904a.a(frameLayout, xc1Var, !((ArrayList) f391903b).contains(xc1Var.e()));
    }
}
