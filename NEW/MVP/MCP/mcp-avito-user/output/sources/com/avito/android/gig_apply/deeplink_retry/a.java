package com.avito.android.gig_apply.deeplink_retry;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.error.z;
import com.avito.android.gig_apply.GigSlotRetryDeeplink;
import com.avito.android.remote.model.TypedResult;
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

/* compiled from: GigSlotRetryPaymentDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.deeplink_retry.GigSlotRetryPaymentDeeplinkHandler$doHandle$1", f = "GigSlotRetryPaymentDeeplinkHandler.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159606q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f159607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GigSlotRetryDeeplink f159608s;

    /* compiled from: GigSlotRetryPaymentDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.deeplink_retry.GigSlotRetryPaymentDeeplinkHandler$doHandle$1$1", f = "GigSlotRetryPaymentDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.gig_apply.deeplink_retry.a$a, reason: collision with other inner class name */
    public static final class C4666a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<IG.b> f159609q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gig_apply.deeplink_retry.b f159610r;

        /* compiled from: GigSlotRetryPaymentDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIG/b;", "it", "Lkotlin/G0;", "invoke", "(LIG/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.gig_apply.deeplink_retry.a$a$a, reason: collision with other inner class name */
        public static final class C4667a extends N implements l<IG.b, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.gig_apply.deeplink_retry.b f159611l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4667a(com.avito.android.gig_apply.deeplink_retry.b bVar) {
                super(1);
                this.f159611l = bVar;
            }

            @Override // Y41.l
            public final G0 invoke(IG.b bVar) {
                com.avito.android.gig_apply.deeplink_retry.b bVar2 = this.f159611l;
                bVar2.f159613f.g(null, false);
                bVar2.j(new GigSlotRetryDeeplink.b.C4659b(bVar2.f159615h.b(bVar.getUri())));
                return G0.f406611a;
            }
        }

        /* compiled from: GigSlotRetryPaymentDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.gig_apply.deeplink_retry.a$a$b */
        public static final class b extends N implements l<String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.gig_apply.deeplink_retry.b f159612l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.avito.android.gig_apply.deeplink_retry.b bVar) {
                super(1);
                this.f159612l = bVar;
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                com.avito.android.gig_apply.deeplink_retry.b bVar = this.f159612l;
                bVar.f159613f.g(null, false);
                bVar.j(new GigSlotRetryDeeplink.b.a(str));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4666a(TypedResult<IG.b> typedResult, com.avito.android.gig_apply.deeplink_retry.b bVar, Continuation<? super C4666a> continuation) {
            super(2, continuation);
            this.f159609q = typedResult;
            this.f159610r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new C4666a(this.f159609q, this.f159610r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4666a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.gig_apply.deeplink_retry.b bVar = this.f159610r;
            z.o(this.f159609q, new C4667a(bVar), new b(bVar), null, 60);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, GigSlotRetryDeeplink gigSlotRetryDeeplink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f159607r = bVar;
        this.f159608s = gigSlotRetryDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f159607r, this.f159608s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159606q;
        b bVar = this.f159607r;
        if (i12 == 0) {
            C42729a0.b(obj);
            IG.a aVar = new IG.a(this.f159608s.f159530b);
            this.f159606q = 1;
            obj = bVar.f159614g.a(aVar, this);
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
        AbstractC43129d1 abstractC43129d1B = bVar.f159616i.b();
        C4666a c4666a = new C4666a((TypedResult) obj, bVar, null);
        this.f159606q = 2;
        if (C43259k.g(abstractC43129d1B, c4666a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
