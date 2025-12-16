package com.avito.android.profile_settings_extended.mvi;

import Hb0.InterfaceC13947a;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yc0.InterfaceC50220d;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processBasicInfoV2Action$7", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {818}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33494o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230716q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33480a f230718s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50220d f230719t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33494o(C33480a c33480a, Continuation continuation, InterfaceC50220d interfaceC50220d) {
        super(2, continuation);
        this.f230718s = c33480a;
        this.f230719t = interfaceC50220d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33494o c33494o = new C33494o(this.f230718s, continuation, this.f230719t);
        c33494o.f230717r = obj;
        return c33494o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33494o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230716q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230717r;
            InterfaceC13947a interfaceC13947a = this.f230718s.f230515p;
            InterfaceC50220d.i iVar = (InterfaceC50220d.i) this.f230719t;
            if (interfaceC13947a.a(iVar.f443239b.f229227b)) {
                ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.ShowSellerTypeOnboarding showSellerTypeOnboarding = new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.ShowSellerTypeOnboarding(iVar.f443238a, iVar.f443239b);
                this.f230716q = 1;
                if (interfaceC43172j.emit(showSellerTypeOnboarding, this) == coroutine_suspended) {
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
