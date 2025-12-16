package shark;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import shark.AbstractC48345t2;
import shark.internal.X;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lshark/M1;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lshark/M1$b;", "Lshark/M1$c;", "Lshark/M1$d;", "Lshark/M1$e;", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f438143a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f438144b = new a(null);

    /* compiled from: HeapObject.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lshark/M1$a;", "", "<init>", "()V", "", "", "primitiveWrapperClassNames", "Ljava/util/Set;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public static final String a(a aVar, String str) {
            aVar.getClass();
            int iM2 = C43066x.M('.', 0, 6, str);
            if (iM2 == -1) {
                return str;
            }
            int i12 = iM2 + 1;
            if (str != null) {
                return str.substring(i12);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: HeapObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/M1$b;", "Lshark/M1;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class b extends M1 {

        /* renamed from: c, reason: collision with root package name */
        public final C48240c2 f438145c;

        /* renamed from: d, reason: collision with root package name */
        public final X.a f438146d;

        /* renamed from: e, reason: collision with root package name */
        public final long f438147e;

        /* compiled from: HeapObject.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<c, Boolean> {
            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(c cVar) {
                boolean z12;
                Iterator it = C43033p.u(N1.f438163l, cVar.e()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z12 = false;
                        break;
                    }
                    if (((b) it.next()).f438147e == b.this.f438147e) {
                        z12 = true;
                        break;
                    }
                }
                return Boolean.valueOf(z12);
            }
        }

        public b(@Y61.k C48240c2 c48240c2, @Y61.k X.a aVar, long j12) {
            super(null);
            this.f438145c = c48240c2;
            this.f438146d = aVar;
            this.f438147e = j12;
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final C48240c2 getF438155c() {
            return this.f438145c;
        }

        @Override // shark.M1
        /* renamed from: c, reason: from getter */
        public final long getF438157e() {
            return this.f438147e;
        }

        @Override // shark.M1
        public final AbstractC48345t2.b.c d() {
            C48240c2 c48240c2 = this.f438145c;
            c48240c2.getClass();
            return (AbstractC48345t2.b.c.a) c48240c2.m(this.f438147e, this.f438146d, C48306j2.f438637l);
        }

        @Y61.k
        public final C43025h e() {
            return C43033p.i(this.f438145c.d(), new O1(this));
        }

        @Y61.k
        public final InterfaceC43030m<c> f() {
            return !C43066x.z(g(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false) ? C43033p.i(this.f438145c.d(), new a()) : C43033p.h();
        }

        @Y61.k
        public final String g() {
            return this.f438145c.g(this.f438147e);
        }

        @Y61.k
        public final C43025h h() {
            C48240c2 c48240c2 = this.f438145c;
            c48240c2.getClass();
            l0.f fVar = new l0.f();
            fVar.f406840b = 0;
            return C43033p.i(new kotlin.sequences.o0(c48240c2.f438260i.b(), new C48244d2(c48240c2, fVar)), new S1(this));
        }

        @Y61.l
        public final b i() {
            long j12 = this.f438146d.f438469b;
            if (j12 == 0) {
                return null;
            }
            return (b) this.f438145c.f(j12);
        }

        @Y61.k
        public final String j(@Y61.k AbstractC48345t2.b.c.a.C12636a c12636a) {
            C48240c2 c48240c2 = this.f438145c;
            c48240c2.getClass();
            long j12 = c12636a.f438720a;
            shark.internal.P p12 = c48240c2.f438260i;
            String strA = p12.a(j12);
            a3 a3Var = p12.f438424i;
            if (a3Var == null) {
                return strA;
            }
            String strA2 = p12.a(p12.f438418c.c(this.f438147e));
            String str = a3Var.f438236a.get(strA2 + '.' + strA);
            return str != null ? str : strA;
        }

        @Y61.k
        public final List<AbstractC48345t2.b.c.a.C12636a> k() {
            return this.f438145c.f438260i.f438430o.a(this.f438146d);
        }

        @Y61.l
        public final K1 l(@Y61.k String str) {
            C48240c2 c48240c2 = this.f438145c;
            for (AbstractC48345t2.b.c.a.C12637b c12637b : c48240c2.f438260i.f438430o.b(this.f438146d)) {
                c48240c2.getClass();
                long j12 = c12637b.f438722a;
                shark.internal.P p12 = c48240c2.f438260i;
                String strA = p12.a(j12);
                a3 a3Var = p12.f438424i;
                if (a3Var != null) {
                    String strA2 = p12.a(p12.f438418c.c(this.f438147e));
                    String str2 = a3Var.f438236a.get(strA2 + '.' + strA);
                    if (str2 != null) {
                        strA = str2;
                    }
                }
                if (strA.equals(str)) {
                    return new K1(this, str, new X1(c48240c2, c12637b.f438724c));
                }
            }
            return null;
        }

        @Y61.k
        public final kotlin.sequences.o0 m() {
            return new kotlin.sequences.o0(new C42770s0(this.f438145c.f438260i.f438430o.b(this.f438146d)), new R1(this));
        }

        @Y61.k
        public final String toString() {
            return "class " + g();
        }
    }

    /* compiled from: HeapObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/M1$c;", "Lshark/M1;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class c extends M1 {

        /* renamed from: c, reason: collision with root package name */
        public final C48240c2 f438149c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final X.b f438150d;

        /* renamed from: e, reason: collision with root package name */
        public final long f438151e;

        public c(@Y61.k C48240c2 c48240c2, @Y61.k X.b bVar, long j12) {
            super(null);
            this.f438149c = c48240c2;
            this.f438150d = bVar;
            this.f438151e = j12;
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final C48240c2 getF438155c() {
            return this.f438149c;
        }

        @Override // shark.M1
        /* renamed from: c, reason: from getter */
        public final long getF438157e() {
            return this.f438151e;
        }

        @Y61.k
        public final b e() {
            return (b) this.f438149c.f(this.f438150d.f438474b);
        }

        @Y61.k
        public final String f() {
            return this.f438149c.g(this.f438150d.f438474b);
        }

        @Y61.k
        public final String g() {
            return a.a(M1.f438144b, f());
        }

        public final boolean h(@Y61.k String str) {
            Iterator it = C43033p.u(N1.f438163l, e()).iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.L.f(((b) it.next()).g(), str)) {
                    return true;
                }
            }
            return false;
        }

        @Y61.l
        public final String i() {
            char[] cArrU;
            if (!kotlin.jvm.internal.L.f(f(), "java.lang.String")) {
                return null;
            }
            K1 k1J = j("java.lang.String", "count");
            Integer numB = k1J != null ? k1J.f438095c.b() : null;
            if (numB != null && numB.intValue() == 0) {
                return "";
            }
            K1 k1J2 = j("java.lang.String", "value");
            if (k1J2 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            M1 m1E = k1J2.f438095c.e();
            if (m1E == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            AbstractC48345t2.b.c cVarD = m1E.d();
            if (cVarD instanceof AbstractC48345t2.b.c.d.C12641c) {
                K1 k1J3 = j("java.lang.String", "offset");
                Integer numB2 = k1J3 != null ? k1J3.f438095c.b() : null;
                if (numB == null || numB2 == null) {
                    cArrU = ((AbstractC48345t2.b.c.d.C12641c) cVarD).f438741c;
                } else {
                    int iIntValue = numB.intValue() + numB2.intValue();
                    AbstractC48345t2.b.c.d.C12641c c12641c = (AbstractC48345t2.b.c.d.C12641c) cVarD;
                    char[] cArr = c12641c.f438741c;
                    cArrU = C42756l.u(c12641c.f438741c, numB2.intValue(), iIntValue > cArr.length ? cArr.length : numB.intValue() + numB2.intValue());
                }
                return new String(cArrU);
            }
            if (cVarD instanceof AbstractC48345t2.b.c.d.C12640b) {
                return new String(((AbstractC48345t2.b.c.d.C12640b) cVarD).f438738c, Charset.forName(Constants.ENCODING));
            }
            StringBuilder sb2 = new StringBuilder("'value' field ");
            K1 k1J4 = j("java.lang.String", "value");
            if (k1J4 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            sb2.append(k1J4.f438095c);
            sb2.append(" was expected to be either a char or byte array in string instance with id ");
            sb2.append(this.f438151e);
            throw new UnsupportedOperationException(sb2.toString());
        }

        @Y61.l
        public final K1 j(@Y61.k String str, @Y61.k String str2) {
            Object next;
            C43026i.b bVar = new C43026i.b(k());
            while (true) {
                if (!bVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bVar.next();
                K1 k12 = (K1) next;
                if (kotlin.jvm.internal.L.f(k12.f438093a.g(), str) && k12.f438094b.equals(str2)) {
                    break;
                }
            }
            return (K1) next;
        }

        @Y61.k
        public final C43026i k() {
            InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new V1(this));
            return C43033p.q(new kotlin.sequences.o0(C43033p.u(N1.f438163l, e()), new U1(this, interfaceC42726CB)));
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final AbstractC48345t2.b.c.C12638b d() {
            C48240c2 c48240c2 = this.f438149c;
            c48240c2.getClass();
            return (AbstractC48345t2.b.c.C12638b) c48240c2.m(this.f438151e, this.f438150d, C48310k2.f438643l);
        }

        @Y61.k
        public final String toString() {
            return "instance @" + this.f438151e + " of " + f();
        }
    }

    /* compiled from: HeapObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/M1$d;", "Lshark/M1;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class d extends M1 {

        /* renamed from: c, reason: collision with root package name */
        public final C48240c2 f438152c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final X.c f438153d;

        /* renamed from: e, reason: collision with root package name */
        public final long f438154e;

        public d(@Y61.k C48240c2 c48240c2, @Y61.k X.c cVar, long j12) {
            super(null);
            this.f438152c = c48240c2;
            this.f438153d = cVar;
            this.f438154e = j12;
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final C48240c2 getF438155c() {
            return this.f438152c;
        }

        @Override // shark.M1
        /* renamed from: c, reason: from getter */
        public final long getF438157e() {
            return this.f438154e;
        }

        @Y61.k
        public final String e() {
            return this.f438152c.g(this.f438153d.f438477b);
        }

        @Y61.k
        public final kotlin.sequences.o0 f() {
            long[] jArr = d().f438732d;
            return new kotlin.sequences.o0(jArr.length == 0 ? C43033p.h() : new kotlin.collections.K(jArr), new W1(this));
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final AbstractC48345t2.b.c.C12639c d() {
            C48240c2 c48240c2 = this.f438152c;
            c48240c2.getClass();
            return (AbstractC48345t2.b.c.C12639c) c48240c2.m(this.f438154e, this.f438153d, C48318m2.f438655l);
        }

        @Y61.k
        public final String toString() {
            return "object array @" + this.f438154e + " of " + e();
        }
    }

    /* compiled from: HeapObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/M1$e;", "Lshark/M1;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class e extends M1 {

        /* renamed from: c, reason: collision with root package name */
        public final C48240c2 f438155c;

        /* renamed from: d, reason: collision with root package name */
        public final X.d f438156d;

        /* renamed from: e, reason: collision with root package name */
        public final long f438157e;

        public e(@Y61.k C48240c2 c48240c2, @Y61.k X.d dVar, long j12) {
            super(null);
            this.f438155c = c48240c2;
            this.f438156d = dVar;
            this.f438157e = j12;
        }

        @Override // shark.M1
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final C48240c2 getF438155c() {
            return this.f438155c;
        }

        @Override // shark.M1
        /* renamed from: c, reason: from getter */
        public final long getF438157e() {
            return this.f438157e;
        }

        @Override // shark.M1
        public final AbstractC48345t2.b.c d() {
            C48240c2 c48240c2 = this.f438155c;
            c48240c2.getClass();
            return (AbstractC48345t2.b.c.d) c48240c2.m(this.f438157e, this.f438156d, C48326o2.f438663l);
        }

        @Y61.k
        public final String e() {
            X.d dVar = this.f438156d;
            dVar.getClass();
            String strName = PrimitiveType.values()[dVar.f438479a].name();
            Locale locale = Locale.US;
            if (strName != null) {
                return strName.toLowerCase(locale).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        @Y61.k
        public final String toString() {
            return "primitive array @" + this.f438157e + " of " + e();
        }
    }

    static {
        PrimitiveType[] primitiveTypeArrValues = PrimitiveType.values();
        int iF2 = kotlin.collections.P0.f(primitiveTypeArrValues.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (PrimitiveType primitiveType : primitiveTypeArrValues) {
            StringBuilder sb2 = new StringBuilder();
            String strName = primitiveType.name();
            Locale locale = Locale.US;
            if (strName == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            sb2.append(strName.toLowerCase(locale));
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            linkedHashMap.put(sb2.toString(), primitiveType);
        }
        f438143a = C42756l.l0(new String[]{Boolean.class.getName(), Character.class.getName(), Float.class.getName(), Double.class.getName(), Byte.class.getName(), Short.class.getName(), Integer.class.getName(), Long.class.getName()});
    }

    public M1() {
    }

    @Y61.l
    public final c a() {
        if (this instanceof c) {
            return (c) this;
        }
        return null;
    }

    @Y61.k
    /* renamed from: b */
    public abstract C48240c2 getF438155c();

    /* renamed from: c */
    public abstract long getF438157e();

    @Y61.k
    public abstract AbstractC48345t2.b.c d();

    public /* synthetic */ M1(C42822w c42822w) {
        this();
    }
}
