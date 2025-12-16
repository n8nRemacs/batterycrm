package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tk1;

/* loaded from: classes8.dex */
public final class jf1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final Object f386850b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile jf1 f386851c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bz0 f386852a;

    private jf1(@j.N bz0 bz0Var) {
        this.f386852a = bz0Var;
    }

    public final void a(@j.N Context context, @j.N ne1 ne1Var, @j.N cd1 cd1Var, @j.N fm1 fm1Var) {
        this.f386852a.a(new ud1(context, ne1Var.k(), new tk1.b(fm1Var), ne1Var, new nm1(cd1Var)));
    }

    @j.N
    public static jf1 a(@j.N Context context) {
        if (f386851c == null) {
            synchronized (f386850b) {
                try {
                    if (f386851c == null) {
                        f386851c = new jf1(vm1.a(context, 1));
                    }
                } finally {
                }
            }
        }
        return f386851c;
    }

    public final void a(@j.N Context context, @j.N n2 n2Var, @j.N jk1 jk1Var, @j.N Object obj, @j.N mk1 mk1Var) {
        this.f386852a.a(new lk1().a(context, n2Var, jk1Var, obj, mk1Var));
    }

    public final void a(@j.N Context context, @j.N n2 n2Var, @j.N md1 md1Var, @j.N Object obj, @j.N fd1 fd1Var) {
        this.f386852a.a(new nd1().a(context, n2Var, md1Var, obj, fd1Var));
    }
}
