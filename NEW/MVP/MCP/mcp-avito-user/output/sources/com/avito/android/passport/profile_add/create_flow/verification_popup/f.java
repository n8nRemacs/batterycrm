package com.avito.android.passport.profile_add.create_flow.verification_popup;

import W50.a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VerificationPopupFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment$setupAppBar$4", f = "VerificationPopupFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ VerificationPopupFragment f212256q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VerificationPopupFragment verificationPopupFragment, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f212256q = verificationPopupFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f212256q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((f) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        VerificationPopupFragment.a aVar = VerificationPopupFragment.f212207x0;
        this.f212256q.t5().accept(a.b.f17739a);
        return G0.f406611a;
    }
}
