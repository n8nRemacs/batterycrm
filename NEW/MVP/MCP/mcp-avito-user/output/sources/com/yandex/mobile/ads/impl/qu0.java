package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class qu0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39376x f389297a = new C39376x();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nu0 f389298b = new nu0();

    public final boolean a(@j.N Context context, @j.N List<mu0> list) {
        this.f389297a.getClass();
        int i12 = 0;
        while (context instanceof ContextWrapper) {
            int i13 = i12 + 1;
            if (i12 >= 10) {
                break;
            }
            if (context instanceof Activity) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i12 = i13;
        }
        context = null;
        if (context != null) {
            Iterator<mu0> it = list.iterator();
            while (it.hasNext()) {
                if (a(context, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(@j.N Context context, @j.N mu0 mu0Var) {
        try {
            this.f389298b.getClass();
            context.startActivity(nu0.a(mu0Var));
            return true;
        } catch (Exception unused) {
            mu0Var.getClass();
            return false;
        }
    }
}
