package com.avito.android.extended_profile.mvi;

import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.CommercialLoadingItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "group", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Lcom/avito/android/extended_profile/data/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, com.avito.android.extended_profile.data.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f150344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CommercialItem f150345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String str, CommercialItem commercialItem) {
        super(1);
        this.f150344l = str;
        this.f150345m = commercialItem;
    }

    @Override // Y41.l
    public final com.avito.android.extended_profile.data.g invoke(com.avito.android.extended_profile.data.g gVar) {
        com.avito.android.extended_profile.data.g gVar2 = gVar;
        if (!(gVar2 instanceof com.avito.android.extended_profile.data.k)) {
            return gVar2;
        }
        com.avito.android.extended_profile.data.k kVar = (com.avito.android.extended_profile.data.k) gVar2;
        List<QH.a> list = ((com.avito.android.extended_profile.data.k) gVar2).f149500d;
        ArrayList arrayList = new ArrayList();
        for (com.avito.conveyor_item.a aVar : list) {
            if ((aVar instanceof CommercialLoadingItem) && kotlin.jvm.internal.L.f(((CommercialLoadingItem) aVar).f86897b.f86885b, this.f150344l)) {
                aVar = this.f150345m;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return new com.avito.android.extended_profile.data.k(kVar.f149499c, arrayList);
    }
}
