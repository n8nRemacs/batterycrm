package com.avito.android.soa_stat.profile_settings.mvi;

import Uw0.C15577a;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SoaStatSettingActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.mvi.SoaStatSettingActor$trackToggle$1", f = "SoaStatSettingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class o extends SuspendLambda implements Y41.p<SoaStatSettingInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f284207q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f284208r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f284208r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f284208r, continuation);
        oVar.f284207q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(SoaStatSettingInternalAction soaStatSettingInternalAction, Continuation<? super G0> continuation) {
        return ((o) create(soaStatSettingInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        SoaStatSettingInternalAction soaStatSettingInternalAction = (SoaStatSettingInternalAction) this.f284207q;
        if (soaStatSettingInternalAction instanceof SoaStatSettingInternalAction.ToggleSettingLoading) {
            this.f284208r.f284125b.c(new C15577a(((SoaStatSettingInternalAction.ToggleSettingLoading) soaStatSettingInternalAction).f284159d));
        }
        return G0.f406611a;
    }
}
