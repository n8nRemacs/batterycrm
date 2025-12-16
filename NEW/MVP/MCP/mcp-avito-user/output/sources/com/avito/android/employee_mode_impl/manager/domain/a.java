package com.avito.android.employee_mode_impl.manager.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import Yy.C18347a;
import com.avito.android.employee_mode_impl.generated.api.EmployeeModeApi;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: EmployeeInfoRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/domain/a;", "Lcom/avito/android/employee_mode_impl/manager/domain/c;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f147361a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<EmployeeModeApi> f147362b;

    /* compiled from: EmployeeInfoRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/employee_mode_impl/manager/domain/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.domain.EmployeeInfoRemoteRepository$employeeInfo$2", f = "EmployeeInfoRepository.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.domain.a$a, reason: collision with other inner class name */
    public static final class C4293a extends SuspendLambda implements p<T, Continuation<? super TypedResult<d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147363q;

        public C4293a(Continuation<? super C4293a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C4293a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<d>> continuation) {
            return ((C4293a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147363q;
            if (i12 == 0) {
                C42729a0.b(obj);
                EmployeeModeApi employeeModeApi = a.this.f147362b.get();
                this.f147363q = 1;
                obj = employeeModeApi.apiUserInfoV2(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new TypedResult.Success(new d(((C18347a) ((TypedResult.Success) typedResult).getResult()).getIsApprovedEmployee()));
            }
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public a(@k R0 r02, @k h31.e<EmployeeModeApi> eVar) {
        this.f147361a = r02;
        this.f147362b = eVar;
    }

    @Override // com.avito.android.employee_mode_impl.manager.domain.c
    @l
    public final Object a(@k Continuation<? super TypedResult<d>> continuation) {
        return C43259k.g(this.f147361a.a(), new C4293a(null), continuation);
    }
}
