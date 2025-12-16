package com.avito.android.publish.details;

import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class M1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f233075l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(K1 k12) {
        super(0);
        this.f233075l = k12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        K1 k12 = this.f233075l;
        ItemDetailsView itemDetailsView = k12.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.a();
        }
        k12.C(Z1.f233194l);
        return kotlin.G0.f406611a;
    }
}
