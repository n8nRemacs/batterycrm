package com.avito.android.lib.beduin_v2.feature.item;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.app.m;
import cU.s;
import cU.t;
import cU.v;
import cU0.InterfaceC27108f;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.beduin.v2.engine.component.z;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: BeduinItemImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/item/f;", "Lcom/avito/android/lib/beduin_v2/feature/item/a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class f implements com.avito.android.lib.beduin_v2.feature.item.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FrameLayout f176166a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ZS.b f176167b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f176168c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final z f176169d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC27108f f176170e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f176171f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f176172g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BeduinView f176173h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public C43238h f176174i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public h f176175j;

    /* compiled from: BeduinItemImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.item.BeduinItemImpl$bind$1", f = "BeduinItemImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f176176q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ h f176177r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f176178s;

        /* compiled from: BeduinItemImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.item.BeduinItemImpl$bind$1$1", f = "BeduinItemImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.lib.beduin_v2.feature.item.f$a$a, reason: collision with other inner class name */
        public static final class C5212a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f176179q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f176180r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f176181s;

            /* compiled from: BeduinItemImpl.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.lib.beduin_v2.feature.item.f$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C5213a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f176182b;

                public C5213a(f fVar) {
                    this.f176182b = fVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    BeduinOneTimeEvent beduinOneTimeEvent = (BeduinOneTimeEvent) obj;
                    f fVar = this.f176182b;
                    fVar.getClass();
                    if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) && !(beduinOneTimeEvent instanceof BeduinOneTimeEvent.b)) {
                        if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                            fVar.f176173h.c(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
                        } else if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d)) {
                            boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.c;
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f176182b, f.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5212a(h hVar, f fVar, Continuation<? super C5212a> continuation) {
                super(2, continuation);
                this.f176180r = hVar;
                this.f176181s = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5212a(this.f176180r, this.f176181s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5212a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f176179q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    h hVar = this.f176180r;
                    C5213a c5213a = new C5213a(this.f176181s);
                    this.f176179q = 1;
                    if (hVar.f176194e.collect(c5213a, this) == coroutine_suspended) {
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

        /* compiled from: BeduinItemImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.item.BeduinItemImpl$bind$1$2", f = "BeduinItemImpl.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f176183q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f176184r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f176185s;

            /* compiled from: BeduinItemImpl.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.lib.beduin_v2.feature.item.f$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C5214a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f176186b;

                public C5214a(f fVar) {
                    this.f176186b = fVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    AbstractC40048c abstractC40048c = (AbstractC40048c) obj;
                    f fVar = this.f176186b;
                    fVar.getClass();
                    if (!(abstractC40048c instanceof AbstractC40048c.d)) {
                        if (abstractC40048c instanceof AbstractC40048c.a) {
                            fVar.f176173h.b(((AbstractC40048c.a) abstractC40048c).getF395211c());
                        } else if (abstractC40048c instanceof AbstractC40048c.b) {
                            V2.f318762a.f(((AbstractC40048c.b) abstractC40048c).f395216b);
                        } else {
                            boolean z12 = abstractC40048c instanceof AbstractC40048c.C11084c;
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f176186b, f.class, "render", "render(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, f fVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f176184r = hVar;
                this.f176185s = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f176184r, this.f176185s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f176183q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    n2<AbstractC40048c> n2Var = this.f176184r.f176193d;
                    C5214a c5214a = new C5214a(this.f176185s);
                    this.f176183q = 1;
                    if (n2Var.collect(c5214a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176177r = hVar;
            this.f176178s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f176177r, this.f176178s, continuation);
            aVar.f176176q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f176176q;
            h hVar = this.f176177r;
            f fVar = this.f176178s;
            C43259k.d(t12, null, null, new C5212a(hVar, fVar, null), 3);
            C43259k.d(t12, null, null, new b(hVar, fVar, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinItemImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<H> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final H invoke() {
            return f.this.c();
        }
    }

    public f(@k ZS.b bVar, @k FrameLayout frameLayout, @k InterfaceC27108f interfaceC27108f, @k ScreenPerformanceTracker screenPerformanceTracker, @k z zVar, boolean z12) {
        this.f176166a = frameLayout;
        this.f176167b = bVar;
        this.f176168c = screenPerformanceTracker;
        this.f176169d = zVar;
        this.f176170e = interfaceC27108f;
        this.f176171f = z12;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b());
        this.f176172g = interfaceC42726CC;
        Context context = frameLayout.getContext();
        t tVarA = ((s.b) C29972i.a(C29972i.b(context), s.b.class)).fd().a(context, screenPerformanceTracker, ((H) interfaceC42726CC.getValue()).b(), v.f57891a, zVar.a());
        BeduinView beduinView = new BeduinView(context, null, 0, 0, 14, null);
        A aB2 = tVarA.b();
        com.avito.beduin.v2.theme.k kVarA = tVarA.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f176173h = beduinView;
        frameLayout.removeAllViews();
        frameLayout.addView(beduinView);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    public final void T3(@k String str) {
        D6.H(this.f176173h);
        C43238h c43238h = this.f176174i;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(K.f411877a.y());
        h hVar = new h(c43238hA, (this.f176171f ? c() : (H) this.f176172g.getValue()).c());
        this.f176174i = c43238hA;
        this.f176175j = hVar;
        C43259k.d(c43238hA, null, null, new a(hVar, this, null), 3);
        C43259k.d(c43238hA, null, null, new g(hVar, new InterfaceC40047a.e(str, this.f176167b), null), 3);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    public final void a() {
        D6.w(this.f176173h);
        C43238h c43238h = this.f176174i;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f176174i = null;
        this.f176175j = null;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    public final boolean b() {
        return this.f176175j != null;
    }

    public final H c() {
        m mVarC = C35835l0.c(this.f176166a.getContext());
        return com.avito.android.lib.beduin_v2.feature.di.K.a(((H.b) C29972i.a(C29972i.b(mVarC), H.b.class)).ed(), this.f176168c, this.f176167b, cv.c.c(mVarC), this.f176170e, this.f176169d, null, 32);
    }
}
