package com.avito.android.soa_stat.profile_settings.mvi;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SoaStatSettingActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.mvi.SoaStatSettingActor$processLoad$1", f = "SoaStatSettingActor.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<IncomeProfileSettingsResponse>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284161q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f284162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f284163s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f284163s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f284163s, continuation);
        fVar.f284162r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<IncomeProfileSettingsResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284161q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f284162r;
            com.avito.android.soa_stat.profile_settings.domain.a aVar = this.f284163s.f284124a;
            this.f284162r = interfaceC43172j;
            this.f284161q = 1;
            obj = aVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f284162r;
            C42729a0.b(obj);
        }
        this.f284162r = null;
        this.f284161q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
