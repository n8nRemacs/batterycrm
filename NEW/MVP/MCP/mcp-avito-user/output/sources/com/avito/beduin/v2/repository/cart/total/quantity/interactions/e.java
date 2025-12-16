package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import Y41.p;
import Y61.k;
import bV0.C25569a;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: CartTotalQuantityRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.cart.total.quantity.interactions.CartTotalQuantityRepositoryObserveInteractionHandler$observeData$1", f = "CartTotalQuantityRepositoryObserveInteractionHandler.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338159q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338160r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f338161s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36272i f338162t;

    /* compiled from: CartTotalQuantityRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338163l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338163l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: CartTotalQuantityRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbV0/a;", "it", "Lkotlin/G0;", "invoke", "(LbV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<C25569a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f338164l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C36272i f338165m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36272i c36272i, I0 i02) {
            super(1);
            this.f338164l = i02;
            this.f338165m = c36272i;
        }

        @Override // Y41.l
        public final G0 invoke(C25569a c25569a) {
            com.avito.beduin.v2.engine.field.d a12;
            C25569a c25569a2 = c25569a;
            if (c25569a2 != null) {
                a12 = new A(new Q("quantity", this.f338165m.c(c25569a2.f57097a)));
            } else {
                a12 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            this.f338164l.w(a12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, C36272i c36272i, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f338161s = fVar;
        this.f338162t = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f338161s, this.f338162t, continuation);
        eVar.f338160r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super com.avito.beduin.v2.engine.field.d> i02, Continuation<? super G0> continuation) {
        return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338159q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338160r;
            a aVar = new a(this.f338161s.f338166c.c(new b(this.f338162t, i02)));
            this.f338159q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
