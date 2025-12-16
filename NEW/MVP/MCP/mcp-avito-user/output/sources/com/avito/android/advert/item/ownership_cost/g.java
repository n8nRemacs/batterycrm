package com.avito.android.advert.item.ownership_cost;

import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: OwnershipCostRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/OwnershipCostResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f77943b;

    public g(h hVar) {
        this.f77943b = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.b) {
            this.f77943b.f77945b = (OwnershipCostResponse) ((P2.b) p22).f318720a;
        }
    }
}
