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
import kv.C43501a;

/* compiled from: VerificationPopupFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment$listenDeeplinkResult$1", f = "VerificationPopupFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f212231q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ VerificationPopupFragment f212232r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(VerificationPopupFragment verificationPopupFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f212232r = verificationPopupFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f212232r, continuation);
        aVar.f212231q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f212231q;
        VerificationPopupFragment.a aVar = VerificationPopupFragment.f212207x0;
        i iVarT5 = this.f212232r.t5();
        com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
        iVarT5.accept(new a.d(aVar2.f134521b, c43501a.f413261b));
        return G0.f406611a;
    }
}
