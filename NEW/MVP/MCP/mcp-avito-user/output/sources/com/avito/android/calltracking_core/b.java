package com.avito.android.calltracking_core;

import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f113793c;

    public /* synthetic */ b(c cVar, int i12) {
        this.f113792b = i12;
        this.f113793c = cVar;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f113792b) {
            case 0:
                return this.f113793c.f113794a.get().c();
            default:
                return this.f113793c.f113794a.get().e();
        }
    }
}
