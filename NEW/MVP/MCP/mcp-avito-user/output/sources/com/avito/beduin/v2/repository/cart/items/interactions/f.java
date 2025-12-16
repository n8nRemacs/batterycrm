package com.avito.beduin.v2.repository.cart.items.interactions;

import Y41.p;
import Y61.l;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
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

/* compiled from: CartItemsRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.cart.items.interactions.CartItemsRepositoryObserveInteractionHandler$observeData$1", f = "CartItemsRepositoryObserveInteractionHandler.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338140q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338141r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f338142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36272i f338143t;

    /* compiled from: CartItemsRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338144l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338144l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338144l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: CartItemsRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "itemId", "LYU0/b;", "itemInfo", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;LYU0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, YU0.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36272i f338145l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f338146m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C36272i c36272i, I0<? super com.avito.beduin.v2.engine.field.d> i02) {
            super(2);
            this.f338145l = c36272i;
            this.f338146m = i02;
        }

        @Override // Y41.p
        public final G0 invoke(String str, YU0.b bVar) {
            YU0.b bVar2 = bVar;
            C36272i c36272i = this.f338145l;
            this.f338146m.w(new A(new Q("itemId", c36272i.e(str)), new Q("itemInfo", bVar2 != null ? bVar2.a(c36272i) : com.avito.beduin.v2.engine.field.entity.f.f336800b)));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, C36272i c36272i, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f338142s = gVar;
        this.f338143t = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f338142s, this.f338143t, continuation);
        fVar.f338141r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super com.avito.beduin.v2.engine.field.d> i02, Continuation<? super G0> continuation) {
        return ((f) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338140q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338141r;
            a aVar = new a(this.f338142s.f338147c.a(new b(this.f338143t, i02)));
            this.f338140q = 1;
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
