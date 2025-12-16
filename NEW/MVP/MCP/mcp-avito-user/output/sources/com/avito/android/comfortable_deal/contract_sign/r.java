package com.avito.android.comfortable_deal.contract_sign;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: ContractSignScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f120894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f120895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120896n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Y41.a aVar, String str, String str2) {
        super(1);
        this.f120894l = str;
        this.f120895m = str2;
        this.f120896n = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        String str = this.f120894l;
        String str2 = this.f120895m;
        int I12 = C43066x.I(str, str2, 0, false, 6);
        if (I12 <= iIntValue && iIntValue < str2.length() + I12) {
            this.f120896n.invoke();
        }
        return G0.f406611a;
    }
}
