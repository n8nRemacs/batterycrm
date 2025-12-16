package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.C33468b;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<anonymous>", "(Lcom/avito/android/profile_settings_extended/b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$forGeoWidget$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33485f extends SuspendLambda implements Y41.p<C33468b.a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230683q;

    public C33485f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33485f c33485f = new C33485f(2, continuation);
        c33485f.f230683q = obj;
        return c33485f;
    }

    @Override // Y41.p
    public final Object invoke(C33468b.a aVar, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>> continuation) {
        return ((C33485f) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C33468b.a aVar = (C33468b.a) this.f230683q;
        if (aVar instanceof C33468b.a.C7002b) {
            return new C43210w(new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemovalProgress(((C33468b.a.C7002b) aVar).f229997a, true));
        }
        if (aVar instanceof C33468b.a.c) {
            return new C43210w(new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemoved(((C33468b.a.c) aVar).f229998a));
        }
        if (!(aVar instanceof C33468b.a.C7001a)) {
            throw new NoWhenBranchMatchedException();
        }
        C33468b.a.C7001a c7001a = (C33468b.a.C7001a) aVar;
        return new C43187o(C42745f0.U(new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemovalProgress(c7001a.f229995a, false), new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar(c7001a.f229996b, null)));
    }
}
