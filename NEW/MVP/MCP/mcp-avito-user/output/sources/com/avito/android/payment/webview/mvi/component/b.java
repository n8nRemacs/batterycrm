package com.avito.android.payment.webview.mvi.component;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.payment.webview.model.a;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import x60.b;

/* compiled from: WebPaymentMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lx60/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.payment.webview.mvi.component.WebPaymentMviActor$handlePostMessage$1", f = "WebPaymentMviActor.kt", i = {0}, l = {196, 203}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super x60.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f214865q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f214866r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.payment.webview.mvi.component.a f214867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f214868t;

    /* compiled from: WebPaymentMviActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/payment/webview/model/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/payment/webview/model/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.payment.webview.mvi.component.WebPaymentMviActor$handlePostMessage$1$postMessageData$1", f = "WebPaymentMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super com.avito.android.payment.webview.model.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.payment.webview.mvi.component.a f214869q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f214870r;

        /* compiled from: Gsons.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.payment.webview.mvi.component.b$a$a, reason: collision with other inner class name */
        public static final class C6441a extends com.google.gson.reflect.a<com.avito.android.payment.webview.model.a> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.payment.webview.mvi.component.a aVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f214869q = aVar;
            this.f214870r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f214869q, this.f214870r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super com.avito.android.payment.webview.model.a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Gson gson = this.f214869q.f214863g.get();
            String str = this.f214870r;
            try {
                Type type = new C6441a().getType();
                return gson.e(str, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.payment.webview.mvi.component.a aVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f214867s = aVar;
        this.f214868t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f214867s, this.f214868t, continuation);
        bVar.f214866r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super x60.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f214865q;
        com.avito.android.payment.webview.mvi.component.a aVar = this.f214867s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f214866r;
            kotlinx.coroutines.scheduling.c cVarC = aVar.f214864h.c();
            a aVar2 = new a(aVar, this.f214868t, null);
            this.f214866r = interfaceC43172j;
            this.f214865q = 1;
            obj = C43259k.g(cVarC, aVar2, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f214866r;
            C42729a0.b(obj);
        }
        com.avito.android.payment.webview.model.a aVar3 = (com.avito.android.payment.webview.model.a) obj;
        if (aVar3 instanceof a.C6439a) {
            com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar.f214859c;
            a.C6439a c6439a = (a.C6439a) aVar3;
            DeepLink deeplink = c6439a.getDeeplink();
            if (deeplink != null) {
                aVar4.r6(null, deeplink, "web_payment_post_message_redirect");
            }
            if (L.f(c6439a.getCloseScreen(), Boxing.boxBoolean(true))) {
                b.a aVar5 = new b.a(null, 1, null);
                this.f214866r = null;
                this.f214865q = 2;
                if (interfaceC43172j.emit(aVar5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
