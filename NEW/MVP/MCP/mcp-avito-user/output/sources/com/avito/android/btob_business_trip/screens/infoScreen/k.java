package com.avito.android.btob_business_trip.screens.infoScreen;

import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zk.InterfaceC50577a;

/* compiled from: B2bBusinessTripInfoScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectItemsInfo f107986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC50577a, G0> f107987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(SelectItemsInfo selectItemsInfo, Y41.l<? super InterfaceC50577a, G0> lVar) {
        super(0);
        this.f107986l = selectItemsInfo;
        this.f107987m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SelectItemsInfo selectItemsInfo = this.f107986l;
        if (selectItemsInfo != null) {
            this.f107987m.invoke(new InterfaceC50577a.C12970a(selectItemsInfo));
        }
        return G0.f406611a;
    }
}
