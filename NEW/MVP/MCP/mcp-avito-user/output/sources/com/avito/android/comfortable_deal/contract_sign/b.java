package com.avito.android.comfortable_deal.contract_sign;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContractSignFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContractSignFragment f120799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f120800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ContractSignFragment contractSignFragment, int i12) {
        super(2);
        this.f120799l = contractSignFragment;
        this.f120800m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f120800m | 1);
        ContractSignFragment.q5(this.f120799l, a12, iA2);
        return G0.f406611a;
    }
}
