package com.avito.android.profile.user_profile.cards.rfp;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RfpCarfItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f225358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.RfpCardItem f225359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, CardItem.RfpCardItem rfpCardItem) {
        super(0);
        this.f225358l = eVar;
        this.f225359m = rfpCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f225358l.f225360b.invoke(new InterfaceC15503a.k(this.f225359m));
        return G0.f406611a;
    }
}
