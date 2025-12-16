package androidx.compose.runtime.snapshots;

import androidx.collection.M0;
import androidx.collection.R0;
import androidx.collection.S0;
import androidx.collection.i1;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22074h0;
import androidx.compose.runtime.InterfaceC22079i0;
import androidx.compose.runtime.P1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: SnapshotStateObserver.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/H;", "", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f38627a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38629c;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C22166k f38634h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public a f38635i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Object> f38628b = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Set<? extends Object>, AbstractC22167l, G0> f38630d = new b();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, G0> f38631e = new c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a> f38632f = new androidx.compose.runtime.collection.e<>(new a[16], 0);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f38633g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f38636j = -1;

    /* compiled from: SnapshotStateObserver.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/H$a;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Object, G0> f38637a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Object f38638b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public M0<Object> f38639c;

        /* renamed from: j, reason: collision with root package name */
        public int f38646j;

        /* renamed from: d, reason: collision with root package name */
        public int f38640d = -1;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final R0<Object, Object> f38641e = i1.b();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final R0<Object, M0<Object>> f38642f = new R0<>(0, 1, null);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final S0<Object> f38643g = new S0<>(0, 1, null);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.runtime.collection.e<InterfaceC22074h0<?>> f38644h = new androidx.compose.runtime.collection.e<>(new InterfaceC22074h0[16], 0);

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final C1654a f38645i = new C1654a();

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final R0<Object, Object> f38647k = i1.b();

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final HashMap<InterfaceC22074h0<?>, Object> f38648l = new HashMap<>();

        /* compiled from: SnapshotStateObserver.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/snapshots/H$a$a", "Landroidx/compose/runtime/i0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.snapshots.H$a$a, reason: collision with other inner class name */
        public static final class C1654a implements InterfaceC22079i0 {
            public C1654a() {
            }

            @Override // androidx.compose.runtime.InterfaceC22079i0
            public final void a() {
                a aVar = a.this;
                aVar.f38646j--;
            }

            @Override // androidx.compose.runtime.InterfaceC22079i0
            public final void start() {
                a.this.f38646j++;
            }
        }

        public a(@Y61.k Y41.l<Object, G0> lVar) {
            this.f38637a = lVar;
        }

        public final void a(@Y61.k Object obj, @Y61.k Y41.l<Object, G0> lVar, @Y61.k Y41.a<G0> aVar) {
            long[] jArr;
            long[] jArr2;
            int i12;
            Object obj2 = this.f38638b;
            M0<Object> m02 = this.f38639c;
            int i13 = this.f38640d;
            this.f38638b = obj;
            this.f38639c = this.f38642f.e(obj);
            if (this.f38640d == -1) {
                this.f38640d = Long.hashCode(C22176v.j().getF38722b());
            }
            C1654a c1654a = this.f38645i;
            androidx.compose.runtime.collection.e<InterfaceC22079i0> eVarC = C22126m3.c();
            try {
                eVarC.b(c1654a);
                AbstractC22167l.f38720e.getClass();
                AbstractC22167l.a.c(aVar, lVar);
                eVarC.k(eVarC.f38262d - 1);
                Object obj3 = this.f38638b;
                int i14 = this.f38640d;
                M0<Object> m03 = this.f38639c;
                if (m03 != null) {
                    long[] jArr3 = m03.f25647a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j12 = jArr3[i15];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8;
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j12 & 255) < 128) {
                                        int i19 = (i15 << 3) + i18;
                                        Object obj4 = m03.f25648b[i19];
                                        jArr2 = jArr3;
                                        boolean z12 = m03.f25649c[i19] != i14;
                                        if (z12) {
                                            d(obj3, obj4);
                                        }
                                        if (z12) {
                                            m03.g(i19);
                                        }
                                        i12 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i12 = i16;
                                    }
                                    j12 >>= i12;
                                    i18++;
                                    i16 = i12;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i17 != i16) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i15 == length) {
                                break;
                            }
                            i15++;
                            jArr3 = jArr;
                        }
                    }
                }
                this.f38638b = obj2;
                this.f38639c = m02;
                this.f38640d = i13;
            } catch (Throwable th2) {
                eVarC.k(eVarC.f38262d - 1);
                throw th2;
            }
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final boolean b(@Y61.k java.util.Set<? extends java.lang.Object> r42) {
            /*
                Method dump skipped, instructions count: 1876
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.H.a.b(java.util.Set):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(java.lang.Object r21, int r22, java.lang.Object r23, androidx.collection.M0<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r24
                int r4 = r0.f38646j
                if (r4 <= 0) goto Ld
                return
            Ld:
                int r4 = r3.e(r1)
                if (r4 >= 0) goto L16
                int r4 = ~r4
                r6 = -1
                goto L1a
            L16:
                int[] r6 = r3.f25649c
                r6 = r6[r4]
            L1a:
                java.lang.Object[] r7 = r3.f25648b
                r7[r4] = r1
                int[] r3 = r3.f25649c
                r3[r4] = r2
                boolean r3 = r1 instanceof androidx.compose.runtime.InterfaceC22074h0
                r4 = 2
                if (r3 == 0) goto L91
                if (r6 == r2) goto L91
                r2 = r1
                androidx.compose.runtime.h0 r2 = (androidx.compose.runtime.InterfaceC22074h0) r2
                androidx.compose.runtime.g0$a r2 = r2.o()
                java.util.HashMap<androidx.compose.runtime.h0<?>, java.lang.Object> r3 = r0.f38648l
                java.lang.Object r7 = r2.f38410f
                r3.put(r1, r7)
                androidx.collection.M0 r2 = r2.f38409e
                androidx.collection.R0<java.lang.Object, java.lang.Object> r3 = r0.f38647k
                androidx.compose.runtime.collection.i.d(r3, r1)
                java.lang.Object[] r7 = r2.f25648b
                long[] r2 = r2.f25647a
                int r8 = r2.length
                int r8 = r8 - r4
                if (r8 < 0) goto L91
                r10 = 0
            L47:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L8c
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L61:
                if (r15 >= r13) goto L8a
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L86
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                androidx.compose.runtime.snapshots.V r9 = (androidx.compose.runtime.snapshots.V) r9
                boolean r5 = r9 instanceof androidx.compose.runtime.snapshots.W
                if (r5 == 0) goto L83
                r5 = r9
                androidx.compose.runtime.snapshots.W r5 = (androidx.compose.runtime.snapshots.W) r5
                int r17 = androidx.compose.runtime.snapshots.C22164i.f38715b
                r5.q(r4)
            L83:
                androidx.compose.runtime.collection.i.a(r3, r9, r1)
            L86:
                long r11 = r11 >> r14
                int r15 = r15 + 1
                goto L61
            L8a:
                if (r13 != r14) goto L91
            L8c:
                if (r10 == r8) goto L91
                int r10 = r10 + 1
                goto L47
            L91:
                r2 = -1
                if (r6 != r2) goto La7
                boolean r2 = r1 instanceof androidx.compose.runtime.snapshots.W
                if (r2 == 0) goto La0
                r2 = r1
                androidx.compose.runtime.snapshots.W r2 = (androidx.compose.runtime.snapshots.W) r2
                int r3 = androidx.compose.runtime.snapshots.C22164i.f38715b
                r2.q(r4)
            La0:
                androidx.collection.R0<java.lang.Object, java.lang.Object> r2 = r0.f38641e
                r3 = r23
                androidx.compose.runtime.collection.i.a(r2, r1, r3)
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.H.a.c(java.lang.Object, int, java.lang.Object, androidx.collection.M0):void");
        }

        public final void d(Object obj, Object obj2) {
            R0<Object, Object> r02 = this.f38641e;
            androidx.compose.runtime.collection.i.c(r02, obj2, obj);
            if (!(obj2 instanceof InterfaceC22074h0) || r02.c(obj2)) {
                return;
            }
            androidx.compose.runtime.collection.i.d(this.f38647k, obj2);
            this.f38648l.remove(obj2);
        }

        public final void e(@Y61.k Y41.l<Object, Boolean> lVar) {
            long[] jArr;
            int i12;
            long[] jArr2;
            int i13;
            long j12;
            int i14;
            long j13;
            int i15;
            R0<Object, M0<Object>> r02 = this.f38642f;
            long[] jArr3 = r02.f25721a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr3[i16];
                long j15 = -9187201950435737472L;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j14 & 255) < 128) {
                            int i22 = (i16 << 3) + i19;
                            Object obj = r02.f25722b[i22];
                            M0 m02 = (M0) r02.f25723c[i22];
                            Boolean boolInvoke = lVar.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = m02.f25648b;
                                int[] iArr = m02.f25649c;
                                long[] jArr4 = m02.f25647a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i14 = i18;
                                    int i23 = 0;
                                    while (true) {
                                        long j16 = jArr4[i23];
                                        i13 = i16;
                                        j12 = j14;
                                        j13 = -9187201950435737472L;
                                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                            for (int i25 = 0; i25 < i24; i25++) {
                                                if ((j16 & 255) < 128) {
                                                    int i26 = (i23 << 3) + i25;
                                                    Object obj2 = objArr[i26];
                                                    int i27 = iArr[i26];
                                                    d(obj, obj2);
                                                }
                                                j16 >>= 8;
                                            }
                                            if (i24 != 8) {
                                                break;
                                            }
                                        }
                                        if (i23 == length2) {
                                            break;
                                        }
                                        i23++;
                                        i16 = i13;
                                        j14 = j12;
                                    }
                                } else {
                                    i13 = i16;
                                    j12 = j14;
                                    i14 = i18;
                                    j13 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i13 = i16;
                                j12 = j14;
                                i14 = i18;
                                j13 = j15;
                            }
                            if (boolInvoke.booleanValue()) {
                                r02.l(i22);
                            }
                            i15 = 8;
                        } else {
                            jArr2 = jArr3;
                            i13 = i16;
                            j12 = j14;
                            i14 = i18;
                            j13 = j15;
                            i15 = i17;
                        }
                        j14 = j12 >> i15;
                        i19++;
                        i17 = i15;
                        j15 = j13;
                        jArr3 = jArr2;
                        i18 = i14;
                        i16 = i13;
                    }
                    jArr = jArr3;
                    int i28 = i16;
                    if (i18 != i17) {
                        return;
                    } else {
                        i12 = i28;
                    }
                } else {
                    jArr = jArr3;
                    i12 = i16;
                }
                if (i12 == length) {
                    return;
                }
                i16 = i12 + 1;
                jArr3 = jArr;
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/l;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<Set<? extends Object>, AbstractC22167l, G0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(Set<? extends Object> set, AbstractC22167l abstractC22167l) {
            List listH0;
            Set<? extends Object> set2 = set;
            while (true) {
                H h12 = H.this;
                AtomicReference<Object> atomicReference = h12.f38628b;
                Object obj = atomicReference.get();
                if (obj == null) {
                    listH0 = set2;
                } else if (obj instanceof Set) {
                    listH0 = C42745f0.U(obj, set2);
                } else {
                    if (!(obj instanceof List)) {
                        androidx.compose.runtime.G.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    listH0 = C42745f0.h0(Collections.singletonList(set2), (Collection) obj);
                }
                while (!atomicReference.compareAndSet(obj, listH0)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                if (H.a(h12)) {
                    h12.f38627a.invoke(new I(h12));
                }
                return G0.f406611a;
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            H h12 = H.this;
            h12.getClass();
            synchronized (h12.f38633g) {
                a aVar = h12.f38635i;
                Object obj2 = aVar.f38638b;
                int i12 = aVar.f38640d;
                M0<Object> m02 = aVar.f38639c;
                if (m02 == null) {
                    m02 = new M0<>(0, 1, null);
                    aVar.f38639c = m02;
                    aVar.f38642f.m(obj2, m02);
                    G0 g02 = G0.f406611a;
                }
                aVar.c(obj, i12, obj2, m02);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@Y61.k Y41.l<? super Y41.a<G0>, G0> lVar) {
        this.f38627a = (kotlin.jvm.internal.N) lVar;
    }

    public static final boolean a(H h12) {
        boolean z12;
        Set<? extends Object> set;
        synchronized (h12.f38633g) {
            z12 = h12.f38629c;
        }
        if (z12) {
            return false;
        }
        boolean z13 = false;
        while (true) {
            AtomicReference<Object> atomicReference = h12.f38628b;
            Object obj = atomicReference.get();
            Set<? extends Object> set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        androidx.compose.runtime.G.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                }
                while (!atomicReference.compareAndSet(obj, objSubList)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z13;
            }
            synchronized (h12.f38633g) {
                try {
                    androidx.compose.runtime.collection.e<a> eVar = h12.f38632f;
                    a[] aVarArr = eVar.f38260b;
                    int i12 = eVar.f38262d;
                    for (int i13 = 0; i13 < i12; i13++) {
                        z13 = aVarArr[i13].b(set2) || z13;
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f38633g) {
            try {
                androidx.compose.runtime.collection.e<a> eVar = this.f38632f;
                a[] aVarArr = eVar.f38260b;
                int i12 = eVar.f38262d;
                for (int i13 = 0; i13 < i12; i13++) {
                    a aVar = aVarArr[i13];
                    aVar.f38641e.g();
                    aVar.f38642f.g();
                    aVar.f38647k.g();
                    aVar.f38648l.clear();
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@Y61.k java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.H.c(java.lang.Object):void");
    }

    public final void d(@Y61.k Y41.l<Object, Boolean> lVar) {
        synchronized (this.f38633g) {
            try {
                androidx.compose.runtime.collection.e<a> eVar = this.f38632f;
                int i12 = eVar.f38262d;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    a aVar = eVar.f38260b[i14];
                    aVar.e(lVar);
                    if (!(aVar.f38642f.f25725e != 0)) {
                        i13++;
                    } else if (i13 > 0) {
                        a[] aVarArr = eVar.f38260b;
                        aVarArr[i14 - i13] = aVarArr[i14];
                    }
                }
                int i15 = i12 - i13;
                Arrays.fill(eVar.f38260b, i15, i12, (Object) null);
                eVar.f38262d = i15;
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> void e(@Y61.k T t12, @Y61.k Y41.l<? super T, G0> lVar, @Y61.k Y41.a<G0> aVar) {
        a aVar2;
        a aVar3;
        synchronized (this.f38633g) {
            androidx.compose.runtime.collection.e<a> eVar = this.f38632f;
            a[] aVarArr = eVar.f38260b;
            int i12 = eVar.f38262d;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArr[i13];
                if (aVar2.f38637a == lVar) {
                    break;
                } else {
                    i13++;
                }
            }
            aVar3 = aVar2;
            if (aVar3 == null) {
                v0.e(1, lVar);
                aVar3 = new a(lVar);
                eVar.b(aVar3);
            }
        }
        a aVar4 = this.f38635i;
        long j12 = this.f38636j;
        if (j12 != -1 && j12 != androidx.compose.runtime.internal.T.a()) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbQ.append(androidx.compose.runtime.internal.T.a());
            sbQ.append(", name=");
            sbQ.append(Thread.currentThread().getName());
            sbQ.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            P1.a(sbQ.toString());
        }
        try {
            this.f38635i = aVar3;
            this.f38636j = androidx.compose.runtime.internal.T.a();
            aVar3.a(t12, this.f38631e, aVar);
        } finally {
            this.f38635i = aVar4;
            this.f38636j = j12;
        }
    }
}
