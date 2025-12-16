package com.avito.android.profile_settings_extended.mvi;

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
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processBasicInfoV2Action$3", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33492m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230710q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33480a f230712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50220d f230713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33492m(C33480a c33480a, Continuation continuation, InterfaceC50220d interfaceC50220d) {
        super(2, continuation);
        this.f230712s = c33480a;
        this.f230713t = interfaceC50220d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33492m c33492m = new C33492m(this.f230712s, continuation, this.f230713t);
        c33492m.f230711r = obj;
        return c33492m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33492m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230710q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230711r;
            C33480a c33480a = this.f230712s;
            c33480a.f230514o.a(((InterfaceC50220d.j) this.f230713t).f443240a.f229210f);
            ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar showToastBar = new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(c33480a.f230511l.n(), false, 2, null);
            this.f230710q = 1;
            if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
