package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.C33468b;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
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
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<anonymous>", "(Lcom/avito/android/profile_settings_extended/b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$forPhoneWidget$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33486g extends SuspendLambda implements Y41.p<C33468b.a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230684q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CommonValueId f230685r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33480a f230686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f230687t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33486g(CommonValueId commonValueId, C33480a c33480a, String str, Continuation<? super C33486g> continuation) {
        super(2, continuation);
        this.f230685r = commonValueId;
        this.f230686s = c33480a;
        this.f230687t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33486g c33486g = new C33486g(this.f230685r, this.f230686s, this.f230687t, continuation);
        c33486g.f230684q = obj;
        return c33486g;
    }

    @Override // Y41.p
    public final Object invoke(C33468b.a aVar, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>> continuation) {
        return ((C33486g) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C33468b.a aVar = (C33468b.a) this.f230684q;
        boolean z12 = aVar instanceof C33468b.a.C7002b;
        CommonValueId commonValueId = this.f230685r;
        if (z12) {
            return new C43187o(C42745f0.U(new ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.PhoneDeletionProgress(commonValueId, true), new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemovalProgress(((C33468b.a.C7002b) aVar).f229997a, true)));
        }
        if (aVar instanceof C33468b.a.c) {
            return new C43187o(C42745f0.U(new ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.PhoneDeletionProgress(commonValueId, false), new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemoved(((C33468b.a.c) aVar).f229998a), new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(this.f230686s.f230511l.a(this.f230687t), false, 2, null)));
        }
        if (!(aVar instanceof C33468b.a.C7001a)) {
            throw new NoWhenBranchMatchedException();
        }
        C33468b.a.C7001a c7001a = (C33468b.a.C7001a) aVar;
        return new C43187o(C42745f0.U(new ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.PhoneDeletionProgress(commonValueId, false), new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CommonValueRemovalProgress(c7001a.f229995a, false), new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar(c7001a.f229996b, null)));
    }
}
