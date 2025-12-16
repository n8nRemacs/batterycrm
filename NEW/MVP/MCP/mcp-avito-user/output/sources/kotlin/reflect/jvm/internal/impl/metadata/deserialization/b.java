package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import Y61.l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: Flags.java */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: A, reason: collision with root package name */
    public static final C11675b f409096A;

    /* renamed from: B, reason: collision with root package name */
    public static final C11675b f409097B;

    /* renamed from: C, reason: collision with root package name */
    public static final C11675b f409098C;

    /* renamed from: D, reason: collision with root package name */
    public static final C11675b f409099D;

    /* renamed from: E, reason: collision with root package name */
    public static final C11675b f409100E;

    /* renamed from: F, reason: collision with root package name */
    public static final C11675b f409101F;

    /* renamed from: G, reason: collision with root package name */
    public static final C11675b f409102G;

    /* renamed from: H, reason: collision with root package name */
    public static final C11675b f409103H;

    /* renamed from: I, reason: collision with root package name */
    public static final C11675b f409104I;

    /* renamed from: J, reason: collision with root package name */
    public static final C11675b f409105J;

    /* renamed from: K, reason: collision with root package name */
    public static final C11675b f409106K;

    /* renamed from: L, reason: collision with root package name */
    public static final C11675b f409107L;

    /* renamed from: M, reason: collision with root package name */
    public static final C11675b f409108M;

    /* renamed from: N, reason: collision with root package name */
    public static final C11675b f409109N;

    /* renamed from: a, reason: collision with root package name */
    public static final C11675b f409110a;

    /* renamed from: b, reason: collision with root package name */
    public static final C11675b f409111b;

    /* renamed from: c, reason: collision with root package name */
    public static final C11675b f409112c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<ProtoBuf.Visibility> f409113d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<ProtoBuf.Modality> f409114e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<ProtoBuf.Class.Kind> f409115f;

    /* renamed from: g, reason: collision with root package name */
    public static final C11675b f409116g;

    /* renamed from: h, reason: collision with root package name */
    public static final C11675b f409117h;

    /* renamed from: i, reason: collision with root package name */
    public static final C11675b f409118i;

    /* renamed from: j, reason: collision with root package name */
    public static final C11675b f409119j;

    /* renamed from: k, reason: collision with root package name */
    public static final C11675b f409120k;

    /* renamed from: l, reason: collision with root package name */
    public static final C11675b f409121l;

    /* renamed from: m, reason: collision with root package name */
    public static final C11675b f409122m;

    /* renamed from: n, reason: collision with root package name */
    public static final C11675b f409123n;

    /* renamed from: o, reason: collision with root package name */
    public static final C11675b f409124o;

    /* renamed from: p, reason: collision with root package name */
    public static final d<ProtoBuf.MemberKind> f409125p;

    /* renamed from: q, reason: collision with root package name */
    public static final C11675b f409126q;

    /* renamed from: r, reason: collision with root package name */
    public static final C11675b f409127r;

    /* renamed from: s, reason: collision with root package name */
    public static final C11675b f409128s;

    /* renamed from: t, reason: collision with root package name */
    public static final C11675b f409129t;

    /* renamed from: u, reason: collision with root package name */
    public static final C11675b f409130u;

    /* renamed from: v, reason: collision with root package name */
    public static final C11675b f409131v;

    /* renamed from: w, reason: collision with root package name */
    public static final C11675b f409132w;

    /* renamed from: x, reason: collision with root package name */
    public static final C11675b f409133x;

    /* renamed from: y, reason: collision with root package name */
    public static final C11675b f409134y;

    /* renamed from: z, reason: collision with root package name */
    public static final C11675b f409135z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b, reason: collision with other inner class name */
    public static class C11675b extends d<Boolean> {
        public C11675b(int i12) {
            super(i12, 1, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @k
        public final /* bridge */ /* synthetic */ Boolean c(int i12) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public final /* bridge */ /* synthetic */ int d(Boolean bool) {
            throw null;
        }

        @k
        public final Boolean e(int i12) {
            return Boolean.valueOf((i12 & (1 << this.f409137a)) != 0);
        }
    }

    /* compiled from: Flags.java */
    public static class c<E extends i.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        public final E[] f409136c;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(int i12, E[] eArr) {
            if (eArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i13 = 1;
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i14 = 31; i14 >= 0; i14--) {
                    if (((1 << i14) & length) != 0) {
                        i13 = 1 + i14;
                    }
                }
                throw new IllegalStateException("Empty enum: " + eArr.getClass());
            }
            super(i12, i13, null);
            this.f409136c = eArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @l
        public final Object c(int i12) {
            int i13 = (1 << this.f409138b) - 1;
            int i14 = this.f409137a;
            int i15 = (i12 & (i13 << i14)) >> i14;
            for (E e12 : this.f409136c) {
                if (e12.getNumber() == i15) {
                    return e12;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public final int d(Object obj) {
            return ((i.a) obj).getNumber() << this.f409137a;
        }
    }

    /* compiled from: Flags.java */
    public static abstract class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f409137a;

        /* renamed from: b, reason: collision with root package name */
        public final int f409138b;

        public d(int i12, int i13, a aVar) {
            this.f409137a = i12;
            this.f409138b = i13;
        }

        public static C11675b a(d<?> dVar) {
            return new C11675b(dVar.f409137a + dVar.f409138b);
        }

        public static C11675b b() {
            return new C11675b(0);
        }

        public abstract E c(int i12);

        public abstract int d(E e12);
    }

    static {
        C11675b c11675bB = d.b();
        f409110a = c11675bB;
        f409111b = d.a(c11675bB);
        C11675b c11675bB2 = d.b();
        f409112c = c11675bB2;
        c cVar = new c(c11675bB2.f409137a + c11675bB2.f409138b, ProtoBuf.Visibility.values());
        f409113d = cVar;
        c cVar2 = new c(cVar.f409137a + cVar.f409138b, ProtoBuf.Modality.values());
        f409114e = cVar2;
        ProtoBuf.Class.Kind[] kindArrValues = ProtoBuf.Class.Kind.values();
        int i12 = cVar2.f409137a;
        int i13 = cVar2.f409138b;
        c cVar3 = new c(i12 + i13, kindArrValues);
        f409115f = cVar3;
        C11675b c11675bA = d.a(cVar3);
        f409116g = c11675bA;
        C11675b c11675bA2 = d.a(c11675bA);
        f409117h = c11675bA2;
        C11675b c11675bA3 = d.a(c11675bA2);
        f409118i = c11675bA3;
        C11675b c11675bA4 = d.a(c11675bA3);
        f409119j = c11675bA4;
        C11675b c11675bA5 = d.a(c11675bA4);
        f409120k = c11675bA5;
        C11675b c11675bA6 = d.a(c11675bA5);
        f409121l = c11675bA6;
        f409122m = d.a(c11675bA6);
        C11675b c11675bA7 = d.a(cVar);
        f409123n = c11675bA7;
        f409124o = d.a(c11675bA7);
        c cVar4 = new c(i12 + i13, ProtoBuf.MemberKind.values());
        f409125p = cVar4;
        C11675b c11675bA8 = d.a(cVar4);
        f409126q = c11675bA8;
        C11675b c11675bA9 = d.a(c11675bA8);
        f409127r = c11675bA9;
        C11675b c11675bA10 = d.a(c11675bA9);
        f409128s = c11675bA10;
        C11675b c11675bA11 = d.a(c11675bA10);
        f409129t = c11675bA11;
        C11675b c11675bA12 = d.a(c11675bA11);
        f409130u = c11675bA12;
        C11675b c11675bA13 = d.a(c11675bA12);
        f409131v = c11675bA13;
        C11675b c11675bA14 = d.a(c11675bA13);
        f409132w = c11675bA14;
        f409133x = d.a(c11675bA14);
        C11675b c11675bA15 = d.a(cVar4);
        f409134y = c11675bA15;
        C11675b c11675bA16 = d.a(c11675bA15);
        f409135z = c11675bA16;
        C11675b c11675bA17 = d.a(c11675bA16);
        f409096A = c11675bA17;
        C11675b c11675bA18 = d.a(c11675bA17);
        f409097B = c11675bA18;
        C11675b c11675bA19 = d.a(c11675bA18);
        f409098C = c11675bA19;
        C11675b c11675bA20 = d.a(c11675bA19);
        f409099D = c11675bA20;
        C11675b c11675bA21 = d.a(c11675bA20);
        f409100E = c11675bA21;
        C11675b c11675bA22 = d.a(c11675bA21);
        f409101F = c11675bA22;
        f409102G = d.a(c11675bA22);
        C11675b c11675bA23 = d.a(c11675bB2);
        f409103H = c11675bA23;
        C11675b c11675bA24 = d.a(c11675bA23);
        f409104I = c11675bA24;
        f409105J = d.a(c11675bA24);
        C11675b c11675bA25 = d.a(cVar2);
        f409106K = c11675bA25;
        C11675b c11675bA26 = d.a(c11675bA25);
        f409107L = c11675bA26;
        f409108M = d.a(c11675bA26);
        d.a(d.b());
        f409109N = d.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a(int):void");
    }
}
