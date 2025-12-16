package com.avito.android.bxcontent;

import bY.InterfaceC25585b;
import bY.InterfaceC25596c;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.bxcontent.InterfaceC28963b;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.map.mvi.entity.MapInternalAction;
import i31.InterfaceC41220a;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.C43221z1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: BxContentCombinationFeatureManager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/d;", "Lcom/avito/android/bxcontent/o;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C28969d implements InterfaceC29238o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Screen f109653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A1.a f109654c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.beduin.H f109655d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> f109656e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.arch.mvi.c<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c> f109657f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.beduin_v2.feature.mvi.x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f109658g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final n2<C29099l> f109659h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f109660i;

    /* compiled from: BxContentCombinationFeatureManager.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/d$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.d$a */
    public interface a {
        @Y61.k
        C28969d a(@Y61.k A1.a aVar, @Y61.k com.avito.android.advertising.loaders.beduin.H h12);
    }

    /* compiled from: BxContentCombinationFeatureManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$accept$1", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {116, 117, 118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.d$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f109661q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f109662r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C28969d f109663s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, C28969d c28969d, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f109662r = obj;
            this.f109663s = c28969d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f109662r, this.f109663s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.lib.beduin_v2.feature.mvi.x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> xVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f109661q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f109662r;
                boolean z12 = obj2 instanceof InterfaceC29127b;
                C28969d c28969d = this.f109663s;
                if (z12) {
                    com.avito.android.arch.mvi.c<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> cVar = c28969d.f109656e;
                    this.f109661q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC25585b) {
                    com.avito.android.arch.mvi.c<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c> cVar2 = c28969d.f109657f;
                    if (cVar2 != 0) {
                        this.f109661q = 2;
                        if (cVar2.ya(obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if ((obj2 instanceof InterfaceC40047a) && (xVar = c28969d.f109658g) != 0) {
                    this.f109661q = 3;
                    if (xVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    @i31.c
    public C28969d(@Y61.k C29090i c29090i, @Y61.k com.avito.android.arch.mvi.q qVar, @Y61.k h31.e eVar, @Y61.k h31.e eVar2, @Y61.k Screen screen, @InterfaceC41220a @Y61.k A1.a aVar, @InterfaceC41220a @Y61.k com.avito.android.advertising.loaders.beduin.H h12) {
        InterfaceC43160i<OneTimeEvent> interfaceC43160i;
        InterfaceC43160i<InterfaceC25596c> interfaceC43160i2;
        this.f109653b = screen;
        this.f109654c = aVar;
        this.f109655d = h12;
        com.avito.android.arch.mvi.c<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> cVarA = qVar.a(null, aVar);
        this.f109656e = cVarA;
        com.avito.android.arch.mvi.c<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c> cVarA2 = c29090i.f111124b ? ((com.avito.android.arch.mvi.q) eVar.get()).a(null, aVar) : null;
        this.f109657f = cVarA2;
        com.avito.android.lib.beduin_v2.feature.mvi.y yVarA = c29090i.f111123a ? ((n.a) eVar2.get()).a(aVar) : null;
        this.f109658g = yVarA;
        C43221z1 c43221z1K = C43175k.k(cVarA, cVarA2 != null ? cVarA2 : new C43210w(null), yVarA != null ? yVarA : new C43210w(null), new C29087h(4, null));
        i2.f411430a.getClass();
        this.f109659h = C43175k.U(c43221z1K, aVar, i2.a.f411433c, new C29099l(cVarA.f91929r.get(), cVarA2 != null ? cVarA2.f91929r.get() : null, yVarA != null ? (AbstractC40048c) yVarA.getState() : null));
        InterfaceC43160i interfaceC43160iG = C43175k.G(new C29078e(cVarA.f91928q, null, this));
        InterfaceC43160i interfaceC43160iG2 = (cVarA2 == null || (interfaceC43160i2 = cVarA2.f91928q) == null) ? null : C43175k.G(new C29081f(interfaceC43160i2, null, this));
        interfaceC43160iG2 = interfaceC43160iG2 == null ? new C43210w(null) : interfaceC43160iG2;
        InterfaceC43160i interfaceC43160iG3 = (yVarA == null || (interfaceC43160i = yVarA.f176364c) == 0) ? null : C43175k.G(new C29084g(interfaceC43160i, null, this));
        this.f109660i = new C43189o1(C43175k.N(interfaceC43160iG, interfaceC43160iG2, interfaceC43160iG3 == null ? new C43210w(null) : interfaceC43160iG3));
    }

    @Y61.k
    public final com.avito.android.bxcontent.mvi.entity.l a() {
        return this.f109659h.getValue().f111141a;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(this.f109654c, null, null, new b(obj, this, null), 3);
    }

    @Y61.l
    public final com.avito.android.map.mvi.entity.a b() {
        return this.f109659h.getValue().f111142b;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC28963b.InterfaceC3268b> getEvents() {
        return this.f109660i;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C29099l> getState() {
        return this.f109659h;
    }
}
