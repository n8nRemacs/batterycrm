package com.avito.android.tariff.cpa.prepaid_expense;

import com.avito.android.tariff.cpa.prepaid_expense.PublicationAdvanceFragment;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublicationAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<P2<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublicationAdvanceFragment f294956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PublicationAdvanceFragment publicationAdvanceFragment) {
        super(1);
        this.f294956l = publicationAdvanceFragment;
    }

    @Override // Y41.l
    public final G0 invoke(P2<?> p22) {
        P2<?> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        PublicationAdvanceFragment publicationAdvanceFragment = this.f294956l;
        if (z12) {
            PublicationAdvanceFragment.a aVar = PublicationAdvanceFragment.f294939y0;
            publicationAdvanceFragment.r5().k(null);
        } else if (p23 instanceof P2.a) {
            PublicationAdvanceFragment.a aVar2 = PublicationAdvanceFragment.f294939y0;
            publicationAdvanceFragment.r5().a("");
        } else if (p23 instanceof P2.b) {
            PublicationAdvanceFragment.a aVar3 = PublicationAdvanceFragment.f294939y0;
            publicationAdvanceFragment.r5().j();
        }
        return G0.f406611a;
    }
}
