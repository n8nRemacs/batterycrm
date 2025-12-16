package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class tk implements vp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final vp[] f390215a;

    public tk(@j.N vp... vpVarArr) {
        this.f390215a = vpVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.vp
    public final boolean a(@j.N Context context) {
        for (vp vpVar : this.f390215a) {
            if (!vpVar.a(context)) {
                return false;
            }
        }
        return true;
    }
}
