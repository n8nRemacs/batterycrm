package com.avito.android.comfortable_deal.commission_details;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommissionDetailsDialogScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CommissionDetailsDialogArguments f120582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f120584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f120585o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CommissionDetailsDialogArguments commissionDetailsDialogArguments, Y41.a aVar, l lVar, v.a aVar2, int i12) {
        super(2);
        this.f120582l = commissionDetailsDialogArguments;
        this.f120583m = aVar;
        this.f120584n = lVar;
        this.f120585o = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        j.a(this.f120582l, this.f120583m, this.f120584n, this.f120585o, a12, iA2);
        return G0.f406611a;
    }
}
