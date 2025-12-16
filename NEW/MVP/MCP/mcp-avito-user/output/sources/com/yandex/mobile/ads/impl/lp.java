package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.ba1;
import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.db0;
import com.yandex.mobile.ads.impl.q7;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import okhttp3.internal.http2.Http2;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public final class lp extends db0 {

    /* renamed from: i, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.d0<Integer> f387589i = com.yandex.mobile.ads.embedded.guava.collect.d0.a(new A(12));

    /* renamed from: j, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.d0<Integer> f387590j = com.yandex.mobile.ads.embedded.guava.collect.d0.a(new A(13));

    /* renamed from: c, reason: collision with root package name */
    private final Object f387591c;

    /* renamed from: d, reason: collision with root package name */
    private final cu.b f387592d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f387593e;

    /* renamed from: f, reason: collision with root package name */
    @j.B
    private c f387594f;

    /* renamed from: g, reason: collision with root package name */
    @j.B
    @j.P
    private e f387595g;

    /* renamed from: h, reason: collision with root package name */
    @j.B
    private jc f387596h;

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f387615a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f387616b;

        public b(vw vwVar, int i12) {
            this.f387615a = (vwVar.f391173d & 1) != 0;
            this.f387616b = lp.a(false, i12);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            return qk.e().a(this.f387616b, bVar.f387616b).a(this.f387615a, bVar.f387615a).d();
        }
    }

    public static final class c extends ba1 {

        /* renamed from: Q, reason: collision with root package name */
        public static final c f387617Q = new a().a();

        /* renamed from: B, reason: collision with root package name */
        public final boolean f387618B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f387619C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f387620D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f387621E;

        /* renamed from: F, reason: collision with root package name */
        public final boolean f387622F;

        /* renamed from: G, reason: collision with root package name */
        public final boolean f387623G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f387624H;

        /* renamed from: I, reason: collision with root package name */
        public final boolean f387625I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f387626J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f387627K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f387628L;

        /* renamed from: M, reason: collision with root package name */
        public final boolean f387629M;

        /* renamed from: N, reason: collision with root package name */
        public final boolean f387630N;

        /* renamed from: O, reason: collision with root package name */
        private final SparseArray<Map<w91, d>> f387631O;

        /* renamed from: P, reason: collision with root package name */
        private final SparseBooleanArray f387632P;

        public static final class a extends ba1.a {

            /* renamed from: A, reason: collision with root package name */
            private boolean f387633A;

            /* renamed from: B, reason: collision with root package name */
            private boolean f387634B;

            /* renamed from: C, reason: collision with root package name */
            private boolean f387635C;

            /* renamed from: D, reason: collision with root package name */
            private boolean f387636D;

            /* renamed from: E, reason: collision with root package name */
            private boolean f387637E;

            /* renamed from: F, reason: collision with root package name */
            private boolean f387638F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f387639G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f387640H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f387641I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f387642J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f387643K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f387644L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f387645M;

            /* renamed from: N, reason: collision with root package name */
            private final SparseArray<Map<w91, d>> f387646N;

            /* renamed from: O, reason: collision with root package name */
            private final SparseBooleanArray f387647O;

            public /* synthetic */ a(Bundle bundle, int i12) {
                this(bundle);
            }

            @Deprecated
            public a() {
                this.f387646N = new SparseArray<>();
                this.f387647O = new SparseBooleanArray();
                b();
            }

            @Override // com.yandex.mobile.ads.impl.ba1.a
            public final ba1.a a(int i12, int i13) {
                super.a(i12, i13);
                return this;
            }

            @Override // com.yandex.mobile.ads.impl.ba1.a
            public final void b(Context context) {
                super.b(context);
            }

            public final void c(boolean z12) {
                this.f387638F = z12;
            }

            public final void d(boolean z12) {
                this.f387639G = z12;
            }

            public final void e(boolean z12) {
                this.f387645M = z12;
            }

            public final void f(boolean z12) {
                this.f387636D = z12;
            }

            public final void g(boolean z12) {
                this.f387634B = z12;
            }

            public final void h(boolean z12) {
                this.f387635C = z12;
            }

            public final void i(boolean z12) {
                this.f387642J = z12;
            }

            public final void j(boolean z12) {
                this.f387637E = z12;
            }

            public final void k(boolean z12) {
                this.f387643K = z12;
            }

            public final void l(boolean z12) {
                this.f387633A = z12;
            }

            public final void m(boolean z12) {
                this.f387644L = z12;
            }

            public final void a(boolean z12) {
                this.f387640H = z12;
            }

            public final void b(boolean z12) {
                this.f387641I = z12;
            }

            private void b() {
                this.f387633A = true;
                this.f387634B = false;
                this.f387635C = true;
                this.f387636D = false;
                this.f387637E = true;
                this.f387638F = false;
                this.f387639G = false;
                this.f387640H = false;
                this.f387641I = false;
                this.f387642J = true;
                this.f387643K = true;
                this.f387644L = false;
                this.f387645M = true;
            }

            @Override // com.yandex.mobile.ads.impl.ba1.a
            public final void a(Context context) {
                super.a(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void a(Bundle bundle) {
                com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                if (parcelableArrayList == null) {
                    pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.i();
                } else {
                    pVarA = sg.a(w91.f391353e, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    rg.a<d> aVar = d.f387648d;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i12 = 0; i12 < sparseParcelableArray.size(); i12++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i12), aVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i12)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != pVarA.size()) {
                    return;
                }
                for (int i13 = 0; i13 < intArray.length; i13++) {
                    int i14 = intArray[i13];
                    w91 w91Var = (w91) pVarA.get(i13);
                    d dVar = (d) sparseArray.get(i13);
                    Map<w91, d> map = this.f387646N.get(i14);
                    if (map == null) {
                        map = new HashMap<>();
                        this.f387646N.put(i14, map);
                    }
                    if (!map.containsKey(w91Var) || !pc1.a(map.get(w91Var), dVar)) {
                        map.put(w91Var, dVar);
                    }
                }
            }

            public a(Context context) {
                super(context);
                this.f387646N = new SparseArray<>();
                this.f387647O = new SparseBooleanArray();
                b();
            }

            private a(Bundle bundle) {
                super(bundle);
                b();
                c cVar = c.f387617Q;
                l(bundle.getBoolean(ba1.a(1000), cVar.f387618B));
                g(bundle.getBoolean(ba1.a(1001), cVar.f387619C));
                h(bundle.getBoolean(ba1.a(1002), cVar.f387620D));
                f(bundle.getBoolean(ba1.a(1014), cVar.f387621E));
                j(bundle.getBoolean(ba1.a(ErrorCodes.MALFORMED_URL_EXCEPTION), cVar.f387622F));
                c(bundle.getBoolean(ba1.a(ErrorCodes.PROTOCOL_EXCEPTION), cVar.f387623G));
                d(bundle.getBoolean(ba1.a(1005), cVar.f387624H));
                a(bundle.getBoolean(ba1.a(ErrorCodes.SSL_HANDSHAKE_EXCEPTION), cVar.f387625I));
                b(bundle.getBoolean(ba1.a(1015), cVar.f387626J));
                i(bundle.getBoolean(ba1.a(1016), cVar.f387627K));
                k(bundle.getBoolean(ba1.a(ErrorCodes.IO_EXCEPTION), cVar.f387628L));
                m(bundle.getBoolean(ba1.a(1008), cVar.f387629M));
                e(bundle.getBoolean(ba1.a(1009), cVar.f387630N));
                this.f387646N = new SparseArray<>();
                a(bundle);
                this.f387647O = a(bundle.getIntArray(ba1.a(1013)));
            }

            public final c a() {
                return new c(this, 0);
            }

            private static SparseBooleanArray a(@j.P int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i12 : iArr) {
                    sparseBooleanArray.append(i12, true);
                }
                return sparseBooleanArray;
            }
        }

        public /* synthetic */ c(a aVar, int i12) {
            this(aVar);
        }

        public static c a(Context context) {
            return new a(context).a();
        }

        public final boolean b(int i12) {
            return this.f387632P.get(i12);
        }

        @Override // com.yandex.mobile.ads.impl.ba1
        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (super.equals(cVar) && this.f387618B == cVar.f387618B && this.f387619C == cVar.f387619C && this.f387620D == cVar.f387620D && this.f387621E == cVar.f387621E && this.f387622F == cVar.f387622F && this.f387623G == cVar.f387623G && this.f387624H == cVar.f387624H && this.f387625I == cVar.f387625I && this.f387626J == cVar.f387626J && this.f387627K == cVar.f387627K && this.f387628L == cVar.f387628L && this.f387629M == cVar.f387629M && this.f387630N == cVar.f387630N) {
                SparseBooleanArray sparseBooleanArray = this.f387632P;
                SparseBooleanArray sparseBooleanArray2 = cVar.f387632P;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            SparseArray<Map<w91, d>> sparseArray = this.f387631O;
                            SparseArray<Map<w91, d>> sparseArray2 = cVar.f387631O;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i13 = 0; i13 < size2; i13++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i13));
                                    if (iIndexOfKey >= 0) {
                                        Map<w91, d> mapValueAt = sparseArray.valueAt(i13);
                                        Map<w91, d> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                        if (mapValueAt2.size() == mapValueAt.size()) {
                                            for (Map.Entry<w91, d> entry : mapValueAt.entrySet()) {
                                                w91 key = entry.getKey();
                                                if (!mapValueAt2.containsKey(key) || !pc1.a(entry.getValue(), mapValueAt2.get(key))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i12)) < 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.ba1
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f387618B ? 1 : 0)) * 31) + (this.f387619C ? 1 : 0)) * 31) + (this.f387620D ? 1 : 0)) * 31) + (this.f387621E ? 1 : 0)) * 31) + (this.f387622F ? 1 : 0)) * 31) + (this.f387623G ? 1 : 0)) * 31) + (this.f387624H ? 1 : 0)) * 31) + (this.f387625I ? 1 : 0)) * 31) + (this.f387626J ? 1 : 0)) * 31) + (this.f387627K ? 1 : 0)) * 31) + (this.f387628L ? 1 : 0)) * 31) + (this.f387629M ? 1 : 0)) * 31) + (this.f387630N ? 1 : 0);
        }

        private c(a aVar) {
            super(aVar);
            this.f387618B = aVar.f387633A;
            this.f387619C = aVar.f387634B;
            this.f387620D = aVar.f387635C;
            this.f387621E = aVar.f387636D;
            this.f387622F = aVar.f387637E;
            this.f387623G = aVar.f387638F;
            this.f387624H = aVar.f387639G;
            this.f387625I = aVar.f387640H;
            this.f387626J = aVar.f387641I;
            this.f387627K = aVar.f387642J;
            this.f387628L = aVar.f387643K;
            this.f387629M = aVar.f387644L;
            this.f387630N = aVar.f387645M;
            this.f387631O = aVar.f387646N;
            this.f387632P = aVar.f387647O;
        }

        @j.P
        @Deprecated
        public final d a(int i12, w91 w91Var) {
            Map<w91, d> map = this.f387631O.get(i12);
            if (map != null) {
                return map.get(w91Var);
            }
            return null;
        }

        @Deprecated
        public final boolean b(int i12, w91 w91Var) {
            Map<w91, d> map = this.f387631O.get(i12);
            return map != null && map.containsKey(w91Var);
        }
    }

    public static final class d implements rg {

        /* renamed from: d, reason: collision with root package name */
        public static final rg.a<d> f387648d = new Q0(0);

        /* renamed from: a, reason: collision with root package name */
        public final int f387649a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f387650b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387651c;

        public d(int i12, int i13, int[] iArr) {
            this.f387649a = i12;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f387650b = iArrCopyOf;
            this.f387651c = i13;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            boolean z12 = false;
            int i12 = bundle.getInt(Integer.toString(0, 36), -1);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int i13 = bundle.getInt(Integer.toString(2, 36), -1);
            if (i12 >= 0 && i13 >= 0) {
                z12 = true;
            }
            db.a(z12);
            intArray.getClass();
            return new d(i12, i13, intArray);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f387649a == dVar.f387649a && Arrays.equals(this.f387650b, dVar.f387650b) && this.f387651c == dVar.f387651c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f387650b) + (this.f387649a * 31)) * 31) + this.f387651c;
        }
    }

    public static final class f extends g<f> implements Comparable<f> {

        /* renamed from: e, reason: collision with root package name */
        private final int f387657e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f387658f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f387659g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f387660h;

        /* renamed from: i, reason: collision with root package name */
        private final int f387661i;

        /* renamed from: j, reason: collision with root package name */
        private final int f387662j;

        /* renamed from: k, reason: collision with root package name */
        private final int f387663k;

        /* renamed from: l, reason: collision with root package name */
        private final int f387664l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f387665m;

        public f(int i12, v91 v91Var, int i13, c cVar, int i14, @j.P String str) {
            int iA2;
            super(i12, i13, v91Var);
            int i15 = 0;
            this.f387658f = lp.a(false, i14);
            int i16 = this.f387669d.f391173d & (~cVar.f383844u);
            this.f387659g = (i16 & 1) != 0;
            this.f387660h = (i16 & 2) != 0;
            com.yandex.mobile.ads.embedded.guava.collect.p<String> pVarA = cVar.f383842s.isEmpty() ? com.yandex.mobile.ads.embedded.guava.collect.p.a("") : cVar.f383842s;
            int i17 = 0;
            while (true) {
                if (i17 >= pVarA.size()) {
                    i17 = Integer.MAX_VALUE;
                    iA2 = 0;
                    break;
                } else {
                    iA2 = lp.a(this.f387669d, pVarA.get(i17), cVar.f383845v);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f387661i = i17;
            this.f387662j = iA2;
            int iA3 = lp.a(this.f387669d.f391174e, cVar.f383843t);
            this.f387663k = iA3;
            this.f387665m = (this.f387669d.f391174e & 1088) != 0;
            int iA4 = lp.a(this.f387669d, str, lp.b(str) == null);
            this.f387664l = iA4;
            boolean z12 = iA2 > 0 || (cVar.f383842s.isEmpty() && iA3 > 0) || this.f387659g || (this.f387660h && iA4 > 0);
            if (lp.a(cVar.f387628L, i14) && z12) {
                i15 = 1;
            }
            this.f387657e = i15;
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final /* bridge */ /* synthetic */ boolean a(g gVar) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final int a() {
            return this.f387657e;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            qk qkVarA = qk.e().a(this.f387658f, fVar.f387658f).a(Integer.valueOf(this.f387661i), Integer.valueOf(fVar.f387661i), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f387662j, fVar.f387662j).a(this.f387663k, fVar.f387663k).a(this.f387659g, fVar.f387659g).a(Boolean.valueOf(this.f387660h), Boolean.valueOf(fVar.f387660h), this.f387662j == 0 ? com.yandex.mobile.ads.embedded.guava.collect.d0.a() : com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f387664l, fVar.f387664l);
            if (this.f387663k == 0) {
                qkVarA = qkVarA.b(this.f387665m, fVar.f387665m);
            }
            return qkVarA.d();
        }

        public static int a(List<f> list, List<f> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    public static abstract class g<T extends g<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f387666a;

        /* renamed from: b, reason: collision with root package name */
        public final v91 f387667b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387668c;

        /* renamed from: d, reason: collision with root package name */
        public final vw f387669d;

        public interface a<T extends g<T>> {
            List<T> a(int i12, v91 v91Var, int[] iArr);
        }

        public g(int i12, int i13, v91 v91Var) {
            this.f387666a = i12;
            this.f387667b = v91Var;
            this.f387668c = i13;
            this.f387669d = v91Var.a(i13);
        }

        public abstract int a();

        public abstract boolean a(T t12);
    }

    public lp(Context context, c cVar, q7.b bVar) {
        this(cVar, bVar, context);
    }

    public static boolean a(boolean z12, int i12) {
        int i13 = i12 & 7;
        return i13 == 4 || (z12 && i13 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final void d() {
        e eVar;
        synchronized (this.f387591c) {
            try {
                if (pc1.f388768a >= 32 && (eVar = this.f387595g) != null) {
                    eVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.d();
    }

    @j.X
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f387652a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f387653b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private Handler f387654c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private Spatializer$OnSpatializerStateChangedListener f387655d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ lp f387656a;

            public a(lp lpVar) {
                this.f387656a = lpVar;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z12) {
                lp.a(this.f387656a);
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z12) {
                lp.a(this.f387656a);
            }
        }

        private e(Spatializer spatializer) {
            this.f387652a = spatializer;
            this.f387653b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @j.P
        public static e a(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager == null) {
                return null;
            }
            return new e(audioManager.getSpatializer());
        }

        public final boolean b() {
            return this.f387652a.isEnabled();
        }

        public final boolean c() {
            return this.f387653b;
        }

        public final void d() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f387655d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f387654c == null) {
                return;
            }
            this.f387652a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) pc1.a(this.f387654c)).removeCallbacksAndMessages(null);
            this.f387654c = null;
            this.f387655d = null;
        }

        public final void a(lp lpVar, Looper looper) {
            if (this.f387655d == null && this.f387654c == null) {
                this.f387655d = new a(lpVar);
                Handler handler = new Handler(looper);
                this.f387654c = handler;
                this.f387652a.addOnSpatializerStateChangedListener(new androidx.media3.exoplayer.audio.o(handler, 0), this.f387655d);
            }
        }

        public final boolean a() {
            return this.f387652a.isAvailable();
        }

        public final boolean a(vw vwVar, jc jcVar) throws IllegalArgumentException {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(pc1.a(("audio/eac3-joc".equals(vwVar.f391181l) && vwVar.f391194y == 16) ? 12 : vwVar.f391194y));
            int i12 = vwVar.f391195z;
            if (i12 != -1) {
                channelMask.setSampleRate(i12);
            }
            return this.f387652a.canBeSpatialized(jcVar.a().f386818a, channelMask.build());
        }
    }

    private lp(c cVar, q7.b bVar, @j.P Context context) {
        this.f387591c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f387592d = bVar;
        this.f387594f = cVar;
        this.f387596h = jc.f386811g;
        boolean z12 = context != null && pc1.d(context);
        this.f387593e = z12;
        if (!z12 && context != null && pc1.f388768a >= 32) {
            this.f387595g = e.a(context);
        }
        if (this.f387594f.f387627K && context == null) {
            ka0.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @j.P
    public static String b(@j.P String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final class a extends g<a> implements Comparable<a> {

        /* renamed from: e, reason: collision with root package name */
        private final int f387597e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f387598f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private final String f387599g;

        /* renamed from: h, reason: collision with root package name */
        private final c f387600h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f387601i;

        /* renamed from: j, reason: collision with root package name */
        private final int f387602j;

        /* renamed from: k, reason: collision with root package name */
        private final int f387603k;

        /* renamed from: l, reason: collision with root package name */
        private final int f387604l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f387605m;

        /* renamed from: n, reason: collision with root package name */
        private final int f387606n;

        /* renamed from: o, reason: collision with root package name */
        private final int f387607o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f387608p;

        /* renamed from: q, reason: collision with root package name */
        private final int f387609q;

        /* renamed from: r, reason: collision with root package name */
        private final int f387610r;

        /* renamed from: s, reason: collision with root package name */
        private final int f387611s;

        /* renamed from: t, reason: collision with root package name */
        private final int f387612t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f387613u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f387614v;

        public a(int i12, v91 v91Var, int i13, c cVar, int i14, boolean z12, ju0<vw> ju0Var) {
            int i15;
            int iA2;
            int iA3;
            super(i12, i13, v91Var);
            this.f387600h = cVar;
            this.f387599g = lp.b(this.f387669d.f391172c);
            this.f387601i = lp.a(false, i14);
            int i16 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i16 >= cVar.f383837n.size()) {
                    iA2 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = lp.a(this.f387669d, cVar.f383837n.get(i16), false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f387603k = i16;
            this.f387602j = iA2;
            this.f387604l = lp.a(this.f387669d.f391174e, cVar.f383838o);
            vw vwVar = this.f387669d;
            int i17 = vwVar.f391174e;
            this.f387605m = i17 == 0 || (i17 & 1) != 0;
            this.f387608p = (vwVar.f391173d & 1) != 0;
            int i18 = vwVar.f391194y;
            this.f387609q = i18;
            this.f387610r = vwVar.f391195z;
            int i19 = vwVar.f391177h;
            this.f387611s = i19;
            this.f387598f = (i19 == -1 || i19 <= cVar.f383840q) && (i18 == -1 || i18 <= cVar.f383839p) && ju0Var.apply(vwVar);
            String[] strArrD = pc1.d();
            int i22 = 0;
            while (true) {
                if (i22 >= strArrD.length) {
                    iA3 = 0;
                    i22 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA3 = lp.a(this.f387669d, strArrD[i22], false);
                    if (iA3 > 0) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            this.f387606n = i22;
            this.f387607o = iA3;
            int i23 = 0;
            while (true) {
                if (i23 < cVar.f383841r.size()) {
                    String str = this.f387669d.f391181l;
                    if (str != null && str.equals(cVar.f383841r.get(i23))) {
                        i15 = i23;
                        break;
                    }
                    i23++;
                } else {
                    break;
                }
            }
            this.f387612t = i15;
            this.f387613u = vx0.b(i14) == 128;
            this.f387614v = vx0.c(i14) == 64;
            this.f387597e = a(z12, i14);
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final boolean a(g gVar) {
            int i12;
            String str;
            int i13;
            a aVar = (a) gVar;
            c cVar = this.f387600h;
            if ((cVar.f387625I || ((i13 = this.f387669d.f391194y) != -1 && i13 == aVar.f387669d.f391194y)) && (cVar.f387623G || ((str = this.f387669d.f391181l) != null && TextUtils.equals(str, aVar.f387669d.f391181l)))) {
                c cVar2 = this.f387600h;
                if ((cVar2.f387624H || ((i12 = this.f387669d.f391195z) != -1 && i12 == aVar.f387669d.f391195z)) && (cVar2.f387626J || (this.f387613u == aVar.f387613u && this.f387614v == aVar.f387614v))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final int a() {
            return this.f387597e;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            com.yandex.mobile.ads.embedded.guava.collect.d0 d0VarB = (this.f387598f && this.f387601i) ? lp.f387589i : lp.f387589i.b();
            qk qkVarA = qk.e().a(this.f387601i, aVar.f387601i).a(Integer.valueOf(this.f387603k), Integer.valueOf(aVar.f387603k), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f387602j, aVar.f387602j).a(this.f387604l, aVar.f387604l).a(this.f387608p, aVar.f387608p).a(this.f387605m, aVar.f387605m).a(Integer.valueOf(this.f387606n), Integer.valueOf(aVar.f387606n), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f387607o, aVar.f387607o).a(this.f387598f, aVar.f387598f).a(Integer.valueOf(this.f387612t), Integer.valueOf(aVar.f387612t), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(Integer.valueOf(this.f387611s), Integer.valueOf(aVar.f387611s), this.f387600h.f383846w ? lp.f387589i.b() : lp.f387590j).a(this.f387613u, aVar.f387613u).a(this.f387614v, aVar.f387614v).a(Integer.valueOf(this.f387609q), Integer.valueOf(aVar.f387609q), d0VarB).a(Integer.valueOf(this.f387610r), Integer.valueOf(aVar.f387610r), d0VarB);
            Integer numValueOf = Integer.valueOf(this.f387611s);
            Integer numValueOf2 = Integer.valueOf(aVar.f387611s);
            if (!pc1.a(this.f387599g, aVar.f387599g)) {
                d0VarB = lp.f387590j;
            }
            return qkVarA.a(numValueOf, numValueOf2, d0VarB).d();
        }

        private int a(boolean z12, int i12) {
            if (!lp.a(this.f387600h.f387628L, i12)) {
                return 0;
            }
            if (!this.f387598f && !this.f387600h.f387622F) {
                return 0;
            }
            if (lp.a(false, i12) && this.f387598f && this.f387669d.f391177h != -1) {
                c cVar = this.f387600h;
                if (!cVar.f383847x && !cVar.f383846w && (cVar.f387630N || !z12)) {
                    return 2;
                }
            }
            return 1;
        }

        public static int a(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }
    }

    public static final class h extends g<h> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f387670e;

        /* renamed from: f, reason: collision with root package name */
        private final c f387671f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f387672g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f387673h;

        /* renamed from: i, reason: collision with root package name */
        private final int f387674i;

        /* renamed from: j, reason: collision with root package name */
        private final int f387675j;

        /* renamed from: k, reason: collision with root package name */
        private final int f387676k;

        /* renamed from: l, reason: collision with root package name */
        private final int f387677l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f387678m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f387679n;

        /* renamed from: o, reason: collision with root package name */
        private final int f387680o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f387681p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f387682q;

        /* renamed from: r, reason: collision with root package name */
        private final int f387683r;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(int r5, com.yandex.mobile.ads.impl.v91 r6, int r7, com.yandex.mobile.ads.impl.lp.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lp.h.<init>(int, com.yandex.mobile.ads.impl.v91, int, com.yandex.mobile.ads.impl.lp$c, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(h hVar, h hVar2) {
            com.yandex.mobile.ads.embedded.guava.collect.d0 d0VarB = (hVar.f387670e && hVar.f387673h) ? lp.f387589i : lp.f387589i.b();
            return qk.e().a(Integer.valueOf(hVar.f387674i), Integer.valueOf(hVar2.f387674i), hVar.f387671f.f383846w ? lp.f387589i.b() : lp.f387590j).a(Integer.valueOf(hVar.f387675j), Integer.valueOf(hVar2.f387675j), d0VarB).a(Integer.valueOf(hVar.f387674i), Integer.valueOf(hVar2.f387674i), d0VarB).d();
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final boolean a(g gVar) {
            h hVar = (h) gVar;
            return (this.f387679n || pc1.a(this.f387669d.f391181l, hVar.f387669d.f391181l)) && (this.f387671f.f387621E || (this.f387681p == hVar.f387681p && this.f387682q == hVar.f387682q));
        }

        @Override // com.yandex.mobile.ads.impl.lp.g
        public final int a() {
            return this.f387680o;
        }

        private int a(int i12, int i13) {
            if ((this.f387669d.f391174e & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !lp.a(this.f387671f.f387628L, i12)) {
                return 0;
            }
            if (!this.f387670e && !this.f387671f.f387618B) {
                return 0;
            }
            if (lp.a(false, i12) && this.f387672g && this.f387670e && this.f387669d.f391177h != -1) {
                c cVar = this.f387671f;
                if (!cVar.f383847x && !cVar.f383846w && (i12 & i13) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(h hVar, h hVar2) {
            qk qkVarA = qk.e().a(hVar.f387673h, hVar2.f387673h).a(hVar.f387677l, hVar2.f387677l).a(hVar.f387678m, hVar2.f387678m).a(hVar.f387670e, hVar2.f387670e).a(hVar.f387672g, hVar2.f387672g).a(Integer.valueOf(hVar.f387676k), Integer.valueOf(hVar2.f387676k), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(hVar.f387681p, hVar2.f387681p).a(hVar.f387682q, hVar2.f387682q);
            if (hVar.f387681p && hVar.f387682q) {
                qkVarA = qkVarA.a(hVar.f387683r, hVar2.f387683r);
            }
            return qkVarA.d();
        }

        public static int a(List<h> list, List<h> list2) {
            return qk.e().a((h) Collections.max(list, new A(6)), (h) Collections.max(list2, new A(6)), new A(6)).a(list.size(), list2.size()).a((h) Collections.max(list, new A(7)), (h) Collections.max(list2, new A(7)), new A(7)).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final void a(jc jcVar) {
        boolean zEquals;
        boolean z12;
        e eVar;
        synchronized (this.f387591c) {
            zEquals = this.f387596h.equals(jcVar);
            this.f387596h = jcVar;
        }
        if (zEquals) {
            return;
        }
        synchronized (this.f387591c) {
            try {
                z12 = this.f387594f.f387627K && !this.f387593e && pc1.f388768a >= 32 && (eVar = this.f387595g) != null && eVar.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f9  */
    @Override // com.yandex.mobile.ads.impl.db0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(com.yandex.mobile.ads.impl.db0.a r31, int[][][] r32, int[] r33) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lp.a(com.yandex.mobile.ads.impl.db0$a, int[][][], int[]):android.util.Pair");
    }

    @j.P
    public static Pair a(db0.a aVar, int[][][] iArr, int[] iArr2, c cVar) {
        return a(2, aVar, iArr, new O(11, cVar, iArr2), new A(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(com.yandex.mobile.ads.impl.lp.c r16, int[] r17, int r18, com.yandex.mobile.ads.impl.v91 r19, int[] r20) {
        /*
            r8 = r16
            r9 = r19
            r10 = r17[r18]
            int r0 = r8.f383832i
            int r1 = r8.f383833j
            boolean r2 = r8.f383834k
            r11 = 1
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r13) goto L76
            if (r1 != r13) goto L16
            goto L76
        L16:
            r4 = r13
            r3 = 0
        L18:
            int r5 = r9.f390831a
            if (r3 >= r5) goto L74
            com.yandex.mobile.ads.impl.vw r5 = r9.a(r3)
            int r6 = r5.f391186q
            if (r6 <= 0) goto L6f
            int r7 = r5.f391187r
            if (r7 <= 0) goto L6f
            if (r2 == 0) goto L39
            if (r6 <= r7) goto L2e
            r14 = r11
            goto L2f
        L2e:
            r14 = 0
        L2f:
            if (r0 <= r1) goto L33
            r15 = r11
            goto L34
        L33:
            r15 = 0
        L34:
            if (r14 == r15) goto L39
            r14 = r0
            r15 = r1
            goto L3b
        L39:
            r15 = r0
            r14 = r1
        L3b:
            int r12 = r6 * r14
            int r13 = r7 * r15
            if (r12 < r13) goto L4b
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.yandex.mobile.ads.impl.pc1.a(r13, r6)
            r7.<init>(r15, r6)
            goto L55
        L4b:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.yandex.mobile.ads.impl.pc1.a(r12, r7)
            r6.<init>(r7, r14)
            r7 = r6
        L55:
            int r6 = r5.f391186q
            int r5 = r5.f391187r
            int r12 = r6 * r5
            int r13 = r7.x
            float r13 = (float) r13
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r13 = r13 * r14
            int r13 = (int) r13
            if (r6 < r13) goto L6f
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r14
            int r6 = (int) r6
            if (r5 < r6) goto L6f
            if (r12 >= r4) goto L6f
            r4 = r12
        L6f:
            int r3 = r3 + r11
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L18
        L74:
            r12 = r4
            goto L79
        L76:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L79:
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c
            com.yandex.mobile.ads.embedded.guava.collect.p$a r13 = new com.yandex.mobile.ads.embedded.guava.collect.p$a
            r13.<init>()
            r14 = 0
        L81:
            int r0 = r9.f390831a
            if (r14 >= r0) goto Lb1
            com.yandex.mobile.ads.impl.vw r0 = r9.a(r14)
            int r0 = r0.b()
            r15 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r15) goto L9a
            r1 = -1
            if (r0 == r1) goto L98
            if (r0 > r12) goto L98
            goto L9a
        L98:
            r7 = 0
            goto L9b
        L9a:
            r7 = r11
        L9b:
            com.yandex.mobile.ads.impl.lp$h r6 = new com.yandex.mobile.ads.impl.lp$h
            r5 = r20[r14]
            r0 = r6
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r16
            r15 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.b(r15)
            int r14 = r14 + r11
            goto L81
        Lb1:
            com.yandex.mobile.ads.embedded.guava.collect.p r0 = r13.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lp.a(com.yandex.mobile.ads.impl.lp$c, int[], int, com.yandex.mobile.ads.impl.v91, int[]):java.util.List");
    }

    @j.P
    public final Pair a(db0.a aVar, int[][][] iArr, final c cVar) {
        final boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 < aVar.a()) {
                if (2 == aVar.a(i12) && aVar.b(i12).f391354a > 0) {
                    z12 = true;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        return a(1, aVar, iArr, new g.a() { // from class: com.yandex.mobile.ads.impl.P0
            @Override // com.yandex.mobile.ads.impl.lp.g.a
            public final List a(int i13, v91 v91Var, int[] iArr2) {
                return this.f383278b.a(cVar, z12, i13, v91Var, iArr2);
            }
        }, new A(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(c cVar, boolean z12, int i12, v91 v91Var, int[] iArr) {
        ju0 ju0Var = new ju0() { // from class: com.yandex.mobile.ads.impl.O0
            @Override // com.yandex.mobile.ads.impl.ju0
            public final boolean apply(Object obj) {
                return this.f383272b.a((vw) obj);
            }
        };
        int i13 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar = new p.a();
        for (int i14 = 0; i14 < v91Var.f390831a; i14++) {
            aVar.b(new a(i12, v91Var, i14, cVar, iArr[i14], z12, ju0Var));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060 A[Catch: all -> 0x0089, FALL_THROUGH, TryCatch #0 {all -> 0x0089, blocks: (B:4:0x0006, B:6:0x000c, B:8:0x0010, B:10:0x0014, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x0060, B:42:0x0064, B:44:0x0068, B:46:0x006e, B:48:0x0076, B:50:0x007e, B:56:0x008c), top: B:60:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.yandex.mobile.ads.impl.vw r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.Object r3 = r8.f387591c
            monitor-enter(r3)
            com.yandex.mobile.ads.impl.lp$c r4 = r8.f387594f     // Catch: java.lang.Throwable -> L89
            boolean r4 = r4.f387627K     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L8c
            boolean r4 = r8.f387593e     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L8c
            int r4 = r9.f391194y     // Catch: java.lang.Throwable -> L89
            if (r4 <= r2) goto L8c
            java.lang.String r4 = r9.f391181l     // Catch: java.lang.Throwable -> L89
            r5 = 32
            if (r4 != 0) goto L1b
            goto L60
        L1b:
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -2123537834: goto L44;
                case 187078296: goto L39;
                case 187078297: goto L30;
                case 1504578661: goto L25;
                default: goto L23;
            }
        L23:
            r2 = r6
            goto L4e
        L25:
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L2e
            goto L23
        L2e:
            r2 = 3
            goto L4e
        L30:
            java.lang.String r7 = "audio/ac4"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L4e
            goto L23
        L39:
            java.lang.String r2 = "audio/ac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L42
            goto L23
        L42:
            r2 = r0
            goto L4e
        L44:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L4d
            goto L23
        L4d:
            r2 = r1
        L4e:
            switch(r2) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L60
        L52:
            int r2 = com.yandex.mobile.ads.impl.pc1.f388768a     // Catch: java.lang.Throwable -> L89
            if (r2 < r5) goto L8c
            com.yandex.mobile.ads.impl.lp$e r2 = r8.f387595g     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8c
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8c
        L60:
            int r2 = com.yandex.mobile.ads.impl.pc1.f388768a     // Catch: java.lang.Throwable -> L89
            if (r2 < r5) goto L8b
            com.yandex.mobile.ads.impl.lp$e r2 = r8.f387595g     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8b
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8b
            com.yandex.mobile.ads.impl.lp$e r2 = r8.f387595g     // Catch: java.lang.Throwable -> L89
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8b
            com.yandex.mobile.ads.impl.lp$e r2 = r8.f387595g     // Catch: java.lang.Throwable -> L89
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8b
            com.yandex.mobile.ads.impl.lp$e r2 = r8.f387595g     // Catch: java.lang.Throwable -> L89
            com.yandex.mobile.ads.impl.jc r4 = r8.f387596h     // Catch: java.lang.Throwable -> L89
            boolean r9 = r2.a(r9, r4)     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L8b
            goto L8c
        L89:
            r9 = move-exception
            goto L8e
        L8b:
            r0 = r1
        L8c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            return r0
        L8e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lp.a(com.yandex.mobile.ads.impl.vw):boolean");
    }

    @j.P
    public static Pair a(db0.a aVar, int[][][] iArr, c cVar, @j.P String str) {
        return a(3, aVar, iArr, new O(12, cVar, str), new A(4));
    }

    @j.P
    private static Pair a(int i12, db0.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        int i13;
        RandomAccess randomAccessA;
        db0.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iA2 = aVar.a();
        int i14 = 0;
        while (i14 < iA2) {
            if (i12 == aVar3.a(i14)) {
                w91 w91VarB = aVar3.b(i14);
                for (int i15 = 0; i15 < w91VarB.f391354a; i15++) {
                    v91 v91VarA = w91VarB.a(i15);
                    List listA = aVar2.a(i14, v91VarA, iArr[i14][i15]);
                    boolean[] zArr = new boolean[v91VarA.f390831a];
                    int i16 = 0;
                    while (i16 < v91VarA.f390831a) {
                        g gVar = (g) listA.get(i16);
                        int iA3 = gVar.a();
                        if (zArr[i16] || iA3 == 0) {
                            i13 = iA2;
                        } else {
                            if (iA3 == 1) {
                                randomAccessA = com.yandex.mobile.ads.embedded.guava.collect.p.a(gVar);
                                i13 = iA2;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i17 = i16 + 1;
                                while (i17 < v91VarA.f390831a) {
                                    g gVar2 = (g) listA.get(i17);
                                    int i18 = iA2;
                                    if (gVar2.a() == 2 && gVar.a(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    iA2 = i18;
                                }
                                i13 = iA2;
                                randomAccessA = arrayList2;
                            }
                            arrayList.add(randomAccessA);
                        }
                        i16++;
                        iA2 = i13;
                    }
                }
            }
            i14++;
            aVar3 = aVar;
            iA2 = iA2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((g) list.get(i19)).f387668c;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new cu.a(0, gVar3.f387667b, iArr2), Integer.valueOf(gVar3.f387666a));
    }

    public static void a(lp lpVar) {
        boolean z12;
        e eVar;
        synchronized (lpVar.f387591c) {
            try {
                z12 = lpVar.f387594f.f387627K && !lpVar.f387593e && pc1.f388768a >= 32 && (eVar = lpVar.f387595g) != null && eVar.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            lpVar.b();
        }
    }

    public static int a(vw vwVar, @j.P String str, boolean z12) {
        if (!TextUtils.isEmpty(str) && str.equals(vwVar.f391172c)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(vwVar.f391172c);
        if (strB2 == null || strB == null) {
            return (z12 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i12 = pc1.f388768a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    public static int a(int i12, int i13) {
        if (i12 == 0 || i12 != i13) {
            return Integer.bitCount(i12 & i13);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str) {
        if (str != null) {
            switch (str) {
                case "video/av01":
                    return 4;
                case "video/hevc":
                    return 3;
                case "video/avc":
                    return 1;
                case "video/x-vnd.on2.vp9":
                    return 2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List a(c cVar, String str, int i12, v91 v91Var, int[] iArr) {
        int i13 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar = new p.a();
        for (int i14 = 0; i14 < v91Var.f390831a; i14++) {
            aVar.b(new f(i12, v91Var, i14, cVar, iArr[i14], str));
        }
        return aVar.a();
    }
}
