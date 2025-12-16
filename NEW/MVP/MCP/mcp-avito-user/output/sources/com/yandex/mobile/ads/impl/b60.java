package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class b60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39382z f383801a;

    public static class a implements InterfaceC39306b0 {
        private a() {
        }

        public /* synthetic */ a(int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
        public final void onReturnedToApplication() {
        }
    }

    public b60(@j.N Context context, @j.N im imVar) {
        n2 n2Var = new n2(y6.f391940g);
        lm lmVarA = nm.a(imVar);
        this.f383801a = new C39382z(context, n2Var, new a(0), lmVarA != null ? lmVarA.a() : null);
    }

    public final void a() {
        this.f383801a.e();
    }
}
