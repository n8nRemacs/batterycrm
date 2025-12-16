package com.avito.android.safedeal.delivery.order_cancellation.details.usecase;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.error.f;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CancelOrderUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/usecase/a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal.delivery.order_cancellation.data.a f256263a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f256264b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f256265c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ReasonRds f256266d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f256267e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC28373a f256268f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Z0 f256269g;

    /* compiled from: CancelOrderUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.delivery.order_cancellation.details.usecase.CancelOrderUseCase$invoke$1", f = "CancelOrderUseCase.kt", i = {0, 1, 2}, l = {32, 33, 36, 39, 41, 45, 49, 54}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.details.usecase.a$a, reason: collision with other inner class name */
    public static final class C7676a extends SuspendLambda implements p<InterfaceC43172j<? super ReasonDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f256270q;

        /* renamed from: r, reason: collision with root package name */
        public Dn0.c f256271r;

        /* renamed from: s, reason: collision with root package name */
        public int f256272s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f256273t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Dn0.c f256275v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7676a(Dn0.c cVar, Continuation<? super C7676a> continuation) {
            super(2, continuation);
            this.f256275v = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7676a c7676a = a.this.new C7676a(this.f256275v, continuation);
            c7676a.f256273t = obj;
            return c7676a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ReasonDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7676a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal.delivery.order_cancellation.details.usecase.a.C7676a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.safedeal.delivery.order_cancellation.data.a aVar, @k f fVar, @Kn0.c @k String str, @k ReasonRds reasonRds, @k E e12, @k InterfaceC28373a interfaceC28373a, @k Z0 z02) {
        this.f256263a = aVar;
        this.f256264b = fVar;
        this.f256265c = str;
        this.f256266d = reasonRds;
        this.f256267e = e12;
        this.f256268f = interfaceC28373a;
        this.f256269g = z02;
    }

    @k
    public final InterfaceC43160i<ReasonDetailsInternalAction> a(@k Dn0.c cVar) {
        return C43175k.G(new C7676a(cVar, null));
    }
}
