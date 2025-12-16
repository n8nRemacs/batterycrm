package com.avito.android.tariff_lf.edit_info.item.manager_call;

import Y61.k;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ManagerCallPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/manager_call/h;", "Lcom/avito/android/tariff_lf/edit_info/item/manager_call/f;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c> f299023b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f299024c;

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299023b = cVar;
        this.f299024c = cVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.manager_call.f
    @k
    public final z<c> A1() {
        return this.f299024c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        c cVar = (c) aVar;
        dVar.a(new g(this, cVar));
        dVar.c1(cVar.f299014b);
    }
}
