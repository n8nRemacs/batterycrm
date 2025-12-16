package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class ce0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f384243a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final mj1 f384244b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final lj1 f384245c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Executor f384246d;

    public ce0(@Y61.k n2 n2Var, @Y61.k mj1 mj1Var, @Y61.k lj1 lj1Var, @Y61.k Executor executor) {
        this.f384243a = n2Var;
        this.f384244b = mj1Var;
        this.f384245c = lj1Var;
        this.f384246d = executor;
    }

    public final void a(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k String str) {
        String strC = this.f384243a.c();
        if (strC != null) {
            int iL2 = this.f384243a.l();
            jj1 jj1VarA = nj1.a(customizableMediaView, str);
            this.f384246d.execute(new H0(this, new oj1(iL2, strC), jj1VarA, 1));
        }
    }

    public /* synthetic */ ce0(n2 n2Var, mj1 mj1Var, lj1 lj1Var) {
        this(n2Var, mj1Var, lj1Var, Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ce0 ce0Var, oj1 oj1Var, jj1 jj1Var) {
        ce0Var.f384244b.a(oj1Var, jj1Var);
        ce0Var.f384245c.a(jj1Var, ce0Var.f384243a);
    }

    public ce0(@Y61.k Context context, @Y61.k n2 n2Var) {
        this(n2Var, new mj1(context), new lj1(context));
    }
}
