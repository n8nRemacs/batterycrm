package com.avito.android.advert.item.ownership_cost.items.results;

import com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType;
import com.avito.android.remote.model.OwnershipCostAction;
import com.avito.android.remote.model.OwnershipCostButton;
import com.avito.android.remote.model.OwnershipCostResponse;
import k6.AbstractC42523a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OwnershipCostResultsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostButton;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/OwnershipCostButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<OwnershipCostButton, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f78051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f78052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResponse.OwnershipCostDisclaimer f78053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResultsItem f78054o;

    /* compiled from: OwnershipCostResultsItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78055a;

        static {
            int[] iArr = new int[OwnershipCostAction.values().length];
            try {
                iArr[OwnershipCostAction.TO_DISCLAIMER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OwnershipCostAction.TO_INPUTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78055a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, j jVar, OwnershipCostResponse.OwnershipCostDisclaimer ownershipCostDisclaimer, OwnershipCostResultsItem ownershipCostResultsItem) {
        super(1);
        this.f78051l = hVar;
        this.f78052m = jVar;
        this.f78053n = ownershipCostDisclaimer;
        this.f78054o = ownershipCostResultsItem;
    }

    @Override // Y41.l
    public final G0 invoke(OwnershipCostButton ownershipCostButton) {
        OwnershipCostButton ownershipCostButton2 = ownershipCostButton;
        OwnershipCostAction action = ownershipCostButton2.getAction();
        int i12 = action == null ? -1 : a.f78055a[action.ordinal()];
        OwnershipCostResultsItem ownershipCostResultsItem = this.f78054o;
        j jVar = this.f78052m;
        h hVar = this.f78051l;
        if (i12 == 1) {
            hVar.f78056b.a(jVar.getContext(), this.f78053n);
        } else if (i12 == 2) {
            hVar.f78056b.b(jVar.getContext(), ownershipCostResultsItem.f78041d, ownershipCostResultsItem.f78042e);
        }
        hVar.getClass();
        hVar.f78057c.x1(ownershipCostResultsItem.f78042e, OwnershipCostEventBlockType.f82833c, ownershipCostButton2.getLabel(), null);
        hVar.f78058d.a(AbstractC42523a.C11604a.f406092b);
        return G0.f406611a;
    }
}
