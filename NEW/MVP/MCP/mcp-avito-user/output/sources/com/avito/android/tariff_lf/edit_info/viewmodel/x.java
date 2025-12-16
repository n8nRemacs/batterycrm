package com.avito.android.tariff_lf.edit_info.viewmodel;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class x extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f299156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff_lf.edit_info.item.manager_call.c f299157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar, com.avito.android.tariff_lf.edit_info.item.manager_call.c cVar) {
        super(1);
        this.f299156l = rVar;
        this.f299157m = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        this.f299156l.f299130W.postValue(this.f299157m.f299018f);
        return G0.f406611a;
    }
}
