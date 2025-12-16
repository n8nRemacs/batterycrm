package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.C20321u;
import androidx.compose.animation.core.J1;
import androidx.compose.animation.core.R0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.unit.q;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;

/* compiled from: LazyLayoutItemAnimation.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p;", "", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20737p {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final b f29480s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    public static final long f29481t;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f29482a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22264l0 f29483b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f29484c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public R0 f29485d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public R0 f29486e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public R0 f29487f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29488g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29489h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29490i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29491j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29492k;

    /* renamed from: l, reason: collision with root package name */
    public long f29493l;

    /* renamed from: m, reason: collision with root package name */
    public long f29494m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public C22267c f29495n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C20268c<androidx.compose.ui.unit.q, C20321u> f29496o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f29497p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29498q;

    /* renamed from: r, reason: collision with root package name */
    public long f29499r;

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29500l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.p$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29501q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20737p.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29501q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = C20737p.this.f29497p;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                this.f29501q = 1;
                if (c20268c.h(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$d */
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29503q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f29504r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20737p f29505s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ R0 f29506t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C22267c f29507u;

        /* compiled from: LazyLayoutItemAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.lazy.layout.p$d$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C22267c f29508l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C20737p f29509m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22267c c22267c, C20737p c20737p) {
                super(1);
                this.f29508l = c22267c;
                this.f29509m = c20737p;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
                this.f29508l.g(c20268c.f().floatValue());
                this.f29509m.f29484c.invoke();
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, C20737p c20737p, R0 r02, C22267c c22267c, Continuation continuation) {
            super(2, continuation);
            this.f29504r = z12;
            this.f29505s = c20737p;
            this.f29506t = r02;
            this.f29507u = c22267c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f29504r, this.f29505s, this.f29506t, this.f29507u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29503q;
            C20737p c20737p = this.f29505s;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    if (this.f29504r) {
                        C20268c<Float, C20318t> c20268c = c20737p.f29497p;
                        Float fBoxFloat = Boxing.boxFloat(0.0f);
                        this.f29503q = 1;
                        if (c20268c.h(fBoxFloat, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        b bVar = C20737p.f29480s;
                        c20737p.e(false);
                        return kotlin.G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                C20268c<Float, C20318t> c20268c2 = c20737p.f29497p;
                Float fBoxFloat2 = Boxing.boxFloat(1.0f);
                R0 r02 = this.f29506t;
                a aVar = new a(this.f29507u, c20737p);
                this.f29503q = 2;
                if (C20268c.c(c20268c2, fBoxFloat2, r02, null, aVar, this, 4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                b bVar2 = C20737p.f29480s;
                c20737p.e(false);
                return kotlin.G0.f406611a;
            } catch (Throwable th2) {
                b bVar3 = C20737p.f29480s;
                c20737p.e(false);
                throw th2;
            }
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$e */
    public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29510q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20737p.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29510q;
            C20737p c20737p = C20737p.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<androidx.compose.ui.unit.q, C20321u> c20268c = c20737p.f29496o;
                androidx.compose.ui.unit.q.f42862b.getClass();
                androidx.compose.ui.unit.q qVarA = androidx.compose.ui.unit.q.a(0L);
                this.f29510q = 1;
                if (c20268c.h(qVarA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            androidx.compose.ui.unit.q.f42862b.getClass();
            b bVar = C20737p.f29480s;
            c20737p.h(0L);
            c20737p.g(false);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {JfifUtil.MARKER_SOS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$f */
    public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29512q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20737p.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29512q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<androidx.compose.ui.unit.q, C20321u> c20268c = C20737p.this.f29496o;
                this.f29512q = 1;
                if (c20268c.i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$g */
    public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29514q;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20737p.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29514q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = C20737p.this.f29497p;
                this.f29514q = 1;
                if (c20268c.i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.p$h */
    public static final class h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29516q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20737p.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29516q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = C20737p.this.f29497p;
                this.f29516q = 1;
                if (c20268c.i(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        long j12 = Integer.MAX_VALUE;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        f29481t = (j12 & 4294967295L) | (j12 << 32);
    }

    public C20737p(@Y61.k kotlinx.coroutines.T t12, @Y61.l InterfaceC22264l0 interfaceC22264l0, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f29482a = t12;
        this.f29483b = interfaceC22264l0;
        this.f29484c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f29489h = C22126m3.g(bool);
        this.f29490i = C22126m3.g(bool);
        this.f29491j = C22126m3.g(bool);
        this.f29492k = C22126m3.g(bool);
        long j12 = f29481t;
        this.f29493l = j12;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f29494m = 0L;
        this.f29495n = interfaceC22264l0 != null ? interfaceC22264l0.a() : null;
        this.f29496o = new C20268c<>(androidx.compose.ui.unit.q.a(0L), J1.f26081g, null, null, 12, null);
        Float fValueOf = Float.valueOf(1.0f);
        int i12 = kotlin.jvm.internal.A.f406820a;
        this.f29497p = new C20268c<>(fValueOf, J1.f26075a, null, null, 12, null);
        this.f29498q = C22126m3.g(androidx.compose.ui.unit.q.a(0L));
        this.f29499r = j12;
    }

    public final void a() {
        C22267c c22267c = this.f29495n;
        R0 r02 = this.f29485d;
        boolean zBooleanValue = ((Boolean) ((C22082i3) this.f29490i).getF42167b()).booleanValue();
        kotlinx.coroutines.T t12 = this.f29482a;
        if (zBooleanValue || r02 == null || c22267c == null) {
            if (c()) {
                if (c22267c != null) {
                    c22267c.g(1.0f);
                }
                C43259k.d(t12, null, null, new c(null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean zC2 = c();
        boolean z12 = !zC2;
        if (!zC2) {
            c22267c.g(0.0f);
        }
        C43259k.d(t12, null, null, new d(z12, this, r02, c22267c, null), 3);
    }

    public final void b() {
        if (((Boolean) ((C22082i3) this.f29489h).getF42167b()).booleanValue()) {
            C43259k.d(this.f29482a, null, null, new e(null), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) ((C22082i3) this.f29491j).getF42167b()).booleanValue();
    }

    public final void d() {
        InterfaceC22264l0 interfaceC22264l0;
        boolean zBooleanValue = ((Boolean) ((C22082i3) this.f29489h).getF42167b()).booleanValue();
        kotlinx.coroutines.T t12 = this.f29482a;
        if (zBooleanValue) {
            g(false);
            C43259k.d(t12, null, null, new f(null), 3);
        }
        if (((Boolean) ((C22082i3) this.f29490i).getF42167b()).booleanValue()) {
            e(false);
            C43259k.d(t12, null, null, new g(null), 3);
        }
        if (c()) {
            f(false);
            C43259k.d(t12, null, null, new h(null), 3);
        }
        this.f29488g = false;
        androidx.compose.ui.unit.q.f42862b.getClass();
        h(0L);
        this.f29493l = f29481t;
        C22267c c22267c = this.f29495n;
        if (c22267c != null && (interfaceC22264l0 = this.f29483b) != null) {
            interfaceC22264l0.b(c22267c);
        }
        this.f29495n = null;
        this.f29485d = null;
        this.f29487f = null;
        this.f29486e = null;
    }

    public final void e(boolean z12) {
        ((C22082i3) this.f29490i).setValue(Boolean.valueOf(z12));
    }

    public final void f(boolean z12) {
        ((C22082i3) this.f29491j).setValue(Boolean.valueOf(z12));
    }

    public final void g(boolean z12) {
        ((C22082i3) this.f29489h).setValue(Boolean.valueOf(z12));
    }

    public final void h(long j12) {
        ((C22082i3) this.f29498q).setValue(androidx.compose.ui.unit.q.a(j12));
    }

    public /* synthetic */ C20737p(kotlinx.coroutines.T t12, InterfaceC22264l0 interfaceC22264l0, Y41.a aVar, int i12, C42822w c42822w) {
        this(t12, (i12 & 2) != 0 ? null : interfaceC22264l0, (i12 & 4) != 0 ? a.f29500l : aVar);
    }
}
