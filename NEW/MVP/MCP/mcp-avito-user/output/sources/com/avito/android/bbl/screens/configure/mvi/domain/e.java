package com.avito.android.bbl.screens.configure.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import oh.InterfaceC44774a;
import th.C48672a;

/* compiled from: PostBblConfigureSaveUseCase.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/domain/e;", "Lcom/avito/android/bbl/screens/configure/mvi/domain/d;", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f99203a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44774a f99204b;

    /* compiled from: PostBblConfigureSaveUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/domain/e$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f99205a;

        public a(@k DeepLink deepLink) {
            this.f99205a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f99205a, ((a) obj).f99205a);
        }

        public final int hashCode() {
            return this.f99205a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Result(deepLink="), this.f99205a, ')');
        }
    }

    /* compiled from: PostBblConfigureSaveUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/bbl/screens/configure/mvi/domain/e$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bbl.screens.configure.mvi.domain.PostBblConfigureSaveUseCaseImpl$execute$2", f = "PostBblConfigureSaveUseCase.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f99206q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f99208s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f99209t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f99208s = str;
            this.f99209t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new b(this.f99208s, this.f99209t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<a>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f99206q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC44774a interfaceC44774a = e.this.f99204b;
                this.f99206q = 1;
                obj = interfaceC44774a.b(this.f99208s, this.f99209t, this);
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
                return new TypedResult.Success(new a(((C48672a) ((TypedResult.Success) typedResult).getResult()).getUri()));
            }
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public e(@k R0 r02, @k InterfaceC44774a interfaceC44774a) {
        this.f99203a = r02;
        this.f99204b = interfaceC44774a;
    }

    @Override // com.avito.android.bbl.screens.configure.mvi.domain.d
    @l
    public final Object a(long j12, @k String str, @k Continuation continuation) {
        return C43259k.g(this.f99203a.a(), new b(str, j12, null), continuation);
    }
}
