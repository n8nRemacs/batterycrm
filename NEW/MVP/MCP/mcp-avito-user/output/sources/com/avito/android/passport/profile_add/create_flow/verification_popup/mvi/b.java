package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import com.avito.android.remote.model.VerificationDisclaimer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationPopupActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.VerificationPopupActor$process$1", f = "VerificationPopupActor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super VerificationPopupInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212264q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f212266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f212266s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f212266s, continuation);
        bVar.f212265r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super VerificationPopupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink uri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212264q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f212265r;
            c cVar = this.f212266s;
            M50.a aVar = cVar.f212267a;
            VerificationPopupArguments verificationPopupArguments = cVar.f212268b;
            aVar.c(Boxing.boxInt(verificationPopupArguments.f212200b), verificationPopupArguments.f212201c, verificationPopupArguments.f212205g, verificationPopupArguments.f212203e, AnalyticScreen.f211215h);
            VerificationDisclaimer.Button submitButton = verificationPopupArguments.f212206h.getSubmitButton();
            if (submitButton != null && (uri = submitButton.getUri()) != null) {
                VerificationPopupInternalAction.HandleDeeplink handleDeeplink = new VerificationPopupInternalAction.HandleDeeplink(uri);
                this.f212264q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
