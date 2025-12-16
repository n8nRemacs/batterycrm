package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import X50.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.passport.deeplinks.PassportCreationBusinessVrfLink;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.SetProfileNameActor$handleResult$1", f = "SetProfileNameActor.kt", i = {}, l = {116, 125, 136, 152, 176, 188}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SetProfileNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212134q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X50.a f212136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f212137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(X50.a aVar, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f212136s = aVar;
        this.f212137t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f212136s, this.f212137t, continuation);
        dVar.f212135r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SetProfileNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f212134q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f212135r;
                X50.a aVar = this.f212136s;
                if (aVar instanceof a.b) {
                    SetProfileNameInternalAction.Navigate navigate = new SetProfileNameInternalAction.Navigate(new Navigation.Close(true, new ExtendedProfileCreationResult.Success(true, null, 2, null)));
                    this.f212134q = 1;
                    if (interfaceC43172j.emit(navigate, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.C1318a) {
                    ((a.C1318a) aVar).getClass();
                    SetProfileNameInternalAction.HandleDeeplink handleDeeplink = new SetProfileNameInternalAction.HandleDeeplink(new PassportSwitchProfileLink(String.valueOf(0), null, 2, null), "passport.add_profile.set_profile_name.switch_profile");
                    this.f212134q = 2;
                    if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    boolean z12 = aVar instanceof a.c;
                    e eVar = this.f212137t;
                    SetProfileNameArgs setProfileNameArgs = eVar.f212139b;
                    if (z12) {
                        a.c cVar = (a.c) aVar;
                        if (cVar.f18581b != null) {
                            SetProfileNameInternalAction.Navigate navigate2 = new SetProfileNameInternalAction.Navigate(new Navigation.VerificationPopup(new VerificationPopupArguments(setProfileNameArgs.f212032b, setProfileNameArgs.f212033c, setProfileNameArgs.f212035e, setProfileNameArgs.f212036f, setProfileNameArgs.f212037g, setProfileNameArgs.f212038h, cVar.f18581b)));
                            this.f212134q = 3;
                            if (interfaceC43172j.emit(navigate2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            SetProfileNameInternalAction.HandleDeeplink handleDeeplink2 = new SetProfileNameInternalAction.HandleDeeplink(cVar.f18580a, "passport.add_profile.set_profile_name.start_verification");
                            this.f212134q = 4;
                            if (interfaceC43172j.emit(handleDeeplink2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (aVar instanceof a.d) {
                        a.d dVar = (a.d) aVar;
                        DeepLink deepLink = dVar.f18582a;
                        if ((deepLink instanceof ScreenFlowLink) && (((ScreenFlowLink) deepLink).f260204b instanceof PassportSwitchProfileLink)) {
                            eVar.f212138a.b(Boxing.boxInt(setProfileNameArgs.f212032b), setProfileNameArgs.f212033c, setProfileNameArgs.f212038h, setProfileNameArgs.f212036f);
                        }
                        DeepLink deepLink2 = dVar.f18582a;
                        SetProfileNameInternalAction.HandleDeeplink handleDeeplink3 = new SetProfileNameInternalAction.HandleDeeplink(deepLink2, deepLink2 instanceof PassportCreationBusinessVrfLink ? "passport.add_profile.set_profile_name.business_vrf_link" : "passport.add_profile.set_profile_name.next_link");
                        this.f212134q = 5;
                        if (interfaceC43172j.emit(handleDeeplink3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (aVar instanceof a.e) {
                        SetProfileNameInternalAction.Navigate navigate3 = new SetProfileNameInternalAction.Navigate(new Navigation.Close(true, null, 2, null));
                        this.f212134q = 6;
                        if (interfaceC43172j.emit(navigate3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
