package kotlin.reflect.jvm.internal.impl.descriptors;

import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.C42756l;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.util.l;

/* compiled from: DescriptorVisibilities.java */
/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407786b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407787c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407788d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407789e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407790f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407791g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407792h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f407793i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<AbstractC42900s> f407794j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<AbstractC42900s, Integer> f407795k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC42900s f407796l;

    /* renamed from: m, reason: collision with root package name */
    public static final r51.h f407797m;

    /* renamed from: n, reason: collision with root package name */
    public static final r51.h f407798n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final r51.h f407799o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.util.l f407800p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final HashMap f407801q;

    /* compiled from: DescriptorVisibilities.java */
    public static class a implements r51.h {
        @Override // r51.h
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.types.O getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class b implements r51.h {
        @Override // r51.h
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.types.O getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class c implements r51.h {
        @Override // r51.h
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.types.O getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class d extends AbstractC42887p {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.o] */
        /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.reflect.jvm.internal.impl.descriptors.k] */
        /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.k] */
        /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.k] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.j.s(interfaceC42886o) && kotlin.reflect.jvm.internal.impl.resolve.j.f(interfaceC42882k) != c0.f407540a) {
                return r.d(interfaceC42886o, interfaceC42882k);
            }
            if (interfaceC42886o instanceof InterfaceC42881j) {
                ((InterfaceC42881j) interfaceC42886o).f();
            }
            while (interfaceC42886o != 0) {
                interfaceC42886o = interfaceC42886o.f();
                if (((interfaceC42886o instanceof InterfaceC42851d) && !kotlin.reflect.jvm.internal.impl.resolve.j.l(interfaceC42886o)) || (interfaceC42886o instanceof K)) {
                    break;
                }
            }
            if (interfaceC42886o == 0) {
                return false;
            }
            while (interfaceC42882k != null) {
                if (interfaceC42886o == interfaceC42882k) {
                    return true;
                }
                if (interfaceC42882k instanceof K) {
                    return (interfaceC42886o instanceof K) && interfaceC42886o.d().equals(((K) interfaceC42882k).d()) && kotlin.reflect.jvm.internal.impl.resolve.j.d(interfaceC42882k).equals(kotlin.reflect.jvm.internal.impl.resolve.j.d(interfaceC42886o));
                }
                interfaceC42882k = interfaceC42882k.f();
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class e extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            InterfaceC42882k interfaceC42882kI;
            if (interfaceC42882k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (r.f407785a.c(hVar, interfaceC42886o, interfaceC42882k)) {
                if (hVar == r.f407798n) {
                    return true;
                }
                if (hVar != r.f407797m && (interfaceC42882kI = kotlin.reflect.jvm.internal.impl.resolve.j.i(interfaceC42886o, InterfaceC42851d.class, true)) != null && (hVar instanceof r51.j)) {
                    return ((r51.j) hVar).k().n0().equals(interfaceC42882kI.n0());
                }
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class f extends AbstractC42887p {
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
        
            if ((r0.K0() instanceof kotlin.reflect.jvm.internal.impl.types.C) == false) goto L49;
         */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(@Y61.l r51.h r7, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o r8, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L9d
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.d> r2 = kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d.class
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r8, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r3
                r4 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.k r9 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r9, r2, r4)
                kotlin.reflect.jvm.internal.impl.descriptors.d r9 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r9
                if (r9 != 0) goto L16
                return r4
            L16:
                if (r3 == 0) goto L35
                boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r3)
                if (r5 == 0) goto L35
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r3, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r3
                if (r3 == 0) goto L35
                kotlin.reflect.jvm.internal.impl.types.Y r5 = r9.q()
                kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r3.n0()
                boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.j.r(r5, r3)
                if (r3 == 0) goto L35
                return r1
            L35:
                boolean r3 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r3 == 0) goto L41
                r3 = r8
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.j.t(r3)
                goto L42
            L41:
                r3 = r8
            L42:
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r3, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r2
                if (r2 != 0) goto L4b
                return r4
            L4b:
                kotlin.reflect.jvm.internal.impl.types.Y r4 = r9.q()
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.n0()
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.r(r4, r2)
                if (r2 == 0) goto L94
                r51.h r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407799o
                if (r7 != r2) goto L5e
                goto L94
            L5e:
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r2 != 0) goto L63
                goto L8d
            L63:
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
                if (r2 == 0) goto L68
                goto L8d
            L68:
                r51.h r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407798n
                if (r7 != r2) goto L6d
                goto L8d
            L6d:
                r51.h r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407797m
                if (r7 == r2) goto L94
                if (r7 != 0) goto L74
                goto L94
            L74:
                boolean r2 = r7 instanceof r51.i
                if (r2 == 0) goto L8e
                r0 = r7
                r51.i r0 = (r51.i) r0
                kotlin.reflect.jvm.internal.impl.types.O r0 = r0.b()
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.r(r0, r9)
                if (r2 != 0) goto L8d
                kotlin.reflect.jvm.internal.impl.types.J0 r0 = r0.K0()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.C
                if (r0 == 0) goto L94
            L8d:
                return r1
            L8e:
                kotlin.reflect.jvm.internal.impl.descriptors.r$b r7 = (kotlin.reflect.jvm.internal.impl.descriptors.r.b) r7
                r7.getType()
                throw r0
            L94:
                kotlin.reflect.jvm.internal.impl.descriptors.k r9 = r9.f()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L9d:
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 1
                r9 = 0
                r0 = 2
                java.lang.String r1 = "from"
                r7[r9] = r1
                java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r7[r8] = r9
                java.lang.String r8 = "isVisible"
                r7[r0] = r8
                java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r7 = java.lang.String.format(r8, r7)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.r.f.c(r51.h, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.k):boolean");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class g extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!kotlin.reflect.jvm.internal.impl.resolve.j.d(interfaceC42882k).b0(kotlin.reflect.jvm.internal.impl.resolve.j.d(interfaceC42886o))) {
                return false;
            }
            r.f407800p.getClass();
            return true;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class h extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class i extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class j extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class k extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    public static class l extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        d dVar = new d(o0.e.f407777c);
        f407785a = dVar;
        e eVar = new e(o0.f.f407778c);
        f407786b = eVar;
        f fVar = new f(o0.g.f407779c);
        f407787c = fVar;
        g gVar = new g(o0.b.f407774c);
        f407788d = gVar;
        h hVar = new h(o0.h.f407780c);
        f407789e = hVar;
        i iVar = new i(o0.d.f407776c);
        f407790f = iVar;
        j jVar = new j(o0.a.f407773c);
        f407791g = jVar;
        k kVar = new k(o0.c.f407775c);
        f407792h = kVar;
        l lVar = new l(o0.i.f407781c);
        f407793i = lVar;
        f407794j = Collections.unmodifiableSet(C42756l.l0(new AbstractC42900s[]{dVar, eVar, gVar, iVar}));
        HashMap map = new HashMap(6);
        map.put(eVar, 0);
        map.put(dVar, 0);
        map.put(gVar, 1);
        map.put(fVar, 1);
        map.put(hVar, 2);
        f407795k = Collections.unmodifiableMap(map);
        f407796l = hVar;
        f407797m = new a();
        f407798n = new b();
        f407799o = new c();
        Iterator it = ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.l.class, kotlin.reflect.jvm.internal.impl.util.l.class.getClassLoader()).iterator();
        f407800p = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.l) it.next() : l.a.f410295a;
        f407801q = new HashMap();
        f(dVar);
        f(eVar);
        f(fVar);
        f(gVar);
        f(hVar);
        f(iVar);
        f(jVar);
        f(kVar);
        f(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.r.a(int):void");
    }

    @Y61.l
    public static Integer b(@Y61.k AbstractC42900s abstractC42900s, @Y61.k AbstractC42900s abstractC42900s2) {
        if (abstractC42900s == null) {
            a(12);
            throw null;
        }
        if (abstractC42900s2 == null) {
            a(13);
            throw null;
        }
        Integer numA = abstractC42900s.a().a(abstractC42900s2.a());
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC42900s2.a().a(abstractC42900s.a());
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    @Y61.l
    public static InterfaceC42886o c(@Y61.l r51.h hVar, @Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k InterfaceC42882k interfaceC42882k) {
        InterfaceC42886o interfaceC42886oC;
        if (callableMemberDescriptor == null) {
            a(8);
            throw null;
        }
        if (interfaceC42882k == null) {
            a(9);
            throw null;
        }
        for (InterfaceC42886o interfaceC42886o = (InterfaceC42886o) callableMemberDescriptor.n0(); interfaceC42886o != null && interfaceC42886o.getVisibility() != f407790f; interfaceC42886o = (InterfaceC42886o) kotlin.reflect.jvm.internal.impl.resolve.j.i(interfaceC42886o, InterfaceC42886o.class, true)) {
            if (!interfaceC42886o.getVisibility().c(hVar, interfaceC42886o, interfaceC42882k)) {
                return interfaceC42886o;
            }
        }
        if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.S) || (interfaceC42886oC = c(hVar, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.S) callableMemberDescriptor).e0(), interfaceC42882k)) == null) {
            return null;
        }
        return interfaceC42886oC;
    }

    public static boolean d(@Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(7);
            throw null;
        }
        c0 c0VarF = kotlin.reflect.jvm.internal.impl.resolve.j.f(interfaceC42882k);
        if (c0VarF != c0.f407540a) {
            return c0VarF.equals(kotlin.reflect.jvm.internal.impl.resolve.j.f(interfaceC42886o));
        }
        return false;
    }

    public static boolean e(@Y61.k AbstractC42900s abstractC42900s) {
        if (abstractC42900s != null) {
            return abstractC42900s == f407785a || abstractC42900s == f407786b;
        }
        a(14);
        throw null;
    }

    public static void f(AbstractC42887p abstractC42887p) {
        f407801q.put(abstractC42887p.f407782a, abstractC42887p);
    }

    @Y61.k
    public static AbstractC42900s g(@Y61.k p0 p0Var) {
        if (p0Var == null) {
            a(15);
            throw null;
        }
        AbstractC42900s abstractC42900s = (AbstractC42900s) f407801q.get(p0Var);
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + p0Var);
    }
}
