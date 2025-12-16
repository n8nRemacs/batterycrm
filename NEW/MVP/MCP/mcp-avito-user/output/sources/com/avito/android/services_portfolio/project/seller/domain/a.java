package com.avito.android.services_portfolio.project.seller.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.services_portfolio.generated.api.sx_project_get.SxProjectWithErrorModerationStatus;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import cv0.InterfaceC39418a;
import dv0.C39807a;
import dv0.C39808b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PortfolioProjectSellerInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/domain/a;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39418a f280215a;

    /* compiled from: PortfolioProjectSellerInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.services_portfolio.project.seller.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8338a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f280216a;

        static {
            int[] iArr = new int[SxProjectWithErrorModerationStatus.Type.values().length];
            try {
                iArr[SxProjectWithErrorModerationStatus.Type.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SxProjectWithErrorModerationStatus.Type.INPROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SxProjectWithErrorModerationStatus.Type.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f280216a = iArr;
        }
    }

    /* compiled from: PortfolioProjectSellerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.domain.PortfolioProjectSellerInteractor$deleteProject$1", f = "PortfolioProjectSellerInteractor.kt", i = {0}, l = {55, 66}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectSellerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280217q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280218r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f280220t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f280220t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f280220t, continuation);
            bVar.f280218r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PortfolioProjectSellerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            PortfolioProjectSellerInternalAction error;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280217q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f280218r;
                InterfaceC39418a interfaceC39418a = a.this.f280215a;
                C39808b c39808b = new C39808b(this.f280220t);
                this.f280218r = interfaceC43172j;
                this.f280217q = 1;
                obj = interfaceC39418a.c(c39808b, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f280218r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                String errorMessage = ((C39807a) ((TypedResult.Success) typedResult).getResult()).getErrorMessage();
                error = errorMessage != null ? new PortfolioProjectSellerInternalAction.Error(new ApiError.Failure(errorMessage)) : PortfolioProjectSellerInternalAction.Back.f280259b;
            } else {
                error = typedResult instanceof TypedResult.Error ? new PortfolioProjectSellerInternalAction.Error(((TypedResult.Error) typedResult).getError()) : new PortfolioProjectSellerInternalAction.Loading();
            }
            this.f280218r = null;
            this.f280217q = 2;
            if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectSellerInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.domain.PortfolioProjectSellerInteractor$loadProject$1", f = "PortfolioProjectSellerInteractor.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY, 51}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectSellerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280221q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280222r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f280224t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f280225u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f280224t = j12;
            this.f280225u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f280224t, this.f280225u, continuation);
            cVar.f280222r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PortfolioProjectSellerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[PHI: r20
  0x00c4: PHI (r20v9 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType) = 
  (r20v5 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType)
  (r20v6 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType)
 binds: [B:27:0x00c2, B:30:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x016a A[PHI: r17
  0x016a: PHI (r17v5 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType) = 
  (r17v1 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType)
  (r17v2 com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType)
 binds: [B:62:0x0168, B:65:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.project.seller.domain.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC39418a interfaceC39418a) {
        this.f280215a = interfaceC39418a;
    }

    @k
    public final InterfaceC43160i<PortfolioProjectSellerInternalAction> a(long j12) {
        return C43175k.G(new b(j12, null));
    }

    @k
    public final InterfaceC43160i<PortfolioProjectSellerInternalAction> b(long j12, @l String str) {
        return C43175k.G(new c(j12, str, null));
    }
}
