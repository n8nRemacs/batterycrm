package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.J;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.v;
import com.facebook.imageutils.JfifUtil;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43044a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.CoroutineStart;
import l0.g;

/* compiled from: ContentInViewNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/L;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/foundation/relocation/i;", "Landroidx/compose/ui/node/F;", "Landroidx/compose/ui/node/i;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L extends v.d implements androidx.compose.foundation.relocation.i, androidx.compose.ui.node.F, InterfaceC22415i {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Orientation f27313p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C20433a2 f27314q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27315r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public J f27316s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final I f27317t = new I();

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f27318u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27319v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27320w;

    /* renamed from: x, reason: collision with root package name */
    public long f27321x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27322y;

    /* compiled from: ContentInViewNode.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/L$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.a<l0.j> f27323a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.r f27324b;

        public a(@Y61.k Y41.a aVar, @Y61.k kotlinx.coroutines.r rVar) {
            this.f27323a = aVar;
            this.f27324b = rVar;
        }

        @Y61.k
        public final String toString() {
            String strK;
            kotlinx.coroutines.r rVar = this.f27324b;
            kotlinx.coroutines.S s5 = (kotlinx.coroutines.S) rVar.f411960f.get(kotlinx.coroutines.S.f410719c);
            String str = s5 != null ? s5.f410720b : null;
            StringBuilder sb2 = new StringBuilder("Request@");
            int iHashCode = hashCode();
            C43044a.a(16);
            sb2.append(Integer.toString(iHashCode, 16));
            if (str == null || (strK = AK.c.k("[", str, "](")) == null) {
                strK = "(";
            }
            sb2.append(strK);
            sb2.append("currentBounds()=");
            sb2.append(this.f27323a.invoke());
            sb2.append(", continuation=");
            sb2.append(rVar);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f27425b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27325q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27326r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ N2 f27328t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f27329u;

        /* compiled from: ContentInViewNode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f27330q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f27331r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ N2 f27332s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ L f27333t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ J f27334u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.N0 f27335v;

            /* compiled from: ContentInViewNode.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.gestures.L$c$a$a, reason: collision with other inner class name */
            public static final class C1571a extends kotlin.jvm.internal.N implements Y41.l<Float, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ L f27336l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.N0 f27337m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ InterfaceC20506t1 f27338n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1571a(L l12, kotlinx.coroutines.N0 n02, InterfaceC20506t1 interfaceC20506t1) {
                    super(1);
                    this.f27336l = l12;
                    this.f27337m = n02;
                    this.f27338n = interfaceC20506t1;
                }

                @Override // Y41.l
                public final kotlin.G0 invoke(Float f12) {
                    float fFloatValue = f12.floatValue();
                    L l12 = this.f27336l;
                    float f13 = l12.f27315r ? 1.0f : -1.0f;
                    C20433a2 c20433a2 = l12.f27314q;
                    long jE2 = c20433a2.e(c20433a2.h(f13 * fFloatValue));
                    androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
                    float fG2 = c20433a2.g(c20433a2.e(this.f27338n.b(androidx.compose.ui.input.nestedscroll.i.f40106c, jE2))) * f13;
                    if (Math.abs(fG2) < Math.abs(fFloatValue)) {
                        this.f27337m.c(C43311x0.a("Scroll animation cancelled because scroll was not consumed (" + fG2 + " < " + fFloatValue + ')', null));
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: ContentInViewNode.kt */
            @kotlin.jvm.internal.s0
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ L f27339l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ N2 f27340m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ J f27341n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(L l12, N2 n22, J j12) {
                    super(0);
                    this.f27339l = l12;
                    this.f27340m = n22;
                    this.f27341n = j12;
                }

                @Override // Y41.a
                public final kotlin.G0 invoke() {
                    L l12 = this.f27339l;
                    I i12 = l12.f27317t;
                    while (true) {
                        androidx.compose.runtime.collection.e<a> eVar = i12.f27267a;
                        int i13 = eVar.f38262d;
                        if (i13 == 0) {
                            break;
                        }
                        if (i13 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        l0.j jVarInvoke = eVar.f38260b[i13 - 1].f27323a.invoke();
                        if (!(jVarInvoke == null ? true : l12.n2(l12.f27321x, jVarInvoke))) {
                            break;
                        }
                        androidx.compose.runtime.collection.e<a> eVar2 = i12.f27267a;
                        kotlinx.coroutines.r rVar = eVar2.k(eVar2.f38262d - 1).f27324b;
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                        int i14 = kotlin.Z.f406624c;
                        rVar.resumeWith(g02);
                    }
                    if (l12.f27319v) {
                        l0.j jVarM2 = l12.m2();
                        if (jVarM2 != null && l12.n2(l12.f27321x, jVarM2)) {
                            l12.f27319v = false;
                        }
                    }
                    this.f27340m.f27390e = L.k2(l12, this.f27341n);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(N2 n22, L l12, J j12, kotlinx.coroutines.N0 n02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27332s = n22;
                this.f27333t = l12;
                this.f27334u = j12;
                this.f27335v = n02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f27332s, this.f27333t, this.f27334u, this.f27335v, continuation);
                aVar.f27331r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f27330q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC20506t1 interfaceC20506t1 = (InterfaceC20506t1) this.f27331r;
                    L l12 = this.f27333t;
                    J j12 = this.f27334u;
                    float fK2 = L.k2(l12, j12);
                    N2 n22 = this.f27332s;
                    n22.f27390e = fK2;
                    C1571a c1571a = new C1571a(l12, this.f27335v, interfaceC20506t1);
                    b bVar = new b(l12, n22, j12);
                    this.f27330q = 1;
                    if (n22.a(c1571a, bVar, this) == coroutine_suspended) {
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
        public c(N2 n22, J j12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27328t = n22;
            this.f27329u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            c cVar = L.this.new c(this.f27328t, this.f27329u, continuation);
            cVar.f27326r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27325q;
            L l12 = L.this;
            try {
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlinx.coroutines.N0 n0F = kotlinx.coroutines.Q0.f(((kotlinx.coroutines.T) this.f27326r).getF401642c());
                        l12.f27322y = true;
                        C20433a2 c20433a2 = l12.f27314q;
                        MutatePriority mutatePriority = MutatePriority.f26797b;
                        a aVar = new a(this.f27328t, l12, this.f27329u, n0F, null);
                        this.f27325q = 1;
                        if (c20433a2.f(mutatePriority, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    l12.f27317t.b();
                    l12.f27322y = false;
                    l12.f27317t.a(null);
                    l12.f27319v = false;
                    return kotlin.G0.f406611a;
                } catch (CancellationException e12) {
                    throw e12;
                }
            } catch (Throwable th2) {
                l12.f27322y = false;
                l12.f27317t.a(null);
                l12.f27319v = false;
                throw th2;
            }
        }
    }

    public L(@Y61.k Orientation orientation, @Y61.k C20433a2 c20433a2, boolean z12, @Y61.l J j12) {
        this.f27313p = orientation;
        this.f27314q = c20433a2;
        this.f27315r = z12;
        this.f27316s = j12;
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f27321x = 0L;
    }

    public static final float k2(L l12, J j12) {
        l0.j jVar;
        float fA2;
        int iCompare;
        long j13 = l12.f27321x;
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (!androidx.compose.ui.unit.u.c(j13, 0L)) {
            androidx.compose.runtime.collection.e<a> eVar = l12.f27317t.f27267a;
            int i12 = eVar.f38262d - 1;
            a[] aVarArr = eVar.f38260b;
            if (i12 < aVarArr.length) {
                jVar = null;
                while (true) {
                    if (i12 < 0) {
                        break;
                    }
                    l0.j jVarInvoke = aVarArr[i12].f27323a.invoke();
                    if (jVarInvoke != null) {
                        long jG2 = jVarInvoke.g();
                        long jC2 = androidx.compose.ui.unit.v.c(l12.f27321x);
                        int iOrdinal = l12.f27313p.ordinal();
                        if (iOrdinal == 0) {
                            iCompare = Float.compare(Float.intBitsToFloat((int) (jG2 & 4294967295L)), Float.intBitsToFloat((int) (jC2 & 4294967295L)));
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iCompare = Float.compare(Float.intBitsToFloat((int) (jG2 >> 32)), Float.intBitsToFloat((int) (jC2 >> 32)));
                        }
                        if (iCompare <= 0) {
                            jVar = jVarInvoke;
                        } else if (jVar == null) {
                            jVar = jVarInvoke;
                        }
                    }
                    i12--;
                }
            } else {
                jVar = null;
            }
            if (jVar == null) {
                l0.j jVarM2 = l12.f27319v ? l12.m2() : null;
                if (jVarM2 != null) {
                    jVar = jVarM2;
                }
            }
            long jC3 = androidx.compose.ui.unit.v.c(l12.f27321x);
            int iOrdinal2 = l12.f27313p.ordinal();
            if (iOrdinal2 == 0) {
                float f12 = jVar.f413393d;
                float f13 = jVar.f413391b;
                fA2 = j12.a(f13, f12 - f13, Float.intBitsToFloat((int) (jC3 & 4294967295L)));
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                float f14 = jVar.f413392c;
                float f15 = jVar.f413390a;
                fA2 = j12.a(f15, f14 - f15, Float.intBitsToFloat((int) (jC3 >> 32)));
            }
            return fA2;
        }
        return 0.0f;
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        int iG2;
        l0.j jVarM2;
        long j13 = this.f27321x;
        this.f27321x = j12;
        int iOrdinal = this.f27313p.ordinal();
        if (iOrdinal == 0) {
            iG2 = kotlin.jvm.internal.L.g((int) (j12 & 4294967295L), (int) (4294967295L & j13));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iG2 = kotlin.jvm.internal.L.g((int) (j12 >> 32), (int) (j13 >> 32));
        }
        if (iG2 >= 0 || this.f27322y || this.f27319v || (jVarM2 = m2()) == null || !n2(j13, jVarM2)) {
            return;
        }
        this.f27320w = true;
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l2(@Y61.k Y41.a<l0.j> r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object r1 = r11.invoke()
            l0.j r1 = (l0.j) r1
            if (r1 == 0) goto Lb5
            long r2 = r10.f27321x
            boolean r1 = r10.n2(r2, r1)
            if (r1 != 0) goto Lb5
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r12)
            r1.<init>(r0, r2)
            r1.p()
            androidx.compose.foundation.gestures.L$a r2 = new androidx.compose.foundation.gestures.L$a
            r2.<init>(r11, r1)
            androidx.compose.foundation.gestures.I r3 = r10.f27317t
            r3.getClass()
            java.lang.Object r11 = r11.invoke()
            l0.j r11 = (l0.j) r11
            if (r11 != 0) goto L37
            int r11 = kotlin.Z.f406624c
            kotlin.G0 r11 = kotlin.G0.f406611a
            r1.resumeWith(r11)
            goto L9e
        L37:
            androidx.compose.foundation.gestures.H r4 = new androidx.compose.foundation.gestures.H
            r4.<init>(r3, r2)
            r1.r(r4)
            androidx.compose.runtime.collection.e<androidx.compose.foundation.gestures.L$a> r3 = r3.f27267a
            int r4 = r3.f38262d
            r5 = 0
            kotlin.ranges.l r4 = kotlin.ranges.s.r(r5, r4)
            int r6 = r4.f406905b
            int r4 = r4.f406906c
            if (r6 > r4) goto L94
        L4e:
            T[] r7 = r3.f38260b
            r7 = r7[r4]
            androidx.compose.foundation.gestures.L$a r7 = (androidx.compose.foundation.gestures.L.a) r7
            Y41.a<l0.j> r7 = r7.f27323a
            java.lang.Object r7 = r7.invoke()
            l0.j r7 = (l0.j) r7
            if (r7 != 0) goto L5f
            goto L8f
        L5f:
            l0.j r8 = r11.j(r7)
            boolean r9 = r8.equals(r11)
            if (r9 == 0) goto L6e
            int r4 = r4 + r0
            r3.a(r4, r2)
            goto L97
        L6e:
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L8f
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r7.<init>(r8)
            int r8 = r3.f38262d
            int r8 = r8 - r0
            if (r8 > r4) goto L8f
        L80:
            T[] r9 = r3.f38260b
            r9 = r9[r4]
            androidx.compose.foundation.gestures.L$a r9 = (androidx.compose.foundation.gestures.L.a) r9
            kotlinx.coroutines.r r9 = r9.f27324b
            r9.f(r7)
            if (r8 == r4) goto L8f
            int r8 = r8 + r0
            goto L80
        L8f:
            if (r4 == r6) goto L94
            int r4 = r4 + (-1)
            goto L4e
        L94:
            r3.a(r5, r2)
        L97:
            boolean r11 = r10.f27322y
            if (r11 != 0) goto L9e
            r10.o2()
        L9e:
            java.lang.Object r11 = r1.o()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r0) goto Lab
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
        Lab:
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto Lb2
            return r11
        Lb2:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Lb5:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.L.l2(Y41.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final l0.j m2() {
        if (!this.f42893o) {
            return null;
        }
        AbstractC22443w0 abstractC22443w0F = C22421l.f(this);
        androidx.compose.ui.layout.A a12 = this.f27318u;
        if (a12 != null) {
            if (!a12.m()) {
                a12 = null;
            }
            if (a12 != null) {
                return abstractC22443w0F.P(a12, false);
            }
        }
        return null;
    }

    public final boolean n2(long j12, l0.j jVar) {
        long jP2 = p2(j12, jVar);
        return Math.abs(Float.intBitsToFloat((int) (jP2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jP2 & 4294967295L))) <= 0.5f;
    }

    public final void o2() {
        J j12 = this.f27316s;
        if (j12 == null) {
            j12 = (J) C22417j.a(this, K.f27301a);
        }
        if (this.f27322y) {
            androidx.compose.foundation.internal.e.c("launchAnimation called when previous animation was running");
        }
        J.f27277a.getClass();
        C43259k.d(Y1(), null, CoroutineStart.f410683e, new c(new N2(J.a.f27279b), j12, null), 1);
    }

    public final long p2(long j12, l0.j jVar) {
        long jC2 = androidx.compose.ui.unit.v.c(j12);
        int iOrdinal = this.f27313p.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            J j13 = this.f27316s;
            if (j13 == null) {
                j13 = (J) C22417j.a(this, K.f27301a);
            }
            float f12 = jVar.f413392c;
            float f13 = jVar.f413390a;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(j13.a(f13, f12 - f13, Float.intBitsToFloat((int) (jC2 >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            g.a aVar = l0.g.f413384b;
            return jFloatToRawIntBits;
        }
        J j14 = this.f27316s;
        if (j14 == null) {
            j14 = (J) C22417j.a(this, K.f27301a);
        }
        float f14 = jVar.f413393d;
        float f15 = jVar.f413391b;
        float fA2 = j14.a(f15, f14 - f15, Float.intBitsToFloat((int) (jC2 & 4294967295L)));
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L);
        g.a aVar2 = l0.g.f413384b;
        return jFloatToRawIntBits2;
    }
}
