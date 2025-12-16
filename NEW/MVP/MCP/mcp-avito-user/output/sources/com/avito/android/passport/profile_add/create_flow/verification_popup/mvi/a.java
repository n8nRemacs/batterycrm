package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.deep_linking.links.O;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationPopupActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.VerificationPopupActor$handleDeeplinkResult$1", f = "VerificationPopupActor.kt", i = {}, l = {98, 116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super VerificationPopupInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212259q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212260r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f212261s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f212262t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f212263u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, InterfaceC14249c interfaceC14249c, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f212261s = str;
        this.f212262t = interfaceC14249c;
        this.f212263u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f212261s, this.f212262t, this.f212263u, continuation);
        aVar.f212260r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super VerificationPopupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212259q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f212260r;
            if (L.f(this.f212261s, "passport.add_profile.verification_popup.start_verification")) {
                InterfaceC14249c interfaceC14249c = this.f212262t;
                boolean z12 = interfaceC14249c instanceof O.d;
                c cVar = this.f212263u;
                if (z12) {
                    M50.a aVar = cVar.f212267a;
                    VerificationPopupArguments verificationPopupArguments = cVar.f212268b;
                    aVar.a(Boxing.boxInt(verificationPopupArguments.f212200b), verificationPopupArguments.f212201c, verificationPopupArguments.f212205g, verificationPopupArguments.f212203e, AnalyticScreen.f211216i);
                } else if (interfaceC14249c instanceof O.a) {
                    ProfileCreateExtendedFlow profileCreateExtendedFlow = cVar.f212268b.f212202d;
                    if ((profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Create) || (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.BusinessRegistrationUpgrade)) {
                        VerificationPopupInternalAction.Navigate navigate = new VerificationPopupInternalAction.Navigate(new Navigation.Close(true, null, 2, null));
                        this.f212259q = 1;
                        if (interfaceC43172j.emit(navigate, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (interfaceC14249c instanceof InterfaceC14249c.b) {
                    M50.a aVar2 = cVar.f212267a;
                    VerificationPopupArguments verificationPopupArguments2 = cVar.f212268b;
                    aVar2.b(Boxing.boxInt(verificationPopupArguments2.f212200b), verificationPopupArguments2.f212201c, verificationPopupArguments2.f212205g, verificationPopupArguments2.f212203e);
                    if (!(verificationPopupArguments2.f212202d instanceof ProfileCreateExtendedFlow.Verification)) {
                        VerificationPopupInternalAction.Navigate navigate2 = new VerificationPopupInternalAction.Navigate(new Navigation.Close(true, null, 2, null));
                        this.f212259q = 2;
                        if (interfaceC43172j.emit(navigate2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
