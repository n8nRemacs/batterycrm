package com.avito.android.comfortable_deal.deeplink;

import Pp.C14822a;
import com.avito.android.comfortable_deal.api.model.IsContractSignedResponse;
import com.avito.android.comfortable_deal.contract_sign.model.ContractSignArguments;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import java.util.UUID;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler$doHandleSuspend$2", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {0}, l = {115, 124, 124, 128, 128, 132, 132}, m = "invokeSuspend", n = {"isContractSigned"}, s = {"L$0"})
/* renamed from: com.avito.android.comfortable_deal.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29465f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121915q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29466g f121917s;

    /* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/IsContractSignedResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler$doHandleSuspend$2$isContractSigned$1", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.deeplink.f$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<IsContractSignedResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121918q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29466g f121919r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29466g c29466g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121919r = c29466g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f121919r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<IsContractSignedResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121918q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.comfortable_deal.repository.a aVar = this.f121919r.f121928m;
                this.f121918q = 1;
                obj = aVar.c(this);
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

    /* compiled from: ComfortableDealClientsDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LPp/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplinkHandler$doHandleSuspend$2$redirectToVdr$1", f = "ComfortableDealClientsDeeplinkHandler.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.deeplink.f$b */
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C14822a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121920q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29466g f121921r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29466g c29466g, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f121921r = c29466g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f121921r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C14822a>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121920q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.comfortable_deal.repository.a aVar = this.f121921r.f121928m;
                this.f121920q = 1;
                obj = aVar.o(this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29465f(C29466g c29466g, Continuation<? super C29465f> continuation) {
        super(2, continuation);
        this.f121917s = c29466g;
    }

    public static final Object a(C29466g c29466g, TypedResult<IsContractSignedResponse> typedResult, Continuation<? super G0> continuation) {
        if (typedResult instanceof TypedResult.Success) {
            IsContractSignedResponse isContractSignedResponse = (IsContractSignedResponse) ((TypedResult.Success) typedResult).getResult();
            if (!isContractSignedResponse.getIsRootAgent() || isContractSignedResponse.getIsSigned()) {
                Object objO = c29466g.o(continuation);
                if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objO;
                }
            } else {
                c29466g.f121923h.J(c29466g.f121927l.c(new ContractSignArguments(UUID.randomUUID().toString())), 23124, com.avito.android.deeplink_handler.view.c.f134589l);
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            String f244063c = com.avito.android.error.z.n(apiExceptionA).getF244063c();
            if (f244063c.length() <= 0) {
                f244063c = null;
            }
            if (f244063c != null) {
                a.i.C4057a.d(c29466g.f121926k, com.avito.android.printable_text.b.f(f244063c), null, null, new f.c(apiExceptionA), 0, ToastBarPosition.f181046d, null, null, 1966);
            }
            c29466g.f121925j.g(c29466g.d(), false);
            c29466g.j(ComfortableDealClientsDeeplink.a.b.f121846b);
        }
        return G0.f406611a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29465f c29465f = new C29465f(this.f121917s, continuation);
        c29465f.f121916r = obj;
        return c29465f;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29465f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.C29465f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
