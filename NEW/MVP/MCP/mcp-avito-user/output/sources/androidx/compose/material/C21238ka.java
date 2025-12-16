package androidx.compose.material;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43202t0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Swipeable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/ka;", "T", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@androidx.compose.runtime.F3
@InterfaceC21154e4
/* renamed from: androidx.compose.material.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21238ka<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f33751q = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20307p<Float> f33752a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, Boolean> f33753b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33754c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33755d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33756e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33757f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33758g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Float> f33759h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33760i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43202t0 f33761j;

    /* renamed from: k, reason: collision with root package name */
    public float f33762k;

    /* renamed from: l, reason: collision with root package name */
    public float f33763l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33764m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33765n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33766o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.gestures.Y0 f33767p;

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ka$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33768l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/ka$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ka$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/foundation/gestures/O0;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/O0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {JfifUtil.MARKER_EOI}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.ka$c */
    final class c extends SuspendLambda implements Y41.p<androidx.compose.foundation.gestures.O0, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f33769q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f33770r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C21238ka<Object> f33771s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ float f33772t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20307p<Float> f33773u;

        /* compiled from: Swipeable.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.ka$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.gestures.O0 f33774l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ l0.e f33775m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.foundation.gestures.O0 o02, l0.e eVar) {
                super(1);
                this.f33774l = o02;
                this.f33775m = eVar;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
                C20268c<Float, C20318t> c20268c2 = c20268c;
                float fFloatValue = c20268c2.f().floatValue();
                l0.e eVar = this.f33775m;
                this.f33774l.a(fFloatValue - eVar.f406839b);
                eVar.f406839b = c20268c2.f().floatValue();
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C21238ka<Object> c21238ka, float f12, InterfaceC20307p<Float> interfaceC20307p, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f33771s = c21238ka;
            this.f33772t = f12;
            this.f33773u = interfaceC20307p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f33771s, this.f33772t, this.f33773u, continuation);
            cVar.f33770r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.foundation.gestures.O0 o02, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(o02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f33769q;
            C21238ka<Object> c21238ka = this.f33771s;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.compose.foundation.gestures.O0 o02 = (androidx.compose.foundation.gestures.O0) this.f33770r;
                    l0.e eVar = new l0.e();
                    eVar.f406839b = ((C22040c3) c21238ka.f33758g).f();
                    InterfaceC22204y1<Float> interfaceC22204y1 = c21238ka.f33759h;
                    float f12 = this.f33772t;
                    ((C22082i3) interfaceC22204y1).setValue(Boxing.boxFloat(f12));
                    ((C22082i3) c21238ka.f33755d).setValue(Boolean.TRUE);
                    C20268c c20268cA = C20274e.a(eVar.f406839b);
                    Float fBoxFloat = Boxing.boxFloat(f12);
                    InterfaceC20307p<Float> interfaceC20307p = this.f33773u;
                    a aVar = new a(o02, eVar);
                    this.f33769q = 1;
                    if (C20268c.c(c20268cA, fBoxFloat, interfaceC20307p, null, aVar, this, 4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                ((C22082i3) c21238ka.f33759h).setValue(null);
                ((C22082i3) c21238ka.f33755d).setValue(Boolean.FALSE);
                return kotlin.G0.f406611a;
            } catch (Throwable th2) {
                ((C22082i3) c21238ka.f33759h).setValue(null);
                ((C22082i3) c21238ka.f33755d).setValue(Boolean.FALSE);
                throw th2;
            }
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.ka$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21238ka<T> f33776l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C21238ka<T> c21238ka) {
            super(1);
            this.f33776l = c21238ka;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            C21238ka<T> c21238ka = this.f33776l;
            float f13 = ((C22040c3) c21238ka.f33758g).f() + fFloatValue;
            float f14 = kotlin.ranges.s.f(f13, c21238ka.f33762k, c21238ka.f33763l);
            float f15 = f13 - f14;
            C21419y7 c21419y7 = (C21419y7) ((C22082i3) c21238ka.f33766o).getF42167b();
            float fSin = 0.0f;
            if (c21419y7 != null) {
                float f16 = f15 < 0.0f ? c21419y7.f34419b : c21419y7.f34420c;
                if (f16 != 0.0f) {
                    float f17 = c21419y7.f34418a;
                    float f18 = f15 / f17;
                    if (f18 < -1.0f) {
                        f18 = -1.0f;
                    }
                    if (f18 > 1.0f) {
                        f18 = 1.0f;
                    }
                    fSin = ((float) Math.sin((f18 * 3.1415927f) / 2)) * (f17 / f16);
                }
            }
            ((C22040c3) c21238ka.f33756e).S6(f14 + fSin);
            ((C22040c3) c21238ka.f33757f).S6(f15);
            ((C22040c3) c21238ka.f33758g).S6(f13);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ka$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Map<Float, ? extends T>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21238ka<T> f33777l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C21238ka<T> c21238ka) {
            super(0);
            this.f33777l = c21238ka;
        }

        @Override // Y41.a
        public final Object invoke() {
            return (Map) ((C22082i3) this.f33777l.f33760i).getF42167b();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ka$f */
    public static final class f implements InterfaceC43160i<Map<Float, ? extends T>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f33778b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.ka$f$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f33779b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            /* renamed from: androidx.compose.material.ka$f$a$a, reason: collision with other inner class name */
            public static final class C1635a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f33780q;

                /* renamed from: r, reason: collision with root package name */
                public int f33781r;

                public C1635a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f33780q = obj;
                    this.f33781r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f33779b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.compose.material.C21238ka.f.a.C1635a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.compose.material.ka$f$a$a r0 = (androidx.compose.material.C21238ka.f.a.C1635a) r0
                    int r1 = r0.f33781r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33781r = r1
                    goto L18
                L13:
                    androidx.compose.material.ka$f$a$a r0 = new androidx.compose.material.ka$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33780q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f33781r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.util.Map r6 = (java.util.Map) r6
                    boolean r6 = r6.isEmpty()
                    if (r6 != 0) goto L48
                    r0.f33781r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f33779b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21238ka.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC43160i interfaceC43160i) {
            this.f33778b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f33778b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ka$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<Float, Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f33783l = new g();

        public g() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ Float invoke(Float f12, Float f13) {
            f12.floatValue();
            f13.floatValue();
            return Float.valueOf(0.0f);
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21238ka(T t12, @Y61.k InterfaceC20307p<Float> interfaceC20307p, @Y61.k Y41.l<? super T, Boolean> lVar) {
        this.f33752a = interfaceC20307p;
        this.f33753b = lVar;
        this.f33754c = C22126m3.g(t12);
        this.f33755d = C22126m3.g(Boolean.FALSE);
        this.f33756e = androidx.compose.runtime.Q1.a(0.0f);
        this.f33757f = androidx.compose.runtime.Q1.a(0.0f);
        this.f33758g = androidx.compose.runtime.Q1.a(0.0f);
        this.f33759h = C22126m3.g(null);
        this.f33760i = C22126m3.g(kotlin.collections.P0.c());
        this.f33761j = C43175k.V(new f(C22126m3.n(new e(this))), 1);
        this.f33762k = Float.NEGATIVE_INFINITY;
        this.f33763l = Float.POSITIVE_INFINITY;
        this.f33764m = C22126m3.g(g.f33783l);
        this.f33765n = androidx.compose.runtime.Q1.a(0.0f);
        this.f33766o = C22126m3.g(null);
        this.f33767p = androidx.compose.foundation.gestures.V0.a(new d(this));
    }

    public final void a(T t12) {
        ((C22082i3) this.f33754c).setValue(t12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21238ka(Object obj, InterfaceC20307p interfaceC20307p, Y41.l lVar, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            W9.f33326a.getClass();
            interfaceC20307p = W9.f33327b;
        }
        this(obj, interfaceC20307p, (i12 & 4) != 0 ? a.f33768l : lVar);
    }
}
