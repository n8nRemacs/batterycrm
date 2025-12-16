package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M0 f259497l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(M0 m02) {
        super(1);
        this.f259497l = m02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DeepLink deepLink) {
        this.f259497l.f259411s0.accept(new e.C(deepLink));
        return kotlin.G0.f406611a;
    }
}
