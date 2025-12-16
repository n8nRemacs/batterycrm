package com.avito.android.profile.user_profile.mvi;

import com.avito.android.component.user_hat.e;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handlePassportCardEvent$1", f = "UserProfileActor.kt", i = {}, l = {771}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class F extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226212q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.component.user_hat.e f226214s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33388a f226215t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(com.avito.android.component.user_hat.e eVar, C33388a c33388a, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f226214s = eVar;
        this.f226215t = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f226214s, this.f226215t, continuation);
        f12.f226213r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((F) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226212q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f226213r;
            com.avito.android.component.user_hat.e eVar = this.f226214s;
            boolean z12 = eVar instanceof e.b;
            C33388a c33388a = this.f226215t;
            if (z12) {
                e.b bVar = (e.b) eVar;
                if (kotlin.jvm.internal.L.f(bVar.f125305a.f125275d, c33388a.f226292l.a())) {
                    UserProfileInternalAction.OpenProfileSettingsScreen openProfileSettingsScreen = new UserProfileInternalAction.OpenProfileSettingsScreen();
                    this.f226212q = 1;
                    if (interfaceC43172j.emit(openProfileSettingsScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    b.a.a(c33388a.f226289i, new PassportSwitchProfileLink(bVar.f125305a.f125275d, null, 2, null), null, null, 6);
                }
            } else if (eVar instanceof e.a) {
                b.a.a(c33388a.f226289i, new PassportAddProfileLink(((e.a) eVar).f125304a), null, null, 6);
            } else if (eVar instanceof e.c) {
                b.a.a(c33388a.f226289i, new PassportProfilesListLink(false, 1, null), null, null, 6);
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
