package com.avito.android.component.advert_badge_bar;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertBadgeBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertBadgeBar f124988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdvertBadgeBar advertBadgeBar) {
        super(0);
        this.f124988l = advertBadgeBar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertBadgeBar advertBadgeBar = this.f124988l;
        i iVar = advertBadgeBar.f124928g;
        if (iVar != null) {
            iVar.c(true);
            advertBadgeBar.f124925d.f125000a = iVar;
            com.avito.konveyor.adapter.h hVar = advertBadgeBar.f124926e;
            if (hVar == null) {
                hVar = null;
            }
            hVar.f338510e = iVar;
            RecyclerView.Adapter adapter = advertBadgeBar.f124923b.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        Y41.a<G0> aVar = advertBadgeBar.f124930i;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
