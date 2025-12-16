package com.avito.android.extended_profile_selection_create.select.adapter.advert;

import RA.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectionAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f152051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectionAdvertItem f152052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, SelectionAdvertItem selectionAdvertItem) {
        super(0);
        this.f152051l = eVar;
        this.f152052m = selectionAdvertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f152051l;
        eVar.f152053b.invoke(new a.C0943a(this.f152052m));
        return G0.f406611a;
    }
}
