package com.avito.android.user_adverts_common.safety;

import io.reactivex.rxjava3.core.q;
import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f315916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f315917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f315918d;

    public /* synthetic */ c(g gVar, String str, int i12) {
        this.f315916b = i12;
        this.f315917c = gVar;
        this.f315918d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f315916b) {
            case 0:
                return q.i(Boolean.valueOf(this.f315917c.f315927c.b(this.f315918d).f315915a == 0));
            default:
                return this.f315917c.f315925a.get().a(this.f315918d);
        }
    }
}
