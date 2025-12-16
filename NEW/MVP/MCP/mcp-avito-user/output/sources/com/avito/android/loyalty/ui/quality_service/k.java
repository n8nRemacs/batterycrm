package com.avito.android.loyalty.ui.quality_service;

import androidx.compose.runtime.internal.P;
import bX.InterfaceC25576a;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import dX.r;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: QualityServiceInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/k;", "", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25576a f183953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f183954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final QualityServiceArgs f183955c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i f183956d;

    /* compiled from: QualityServiceInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/k$a;", "", "<init>", "()V", "", "ALERT_SLUG_PARAM", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: QualityServiceInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$ShowAlert;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.quality_service.QualityServiceInteractor$getAlertContent$1", f = "QualityServiceInteractor.kt", i = {0}, l = {35, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super QualityServiceInternalAction.ShowAlert>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f183957q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f183958r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f183960t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f183960t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = k.this.new b(this.f183960t, continuation);
            bVar.f183958r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super QualityServiceInternalAction.ShowAlert> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f183957q;
            String str = this.f183960t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f183958r;
                InterfaceC25576a interfaceC25576a = k.this.f183953a;
                Map<String, String> mapSingletonMap = Collections.singletonMap("alertSlug", str);
                this.f183958r = interfaceC43172j;
                this.f183957q = 1;
                obj = interfaceC25576a.a(mapSingletonMap, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f183958r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                Iterator<T> it = ((dX.h) ((TypedResult.Success) typedResult).getResult()).a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((dX.g) next).getAlertSlug(), str)) {
                        break;
                    }
                }
                dX.g gVar = (dX.g) next;
                if (gVar != null) {
                    QualityServiceInternalAction.ShowAlert showAlert = new QualityServiceInternalAction.ShowAlert(gVar);
                    this.f183958r = null;
                    this.f183957q = 2;
                    if (interfaceC43172j.emit(showAlert, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.quality_service.QualityServiceInteractor$getQualityService$1", f = "QualityServiceInteractor.kt", i = {0, 1, 2, 2}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super QualityServiceInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public r f183961q;

        /* renamed from: r, reason: collision with root package name */
        public int f183962r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f183963s;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = k.this.new c(continuation);
            cVar.f183963s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super QualityServiceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0374 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 929
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.quality_service.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public k(@Y61.k InterfaceC25576a interfaceC25576a, @Y61.k R0 r02, @Y61.k QualityServiceArgs qualityServiceArgs, @Y61.k i iVar) {
        this.f183953a = interfaceC25576a;
        this.f183954b = r02;
        this.f183955c = qualityServiceArgs;
        this.f183956d = iVar;
    }

    @Y61.k
    public final InterfaceC43160i<QualityServiceInternalAction> a(@Y61.k String str) {
        return C43175k.I(this.f183954b.a(), C43175k.G(new b(str, null)));
    }

    @Y61.k
    public final InterfaceC43160i<QualityServiceInternalAction> b() {
        return C43175k.I(this.f183954b.a(), C43175k.G(new c(null)));
    }
}
