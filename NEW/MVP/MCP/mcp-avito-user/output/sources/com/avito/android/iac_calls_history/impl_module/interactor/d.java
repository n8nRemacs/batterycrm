package com.avito.android.iac_calls_history.impl_module.interactor;

import Y41.p;
import com.avito.android.iac_calls_history.impl_module.api.remote.GetCallHistoryRequest;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.TypedResult;
import java.time.LocalDateTime;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CallsHistoryListInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.interactor.CallsHistoryListInteractorImpl$getCallsHistory$itemsResult$1", f = "CallsHistoryListInteractor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super TypedResult<GetCallHistoryRequest.a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f164724q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f164725r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocalDateTime f164726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryTabType f164727t;

    /* compiled from: CallsHistoryListInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CallsHistoryTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CallsHistoryTabType callsHistoryTabType = CallsHistoryTabType.f164755b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, LocalDateTime localDateTime, CallsHistoryTabType callsHistoryTabType, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f164725r = bVar;
        this.f164726s = localDateTime;
        this.f164727t = callsHistoryTabType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f164725r, this.f164726s, this.f164727t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<GetCallHistoryRequest.a>> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.time.ZonedDateTime] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        String str2;
        LocalDateTime localDateTimeMinusSeconds;
        ?? AtZone;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f164724q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f164725r;
            com.avito.android.iac_calls_history.impl_module.api.a aVar = bVar.f164714a;
            LocalDateTime localDateTime = this.f164726s;
            if (localDateTime == null || (localDateTimeMinusSeconds = localDateTime.minusSeconds(1L)) == null || (AtZone = localDateTimeMinusSeconds.atZone(bVar.f164715b.getF274002b().toZoneId())) == 0) {
                str = null;
            } else {
                b.f164712f.getClass();
                str = AtZone.format(b.f164713g.getValue());
            }
            int iOrdinal = this.f164727t.ordinal();
            if (iOrdinal == 0) {
                GetCallHistoryRequest.Tab[] tabArr = GetCallHistoryRequest.Tab.f164698b;
                str2 = ProfileTab.ALL;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                GetCallHistoryRequest.Tab[] tabArr2 = GetCallHistoryRequest.Tab.f164698b;
                str2 = "missed";
            }
            this.f164724q = 1;
            obj = aVar.c(20, str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
