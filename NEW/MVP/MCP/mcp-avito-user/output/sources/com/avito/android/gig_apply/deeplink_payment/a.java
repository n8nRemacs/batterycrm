package com.avito.android.gig_apply.deeplink_payment;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.error.z;
import com.avito.android.gig_apply.GigSlotReceivePaymentDeeplink;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: GigSlotReceivePaymentDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.deeplink_payment.GigSlotReceivePaymentDeeplinkHandler$doHandle$1", f = "GigSlotReceivePaymentDeeplinkHandler.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159585q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f159586r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GigSlotReceivePaymentDeeplink f159587s;

    /* compiled from: GigSlotReceivePaymentDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.deeplink_payment.GigSlotReceivePaymentDeeplinkHandler$doHandle$1$1", f = "GigSlotReceivePaymentDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.gig_apply.deeplink_payment.a$a, reason: collision with other inner class name */
    public static final class C4664a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<JG.a> f159588q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gig_apply.deeplink_payment.b f159589r;

        /* compiled from: GigSlotReceivePaymentDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJG/a;", "it", "Lkotlin/G0;", "invoke", "(LJG/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.gig_apply.deeplink_payment.a$a$a, reason: collision with other inner class name */
        public static final class C4665a extends N implements l<JG.a, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.gig_apply.deeplink_payment.b f159590l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4665a(com.avito.android.gig_apply.deeplink_payment.b bVar) {
                super(1);
                this.f159590l = bVar;
            }

            @Override // Y41.l
            public final G0 invoke(JG.a aVar) {
                com.avito.android.gig_apply.deeplink_payment.b bVar = this.f159590l;
                bVar.f159592f.g(null, false);
                bVar.j(new GigSlotReceivePaymentDeeplink.b.C4658b(bVar.f159594h.b(aVar.getUri())));
                return G0.f406611a;
            }
        }

        /* compiled from: GigSlotReceivePaymentDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.gig_apply.deeplink_payment.a$a$b */
        public static final class b extends N implements l<String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.gig_apply.deeplink_payment.b f159591l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.avito.android.gig_apply.deeplink_payment.b bVar) {
                super(1);
                this.f159591l = bVar;
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                com.avito.android.gig_apply.deeplink_payment.b bVar = this.f159591l;
                bVar.f159592f.g(null, false);
                bVar.j(GigSlotReceivePaymentDeeplink.b.a.f159527b);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4664a(TypedResult<JG.a> typedResult, com.avito.android.gig_apply.deeplink_payment.b bVar, Continuation<? super C4664a> continuation) {
            super(2, continuation);
            this.f159588q = typedResult;
            this.f159589r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new C4664a(this.f159588q, this.f159589r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4664a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.gig_apply.deeplink_payment.b bVar = this.f159589r;
            z.o(this.f159588q, new C4665a(bVar), new b(bVar), null, 60);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, GigSlotReceivePaymentDeeplink gigSlotReceivePaymentDeeplink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f159586r = bVar;
        this.f159587s = gigSlotReceivePaymentDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f159586r, this.f159587s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159585q;
        b bVar = this.f159586r;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = this.f159587s.f159526b;
            this.f159585q = 1;
            obj = bVar.f159593g.b(j12, this);
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
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B = bVar.f159595i.b();
        C4664a c4664a = new C4664a((TypedResult) obj, bVar, null);
        this.f159585q = 2;
        if (C43259k.g(abstractC43129d1B, c4664a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
