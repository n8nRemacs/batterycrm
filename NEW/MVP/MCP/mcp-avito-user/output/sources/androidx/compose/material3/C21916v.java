package androidx.compose.material3;

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
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/v;", "T", "", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* renamed from: androidx.compose.material3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21916v<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f37488p = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Float, Float> f37489a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Float> f37490b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20307p<Float> f37491c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, Boolean> f37492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H8 f37493e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h f37494f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f37495g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f37496h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f37497i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f37498j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3 f37499k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f37500l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f37501m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f37502n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final f f37503o;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f37504l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f37505l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/v$c;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {529}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.compose.material3.v$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C21916v f37506q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f37507r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37508s;

        /* renamed from: t, reason: collision with root package name */
        public int f37509t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C21916v<T> c21916v, Continuation<? super d> continuation) {
            super(continuation);
            this.f37508s = c21916v;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f37507r = obj;
            this.f37509t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f37508s.a(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.v$e */
    public static final class e extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37510q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37511r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.q<InterfaceC21735n, N6<T>, Continuation<? super kotlin.G0>, Object> f37512s;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/material3/N6;", "invoke", "()Landroidx/compose/material3/N6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.v$e$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<N6<T>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C21916v<T> f37513l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21916v<T> c21916v) {
                super(0);
                this.f37513l = c21916v;
            }

            @Override // Y41.a
            public final Object invoke() {
                return this.f37513l.e();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/material3/N6;", "latestAnchors", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/material3/N6;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.v$e$b */
        public static final class b extends SuspendLambda implements Y41.p<N6<T>, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f37514q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f37515r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.q<InterfaceC21735n, N6<T>, Continuation<? super kotlin.G0>, Object> f37516s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C21916v<T> f37517t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Y41.q<? super InterfaceC21735n, ? super N6<T>, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C21916v<T> c21916v, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f37516s = qVar;
                this.f37517t = c21916v;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f37516s, this.f37517t, continuation);
                bVar.f37515r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super kotlin.G0> continuation) {
                return ((b) create((N6) obj, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f37514q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    N6 n62 = (N6) this.f37515r;
                    f fVar = this.f37517t.f37503o;
                    this.f37514q = 1;
                    if (((h.a) this.f37516s).invoke(fVar, n62, this) == coroutine_suspended) {
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
        public e(Y41.q qVar, C21916v c21916v, Continuation continuation) {
            super(1, continuation);
            this.f37511r = c21916v;
            this.f37512s = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
            return new e(this.f37512s, this.f37511r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super kotlin.G0> continuation) {
            return ((e) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37510q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C21916v<T> c21916v = this.f37511r;
                a aVar = new a(c21916v);
                b bVar = new b(this.f37512s, c21916v, null);
                this.f37510q = 1;
                if (C21894u.b(aVar, bVar, this) == coroutine_suspended) {
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
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/v$f", "Landroidx/compose/material3/n;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$f */
    public static final class f implements InterfaceC21735n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37518a;

        public f(C21916v<T> c21916v) {
            this.f37518a = c21916v;
        }

        @Override // androidx.compose.material3.InterfaceC21735n
        public final void a(float f12, float f13) {
            int i12 = C21916v.f37488p;
            C21916v<T> c21916v = this.f37518a;
            ((C22040c3) c21916v.f37498j).S6(f12);
            ((C22040c3) c21916v.f37500l).S6(f13);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37519l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C21916v<T> c21916v) {
            super(0);
            this.f37519l = c21916v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final T invoke() {
            Object objB;
            C21916v<T> c21916v = this.f37519l;
            T t12 = (T) ((C22082i3) c21916v.f37501m).getF42167b();
            if (t12 != null) {
                return t12;
            }
            float f12 = ((C22040c3) c21916v.f37498j).f();
            boolean zIsNaN = Float.isNaN(f12);
            InterfaceC22204y1 interfaceC22204y1 = c21916v.f37495g;
            if (zIsNaN) {
                return (T) ((C22082i3) interfaceC22204y1).getF42167b();
            }
            Object f42167b = ((C22082i3) interfaceC22204y1).getF42167b();
            N6<T> n6E = c21916v.e();
            float fC2 = n6E.c(f42167b);
            if (fC2 != f12 && !Float.isNaN(fC2) && (fC2 >= f12 ? (objB = n6E.b(f12, false)) != null : (objB = n6E.b(f12, true)) != null)) {
                f42167b = objB;
            }
            return (T) f42167b;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/v$h", "Landroidx/compose/foundation/gestures/Y0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$h */
    public static final class h implements androidx.compose.foundation.gestures.Y0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f37520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37521b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/material3/n;", "Landroidx/compose/material3/N6;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/material3/n;Landroidx/compose/material3/N6;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.v$h$a */
        public static final class a extends SuspendLambda implements Y41.q<InterfaceC21735n, N6<T>, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f37522q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f37524s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Y41.p pVar, Continuation continuation) {
                super(3, continuation);
                this.f37524s = (SuspendLambda) pVar;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // Y41.q
            public final Object invoke(InterfaceC21735n interfaceC21735n, Object obj, Continuation<? super kotlin.G0> continuation) {
                ?? r32 = this.f37524s;
                return h.this.new a(r32, continuation).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f37522q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    b bVar = h.this.f37520a;
                    this.f37522q = 1;
                    if (this.f37524s.invoke(bVar, this) == coroutine_suspended) {
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
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/v$h$b", "Landroidx/compose/foundation/gestures/O0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.v$h$b */
        public static final class b implements androidx.compose.foundation.gestures.O0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C21916v<T> f37525a;

            public b(C21916v<T> c21916v) {
                this.f37525a = c21916v;
            }

            @Override // androidx.compose.foundation.gestures.O0
            public final void a(float f12) {
                C21916v<T> c21916v = this.f37525a;
                c21916v.f37503o.a(c21916v.f(f12), 0.0f);
            }
        }

        public h(C21916v<T> c21916v) {
            this.f37521b = c21916v;
            this.f37520a = new b(c21916v);
        }

        @Override // androidx.compose.foundation.gestures.Y0
        @Y61.l
        public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) throws Throwable {
            Object objA = this.f37521b.a(mutatePriority, new a(pVar, null), continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37526l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C21916v<T> c21916v) {
            super(0);
            this.f37526l = c21916v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final Float invoke() {
            C21916v<T> c21916v = this.f37526l;
            float fC2 = c21916v.e().c(((C22082i3) c21916v.f37495g).getF42167b());
            float fC3 = c21916v.e().c(c21916v.f37497i.getF42167b()) - fC2;
            float fAbs = Math.abs(fC3);
            float f12 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fG2 = (c21916v.g() - fC2) / fC3;
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
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.v$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37527l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C21916v<T> c21916v) {
            super(0);
            this.f37527l = c21916v;
        }

        @Override // Y41.a
        public final T invoke() {
            C21916v<T> c21916v = this.f37527l;
            T t12 = (T) ((C22082i3) c21916v.f37501m).getF42167b();
            if (t12 != null) {
                return t12;
            }
            float f12 = ((C22040c3) c21916v.f37498j).f();
            boolean zIsNaN = Float.isNaN(f12);
            InterfaceC22204y1 interfaceC22204y1 = c21916v.f37495g;
            return (T) (!zIsNaN ? c21916v.c(f12, 0.0f, ((C22082i3) interfaceC22204y1).getF42167b()) : ((C22082i3) interfaceC22204y1).getF42167b());
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.v$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21916v<T> f37528l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f37529m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C21916v<T> c21916v, T t12) {
            super(0);
            this.f37528l = c21916v;
            this.f37529m = t12;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21916v<T> c21916v = this.f37528l;
            f fVar = c21916v.f37503o;
            N6<T> n6E = c21916v.e();
            T t12 = this.f37529m;
            float fC2 = n6E.c(t12);
            if (!Float.isNaN(fC2)) {
                fVar.a(fC2, 0.0f);
                c21916v.i(null);
            }
            c21916v.h(t12);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new c(null);
    }

    @InterfaceC21537e7
    public C21916v() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21916v(T t12, @Y61.k Y41.l<? super Float, Float> lVar, @Y61.k Y41.a<Float> aVar, @Y61.k InterfaceC20307p<Float> interfaceC20307p, @Y61.k Y41.l<? super T, Boolean> lVar2) {
        this.f37489a = lVar;
        this.f37490b = aVar;
        this.f37491c = interfaceC20307p;
        this.f37492d = lVar2;
        this.f37493e = new H8();
        this.f37494f = new h(this);
        this.f37495g = C22126m3.g(t12);
        this.f37496h = C22126m3.d(new j(this));
        this.f37497i = C22126m3.d(new g(this));
        this.f37498j = androidx.compose.runtime.Q1.a(Float.NaN);
        this.f37499k = C22126m3.e(new i(this), C22126m3.o());
        this.f37500l = androidx.compose.runtime.Q1.a(0.0f);
        this.f37501m = C22126m3.g(null);
        this.f37502n = C22126m3.g(new C21768o9(kotlin.collections.P0.c()));
        this.f37503o = new f(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(C21916v c21916v, N6 n62) {
        Object f42167b;
        boolean zIsNaN = Float.isNaN(((C22040c3) c21916v.f37498j).f());
        androidx.compose.runtime.I3 i32 = c21916v.f37496h;
        if (zIsNaN) {
            f42167b = i32.getF42167b();
        } else {
            f42167b = ((C21768o9) n62).a(((C22040c3) c21916v.f37498j).f());
            if (f42167b == null) {
                f42167b = i32.getF42167b();
            }
        }
        c21916v.l(n62, f42167b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.foundation.MutatePriority r7, @Y61.k Y41.q<? super androidx.compose.material3.InterfaceC21735n, ? super androidx.compose.material3.N6<T>, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.C21916v.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.v$d r0 = (androidx.compose.material3.C21916v.d) r0
            int r1 = r0.f37509t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37509t = r1
            goto L18
        L13:
            androidx.compose.material3.v$d r0 = new androidx.compose.material3.v$d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f37507r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37509t
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            androidx.compose.material3.v r7 = r0.f37506q
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
            androidx.compose.material3.H8 r9 = r6.f37493e     // Catch: java.lang.Throwable -> L97
            androidx.compose.material3.v$e r2 = new androidx.compose.material3.v$e     // Catch: java.lang.Throwable -> L97
            r5 = 0
            r2.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> L97
            r0.f37506q = r6     // Catch: java.lang.Throwable -> L97
            r0.f37509t = r4     // Catch: java.lang.Throwable -> L97
            r9.getClass()     // Catch: java.lang.Throwable -> L93
            androidx.compose.material3.I8 r8 = new androidx.compose.material3.I8     // Catch: java.lang.Throwable -> L93
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r7 = kotlinx.coroutines.U.c(r8, r0)     // Catch: java.lang.Throwable -> L93
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r6
        L56:
            androidx.compose.material3.N6 r8 = r7.e()
            androidx.compose.runtime.v1 r9 = r7.f37498j
            androidx.compose.runtime.c3 r9 = (androidx.compose.runtime.C22040c3) r9
            float r0 = r9.f()
            java.lang.Object r8 = r8.a(r0)
            if (r8 == 0) goto L8e
            float r9 = r9.f()
            androidx.compose.material3.N6 r0 = r7.e()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8e
            Y41.l<T, java.lang.Boolean> r9 = r7.f37492d
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
            androidx.compose.material3.N6 r9 = r7.e()
            androidx.compose.runtime.v1 r0 = r7.f37498j
            androidx.compose.runtime.c3 r0 = (androidx.compose.runtime.C22040c3) r0
            float r1 = r0.f()
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto Ld1
            float r0 = r0.f()
            androidx.compose.material3.N6 r1 = r7.e()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Ld1
            Y41.l<T, java.lang.Boolean> r0 = r7.f37492d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld1
            r7.h(r9)
        Ld1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21916v.a(androidx.compose.foundation.MutatePriority, Y41.q, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r10 instanceof androidx.compose.material3.C21982y
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.y r0 = (androidx.compose.material3.C21982y) r0
            int r1 = r0.f37734t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37734t = r1
            goto L18
        L13:
            androidx.compose.material3.y r0 = new androidx.compose.material3.y
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f37732r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37734t
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            androidx.compose.material3.v r7 = r0.f37731q
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
            androidx.compose.material3.N6 r10 = r6.e()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto Le1
            androidx.compose.material3.H8 r10 = r6.f37493e     // Catch: java.lang.Throwable -> La3
            androidx.compose.material3.z r2 = new androidx.compose.material3.z     // Catch: java.lang.Throwable -> La3
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> La3
            r0.f37731q = r6     // Catch: java.lang.Throwable -> La3
            r0.f37734t = r5     // Catch: java.lang.Throwable -> La3
            r10.getClass()     // Catch: java.lang.Throwable -> L9f
            androidx.compose.material3.I8 r7 = new androidx.compose.material3.I8     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r7 = kotlinx.coroutines.U.c(r7, r0)     // Catch: java.lang.Throwable -> L9f
            if (r7 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r7.i(r3)
            androidx.compose.material3.N6 r8 = r7.e()
            androidx.compose.runtime.v1 r9 = r7.f37498j
            androidx.compose.runtime.c3 r9 = (androidx.compose.runtime.C22040c3) r9
            float r10 = r9.f()
            java.lang.Object r8 = r8.a(r10)
            if (r8 == 0) goto Le4
            float r9 = r9.f()
            androidx.compose.material3.N6 r10 = r7.e()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Le4
            Y41.l<T, java.lang.Boolean> r9 = r7.f37492d
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
            androidx.compose.material3.N6 r9 = r7.e()
            androidx.compose.runtime.v1 r10 = r7.f37498j
            androidx.compose.runtime.c3 r10 = (androidx.compose.runtime.C22040c3) r10
            float r0 = r10.f()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Le0
            float r10 = r10.f()
            androidx.compose.material3.N6 r0 = r7.e()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Le0
            Y41.l<T, java.lang.Boolean> r10 = r7.f37492d
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21916v.b(java.lang.Object, androidx.compose.foundation.MutatePriority, Y41.r, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(float f12, float f13, Object obj) {
        T tB2;
        N6<T> n6E = e();
        float fC2 = n6E.c(obj);
        float fFloatValue = this.f37490b.invoke().floatValue();
        if (fC2 == f12 || Float.isNaN(fC2)) {
            return obj;
        }
        Y41.l<Float, Float> lVar = this.f37489a;
        if (fC2 < f12) {
            if (f13 >= fFloatValue) {
                return n6E.b(f12, true);
            }
            tB2 = n6E.b(f12, true);
            if (f12 < Math.abs(Math.abs(lVar.invoke(Float.valueOf(Math.abs(n6E.c(tB2) - fC2))).floatValue()) + fC2)) {
                return obj;
            }
        } else {
            if (f13 <= (-fFloatValue)) {
                return n6E.b(f12, false);
            }
            tB2 = n6E.b(f12, false);
            float fAbs = Math.abs(fC2 - Math.abs(lVar.invoke(Float.valueOf(Math.abs(fC2 - n6E.c(tB2)))).floatValue()));
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
        InterfaceC22192v1 interfaceC22192v1 = this.f37498j;
        C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
        float f14 = Float.isNaN(c22040c3.f()) ? 0.0f : c22040c3.f();
        ((C22040c3) interfaceC22192v1).S6(f13);
        return f13 - f14;
    }

    @Y61.k
    public final N6<T> e() {
        return (N6) ((C22082i3) this.f37502n).getF42167b();
    }

    public final float f(float f12) {
        C22040c3 c22040c3 = (C22040c3) this.f37498j;
        return kotlin.ranges.s.f((Float.isNaN(c22040c3.f()) ? 0.0f : c22040c3.f()) + f12, e().e(), e().f());
    }

    public final float g() {
        InterfaceC22192v1 interfaceC22192v1 = this.f37498j;
        if (Float.isNaN(((C22040c3) interfaceC22192v1).f())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((C22040c3) interfaceC22192v1).f();
    }

    public final void h(T t12) {
        ((C22082i3) this.f37495g).setValue(t12);
    }

    public final void i(T t12) {
        ((C22082i3) this.f37501m).setValue(t12);
    }

    @Y61.l
    public final Object j(float f12, @Y61.k SuspendLambda suspendLambda) {
        Object f42167b = ((C22082i3) this.f37495g).getF42167b();
        Object objC = c(g(), f12, f42167b);
        if (((Boolean) this.f37492d.invoke(objC)).booleanValue()) {
            Object objC2 = C21894u.c(this, objC, f12, suspendLambda);
            return objC2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC2 : kotlin.G0.f406611a;
        }
        Object objC3 = C21894u.c(this, f42167b, f12, suspendLambda);
        return objC3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC3 : kotlin.G0.f406611a;
    }

    public final boolean k(T t12) {
        k kVar = new k(this, t12);
        kotlinx.coroutines.sync.d dVar = this.f37493e.f34836b;
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

    public final void l(@Y61.k N6<T> n62, T t12) {
        if (kotlin.jvm.internal.L.f(e(), n62)) {
            return;
        }
        ((C22082i3) this.f37502n).setValue(n62);
        if (k(t12)) {
            return;
        }
        i(t12);
    }

    public /* synthetic */ C21916v(Object obj, Y41.l lVar, Y41.a aVar, InterfaceC20307p interfaceC20307p, Y41.l lVar2, int i12, C42822w c42822w) {
        this(obj, lVar, aVar, interfaceC20307p, (i12 & 16) != 0 ? a.f37504l : lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21916v(Object obj, N6 n62, Y41.l lVar, Y41.a aVar, InterfaceC20307p interfaceC20307p, Y41.l lVar2, int i12, C42822w c42822w) {
        this(obj, lVar, aVar, interfaceC20307p, (i12 & 32) != 0 ? b.f37505l : lVar2);
        ((C22082i3) this.f37502n).setValue(n62);
        k(obj);
    }
}
