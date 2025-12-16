package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/s;", "T", "", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@F3
/* renamed from: androidx.compose.foundation.gestures.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20501s<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f27961p = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super T, Boolean> f27962a;

    /* renamed from: b, reason: collision with root package name */
    public Y41.l<? super Float, Float> f27963b;

    /* renamed from: c, reason: collision with root package name */
    public Y41.a<Float> f27964c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.compose.animation.core.G1 f27965d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.compose.animation.core.H<Float> f27966e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.G1 f27967f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f27968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f27969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final I3 f27970i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f27971j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final I3 f27972k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f27973l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f27974m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f27975n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final e f27976o;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27977l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/s$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {1170}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.s$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C20501s f27978q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27979r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20501s<T> f27980s;

        /* renamed from: t, reason: collision with root package name */
        public int f27981t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C20501s<T> c20501s, Continuation<? super c> continuation) {
            super(continuation);
            this.f27980s = c20501s;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f27979r = obj;
            this.f27981t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f27980s.a(null, null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {1172}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.s$d */
    public static final class d extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27982q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20501s<T> f27983r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f27984s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f27985t;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/foundation/gestures/T0;", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.s$d$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.Q<? extends T0<T>, ? extends T>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C20501s<T> f27986l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20501s<T> c20501s) {
                super(0);
                this.f27986l = c20501s;
            }

            @Override // Y41.a
            public final Object invoke() {
                C20501s<T> c20501s = this.f27986l;
                return new kotlin.Q(c20501s.c(), c20501s.f27970i.getF42167b());
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/foundation/gestures/T0;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.s$d$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlin.Q<? extends T0<T>, ? extends T>, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f27987q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f27988r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f27989s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C20501s<T> f27990t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Y41.r<? super InterfaceC20430a, ? super T0<T>, ? super T, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, C20501s<T> c20501s, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f27989s = (SuspendLambda) rVar;
                this.f27990t = c20501s;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f27989s, this.f27990t, continuation);
                bVar.f27988r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super kotlin.G0> continuation) {
                return ((b) create((kotlin.Q) obj, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f27987q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    kotlin.Q q12 = (kotlin.Q) this.f27988r;
                    T0 t02 = (T0) q12.f406619b;
                    e eVar = this.f27990t.f27976o;
                    this.f27987q = 1;
                    if (this.f27989s.invoke(eVar, t02, q12.f406620c, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C20501s<T> c20501s, T t12, Y41.r<? super InterfaceC20430a, ? super T0<T>, ? super T, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f27983r = c20501s;
            this.f27984s = t12;
            this.f27985t = (SuspendLambda) rVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
            return new d(this.f27983r, this.f27984s, this.f27985t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super kotlin.G0> continuation) {
            return ((d) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27982q;
            T t12 = this.f27984s;
            C20501s<T> c20501s = this.f27983r;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = C20501s.f27961p;
                ((C22082i3) c20501s.f27974m).setValue(t12);
                a aVar = new a(c20501s);
                b bVar = new b(this.f27985t, c20501s, null);
                this.f27982q = 1;
                if (C20438c.d(aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            if (c20501s.f27962a.invoke(t12).booleanValue()) {
                c20501s.f27976o.a(c20501s.c().c(t12), ((C22040c3) c20501s.f27973l).f());
                ((C22082i3) c20501s.f27969h).setValue(t12);
                c20501s.g(t12);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/s$e", "Landroidx/compose/foundation/gestures/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$e */
    public static final class e implements InterfaceC20430a {

        /* renamed from: a, reason: collision with root package name */
        public T f27991a;

        /* renamed from: b, reason: collision with root package name */
        public T f27992b;

        /* renamed from: c, reason: collision with root package name */
        public float f27993c = Float.NaN;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C20501s<T> f27994d;

        public e(C20501s<T> c20501s) {
            this.f27994d = c20501s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.foundation.gestures.InterfaceC20430a
        public final void a(float f12, float f13) {
            C20501s<T> c20501s = this.f27994d;
            float f14 = ((C22040c3) c20501s.f27971j).f();
            ((C22040c3) c20501s.f27971j).S6(f12);
            ((C22040c3) c20501s.f27973l).S6(f13);
            if (Float.isNaN(f14)) {
                return;
            }
            boolean z12 = f12 >= f14;
            T0 t0C = c20501s.c();
            InterfaceC22204y1 interfaceC22204y1 = c20501s.f27968g;
            C22082i3 c22082i3 = (C22082i3) interfaceC22204y1;
            float fC2 = t0C.c(c22082i3.getF42167b());
            InterfaceC22192v1 interfaceC22192v1 = c20501s.f27971j;
            C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
            if (c22040c3.f() == fC2) {
                T t12 = (T) c20501s.c().b(c22040c3.f() + (z12 ? 1.0f : -1.0f), z12);
                if (t12 == null) {
                    t12 = (T) c22082i3.getF42167b();
                }
                if (z12) {
                    this.f27991a = (T) c22082i3.getF42167b();
                    this.f27992b = t12;
                } else {
                    this.f27991a = t12;
                    this.f27992b = (T) c22082i3.getF42167b();
                }
            } else {
                T t13 = (T) c20501s.c().b(c22040c3.f(), false);
                if (t13 == null) {
                    t13 = (T) c22082i3.getF42167b();
                }
                T t14 = (T) c20501s.c().b(c22040c3.f(), true);
                if (t14 == null) {
                    t14 = (T) c22082i3.getF42167b();
                }
                this.f27991a = t13;
                this.f27992b = t14;
            }
            this.f27993c = Math.abs(c20501s.c().c(this.f27991a) - c20501s.c().c(this.f27992b));
            if (Math.abs(((C22040c3) interfaceC22192v1).f() - c20501s.c().c(((C22082i3) interfaceC22204y1).getF42167b())) >= this.f27993c / 2.0f) {
                Object f42167b = z12 ? this.f27992b : this.f27991a;
                if (f42167b == null) {
                    f42167b = ((C22082i3) interfaceC22204y1).getF42167b();
                }
                if (c20501s.f27962a.invoke(f42167b).booleanValue()) {
                    c20501s.g(f42167b);
                }
            }
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f27995l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20501s<T> f27996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C20501s<T> c20501s) {
            super(0);
            this.f27996l = c20501s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final Float invoke() {
            C20501s<T> c20501s = this.f27996l;
            float fC2 = c20501s.c().c(((C22082i3) c20501s.f27969h).getF42167b());
            float fC3 = c20501s.c().c(c20501s.f27970i.getF42167b()) - fC2;
            float fAbs = Math.abs(fC3);
            float f12 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float f13 = (c20501s.f() - fC2) / fC3;
                if (f13 < 1.0E-6f) {
                    f12 = 0.0f;
                } else if (f13 <= 0.999999f) {
                    f12 = f13;
                }
            }
            return Float.valueOf(f12);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.s$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20501s<T> f27997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C20501s<T> c20501s) {
            super(0);
            this.f27997l = c20501s;
        }

        @Override // Y41.a
        public final T invoke() {
            T tA2;
            C20501s<T> c20501s = this.f27997l;
            T t12 = (T) ((C22082i3) c20501s.f27974m).getF42167b();
            if (t12 != null) {
                return t12;
            }
            boolean zIsNaN = Float.isNaN(((C22040c3) c20501s.f27971j).f());
            InterfaceC22204y1 interfaceC22204y1 = c20501s.f27968g;
            if (zIsNaN || (tA2 = c20501s.c().a(((C22040c3) c20501s.f27971j).f())) == null) {
                tA2 = (T) ((C22082i3) interfaceC22204y1).getF42167b();
            }
            return tA2;
        }
    }

    static {
        new b(null);
    }

    @InterfaceC42830m
    public C20501s() {
        throw null;
    }

    public C20501s(T t12) {
        this.f27962a = f.f27995l;
        this.f27967f = new androidx.compose.foundation.G1();
        this.f27968g = C22126m3.g(t12);
        this.f27969h = C22126m3.g(t12);
        this.f27970i = C22126m3.d(new h(this));
        this.f27971j = androidx.compose.runtime.Q1.a(Float.NaN);
        this.f27972k = C22126m3.e(new g(this), C22126m3.o());
        this.f27973l = androidx.compose.runtime.Q1.a(0.0f);
        this.f27974m = C22126m3.g(null);
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = C20438c.f27581a;
        this.f27975n = C22126m3.g(new Q(C42784z0.f406748b, new float[0]));
        this.f27976o = new e(this);
    }

    public static Object b(C20501s c20501s, Y41.q qVar, ContinuationImpl continuationImpl) {
        MutatePriority mutatePriority = MutatePriority.f26797b;
        c20501s.getClass();
        Object objB = c20501s.f27967f.b(mutatePriority, new B(qVar, c20501s, null), continuationImpl);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r6, @Y61.k androidx.compose.foundation.MutatePriority r7, @Y61.k Y41.r<? super androidx.compose.foundation.gestures.InterfaceC20430a, ? super androidx.compose.foundation.gestures.T0<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.C20501s.c
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.s$c r0 = (androidx.compose.foundation.gestures.C20501s.c) r0
            int r1 = r0.f27981t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27981t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.s$c r0 = new androidx.compose.foundation.gestures.s$c
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f27979r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27981t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.foundation.gestures.s r6 = r0.f27978q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r7 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r9)
            androidx.compose.foundation.gestures.T0 r9 = r5.c()
            boolean r9 = r9.f(r6)
            if (r9 == 0) goto L6a
            androidx.compose.foundation.G1 r9 = r5.f27967f     // Catch: java.lang.Throwable -> L60
            androidx.compose.foundation.gestures.s$d r2 = new androidx.compose.foundation.gestures.s$d     // Catch: java.lang.Throwable -> L60
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L60
            r0.f27978q = r5     // Catch: java.lang.Throwable -> L60
            r0.f27981t = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r9.b(r7, r2, r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L55
            return r1
        L55:
            r6 = r5
        L56:
            androidx.compose.runtime.y1 r6 = r6.f27974m
            androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.C22082i3) r6
            r6.setValue(r4)
            goto L82
        L5e:
            r6 = r5
            goto L62
        L60:
            r7 = move-exception
            goto L5e
        L62:
            androidx.compose.runtime.y1 r6 = r6.f27974m
            androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.C22082i3) r6
            r6.setValue(r4)
            throw r7
        L6a:
            Y41.l<? super T, java.lang.Boolean> r7 = r5.f27962a
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L82
            androidx.compose.runtime.y1 r7 = r5.f27969h
            androidx.compose.runtime.i3 r7 = (androidx.compose.runtime.C22082i3) r7
            r7.setValue(r6)
            r5.g(r6)
        L82:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20501s.a(java.lang.Object, androidx.compose.foundation.MutatePriority, Y41.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.k
    public final T0<T> c() {
        return (T0) ((C22082i3) this.f27975n).getF42167b();
    }

    public final boolean d() {
        return (this.f27963b == null || this.f27964c == null || this.f27965d == null || this.f27966e == null) ? false : true;
    }

    public final float e(float f12) {
        InterfaceC22192v1 interfaceC22192v1 = this.f27971j;
        return kotlin.ranges.s.f((Float.isNaN(((C22040c3) interfaceC22192v1).f()) ? 0.0f : ((C22040c3) interfaceC22192v1).f()) + f12, c().e(), c().d());
    }

    public final float f() {
        InterfaceC22192v1 interfaceC22192v1 = this.f27971j;
        if (Float.isNaN(((C22040c3) interfaceC22192v1).f())) {
            androidx.compose.foundation.internal.e.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((C22040c3) interfaceC22192v1).f();
    }

    public final void g(T t12) {
        ((C22082i3) this.f27968g).setValue(t12);
    }

    @Y61.l
    @InterfaceC42830m
    public final Object h(float f12, @Y61.k ContinuationImpl continuationImpl) {
        if (!d()) {
            androidx.compose.foundation.internal.e.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object f42167b = ((C22082i3) this.f27968g).getF42167b();
        T0<T> t0C = c();
        float f13 = f();
        Y41.l<? super Float, Float> lVar = this.f27963b;
        if (lVar == null) {
            lVar = null;
        }
        Y41.a<Float> aVar = this.f27964c;
        Object objC = C20438c.c(t0C, f13, f12, lVar, aVar != null ? aVar : null);
        return this.f27962a.invoke(objC).booleanValue() ? C20438c.h(this, objC, f12, continuationImpl) : C20438c.h(this, f42167b, f12, continuationImpl);
    }

    public final boolean i(T t12) {
        androidx.compose.foundation.G1 g12 = this.f27967f;
        kotlinx.coroutines.sync.d dVar = g12.f26711b;
        kotlinx.coroutines.sync.d dVar2 = g12.f26711b;
        boolean zF2 = dVar.f();
        if (zF2) {
            try {
                e eVar = this.f27976o;
                float fC2 = c().c(t12);
                if (!Float.isNaN(fC2)) {
                    eVar.a(fC2, 0.0f);
                    ((C22082i3) this.f27974m).setValue(null);
                }
                g(t12);
                ((C22082i3) this.f27969h).setValue(t12);
                dVar2.d(null);
            } catch (Throwable th2) {
                dVar2.d(null);
                throw th2;
            }
        }
        return zF2;
    }

    @InterfaceC42830m
    public C20501s(@Y61.k Y41.l lVar, Object obj) {
        this(obj);
        this.f27962a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20501s(Object obj, T0 t02, Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? a.f27977l : lVar, obj);
        ((C22082i3) this.f27975n).setValue(t02);
        i(obj);
    }
}
