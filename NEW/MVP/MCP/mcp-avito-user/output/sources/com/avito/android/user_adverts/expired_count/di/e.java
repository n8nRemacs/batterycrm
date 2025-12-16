package com.avito.android.user_adverts.expired_count.di;

import A3.a;
import Y61.l;
import f90.K;
import kotlin.Metadata;

/* compiled from: UserAdvertsInfoPluginModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/expired_count/di/e;", "LA3/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f312133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eH0.k f312134b;

    public e(K k12, eH0.k kVar) {
        this.f312133a = k12;
        this.f312134b = kVar;
    }

    public final void a(@Y61.k A3.a aVar) {
        boolean z12 = aVar instanceof a.InterfaceC0003a.c;
        eH0.k kVar = this.f312134b;
        K k12 = this.f312133a;
        if (z12) {
            k12.clear();
            kVar.a();
        } else if (aVar instanceof a.InterfaceC0003a.b) {
            kVar.a();
        } else if (aVar instanceof a.b) {
            k12.clear();
        }
    }

    @Override // A3.b
    public final void d(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
        a(c0004a);
    }

    @Override // A3.b
    public final void e(@Y61.k a.InterfaceC0003a.c cVar) {
        a(cVar);
    }

    @Override // A3.b
    public final void i(@Y61.k a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void l(@Y61.k a.InterfaceC0003a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void p(@Y61.k a.InterfaceC0003a.d dVar) {
        a(dVar);
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @Y61.k String str) {
    }
}
