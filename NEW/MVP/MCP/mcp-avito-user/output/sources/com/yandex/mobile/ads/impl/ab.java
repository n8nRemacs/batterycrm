package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.MobileAds;

/* loaded from: classes8.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final pa0 f383453a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final cv f383454b;

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f383456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f383456b = context;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ab.this.b(this.f383456b);
            return kotlin.G0.f406611a;
        }
    }

    public ab(@Y61.k na0 na0Var, @Y61.k pa0 pa0Var) {
        this.f383453a = pa0Var;
        this.f383454b = new cv(na0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        this.f383453a.getClass();
        if (pa0.b(context)) {
            MobileAds.initialize(context, new L0(6));
        }
    }

    public final void a(@Y61.k Context context) {
        v11 v11VarA = q21.b().a(context);
        if (v11VarA != null && v11VarA.z()) {
            this.f383454b.a(new a(context));
        } else {
            b(context);
        }
    }
}
