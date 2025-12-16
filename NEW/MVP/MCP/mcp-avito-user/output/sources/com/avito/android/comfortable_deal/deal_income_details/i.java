package com.avito.android.comfortable_deal.deal_income_details;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.comfortable_deal.deal_income_details.model.DealIncomeDetailsDialogArguments;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealIncomeDetailsDialogScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DealIncomeDetailsDialogArguments f121828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f121829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f121830n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f121831o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments, Y41.a aVar, Y41.l lVar, v.a aVar2, int i12) {
        super(2);
        this.f121828l = dealIncomeDetailsDialogArguments;
        this.f121829m = aVar;
        this.f121830n = lVar;
        this.f121831o = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        k.a(this.f121828l, this.f121829m, this.f121830n, this.f121831o, a12, iA2);
        return G0.f406611a;
    }
}
