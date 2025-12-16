package com.avito.android.mortgage.landing.list.items.offers;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OffersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f199817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f199818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ OffersItem f199819n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, i iVar, OffersItem offersItem) {
        super(0);
        this.f199817l = kVar;
        this.f199818m = iVar;
        this.f199819n = offersItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Parcelable parcelableL1 = this.f199817l.l1();
        if (parcelableL1 != null) {
            this.f199818m.f199822d.b(parcelableL1, this.f199819n.f199793b);
        }
        return G0.f406611a;
    }
}
