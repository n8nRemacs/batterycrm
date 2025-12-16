package com.avito.android.seller_coach.all_advices.view;

import Y41.l;
import com.avito.android.seller_coach.all_advices.vm.d;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AllAdvicesFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/seller_coach/all_advices/vm/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements l<com.avito.android.seller_coach.all_advices.vm.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AllAdvicesFragment f267418l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AllAdvicesFragment allAdvicesFragment) {
        super(1);
        this.f267418l = allAdvicesFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.seller_coach.all_advices.vm.d dVar) {
        e eVar;
        com.avito.android.seller_coach.all_advices.vm.d dVar2 = dVar;
        boolean z12 = dVar2 instanceof d.b;
        AllAdvicesFragment allAdvicesFragment = this.f267418l;
        if (z12) {
            e eVar2 = allAdvicesFragment.f267398C0;
            eVar = eVar2 != null ? eVar2 : null;
            d.b bVar = (d.b) dVar2;
            ArrayList arrayList = bVar.f267459a;
            eVar.f267424c.setRefreshing(false);
            com.avito.android.progress_overlay.l lVar = eVar.f267426e;
            if (!lVar.d()) {
                lVar.j();
            }
            eVar.f267422a.c(new UV0.c(arrayList));
            eVar.f267425d.setTitle(bVar.f267460b);
        } else if (dVar2 instanceof d.c) {
            e eVar3 = allAdvicesFragment.f267398C0;
            if (eVar3 == null) {
                eVar3 = null;
            }
            eVar3.f267426e.k(null);
        } else if (dVar2 instanceof d.a) {
            e eVar4 = allAdvicesFragment.f267398C0;
            eVar = eVar4 != null ? eVar4 : null;
            String str = ((d.a) dVar2).f267457a;
            eVar.f267424c.setRefreshing(false);
            eVar.f267426e.a(str);
        }
        return G0.f406611a;
    }
}
