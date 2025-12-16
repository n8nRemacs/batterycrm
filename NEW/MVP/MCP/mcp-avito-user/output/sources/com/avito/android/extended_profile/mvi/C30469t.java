package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.remote.model.ExtendedProfile;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$subscriptionDeeplinkHandlerFlow$1", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30469t extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150387q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.extended_profile.mvi.entity.a> f150388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30451a f150389s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30469t(Y41.a<com.avito.android.extended_profile.mvi.entity.a> aVar, C30451a c30451a, Continuation<? super C30469t> continuation) {
        super(2, continuation);
        this.f150388r = aVar;
        this.f150389s = c30451a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30469t c30469t = new C30469t(this.f150388r, this.f150389s, continuation);
        c30469t.f150387q = obj;
        return c30469t;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
        return ((C30469t) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ExtendedProfile.ProfileData.AnalyticParams analyticParams;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f150387q;
        com.avito.android.extended_profile.mvi.entity.a aVarInvoke = this.f150388r.invoke();
        C30451a c30451a = this.f150389s;
        com.avito.android.extended_profile.e0 e0Var = c30451a.f150078l;
        com.avito.android.extended_profile.data.b bVar = aVarInvoke.f150240b;
        return e0Var.c(c43501a, c30451a.f150067a, (bVar == null || (analyticParams = bVar.f149470e) == null) ? null : analyticParams.getProfileSession(), aVarInvoke.f150249k.f150282a);
    }
}
