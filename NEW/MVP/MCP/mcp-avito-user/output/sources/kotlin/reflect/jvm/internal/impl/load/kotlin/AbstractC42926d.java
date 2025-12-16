package kotlin.reflect.jvm.internal.impl.load.kotlin;

import e51.C39954a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.I;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f;
import kotlin.text.C43066x;
import m51.C43888b;
import m51.d;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42926d<A, S extends a<? extends A>> implements InterfaceC42949f<A> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f408459b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g f408460a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$a */
    public static abstract class a<A> {
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    @s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static z a(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, boolean z12, boolean z13, @Y61.l Boolean bool, boolean z14, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar, @Y61.k m51.e eVar) throws ClassNotFoundException {
            I.a aVar;
            b0 b0Var = i12.f409745c;
            if (z12) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + i12 + ')').toString());
                }
                if (i12 instanceof I.a) {
                    I.a aVar2 = (I.a) i12;
                    if (aVar2.f409749g == ProtoBuf.Class.Kind.INTERFACE) {
                        x.a.b bVarA = gVar.a(aVar2.f409748f.d(kotlin.reflect.jvm.internal.impl.name.f.e("DefaultImpls")));
                        if (bVarA != null) {
                            return bVarA.f408560a;
                        }
                        return null;
                    }
                }
                if (bool.booleanValue() && (i12 instanceof I.b)) {
                    t tVar = b0Var instanceof t ? (t) b0Var : null;
                    p51.d dVar = tVar != null ? tVar.f408545c : null;
                    if (dVar != null) {
                        x.a.b bVarA2 = gVar.a(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(dVar.e().replace('/', '.'))));
                        if (bVarA2 != null) {
                            return bVarA2.f408560a;
                        }
                        return null;
                    }
                }
            }
            if (z13 && (i12 instanceof I.a)) {
                I.a aVar3 = (I.a) i12;
                if (aVar3.f409749g == ProtoBuf.Class.Kind.COMPANION_OBJECT && (aVar = aVar3.f409747e) != null) {
                    ProtoBuf.Class.Kind kind = ProtoBuf.Class.Kind.CLASS;
                    ProtoBuf.Class.Kind kind2 = aVar.f409749g;
                    if (kind2 == kind || kind2 == ProtoBuf.Class.Kind.ENUM_CLASS || (z14 && (kind2 == ProtoBuf.Class.Kind.INTERFACE || kind2 == ProtoBuf.Class.Kind.ANNOTATION_CLASS))) {
                        b0 b0Var2 = aVar.f409745c;
                        B b12 = b0Var2 instanceof B ? (B) b0Var2 : null;
                        if (b12 != null) {
                            return b12.f408429b;
                        }
                        return null;
                    }
                }
            }
            if (!(i12 instanceof I.b) || !(b0Var instanceof t)) {
                return null;
            }
            t tVar2 = (t) b0Var;
            z zVar = tVar2.f408546d;
            if (zVar != null) {
                return zVar;
            }
            x.a.b bVarA3 = gVar.a(tVar2.c());
            return bVarA3 != null ? bVarA3.f408560a : null;
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f408461b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f408462c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f408463d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ c[] f408464e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f408465f;

        static {
            c cVar = new c("PROPERTY", 0);
            f408461b = cVar;
            c cVar2 = new c("BACKING_FIELD", 1);
            f408462c = cVar2;
            c cVar3 = new c("DELEGATE_FIELD", 2);
            f408463d = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            f408464e = cVarArr;
            f408465f = kotlin.enums.c.a(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f408464e.clone();
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C11667d {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractC42926d(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar) {
        this.f408460a = gVar;
    }

    public static /* synthetic */ List m(AbstractC42926d abstractC42926d, kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, C c12, Boolean bool, boolean z12, int i13) {
        boolean z13 = (i13 & 4) == 0;
        if ((i13 & 16) != 0) {
            bool = null;
        }
        return abstractC42926d.l(i12, c12, z13, false, bool, (i13 & 32) != 0 ? false : z12);
    }

    @Y61.l
    public static C o(@Y61.k h.d dVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @Y61.k AnnotatedCallableKind annotatedCallableKind, boolean z12) {
        JvmProtoBuf.d dVar2;
        C c12;
        if (dVar instanceof ProtoBuf.b) {
            C.a aVar = C.f408430b;
            m51.i.f414326a.getClass();
            d.b bVarA = m51.i.a((ProtoBuf.b) dVar, cVar, gVar);
            if (bVarA == null) {
                return null;
            }
            aVar.getClass();
            return C.a.b(bVarA);
        }
        if (dVar instanceof ProtoBuf.e) {
            C.a aVar2 = C.f408430b;
            m51.i.f414326a.getClass();
            d.b bVarC = m51.i.c((ProtoBuf.e) dVar, cVar, gVar);
            if (bVarC == null) {
                return null;
            }
            aVar2.getClass();
            return C.a.b(bVarC);
        }
        if (!(dVar instanceof ProtoBuf.h) || (dVar2 = (JvmProtoBuf.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(dVar, JvmProtoBuf.f409148d)) == null) {
            return null;
        }
        int iOrdinal = annotatedCallableKind.ordinal();
        if (iOrdinal == 1) {
            return C42928f.a((ProtoBuf.h) dVar, cVar, gVar, true, true, z12);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3 || (dVar2.f409221c & 8) != 8) {
                return null;
            }
            C.a aVar3 = C.f408430b;
            JvmProtoBuf.c cVar2 = dVar2.f409225g;
            aVar3.getClass();
            c12 = new C(cVar.getString(cVar2.f409211d).concat(cVar.getString(cVar2.f409212e)), null);
        } else {
            if ((dVar2.f409221c & 4) != 4) {
                return null;
            }
            C.a aVar4 = C.f408430b;
            JvmProtoBuf.c cVar3 = dVar2.f409224f;
            aVar4.getClass();
            c12 = new C(cVar.getString(cVar3.f409211d).concat(cVar.getString(cVar3.f409212e)), null);
        }
        return c12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList a(@Y61.k I.a aVar) {
        b0 b0Var = aVar.f409745c;
        B b12 = b0Var instanceof B ? (B) b0Var : null;
        z zVar = b12 != null ? b12.f408429b : null;
        if (zVar != null) {
            ArrayList arrayList = new ArrayList(1);
            zVar.d(new C42927e(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.f409748f.b()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<A> b(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k ProtoBuf.d dVar) {
        C.a aVar = C.f408430b;
        String string = i12.f409743a.getString(dVar.f408911e);
        String strB = C43888b.b(((I.a) i12).f409748f.c());
        aVar.getClass();
        return m(this, i12, C.a.a(string, strB), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List d(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind) {
        C cO2 = o(dVar, i12.f409743a, i12.f409744b, annotatedCallableKind, false);
        if (cO2 == null) {
            return C42784z0.f406748b;
        }
        C.f408430b.getClass();
        return m(this, i12, C.a.c(cO2, 0), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList e(@Y61.k ProtoBuf.Type type, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        Iterable iterable = (Iterable) type.g(JvmProtoBuf.f409150f);
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r((ProtoBuf.Annotation) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List f(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind) {
        if (annotatedCallableKind == AnnotatedCallableKind.f409717c) {
            return u(i12, (ProtoBuf.h) dVar, c.f408461b);
        }
        C cO2 = o(dVar, i12.f409743a, i12.f409744b, annotatedCallableKind, false);
        return cO2 == null ? C42784z0.f406748b : m(this, i12, cO2, null, false, 60);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I r7, @Y61.k kotlin.reflect.jvm.internal.impl.protobuf.h.d r8, @Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r9, int r10, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l r11) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r11 = r7.f409743a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g r0 = r7.f409744b
            r1 = 0
            kotlin.reflect.jvm.internal.impl.load.kotlin.C r9 = o(r8, r11, r0, r9, r1)
            if (r9 == 0) goto L74
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e
            r0 = 64
            r2 = 1
            if (r11 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e) r8
            boolean r11 = r8.p()
            if (r11 != 0) goto L1f
            int r8 = r8.f408919d
            r8 = r8 & r0
            if (r8 != r0) goto L47
        L1f:
            r1 = r2
            goto L47
        L21:
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h
            if (r11 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h) r8
            boolean r11 = r8.p()
            if (r11 != 0) goto L1f
            int r8 = r8.f408987d
            r8 = r8 & r0
            if (r8 != r0) goto L47
            goto L1f
        L33:
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b
            if (r11 == 0) goto L5c
            r8 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.I$a r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.I.a) r8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r0 = r8.f409749g
            if (r0 != r11) goto L42
            r1 = 2
            goto L47
        L42:
            boolean r8 = r8.f409750h
            if (r8 == 0) goto L47
            goto L1f
        L47:
            int r10 = r10 + r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.C$a r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.C.f408430b
            r8.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.C r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.C.a.c(r9, r10)
            r3 = 0
            r4 = 0
            r5 = 60
            r0 = r6
            r1 = r7
            java.util.List r7 = m(r0, r1, r2, r3, r4, r5)
            return r7
        L5c:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported message: "
            r9.<init>(r10)
            java.lang.Class r8 = r8.getClass()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L74:
            kotlin.collections.z0 r7 = kotlin.collections.C42784z0.f406748b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I, kotlin.reflect.jvm.internal.impl.protobuf.h$d, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, int, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$l):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList i(@Y61.k ProtoBuf.TypeParameter typeParameter, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        Iterable iterable = (Iterable) typeParameter.g(JvmProtoBuf.f409152h);
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r((ProtoBuf.Annotation) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<A> j(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k ProtoBuf.h hVar) {
        return u(i12, hVar, c.f408462c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<A> k(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k ProtoBuf.h hVar) {
        return u(i12, hVar, c.f408463d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<A> l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I r8, kotlin.reflect.jvm.internal.impl.load.kotlin.C r9, boolean r10, boolean r11, java.lang.Boolean r12, boolean r13) throws java.lang.ClassNotFoundException {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r5 = r7.f408460a
            m51.e r6 = r7.p()
            kotlin.reflect.jvm.internal.impl.load.kotlin.d$b r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.f408459b
            r0.getClass()
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            kotlin.reflect.jvm.internal.impl.load.kotlin.z r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.b.a(r0, r1, r2, r3, r4, r5, r6)
            if (r10 != 0) goto L2e
            boolean r10 = r8 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.I.a
            r11 = 0
            if (r10 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.I$a r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.I.a) r8
            kotlin.reflect.jvm.internal.impl.descriptors.b0 r8 = r8.f409745c
            boolean r10 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.B
            if (r10 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.load.kotlin.B r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.B) r8
            goto L27
        L26:
            r8 = r11
        L27:
            if (r8 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.load.kotlin.z r8 = r8.f408429b
            r10 = r8
            goto L2e
        L2d:
            r10 = r11
        L2e:
            if (r10 != 0) goto L33
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
            return r8
        L33:
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r8 = r7.n(r10)
            java.util.HashMap r8 = r8.f408468a
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L43
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
        L43:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I, kotlin.reflect.jvm.internal.impl.load.kotlin.C, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    @Y61.k
    public abstract C42929g n(@Y61.k z zVar);

    @Y61.k
    public abstract m51.e p();

    public final boolean q(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar.f() == null || !kotlin.jvm.internal.L.f(bVar.i().b(), "Container")) {
            return false;
        }
        x.a.b bVarA = this.f408460a.a(bVar);
        z zVar = bVarA != null ? bVarA.f408560a : null;
        if (zVar == null) {
            return false;
        }
        e51.b.f394954a.getClass();
        l0.a aVar = new l0.a();
        zVar.d(new C39954a(aVar));
        return aVar.f406838b;
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.annotations.d r(@Y61.k ProtoBuf.Annotation annotation, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @Y61.l
    public abstract C42931i s(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k b0 b0Var, @Y61.k List list);

    @Y61.l
    public final z.a t(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b bVar2, @Y61.k List list) {
        e51.b.f394954a.getClass();
        if (e51.b.f394955b.contains(bVar)) {
            return null;
        }
        return s(bVar, bVar2, list);
    }

    public final List<A> u(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, ProtoBuf.h hVar, c cVar) {
        Boolean boolE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409097B.e(hVar.f408988e);
        boolean zD2 = m51.i.d(hVar);
        c cVar2 = c.f408461b;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = i12.f409744b;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar3 = i12.f409743a;
        if (cVar == cVar2) {
            C cA2 = C42928f.a(hVar, cVar3, gVar, (40 & 8) == 0, (40 & 16) == 0, true);
            return cA2 == null ? C42784z0.f406748b : m(this, i12, cA2, boolE, zD2, 8);
        }
        C cA3 = C42928f.a(hVar, cVar3, gVar, (40 & 8) == 0, (40 & 16) == 0, true);
        if (cA3 == null) {
            return C42784z0.f406748b;
        }
        return C43066x.q(cA3.f408431a, "$delegate", false) != (cVar == c.f408463d) ? C42784z0.f406748b : l(i12, cA3, true, true, boolE, zD2);
    }
}
