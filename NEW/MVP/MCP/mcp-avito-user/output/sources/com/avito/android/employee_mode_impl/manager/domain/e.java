package com.avito.android.employee_mode_impl.manager.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.employee_mode_impl.generated.api.EmployeeModeApi;
import com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: EmployeeMessengerInfoRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/domain/e;", "Lcom/avito/android/employee_mode_impl/manager/domain/g;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f147368a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final EmployeeModeApi f147369b;

    /* compiled from: EmployeeMessengerInfoRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.domain.EmployeeMessengerInfoRemoteRepository$messengerInfo$2", f = "EmployeeMessengerInfoRepository.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<ApiMessengerInfoV2Response>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147370q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<ApiMessengerInfoV2Response>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147370q;
            if (i12 == 0) {
                C42729a0.b(obj);
                EmployeeModeApi employeeModeApi = e.this.f147369b;
                this.f147370q = 1;
                obj = employeeModeApi.apiMessengerInfoV2(this);
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

    @Inject
    public e(@k R0 r02, @k EmployeeModeApi employeeModeApi) {
        this.f147368a = r02;
        this.f147369b = employeeModeApi;
    }

    @Override // com.avito.android.employee_mode_impl.manager.domain.g
    @l
    public final Object a(@k Continuation<? super TypedResult<ApiMessengerInfoV2Response>> continuation) {
        return C43259k.g(this.f147368a.a(), new a(null), continuation);
    }
}
