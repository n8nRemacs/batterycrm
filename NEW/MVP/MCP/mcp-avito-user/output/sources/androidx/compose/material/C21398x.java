package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/x;", "T", "", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.compose.runtime.F3
@InterfaceC21154e4
/* renamed from: androidx.compose.material.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21398x<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34346p = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Float, Float> f34347a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Float> f34348b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20307p<Float> f34349c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, Boolean> f34350d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C21168f5 f34351e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h f34352f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34353g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f34354h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f34355i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f34356j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f34357k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f34358l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34359m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34360n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final f f34361o;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34362l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f34363l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/x$c;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {525}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.compose.material.x$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C21398x f34364q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34365r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34366s;

        /* renamed from: t, reason: collision with root package name */
        public int f34367t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C21398x<T> c21398x, Continuation<? super d> continuation) {
            super(continuation);
            this.f34366s = c21398x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f34365r = obj;
            this.f34367t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f34366s.a(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.x$e */
    public static final class e extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34368q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34369r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.q<InterfaceC21292p, InterfaceC21153e3<T>, Continuation<? super kotlin.G0>, Object> f34370s;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/material/e3;", "invoke", "()Landroidx/compose/material/e3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.x$e$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<InterfaceC21153e3<T>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C21398x<T> f34371l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21398x<T> c21398x) {
                super(0);
                this.f34371l = c21398x;
            }

            @Override // Y41.a
            public final Object invoke() {
                return this.f34371l.e();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/material/e3;", "latestAnchors", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/material/e3;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.x$e$b */
        public static final class b extends SuspendLambda implements Y41.p<InterfaceC21153e3<T>, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f34372q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f34373r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.q<InterfaceC21292p, InterfaceC21153e3<T>, Continuation<? super kotlin.G0>, Object> f34374s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C21398x<T> f34375t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Y41.q<? super InterfaceC21292p, ? super InterfaceC21153e3<T>, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C21398x<T> c21398x, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f34374s = qVar;
                this.f34375t = c21398x;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f34374s, this.f34375t, continuation);
                bVar.f34373r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super kotlin.G0> continuation) {
                return ((b) create((InterfaceC21153e3) obj, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f34372q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC21153e3 interfaceC21153e3 = (InterfaceC21153e3) this.f34373r;
                    f fVar = this.f34375t.f34361o;
                    this.f34372q = 1;
                    if (((h.a) this.f34374s).invoke(fVar, interfaceC21153e3, this) == coroutine_suspended) {
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
        public e(Y41.q qVar, C21398x c21398x, Continuation continuation) {
            super(1, continuation);
            this.f34369r = c21398x;
            this.f34370s = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
            return new e(this.f34370s, this.f34369r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super kotlin.G0> continuation) {
            return ((e) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34368q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C21398x<T> c21398x = this.f34369r;
                a aVar = new a(c21398x);
                b bVar = new b(this.f34370s, c21398x, null);
                this.f34368q = 1;
                if (C21385w.b(aVar, bVar, this) == coroutine_suspended) {
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

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/x$f", "Landroidx/compose/material/p;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$f */
    public static final class f implements InterfaceC21292p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34376a;

        public f(C21398x<T> c21398x) {
            this.f34376a = c21398x;
        }

        @Override // androidx.compose.material.InterfaceC21292p
        public final void a(float f12, float f13) {
            int i12 = C21398x.f34346p;
            C21398x<T> c21398x = this.f34376a;
            ((C22040c3) c21398x.f34356j).S6(f12);
            ((C22040c3) c21398x.f34358l).S6(f13);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34377l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C21398x<T> c21398x) {
            super(0);
            this.f34377l = c21398x;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final T invoke() {
            Object objB;
            C21398x<T> c21398x = this.f34377l;
            T t12 = (T) ((C22082i3) c21398x.f34359m).getF42167b();
            if (t12 != null) {
                return t12;
            }
            float f12 = ((C22040c3) c21398x.f34356j).f();
            boolean zIsNaN = Float.isNaN(f12);
            InterfaceC22204y1 interfaceC22204y1 = c21398x.f34353g;
            if (zIsNaN) {
                return (T) ((C22082i3) interfaceC22204y1).getF42167b();
            }
            Object f42167b = ((C22082i3) interfaceC22204y1).getF42167b();
            InterfaceC21153e3<T> interfaceC21153e3E = c21398x.e();
            float fC2 = interfaceC21153e3E.c(f42167b);
            if (fC2 != f12 && !Float.isNaN(fC2) && (fC2 >= f12 ? (objB = interfaceC21153e3E.b(f12, false)) != null : (objB = interfaceC21153e3E.b(f12, true)) != null)) {
                f42167b = objB;
            }
            return (T) f42167b;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/x$h", "Landroidx/compose/foundation/gestures/Y0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$h */
    public static final class h implements androidx.compose.foundation.gestures.Y0 {

        /* renamed from: a, reason: collision with root package name */
        public final b f34378a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34379b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/material/p;", "Landroidx/compose/material/e3;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/material/p;Landroidx/compose/material/e3;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.x$h$a */
        public static final class a extends SuspendLambda implements Y41.q<InterfaceC21292p, InterfaceC21153e3<T>, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f34380q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f34382s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f34382s = (SuspendLambda) pVar;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // Y41.q
            public final Object invoke(InterfaceC21292p interfaceC21292p, Object obj, Continuation<? super kotlin.G0> continuation) {
                ?? r32 = this.f34382s;
                return h.this.new a(r32, continuation).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f34380q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    b bVar = h.this.f34378a;
                    this.f34380q = 1;
                    if (this.f34382s.invoke(bVar, this) == coroutine_suspended) {
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

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/x$h$b", "Landroidx/compose/foundation/gestures/O0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.material.x$h$b */
        public static final class b implements androidx.compose.foundation.gestures.O0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C21398x<T> f34383a;

            public b(C21398x<T> c21398x) {
                this.f34383a = c21398x;
            }

            @Override // androidx.compose.foundation.gestures.O0
            public final void a(float f12) {
                C21398x<T> c21398x = this.f34383a;
                c21398x.f34361o.a(c21398x.f(f12), 0.0f);
            }
        }

        public h(C21398x<T> c21398x) {
            this.f34379b = c21398x;
            this.f34378a = new b(c21398x);
        }

        @Override // androidx.compose.foundation.gestures.Y0
        public final Object a(MutatePriority mutatePriority, Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super kotlin.G0> continuation) throws Throwable {
            Object objA = this.f34379b.a(mutatePriority, new a(pVar, null), continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34384l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C21398x<T> c21398x) {
            super(0);
            this.f34384l = c21398x;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final Float invoke() {
            C21398x<T> c21398x = this.f34384l;
            float fC2 = c21398x.e().c(((C22082i3) c21398x.f34353g).getF42167b());
            float fC3 = c21398x.e().c(c21398x.f34355i.getF42167b()) - fC2;
            float fAbs = Math.abs(fC3);
            float f12 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fG2 = (c21398x.g() - fC2) / fC3;
                if (fG2 < 1.0E-6f) {
                    f12 = 0.0f;
                } else if (fG2 <= 0.999999f) {
                    f12 = fG2;
                }
            }
            return Float.valueOf(f12);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.x$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34385l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C21398x<T> c21398x) {
            super(0);
            this.f34385l = c21398x;
        }

        @Override // Y41.a
        public final T invoke() {
            C21398x<T> c21398x = this.f34385l;
            T t12 = (T) ((C22082i3) c21398x.f34359m).getF42167b();
            if (t12 != null) {
                return t12;
            }
            float f12 = ((C22040c3) c21398x.f34356j).f();
            boolean zIsNaN = Float.isNaN(f12);
            InterfaceC22204y1 interfaceC22204y1 = c21398x.f34353g;
            return (T) (!zIsNaN ? c21398x.c(f12, 0.0f, ((C22082i3) interfaceC22204y1).getF42167b()) : ((C22082i3) interfaceC22204y1).getF42167b());
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.x$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<T> f34386l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f34387m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C21398x<T> c21398x, T t12) {
            super(0);
            this.f34386l = c21398x;
            this.f34387m = t12;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21398x<T> c21398x = this.f34386l;
            f fVar = c21398x.f34361o;
            InterfaceC21153e3<T> interfaceC21153e3E = c21398x.e();
            T t12 = this.f34387m;
            float fC2 = interfaceC21153e3E.c(t12);
            if (!Float.isNaN(fC2)) {
                fVar.a(fC2, 0.0f);
                c21398x.i(null);
            }
            c21398x.h(t12);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new c(null);
    }

    @InterfaceC21154e4
    public C21398x() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21398x(T t12, @Y61.k Y41.l<? super Float, Float> lVar, @Y61.k Y41.a<Float> aVar, @Y61.k InterfaceC20307p<Float> interfaceC20307p, @Y61.k Y41.l<? super T, Boolean> lVar2) {
        this.f34347a = lVar;
        this.f34348b = aVar;
        this.f34349c = interfaceC20307p;
        this.f34350d = lVar2;
        this.f34351e = new C21168f5();
        this.f34352f = new h(this);
        this.f34353g = C22126m3.g(t12);
        this.f34354h = C22126m3.d(new j(this));
        this.f34355i = C22126m3.d(new g(this));
        this.f34356j = androidx.compose.runtime.Q1.a(Float.NaN);
        this.f34357k = C22126m3.e(new i(this), C22126m3.o());
        this.f34358l = androidx.compose.runtime.Q1.a(0.0f);
        this.f34359m = C22126m3.g(null);
        this.f34360n = C22126m3.g(new C21339s5(kotlin.collections.P0.c()));
        this.f34361o = new f(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.foundation.MutatePriority r7, @Y61.k Y41.q<? super androidx.compose.material.InterfaceC21292p, ? super androidx.compose.material.InterfaceC21153e3<T>, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.C21398x.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.x$d r0 = (androidx.compose.material.C21398x.d) r0
            int r1 = r0.f34367t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34367t = r1
            goto L18
        L13:
            androidx.compose.material.x$d r0 = new androidx.compose.material.x$d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f34365r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34367t
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            androidx.compose.material.x r7 = r0.f34364q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r8 = move-exception
            goto L99
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.C42729a0.b(r9)
            androidx.compose.material.f5 r9 = r6.f34351e     // Catch: java.lang.Throwable -> L97
            androidx.compose.material.x$e r2 = new androidx.compose.material.x$e     // Catch: java.lang.Throwable -> L97
            r5 = 0
            r2.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> L97
            r0.f34364q = r6     // Catch: java.lang.Throwable -> L97
            r0.f34367t = r4     // Catch: java.lang.Throwable -> L97
            r9.getClass()     // Catch: java.lang.Throwable -> L93
            androidx.compose.material.g5 r8 = new androidx.compose.material.g5     // Catch: java.lang.Throwable -> L93
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r7 = kotlinx.coroutines.U.c(r8, r0)     // Catch: java.lang.Throwable -> L93
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r6
        L56:
            androidx.compose.material.e3 r8 = r7.e()
            androidx.compose.runtime.v1 r9 = r7.f34356j
            androidx.compose.runtime.c3 r9 = (androidx.compose.runtime.C22040c3) r9
            float r0 = r9.f()
            java.lang.Object r8 = r8.a(r0)
            if (r8 == 0) goto L8e
            float r9 = r9.f()
            androidx.compose.material.e3 r0 = r7.e()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8e
            Y41.l<T, java.lang.Boolean> r9 = r7.f34350d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8e
            r7.h(r8)
        L8e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L91:
            r8 = r7
            goto L95
        L93:
            r7 = move-exception
            goto L91
        L95:
            r7 = r6
            goto L99
        L97:
            r8 = move-exception
            goto L95
        L99:
            androidx.compose.material.e3 r9 = r7.e()
            androidx.compose.runtime.v1 r0 = r7.f34356j
            androidx.compose.runtime.c3 r0 = (androidx.compose.runtime.C22040c3) r0
            float r1 = r0.f()
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto Ld1
            float r0 = r0.f()
            androidx.compose.material.e3 r1 = r7.e()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Ld1
            Y41.l<T, java.lang.Boolean> r0 = r7.f34350d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld1
            r7.h(r9)
        Ld1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21398x.a(androidx.compose.foundation.MutatePriority, Y41.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7, @Y61.k androidx.compose.foundation.MutatePriority r8, @Y61.k Y41.r r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.A
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material.A r0 = (androidx.compose.material.A) r0
            int r1 = r0.f32332t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32332t = r1
            goto L18
        L13:
            androidx.compose.material.A r0 = new androidx.compose.material.A
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f32330r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32332t
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            androidx.compose.material.x r7 = r0.f32329q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L61
        L2e:
            r8 = move-exception
            goto La5
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.C42729a0.b(r10)
            androidx.compose.material.e3 r10 = r6.e()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto Le1
            androidx.compose.material.f5 r10 = r6.f34351e     // Catch: java.lang.Throwable -> La3
            androidx.compose.material.B r2 = new androidx.compose.material.B     // Catch: java.lang.Throwable -> La3
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> La3
            r0.f32329q = r6     // Catch: java.lang.Throwable -> La3
            r0.f32332t = r5     // Catch: java.lang.Throwable -> La3
            r10.getClass()     // Catch: java.lang.Throwable -> L9f
            androidx.compose.material.g5 r7 = new androidx.compose.material.g5     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r7 = kotlinx.coroutines.U.c(r7, r0)     // Catch: java.lang.Throwable -> L9f
            if (r7 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r7.i(r3)
            androidx.compose.material.e3 r8 = r7.e()
            androidx.compose.runtime.v1 r9 = r7.f34356j
            androidx.compose.runtime.c3 r9 = (androidx.compose.runtime.C22040c3) r9
            float r10 = r9.f()
            java.lang.Object r8 = r8.a(r10)
            if (r8 == 0) goto Le4
            float r9 = r9.f()
            androidx.compose.material.e3 r10 = r7.e()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Le4
            Y41.l<T, java.lang.Boolean> r9 = r7.f34350d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le4
            r7.h(r8)
            goto Le4
        L9d:
            r8 = r7
            goto La1
        L9f:
            r7 = move-exception
            goto L9d
        La1:
            r7 = r6
            goto La5
        La3:
            r8 = move-exception
            goto La1
        La5:
            r7.i(r3)
            androidx.compose.material.e3 r9 = r7.e()
            androidx.compose.runtime.v1 r10 = r7.f34356j
            androidx.compose.runtime.c3 r10 = (androidx.compose.runtime.C22040c3) r10
            float r0 = r10.f()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Le0
            float r10 = r10.f()
            androidx.compose.material.e3 r0 = r7.e()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Le0
            Y41.l<T, java.lang.Boolean> r10 = r7.f34350d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Le0
            r7.h(r9)
        Le0:
            throw r8
        Le1:
            r6.h(r7)
        Le4:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21398x.b(java.lang.Object, androidx.compose.foundation.MutatePriority, Y41.r, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(float f12, float f13, Object obj) {
        T tB2;
        InterfaceC21153e3<T> interfaceC21153e3E = e();
        float fC2 = interfaceC21153e3E.c(obj);
        float fFloatValue = this.f34348b.invoke().floatValue();
        if (fC2 == f12 || Float.isNaN(fC2)) {
            return obj;
        }
        Y41.l<Float, Float> lVar = this.f34347a;
        if (fC2 < f12) {
            if (f13 >= fFloatValue) {
                return interfaceC21153e3E.b(f12, true);
            }
            tB2 = interfaceC21153e3E.b(f12, true);
            if (f12 < Math.abs(Math.abs(lVar.invoke(Float.valueOf(Math.abs(interfaceC21153e3E.c(tB2) - fC2))).floatValue()) + fC2)) {
                return obj;
            }
        } else {
            if (f13 <= (-fFloatValue)) {
                return interfaceC21153e3E.b(f12, false);
            }
            tB2 = interfaceC21153e3E.b(f12, false);
            float fAbs = Math.abs(fC2 - Math.abs(lVar.invoke(Float.valueOf(Math.abs(fC2 - interfaceC21153e3E.c(tB2)))).floatValue()));
            if (f12 < 0.0f) {
                if (Math.abs(f12) < fAbs) {
                    return obj;
                }
            } else if (f12 > fAbs) {
                return obj;
            }
        }
        return tB2;
    }

    public final float d(float f12) {
        float f13 = f(f12);
        InterfaceC22192v1 interfaceC22192v1 = this.f34356j;
        C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
        float f14 = Float.isNaN(c22040c3.f()) ? 0.0f : c22040c3.f();
        ((C22040c3) interfaceC22192v1).S6(f13);
        return f13 - f14;
    }

    @Y61.k
    public final InterfaceC21153e3<T> e() {
        return (InterfaceC21153e3) ((C22082i3) this.f34360n).getF42167b();
    }

    public final float f(float f12) {
        C22040c3 c22040c3 = (C22040c3) this.f34356j;
        return kotlin.ranges.s.f((Float.isNaN(c22040c3.f()) ? 0.0f : c22040c3.f()) + f12, e().e(), e().f());
    }

    public final float g() {
        InterfaceC22192v1 interfaceC22192v1 = this.f34356j;
        if (Float.isNaN(((C22040c3) interfaceC22192v1).f())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((C22040c3) interfaceC22192v1).f();
    }

    public final void h(T t12) {
        ((C22082i3) this.f34353g).setValue(t12);
    }

    public final void i(T t12) {
        ((C22082i3) this.f34359m).setValue(t12);
    }

    @Y61.l
    public final Object j(float f12, @Y61.k ContinuationImpl continuationImpl) {
        Object f42167b = ((C22082i3) this.f34353g).getF42167b();
        Object objC = c(g(), f12, f42167b);
        if (((Boolean) this.f34350d.invoke(objC)).booleanValue()) {
            Object objD = C21385w.d(this, objC, f12, continuationImpl);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : kotlin.G0.f406611a;
        }
        Object objD2 = C21385w.d(this, f42167b, f12, continuationImpl);
        return objD2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD2 : kotlin.G0.f406611a;
    }

    public final boolean k(T t12) {
        k kVar = new k(this, t12);
        kotlinx.coroutines.sync.d dVar = this.f34351e.f33563b;
        boolean zF2 = dVar.f();
        if (zF2) {
            try {
                kVar.invoke();
            } finally {
                dVar.d(null);
            }
        }
        return zF2;
    }

    public final void l(@Y61.k InterfaceC21153e3<T> interfaceC21153e3, T t12) {
        if (kotlin.jvm.internal.L.f(e(), interfaceC21153e3)) {
            return;
        }
        ((C22082i3) this.f34360n).setValue(interfaceC21153e3);
        if (k(t12)) {
            return;
        }
        i(t12);
    }

    public /* synthetic */ C21398x(Object obj, Y41.l lVar, Y41.a aVar, InterfaceC20307p interfaceC20307p, Y41.l lVar2, int i12, C42822w c42822w) {
        this(obj, lVar, aVar, interfaceC20307p, (i12 & 16) != 0 ? a.f34362l : lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21398x(Object obj, InterfaceC21153e3 interfaceC21153e3, Y41.l lVar, Y41.a aVar, InterfaceC20307p interfaceC20307p, Y41.l lVar2, int i12, C42822w c42822w) {
        this(obj, lVar, aVar, interfaceC20307p, (i12 & 32) != 0 ? b.f34363l : lVar2);
        ((C22082i3) this.f34360n).setValue(interfaceC21153e3);
        k(obj);
    }
}
