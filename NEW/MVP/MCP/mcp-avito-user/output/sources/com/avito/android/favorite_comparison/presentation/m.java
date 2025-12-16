package com.avito.android.favorite_comparison.presentation;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sC.AbstractC48027d;

/* compiled from: FavoriteComparisonView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f155343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC48027d.a f155344m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, AbstractC48027d.a aVar) {
        super(0);
        this.f155343l = nVar;
        this.f155344m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f155343l.f155346b.m1().onNext(this.f155344m.f437539c);
        return G0.f406611a;
    }
}
