package com.avito.android.mortgage.verification_flow;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import s10.InterfaceC47957a;

/* compiled from: VerificationFlowFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationFlowFragment f203866l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VerificationFlowFragment verificationFlowFragment) {
        super(1);
        this.f203866l = verificationFlowFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        ((u) this.f203866l.f203848o0.getValue()).accept(new InterfaceC47957a.c(deepLink));
        return G0.f406611a;
    }
}
