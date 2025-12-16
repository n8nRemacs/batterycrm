package com.avito.android.user_advert.advert;

import com.avito.android.util.P2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class V implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f308437c;

    public /* synthetic */ V(Object obj, int i12) {
        this.f308436b = i12;
        this.f308437c = obj;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f308436b) {
            case 0:
                return new P2.a(((C35392g0) this.f308437c).f308932c.a(th2));
            default:
                return new P2.a(((G1) this.f308437c).f308237c.a(th2));
        }
    }
}
