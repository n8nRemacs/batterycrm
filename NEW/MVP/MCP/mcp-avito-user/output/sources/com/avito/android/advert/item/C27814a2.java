package com.avito.android.advert.item;

import cU0.InterfaceC27108f;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import iT.C41343c;
import iT.InterfaceC41341a;
import java.util.Set;
import javax.inject.Inject;
import k4.C42498b;
import k4.C42501e;
import k4.InterfaceC42497a;
import k4.InterfaceC42499c;
import k4.InterfaceC42500d;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;

/* compiled from: AdvertDetailsViewModel.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/a2;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "Lk4/b;", "LiT/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.a2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27814a2 extends androidx.view.M0 implements com.avito.android.arch.mvi.android.k<Object, C42498b, Object>, InterfaceC41341a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f72495E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final aU0.b f72496J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C41343c f72497K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f72498L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f72499M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f72500N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f72501O = C42727D.c(new e());

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f72502P = C42727D.c(new d());

    /* compiled from: AdvertDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewModel$accept$1", f = "AdvertDetailsViewModel.kt", i = {}, l = {66, 67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.a2$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f72503q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f72504r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C27814a2 f72505s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C27814a2 c27814a2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f72504r = obj;
            this.f72505s = c27814a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f72504r, this.f72505s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f72503q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f72504r;
                boolean z12 = obj2 instanceof InterfaceC42497a;
                C27814a2 c27814a2 = this.f72505s;
                if (z12) {
                    com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) c27814a2.f72500N.getValue();
                    this.f72503q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC40047a) {
                    com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) c27814a2.f72499M.getValue();
                    this.f72503q = 2;
                    if (xVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Lk4/a;", "Lk4/c;", "Lk4/e;", "Lk4/d;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.a2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC42497a, InterfaceC42499c, C42501e, InterfaceC42500d>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert.item.advertdetails.mvi.d f72506l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C27814a2 f72507m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.advert.item.advertdetails.mvi.d dVar, C27814a2 c27814a2) {
            super(0);
            this.f72506l = dVar;
            this.f72507m = c27814a2;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC42497a, InterfaceC42499c, C42501e, InterfaceC42500d> invoke() {
            return this.f72506l.a(null, androidx.view.N0.a(this.f72507m));
        }
    }

    /* compiled from: AdvertDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.a2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f72508l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C27814a2 f72509m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n.a aVar, C27814a2 c27814a2) {
            super(0);
            this.f72508l = aVar;
            this.f72509m = c27814a2;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f72508l.a(androidx.view.N0.a(this.f72509m));
        }
    }

    /* compiled from: AdvertDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.a2$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<InterfaceC43160i<? extends Object>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends Object> invoke() {
            C27814a2 c27814a2 = C27814a2.this;
            return C43175k.N(((com.avito.android.lib.beduin_v2.feature.mvi.x) c27814a2.f72499M.getValue()).getEvents(), ((com.avito.android.arch.mvi.c) c27814a2.f72500N.getValue()).f91928q);
        }
    }

    /* compiled from: AdvertDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lk4/b;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.a2$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlinx.coroutines.flow.n2<? extends C42498b>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final kotlinx.coroutines.flow.n2<? extends C42498b> invoke() {
            C27814a2 c27814a2 = C27814a2.this;
            com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) c27814a2.f72499M.getValue();
            InterfaceC42726C interfaceC42726C = c27814a2.f72500N;
            kotlinx.coroutines.flow.C1 c12 = new kotlinx.coroutines.flow.C1(xVar, (com.avito.android.arch.mvi.c) interfaceC42726C.getValue(), new b2(3, null));
            A1.a aVarA = androidx.view.N0.a(c27814a2);
            kotlinx.coroutines.flow.i2.f411430a.getClass();
            return C43175k.U(c12, aVarA, i2.a.f411433c, new C42498b((C42501e) ((com.avito.android.arch.mvi.c) interfaceC42726C.getValue()).f91929r.get(), (AbstractC40048c) ((com.avito.android.lib.beduin_v2.feature.mvi.x) c27814a2.f72499M.getValue()).getState()));
        }
    }

    @Inject
    public C27814a2(@Y61.k n.a aVar, @Y61.k com.avito.android.advert.item.advertdetails.mvi.d dVar, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar, @Y61.k C41343c c41343c, @Y61.k com.avito.android.util.R0 r02) {
        this.f72495E = set;
        this.f72496J = bVar;
        this.f72497K = c41343c;
        this.f72498L = r02;
        this.f72499M = C42727D.c(new c(aVar, this));
        this.f72500N = C42727D.c(new b(dVar, this));
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f72497K.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z H4() {
        return this.f72497K.f398526b;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(androidx.view.N0.a(this), this.f72498L.b(), null, new a(obj, this, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return (InterfaceC43160i) this.f72502P.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final kotlinx.coroutines.flow.n2<C42498b> getState() {
        return (kotlinx.coroutines.flow.n2) this.f72501O.getValue();
    }
}
