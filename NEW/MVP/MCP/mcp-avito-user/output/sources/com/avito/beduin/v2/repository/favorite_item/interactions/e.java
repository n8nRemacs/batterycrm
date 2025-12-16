package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y41.l;
import Y41.p;
import Y61.k;
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
import lV0.C43689a;

/* compiled from: FavoriteItemRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.favorite_item.interactions.FavoriteItemRepositoryObserveInteractionHandler$observeData$1", f = "FavoriteItemRepositoryObserveInteractionHandler.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338264q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f338266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f338267t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f338268u;

    /* compiled from: FavoriteItemRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338269l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338269l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338269l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteItemRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlV0/a;", "it", "Lkotlin/G0;", "invoke", "(LlV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<C43689a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f338270l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C36272i f338271m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36272i c36272i, I0 i02) {
            super(1);
            this.f338270l = i02;
            this.f338271m = c36272i;
        }

        @Override // Y41.l
        public final G0 invoke(C43689a c43689a) {
            com.avito.beduin.v2.engine.field.d a12;
            C43689a c43689a2 = c43689a;
            if (c43689a2 != null) {
                a12 = new A(new Q("favorite", this.f338271m.f(c43689a2.f413819a)));
            } else {
                a12 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            this.f338270l.w(a12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar, C36272i c36272i, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f338266s = fVar;
        this.f338267t = dVar;
        this.f338268u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f338266s, this.f338267t, this.f338268u, continuation);
        eVar.f338265r = obj;
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
        int i12 = this.f338264q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338265r;
            a aVar = new a(this.f338266s.f338272c.m(this.f338267t.f338262e, new b(this.f338268u, i02)));
            this.f338264q = 1;
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
