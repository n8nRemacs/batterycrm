package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.InterfaceC33507u;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$withDataReloading$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33500v extends SuspendLambda implements Y41.p<ExtendedProfileSettingsInternalAction, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230750q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C33480a f230751r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33500v(C33480a c33480a, Continuation<? super C33500v> continuation) {
        super(2, continuation);
        this.f230751r = c33480a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33500v c33500v = new C33500v(this.f230751r, continuation);
        c33500v.f230750q = obj;
        return c33500v;
    }

    @Override // Y41.p
    public final Object invoke(ExtendedProfileSettingsInternalAction extendedProfileSettingsInternalAction, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>> continuation) {
        return ((C33500v) create(extendedProfileSettingsInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ExtendedProfileSettingsInternalAction extendedProfileSettingsInternalAction = (ExtendedProfileSettingsInternalAction) this.f230750q;
        return extendedProfileSettingsInternalAction instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.ReloadData ? InterfaceC33507u.a.a(this.f230751r.f230500a, false, ((ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.ReloadData) extendedProfileSettingsInternalAction).f230607b, 4) : new C43210w(extendedProfileSettingsInternalAction);
    }
}
