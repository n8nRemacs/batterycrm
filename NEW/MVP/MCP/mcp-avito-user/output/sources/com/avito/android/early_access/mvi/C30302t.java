package com.avito.android.early_access.mvi;

import com.adjust.sdk.Constants;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.avito.android.remote.early_access.generated.api.order_status_v_2.OrderStatusV2Response;
import com.avito.android.util.R0;
import gk0.InterfaceC40698a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EarlyAccessInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/t;", "Lcom/avito/android/early_access/mvi/s;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30302t implements InterfaceC30301s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40698a> f145532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f145533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReEarlyAccessData f145534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Long f145535d;

    /* compiled from: EarlyAccessInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$checkEarlyAccessOrderStatus$1", f = "EarlyAccessInteractor.kt", i = {0, 0, 1, 1, 2, 4, 4, 5, 7}, l = {89, 92, 97, 98, 111, 112, 113, 120, 121}, m = "invokeSuspend", n = {"$this$flow", "countOfRequests", "$this$flow", "countOfRequests", "$this$flow", "$this$flow", Constants.DEEPLINK, "$this$flow", "$this$flow"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
    /* renamed from: com.avito.android.early_access.mvi.t$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f145536q;

        /* renamed from: r, reason: collision with root package name */
        public int f145537r;

        /* renamed from: s, reason: collision with root package name */
        public int f145538s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f145539t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f145541v;

        /* compiled from: EarlyAccessInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.early_access.mvi.t$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4228a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145542a;

            static {
                int[] iArr = new int[OrderStatusV2Response.OrderStatus.values().length];
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Create.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Wait.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Paid.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Duplicate.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Cancel.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderStatusV2Response.OrderStatus.Failed.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f145542a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f145541v = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C30302t.this.new a(this.f145541v, continuation);
            aVar.f145539t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0149 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access.mvi.C30302t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EarlyAccessInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$checkEarlyAccessOrderStatus$2", f = "EarlyAccessInteractor.kt", i = {0}, l = {130, 131}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
    /* renamed from: com.avito.android.early_access.mvi.t$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super EarlyAccessInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145543q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f145544r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f145545s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f145544r = interfaceC43172j;
            bVar.f145545s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145543q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f145544r;
                EarlyAccessInternalAction.LoadingError loadingError = new EarlyAccessInternalAction.LoadingError(com.avito.android.error.z.n(this.f145545s));
                this.f145544r = interfaceC43172j;
                this.f145543q = 1;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f145544r;
                C42729a0.b(obj);
            }
            EarlyAccessInternalAction.CloseDialog closeDialog = EarlyAccessInternalAction.CloseDialog.f145458b;
            this.f145544r = null;
            this.f145543q = 2;
            if (interfaceC43172j.emit(closeDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$checkEarlyAccessOrderStatus$3", f = "EarlyAccessInteractor.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.early_access.mvi.t$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145546q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f145547r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f145547r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145546q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f145547r;
                EarlyAccessInternalAction.PaymentStarted paymentStarted = EarlyAccessInternalAction.PaymentStarted.f145467b;
                this.f145546q = 1;
                if (interfaceC43172j.emit(paymentStarted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$createEarlyAccessOrder$1", f = "EarlyAccessInteractor.kt", i = {0, 1, 1, 2, 4, 4, 4, 6}, l = {42, 50, 51, 52, 60, 63, 65, 66}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "data", "$this$flow", "$this$flow", "messageResult", "uriResult", "$this$flow"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$0"})
    /* renamed from: com.avito.android.early_access.mvi.t$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f145548q;

        /* renamed from: r, reason: collision with root package name */
        public String f145549r;

        /* renamed from: s, reason: collision with root package name */
        public int f145550s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f145551t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f145553v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f145553v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = C30302t.this.new d(this.f145553v, continuation);
            dVar.f145551t = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access.mvi.C30302t.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EarlyAccessInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$createEarlyAccessOrder$2", f = "EarlyAccessInteractor.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
    /* renamed from: com.avito.android.early_access.mvi.t$e */
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super EarlyAccessInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145554q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f145555r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f145556s;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f145555r = interfaceC43172j;
            eVar.f145556s = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145554q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f145555r;
                EarlyAccessInternalAction.LoadingError loadingError = new EarlyAccessInternalAction.LoadingError(com.avito.android.error.z.n(this.f145556s));
                this.f145555r = interfaceC43172j;
                this.f145554q = 1;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f145555r;
                C42729a0.b(obj);
            }
            EarlyAccessInternalAction.CloseDialog closeDialog = EarlyAccessInternalAction.CloseDialog.f145458b;
            this.f145555r = null;
            this.f145554q = 2;
            if (interfaceC43172j.emit(closeDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessInteractorImpl$createEarlyAccessOrder$3", f = "EarlyAccessInteractor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.early_access.mvi.t$f */
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145557q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f145558r;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f145558r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145557q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f145558r;
                EarlyAccessInternalAction.LoadingStarted loadingStarted = EarlyAccessInternalAction.LoadingStarted.f145462b;
                this.f145557q = 1;
                if (interfaceC43172j.emit(loadingStarted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C30302t(@Y61.k h31.e<InterfaceC40698a> eVar, @Y61.k R0 r02, @Y61.k ReEarlyAccessData reEarlyAccessData) {
        this.f145532a = eVar;
        this.f145533b = r02;
        this.f145534c = reEarlyAccessData;
    }

    @Override // com.avito.android.early_access.mvi.InterfaceC30301s
    @Y61.k
    public final InterfaceC43160i<EarlyAccessInternalAction> a(@Y61.l String str) {
        return C43175k.I(this.f145533b.a(), new C43137a0(new f(2, null), new C43152f0(C43175k.G(new d(str, null)), new e(3, null))));
    }

    @Override // com.avito.android.early_access.mvi.InterfaceC30301s
    @Y61.k
    public final InterfaceC43160i<EarlyAccessInternalAction> b(long j12) {
        return C43175k.I(this.f145533b.a(), new C43137a0(new c(2, null), new C43152f0(C43175k.G(new a(j12, null)), new b(3, null))));
    }

    @Override // com.avito.android.early_access.mvi.InterfaceC30301s
    @Y61.k
    public final InterfaceC43160i<EarlyAccessInternalAction> c() {
        Long l12 = this.f145535d;
        return l12 != null ? b(l12.longValue()) : C43175k.w();
    }
}
