package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class tg0 extends ah0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f390203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final je1 f390204b;

    public /* synthetic */ tg0() {
        this(new je1());
    }

    @Override // com.yandex.mobile.ads.impl.ah0
    public final void a(@Y61.k Y41.l<? super g70, kotlin.G0> lVar) {
        try {
            je1 je1Var = this.f390204b;
            com.yandex.div.core.Z.f367267b.getClass();
            je1Var.getClass();
            ie1 ie1VarA = je1.a("25.2.0");
            this.f390204b.getClass();
            ie1 ie1VarA2 = je1.a("25.2.0");
            Integer numValueOf = ie1VarA2 != null ? Integer.valueOf(ie1VarA2.a()) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (ie1VarA == null || !(this.f390203a || ie1VarA.a() == iIntValue)) {
                    lVar.invoke(new g70(String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{numValueOf, ie1VarA != null ? Integer.valueOf(ie1VarA.a()) : null}, 2))));
                    throw null;
                }
            }
        } catch (NoClassDefFoundError unused) {
            lVar.invoke(new g70(String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0))));
            throw null;
        }
    }

    public tg0(@Y61.k je1 je1Var) {
        this.f390203a = false;
        this.f390204b = je1Var;
    }
}
