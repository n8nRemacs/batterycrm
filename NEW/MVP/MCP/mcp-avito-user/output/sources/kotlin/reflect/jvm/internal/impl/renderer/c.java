package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.compose.ui.platform.C22491k0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.B;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.H;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42903v;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.P;
import kotlin.reflect.jvm.internal.impl.descriptors.S;
import kotlin.reflect.jvm.internal.impl.descriptors.T;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.W;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.A;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42860d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42861e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42880y;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.I;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.N;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.C42959a;
import kotlin.reflect.jvm.internal.impl.types.C42980h0;
import kotlin.reflect.jvm.internal.impl.types.C42997w;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import v51.C49167a;

/* compiled from: DescriptorRendererImpl.kt */
@s0
/* loaded from: classes8.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.renderer.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f409483g = 0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final i f409484e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f409485f = C42727D.c(new C11684c());

    /* compiled from: DescriptorRendererImpl.kt */
    public final class a implements InterfaceC42884m<G0, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11683a {
            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = PropertyAccessorRenderingPolicy.f409457b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = PropertyAccessorRenderingPolicy.f409457b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object a(L l12, Object obj) {
            c.p(c.this, l12, (StringBuilder) obj);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object b(I i12, Object obj) {
            StringBuilder sb2 = (StringBuilder) obj;
            int i13 = c.f409483g;
            c cVar = c.this;
            cVar.getClass();
            sb2.append(cVar.K("package-fragment"));
            String strI = cVar.I(i12.f407568f.i());
            if (strI.length() > 0) {
                sb2.append(" ");
                sb2.append(strI);
            }
            if (cVar.f409484e.p()) {
                sb2.append(" in ");
                cVar.R(i12.f(), sb2, false);
            }
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object c(C42880y c42880y, Object obj) {
            StringBuilder sb2 = (StringBuilder) obj;
            int i12 = c.f409483g;
            c cVar = c.this;
            cVar.getClass();
            sb2.append(cVar.K("package"));
            String strI = cVar.I(c42880y.f407756e.i());
            if (strI.length() > 0) {
                sb2.append(" ");
                sb2.append(strI);
            }
            if (cVar.f409484e.p()) {
                sb2.append(" in context of ");
                cVar.R(c42880y.f407755d, sb2, false);
            }
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object d(AbstractC42861e abstractC42861e, Object obj) {
            StringBuilder sb2 = (StringBuilder) obj;
            int i12 = c.f409483g;
            c cVar = c.this;
            cVar.getClass();
            cVar.z(sb2, abstractC42861e, null);
            cVar.i0(abstractC42861e.f407652g, sb2);
            cVar.M(abstractC42861e, sb2);
            sb2.append(cVar.K("typealias"));
            sb2.append(" ");
            cVar.R(abstractC42861e, sb2, true);
            cVar.d0(abstractC42861e.r(), sb2, false);
            cVar.B(abstractC42861e, sb2);
            sb2.append(" = ");
            Y y12 = ((z) abstractC42861e).f409893q;
            sb2.append(cVar.Y(y12 != null ? y12 : null));
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object e(Object obj, G g12) {
            int i12 = c.f409483g;
            c.this.R(g12, (StringBuilder) obj, true);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object f(N n12, Object obj) {
            o(n12, (StringBuilder) obj, "setter");
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object g(C42866j c42866j, Object obj) {
            InterfaceC42850c interfaceC42850cT;
            StringBuilder sb2 = (StringBuilder) obj;
            int i12 = c.f409483g;
            c cVar = c.this;
            cVar.getClass();
            cVar.z(sb2, c42866j, null);
            i iVar = cVar.f409484e;
            iVar.getClass();
            n<?>[] nVarArr = i.f409494X;
            boolean z12 = (((Boolean) iVar.f409532o.getValue(iVar, nVarArr[13])).booleanValue() || c42866j.h0().i() != Modality.f407440d) && cVar.i0(c42866j.getVisibility(), sb2);
            cVar.L(sb2, c42866j);
            boolean zBooleanValue = ((Boolean) iVar.f409510P.getValue(iVar, nVarArr[40])).booleanValue();
            boolean z13 = c42866j.f407673F;
            boolean z14 = zBooleanValue || !z13 || z12;
            if (z14) {
                sb2.append(cVar.K("constructor"));
            }
            InterfaceC42851d interfaceC42851dP0 = c42866j.f();
            if (((Boolean) iVar.f409495A.getValue(iVar, nVarArr[25])).booleanValue()) {
                if (z14) {
                    sb2.append(" ");
                }
                cVar.R(interfaceC42851dP0, sb2, true);
                cVar.d0(c42866j.getTypeParameters(), sb2, false);
            }
            cVar.h0(c42866j.g(), c42866j.K(), sb2);
            if (((Boolean) iVar.f409534q.getValue(iVar, nVarArr[15])).booleanValue() && !z13 && interfaceC42851dP0 != null && (interfaceC42850cT = interfaceC42851dP0.t()) != null) {
                List<k0> listG = interfaceC42850cT.g();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listG) {
                    k0 k0Var = (k0) obj2;
                    if (!k0Var.k0() && k0Var.S() == null) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb2.append(" : ");
                    sb2.append(cVar.K("this"));
                    sb2.append(C42745f0.O(arrayList, ", ", "(", ")", f.f409492l, 24));
                }
            }
            if (((Boolean) iVar.f409495A.getValue(iVar, i.f409494X[25])).booleanValue()) {
                cVar.j0(c42866j.getTypeParameters(), sb2);
            }
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final /* bridge */ /* synthetic */ G0 h(InterfaceC42905x interfaceC42905x, StringBuilder sb2) {
            n(interfaceC42905x, sb2);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object i(A a12, Object obj) {
            InterfaceC42850c interfaceC42850cT;
            String str;
            StringBuilder sb2 = (StringBuilder) obj;
            int i12 = c.f409483g;
            c cVar = c.this;
            cVar.getClass();
            boolean z12 = a12.getKind() == ClassKind.f407416e;
            if (!cVar.s()) {
                cVar.z(sb2, a12, null);
                cVar.D(a12.u0(), sb2);
                if (!z12) {
                    cVar.i0(a12.getVisibility(), sb2);
                }
                if ((a12.getKind() != ClassKind.f407414c || a12.i() != Modality.f407442f) && (!a12.getKind().a() || a12.i() != Modality.f407439c)) {
                    cVar.N(a12.i(), sb2, c.w(a12));
                }
                cVar.M(a12, sb2);
                cVar.P("inner", sb2, cVar.r().contains(DescriptorRendererModifier.f409435i) && a12.Y());
                cVar.P("data", sb2, cVar.r().contains(DescriptorRendererModifier.f409437k) && a12.W());
                cVar.P("inline", sb2, cVar.r().contains(DescriptorRendererModifier.f409438l) && a12.isInline());
                cVar.P("value", sb2, cVar.r().contains(DescriptorRendererModifier.f409444r) && a12.M());
                cVar.P("fun", sb2, cVar.r().contains(DescriptorRendererModifier.f409443q) && a12.w0());
                kotlin.reflect.jvm.internal.impl.renderer.b.f409468a.getClass();
                if (a12 instanceof f0) {
                    str = "typealias";
                } else if (a12.v0()) {
                    str = "companion object";
                } else {
                    int iOrdinal = a12.getKind().ordinal();
                    if (iOrdinal == 0) {
                        str = "class";
                    } else if (iOrdinal == 1) {
                        str = "interface";
                    } else if (iOrdinal == 2) {
                        str = "enum class";
                    } else if (iOrdinal == 3) {
                        str = "enum entry";
                    } else if (iOrdinal == 4) {
                        str = "annotation class";
                    } else {
                        if (iOrdinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "object";
                    }
                }
                sb2.append(cVar.K(str));
            }
            boolean zL2 = kotlin.reflect.jvm.internal.impl.resolve.j.l(a12);
            i iVar = cVar.f409484e;
            if (zL2) {
                if (((Boolean) iVar.f409501G.getValue(iVar, i.f409494X[31])).booleanValue()) {
                    if (cVar.s()) {
                        sb2.append("companion object");
                    }
                    c.X(sb2);
                    InterfaceC42882k interfaceC42882kF = a12.f();
                    if (interfaceC42882kF != null) {
                        sb2.append("of ");
                        sb2.append(cVar.Q(interfaceC42882kF.getName(), false));
                    }
                }
                if (cVar.v() || !kotlin.jvm.internal.L.f(a12.getName(), kotlin.reflect.jvm.internal.impl.name.h.f409258c)) {
                    if (!cVar.s()) {
                        c.X(sb2);
                    }
                    sb2.append(cVar.Q(a12.getName(), true));
                }
            } else {
                if (!cVar.s()) {
                    c.X(sb2);
                }
                cVar.R(a12, sb2, true);
            }
            if (!z12) {
                List<g0> listR = a12.r();
                cVar.d0(listR, sb2, false);
                cVar.B(a12, sb2);
                if (!a12.getKind().a() && ((Boolean) iVar.f409526i.getValue(iVar, i.f409494X[7])).booleanValue() && (interfaceC42850cT = a12.t()) != null) {
                    sb2.append(" ");
                    cVar.z(sb2, interfaceC42850cT, null);
                    cVar.i0(interfaceC42850cT.getVisibility(), sb2);
                    sb2.append(cVar.K("constructor"));
                    cVar.h0(interfaceC42850cT.g(), interfaceC42850cT.K(), sb2);
                }
                if (!((Boolean) iVar.f409541x.getValue(iVar, i.f409494X[22])).booleanValue() && !kotlin.reflect.jvm.internal.impl.builtins.k.D(a12.q())) {
                    Collection<O> collectionC = a12.l().C();
                    if (!collectionC.isEmpty() && (collectionC.size() != 1 || !kotlin.reflect.jvm.internal.impl.builtins.k.w(collectionC.iterator().next()))) {
                        c.X(sb2);
                        sb2.append(": ");
                        C42745f0.N(collectionC, sb2, ", ", null, null, new g(cVar), 60);
                    }
                }
                cVar.j0(listR, sb2);
            }
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object j(AbstractC42860d abstractC42860d, Object obj) {
            ((StringBuilder) obj).append(abstractC42860d.getName());
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object k(M m12, Object obj) {
            o(m12, (StringBuilder) obj, "getter");
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object l(V v12, Object obj) {
            int i12 = c.f409483g;
            c.this.g0(v12, true, (StringBuilder) obj, true);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object m(AbstractC42864h abstractC42864h, Object obj) {
            int i12 = c.f409483g;
            c.this.b0(abstractC42864h, (StringBuilder) obj, true);
            return G0.f406611a;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void n(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r10, @Y61.k java.lang.StringBuilder r11) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.c.a.n(kotlin.reflect.jvm.internal.impl.descriptors.x, java.lang.StringBuilder):void");
        }

        public final void o(T t12, StringBuilder sb2, String str) {
            c cVar = c.this;
            i iVar = cVar.f409484e;
            int iOrdinal = ((PropertyAccessorRenderingPolicy) iVar.f409502H.getValue(iVar, i.f409494X[32])).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return;
                }
                n(t12, sb2);
            } else {
                cVar.M(t12, sb2);
                sb2.append(str.concat(" for "));
                c.p(cVar, t12.s0(), sb2);
            }
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409487a;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.f409461b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.f409462c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f409487a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterNameRenderingPolicy parameterNameRenderingPolicy = ParameterNameRenderingPolicy.f409452b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = ParameterNameRenderingPolicy.f409452b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.c$c, reason: collision with other inner class name */
    public static final class C11684c extends kotlin.jvm.internal.N implements Y41.a<c> {
        public C11684c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v2 */
        @Override // Y41.a
        public final c invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            e eVar = e.f409491l;
            c cVar = c.this;
            cVar.getClass();
            i iVar = cVar.f409484e;
            iVar.getClass();
            i iVar2 = new i();
            Field[] declaredFields = i.class.getDeclaredFields();
            int length = declaredFields.length;
            ?? r72 = 0;
            int i12 = 0;
            while (i12 < length) {
                Field field = declaredFields[i12];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(iVar);
                    kotlin.properties.e eVar2 = obj instanceof kotlin.properties.e ? (kotlin.properties.e) obj : null;
                    if (eVar2 != null) {
                        C43066x.h0(field.getName(), "is", r72);
                        kotlin.reflect.d dVarB = m0.f406844a.b(i.class);
                        String name = field.getName();
                        StringBuilder sb2 = new StringBuilder("get");
                        String name2 = field.getName();
                        int length2 = name2.length();
                        String str = name2;
                        if (length2 > 0) {
                            str = Character.toUpperCase(name2.charAt(r72)) + name2.substring(1);
                        }
                        sb2.append(str);
                        field.set(iVar2, iVar2.q(eVar2.getValue(iVar, new h0(dVarB, name, sb2.toString()))));
                    }
                }
                i12++;
                r72 = 0;
            }
            eVar.invoke(iVar2);
            iVar2.f409518a = true;
            return new c(iVar2);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<O, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f409489l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(O o12) {
            O o13 = o12;
            if (!(o13 instanceof C42980h0)) {
                return o13;
            }
            ((C42980h0) o13).getClass();
            return null;
        }
    }

    public c(@Y61.k i iVar) {
        this.f409484e = iVar;
    }

    public static void X(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean k0(O o12) {
        if (kotlin.reflect.jvm.internal.impl.builtins.g.h(o12)) {
            List<x0> listF0 = o12.F0();
            if (!(listF0 instanceof Collection) || !listF0.isEmpty()) {
                Iterator<T> it = listF0.iterator();
                while (it.hasNext()) {
                    if (((x0) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void p(c cVar, U u12, StringBuilder sb2) {
        if (!cVar.s()) {
            i iVar = cVar.f409484e;
            j jVar = iVar.f409524g;
            n<?>[] nVarArr = i.f409494X;
            if (!((Boolean) jVar.getValue(iVar, nVarArr[5])).booleanValue()) {
                if (cVar.r().contains(DescriptorRendererModifier.f409434h)) {
                    cVar.z(sb2, u12, null);
                    InterfaceC42903v interfaceC42903vJ0 = u12.j0();
                    if (interfaceC42903vJ0 != null) {
                        cVar.z(sb2, interfaceC42903vJ0, AnnotationUseSiteTarget.f407455c);
                    }
                    InterfaceC42903v interfaceC42903vD0 = u12.d0();
                    if (interfaceC42903vD0 != null) {
                        cVar.z(sb2, interfaceC42903vD0, AnnotationUseSiteTarget.f407463k);
                    }
                    if (((PropertyAccessorRenderingPolicy) iVar.f409502H.getValue(iVar, nVarArr[32])) == PropertyAccessorRenderingPolicy.f409458c) {
                        M getter = u12.getGetter();
                        if (getter != null) {
                            cVar.z(sb2, getter, AnnotationUseSiteTarget.f407458f);
                        }
                        W wC2 = u12.c();
                        if (wC2 != null) {
                            cVar.z(sb2, wC2, AnnotationUseSiteTarget.f407459g);
                            cVar.z(sb2, (k0) C42745f0.u0(wC2.g()), AnnotationUseSiteTarget.f407462j);
                        }
                    }
                }
                cVar.D(u12.T(), sb2);
                cVar.i0(u12.getVisibility(), sb2);
                cVar.P("const", sb2, cVar.r().contains(DescriptorRendererModifier.f409441o) && u12.isConst());
                cVar.M(u12, sb2);
                cVar.O(sb2, u12);
                cVar.U(sb2, u12);
                cVar.P("lateinit", sb2, cVar.r().contains(DescriptorRendererModifier.f409442p) && u12.D0());
                cVar.L(sb2, u12);
            }
            cVar.f0(u12, sb2, false);
            cVar.d0(u12.getTypeParameters(), sb2, true);
            X xH2 = u12.H();
            if (xH2 != null) {
                cVar.z(sb2, xH2, AnnotationUseSiteTarget.f407460h);
                sb2.append(cVar.H(xH2.getType()));
                sb2.append(".");
            }
        }
        cVar.R(u12, sb2, true);
        sb2.append(": ");
        sb2.append(cVar.Y(u12.getType()));
        cVar.W(sb2, u12);
        cVar.J(u12, sb2);
        cVar.j0(u12.getTypeParameters(), sb2);
    }

    public static Modality w(B b12) {
        if (b12 instanceof InterfaceC42851d) {
            return ((InterfaceC42851d) b12).getKind() == ClassKind.f407414c ? Modality.f407442f : Modality.f407439c;
        }
        InterfaceC42882k interfaceC42882kF = b12.f();
        InterfaceC42851d interfaceC42851d = interfaceC42882kF instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882kF : null;
        if (interfaceC42851d == null) {
            return Modality.f407439c;
        }
        if (!(b12 instanceof CallableMemberDescriptor)) {
            return Modality.f407439c;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) b12;
        if (!callableMemberDescriptor.p().isEmpty() && interfaceC42851d.i() != Modality.f407439c) {
            return Modality.f407441e;
        }
        if (interfaceC42851d.getKind() != ClassKind.f407414c || kotlin.jvm.internal.L.f(callableMemberDescriptor.getVisibility(), r.f407785a)) {
            return Modality.f407439c;
        }
        Modality modalityI = callableMemberDescriptor.i();
        Modality modality = Modality.f407442f;
        return modalityI == modality ? modality : Modality.f407441e;
    }

    public final void B(InterfaceC42854g interfaceC42854g, StringBuilder sb2) {
        List<g0> listR = interfaceC42854g.r();
        List<g0> parameters = interfaceC42854g.l().getParameters();
        if (v() && interfaceC42854g.Y() && parameters.size() > listR.size()) {
            sb2.append(" /*captured type parameters: ");
            c0(parameters.subList(listR.size(), parameters.size()), sb2);
            sb2.append("*/");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String C(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        i iVar = this.f409484e;
        Y41.l lVar = (Y41.l) iVar.f409539v.getValue(iVar, i.f409494X[20]);
        if (lVar != null) {
            return (String) lVar.invoke(gVar);
        }
        if (gVar instanceof C42939b) {
            Iterable iterable = (Iterable) ((C42939b) gVar).f409586a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strC = C((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next());
                if (strC != null) {
                    arrayList.add(strC);
                }
            }
            return C42745f0.O(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof C42938a) {
            return C43066x.U("@", y((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C42938a) gVar).f409586a, null));
        }
        if (!(gVar instanceof s)) {
            return gVar.toString();
        }
        s.b bVar = (s.b) ((s) gVar).f409586a;
        if (bVar instanceof s.b.a) {
            return ((s.b.a) bVar).f409604a + "::class";
        }
        if (!(bVar instanceof s.b.C11686b)) {
            throw new NoWhenBranchMatchedException();
        }
        s.b.C11686b c11686b = (s.b.C11686b) bVar;
        String strB = c11686b.f409605a.f409584a.b().b();
        int i12 = c11686b.f409605a.f409585b;
        for (int i13 = 0; i13 < i12; i13++) {
            strB = C22491k0.a('>', "kotlin.Array<", strB);
        }
        return androidx.appcompat.app.r.q(strB, "::class");
    }

    public final void D(List<? extends X> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i12 = 0;
        for (X x12 : list) {
            int i13 = i12 + 1;
            z(sb2, x12, AnnotationUseSiteTarget.f407460h);
            sb2.append(H(x12.getType()));
            if (i12 == list.size() - 1) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i12 = i13;
        }
    }

    public final void E(StringBuilder sb2, Y y12) {
        z(sb2, y12, null);
        boolean z12 = y12 instanceof C42997w;
        C42997w c42997w = z12 ? (C42997w) y12 : null;
        Y y13 = c42997w != null ? c42997w.f410265c : null;
        if (Q.a(y12)) {
            boolean z13 = y12 instanceof kotlin.reflect.jvm.internal.impl.types.error.f;
            boolean z14 = z13 && ((kotlin.reflect.jvm.internal.impl.types.error.f) y12).f410187e.f410176c;
            i iVar = this.f409484e;
            if (z14 && ((Boolean) iVar.f409515U.getValue(iVar, i.f409494X[46])).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.types.error.h.f410195a.getClass();
                if (z13) {
                    boolean z15 = ((kotlin.reflect.jvm.internal.impl.types.error.f) y12).f410187e.f410176c;
                }
                sb2.append(F(((kotlin.reflect.jvm.internal.impl.types.error.g) y12.H0()).f410193b[0]));
            } else {
                if (!z13 || ((Boolean) iVar.f409517W.getValue(iVar, i.f409494X[48])).booleanValue()) {
                    sb2.append(y12.H0().toString());
                } else {
                    sb2.append(((kotlin.reflect.jvm.internal.impl.types.error.f) y12).f410191i);
                }
                sb2.append(Z(y12.F0()));
            }
        } else {
            if (y12 instanceof C42980h0) {
                throw null;
            }
            if (y13 instanceof C42980h0) {
                ((C42980h0) y13).getClass();
                throw null;
            }
            q0 q0VarH0 = y12.H0();
            InterfaceC42853f interfaceC42853fB = y12.H0().b();
            S sA2 = kotlin.reflect.jvm.internal.impl.descriptors.h0.a(y12, interfaceC42853fB instanceof InterfaceC42854g ? (InterfaceC42854g) interfaceC42853fB : null, 0);
            if (sA2 == null) {
                sb2.append(a0(q0VarH0));
                sb2.append(Z(y12.F0()));
            } else {
                V(sb2, sA2);
            }
        }
        if (y12.I0()) {
            sb2.append("?");
        }
        if (z12) {
            sb2.append(" & Any");
        }
    }

    public final String F(String str) {
        int i12 = b.f409487a[t().ordinal()];
        if (i12 == 1) {
            return str;
        }
        if (i12 == 2) {
            return AK.c.k("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public final String G(@Y61.k String str, @Y61.k String str2, @Y61.k kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
        if (m.d(str, str2)) {
            return C43066x.h0(str2, "(", false) ? AK.c.k("(", str, ")!") : str.concat("!");
        }
        i iVar = this.f409484e;
        j jVar = iVar.f409519b;
        n<?>[] nVarArr = i.f409494X;
        String strQ0 = C43066x.q0(((kotlin.reflect.jvm.internal.impl.renderer.a) jVar.getValue(iVar, nVarArr[0])).a(kVar.i(n.a.f407347C), this), "Collection");
        String strC = m.c(str, strQ0.concat("Mutable"), str2, strQ0, strQ0.concat("(Mutable)"));
        if (strC != null) {
            return strC;
        }
        String strC2 = m.c(str, strQ0.concat("MutableMap.MutableEntry"), str2, strQ0.concat("Map.Entry"), strQ0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strC2 != null) {
            return strC2;
        }
        String strQ02 = C43066x.q0(((kotlin.reflect.jvm.internal.impl.renderer.a) iVar.f409519b.getValue(iVar, nVarArr[0])).a(kVar.j("Array"), this), "Array");
        String strC3 = m.c(str, strQ02.concat(q("Array<")), str2, strQ02.concat(q("Array<out ")), strQ02.concat(q("Array<(out) ")));
        if (strC3 != null) {
            return strC3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String H(O o12) {
        String strY = Y(o12);
        return ((!k0(o12) || kotlin.reflect.jvm.internal.impl.types.G0.f(o12)) && !(o12 instanceof C42997w)) ? strY : C22491k0.a(')', "(", strY);
    }

    @Y61.k
    public final String I(@Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return q(m.b(dVar.e()));
    }

    public final void J(kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var, StringBuilder sb2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarQ;
        String strC;
        i iVar = this.f409484e;
        if (!((Boolean) iVar.f409538u.getValue(iVar, i.f409494X[19])).booleanValue() || (gVarQ = m0Var.Q()) == null || (strC = C(gVarQ)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(q(strC));
    }

    public final String K(String str) {
        int i12 = b.f409487a[t().ordinal()];
        if (i12 == 1) {
            return str;
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar = this.f409484e;
        return ((Boolean) iVar.f409516V.getValue(iVar, i.f409494X[47])).booleanValue() ? str : AK.c.k("<b>", str, "</b>");
    }

    public final void L(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (r().contains(DescriptorRendererModifier.f409436j) && v() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.f407408b) {
            sb2.append("/*");
            sb2.append(C49167a.c(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    public final void M(B b12, StringBuilder sb2) {
        P("external", sb2, b12.isExternal());
        boolean z12 = false;
        P("expect", sb2, r().contains(DescriptorRendererModifier.f409439m) && b12.O());
        if (r().contains(DescriptorRendererModifier.f409440n) && b12.t0()) {
            z12 = true;
        }
        P("actual", sb2, z12);
    }

    public final void N(Modality modality, StringBuilder sb2, Modality modality2) {
        i iVar = this.f409484e;
        if (((Boolean) iVar.f409533p.getValue(iVar, i.f409494X[14])).booleanValue() || modality != modality2) {
            P(C49167a.c(modality.name()), sb2, r().contains(DescriptorRendererModifier.f409432f));
        }
    }

    public final void O(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (kotlin.reflect.jvm.internal.impl.resolve.j.s(callableMemberDescriptor) && callableMemberDescriptor.i() == Modality.f407439c) {
            return;
        }
        i iVar = this.f409484e;
        if (((OverrideRenderingPolicy) iVar.f409496B.getValue(iVar, i.f409494X[26])) == OverrideRenderingPolicy.f409448b && callableMemberDescriptor.i() == Modality.f407441e && !callableMemberDescriptor.p().isEmpty()) {
            return;
        }
        N(callableMemberDescriptor.i(), sb2, w(callableMemberDescriptor));
    }

    public final void P(String str, StringBuilder sb2, boolean z12) {
        if (z12) {
            sb2.append(K(str));
            sb2.append(" ");
        }
    }

    @Y61.k
    public final String Q(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z12) {
        String strQ = q(m.a(fVar));
        i iVar = this.f409484e;
        return (((Boolean) iVar.f409516V.getValue(iVar, i.f409494X[47])).booleanValue() && t() == RenderingFormat.f409462c && z12) ? AK.c.k("<b>", strQ, "</b>") : strQ;
    }

    public final void R(InterfaceC42882k interfaceC42882k, StringBuilder sb2, boolean z12) {
        sb2.append(Q(interfaceC42882k.getName(), z12));
    }

    public final void S(StringBuilder sb2, O o12) {
        J0 j0K0 = o12.K0();
        C42959a c42959a = j0K0 instanceof C42959a ? (C42959a) j0K0 : null;
        if (c42959a == null) {
            T(sb2, o12);
            return;
        }
        i iVar = this.f409484e;
        j jVar = iVar.f409512R;
        kotlin.reflect.n<?>[] nVarArr = i.f409494X;
        boolean zBooleanValue = ((Boolean) jVar.getValue(iVar, nVarArr[42])).booleanValue();
        Y y12 = c42959a.f410081c;
        if (zBooleanValue) {
            T(sb2, y12);
            return;
        }
        T(sb2, c42959a.f410082d);
        if (((Boolean) iVar.f409511Q.getValue(iVar, nVarArr[41])).booleanValue()) {
            RenderingFormat renderingFormatT = t();
            RenderingFormat renderingFormat = RenderingFormat.f409462c;
            if (renderingFormatT == renderingFormat) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* = ");
            T(sb2, y12);
            sb2.append(" */");
            if (t() == renderingFormat) {
                sb2.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(java.lang.StringBuilder r18, kotlin.reflect.jvm.internal.impl.types.O r19) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.c.T(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.types.O):void");
    }

    public final void U(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (r().contains(DescriptorRendererModifier.f409433g) && !callableMemberDescriptor.p().isEmpty()) {
            i iVar = this.f409484e;
            if (((OverrideRenderingPolicy) iVar.f409496B.getValue(iVar, i.f409494X[26])) != OverrideRenderingPolicy.f409449c) {
                P("override", sb2, true);
                if (v()) {
                    sb2.append("/*");
                    sb2.append(callableMemberDescriptor.p().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void V(StringBuilder sb2, S s5) {
        S s12 = s5.f407447c;
        InterfaceC42854g interfaceC42854g = s5.f407445a;
        if (s12 != null) {
            V(sb2, s12);
            sb2.append('.');
            sb2.append(Q(interfaceC42854g.getName(), false));
        } else {
            sb2.append(a0(interfaceC42854g.l()));
        }
        sb2.append(Z(s5.f407446b));
    }

    public final void W(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        X xH2;
        i iVar = this.f409484e;
        if (((Boolean) iVar.f409500F.getValue(iVar, i.f409494X[30])).booleanValue() && (xH2 = callableMemberDescriptor.H()) != null) {
            sb2.append(" on ");
            sb2.append(Y(xH2.getType()));
        }
    }

    @Y61.k
    public final String Y(@Y61.k O o12) {
        StringBuilder sb2 = new StringBuilder();
        i iVar = this.f409484e;
        S(sb2, (O) ((Y41.l) iVar.f409542y.getValue(iVar, i.f409494X[23])).invoke(o12));
        return sb2.toString();
    }

    @Y61.k
    public final String Z(@Y61.k List<? extends x0> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q("<"));
        C42745f0.N(list, sb2, ", ", null, null, new kotlin.reflect.jvm.internal.impl.renderer.d(this), 60);
        sb2.append(q(">"));
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void a(@Y61.k LinkedHashSet linkedHashSet) {
        this.f409484e.a(linkedHashSet);
    }

    @Y61.k
    public final String a0(@Y61.k q0 q0Var) {
        InterfaceC42853f interfaceC42853fB = q0Var.b();
        if (interfaceC42853fB instanceof g0 ? true : interfaceC42853fB instanceof InterfaceC42851d ? true : interfaceC42853fB instanceof f0) {
            if (kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42853fB)) {
                return interfaceC42853fB.l().toString();
            }
            i iVar = this.f409484e;
            return ((kotlin.reflect.jvm.internal.impl.renderer.a) iVar.f409519b.getValue(iVar, i.f409494X[0])).a(interfaceC42853fB, this);
        }
        if (interfaceC42853fB == null) {
            return q0Var instanceof kotlin.reflect.jvm.internal.impl.types.M ? ((kotlin.reflect.jvm.internal.impl.types.M) q0Var).e(d.f409489l) : q0Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC42853fB.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void b() {
        this.f409484e.b();
    }

    public final void b0(g0 g0Var, StringBuilder sb2, boolean z12) {
        if (z12) {
            sb2.append(q("<"));
        }
        if (v()) {
            sb2.append("/*");
            sb2.append(g0Var.getIndex());
            sb2.append("*/ ");
        }
        P("reified", sb2, g0Var.s());
        String str = g0Var.o().f410074b;
        boolean z13 = true;
        P(str, sb2, str.length() > 0);
        z(sb2, g0Var, null);
        R(g0Var, sb2, z12);
        int size = g0Var.getUpperBounds().size();
        if ((size > 1 && !z12) || size == 1) {
            O next = g0Var.getUpperBounds().iterator().next();
            if (next == null) {
                kotlin.reflect.jvm.internal.impl.builtins.k.a(142);
                throw null;
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.k.w(next) || !next.I0()) {
                sb2.append(" : ");
                sb2.append(Y(next));
            }
        } else if (z12) {
            for (O o12 : g0Var.getUpperBounds()) {
                if (o12 == null) {
                    kotlin.reflect.jvm.internal.impl.builtins.k.a(142);
                    throw null;
                }
                if (!kotlin.reflect.jvm.internal.impl.builtins.k.w(o12) || !o12.I0()) {
                    if (z13) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(Y(o12));
                    z13 = false;
                }
            }
        }
        if (z12) {
            sb2.append(q(">"));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void c() {
        this.f409484e.c();
    }

    public final void c0(List list, StringBuilder sb2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((g0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void d(@Y61.k RenderingFormat renderingFormat) {
        this.f409484e.d(renderingFormat);
    }

    public final void d0(List<? extends g0> list, StringBuilder sb2, boolean z12) {
        i iVar = this.f409484e;
        if (((Boolean) iVar.f409540w.getValue(iVar, i.f409494X[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb2.append(q("<"));
        c0(list, sb2);
        sb2.append(q(">"));
        if (z12) {
            sb2.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void e() {
        this.f409484e.e();
    }

    @Y61.k
    public final String e0(@Y61.k x0 x0Var) {
        StringBuilder sb2 = new StringBuilder();
        C42745f0.N(Collections.singletonList(x0Var), sb2, ", ", null, null, new kotlin.reflect.jvm.internal.impl.renderer.d(this), 60);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void f(@Y61.k ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.f409484e.f(parameterNameRenderingPolicy);
    }

    public final void f0(kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var, StringBuilder sb2, boolean z12) {
        if (z12 || !(m0Var instanceof k0)) {
            sb2.append(K(m0Var.c0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.c> g() {
        return this.f409484e.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(kotlin.reflect.jvm.internal.impl.descriptors.k0 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.c.g0(kotlin.reflect.jvm.internal.impl.descriptors.k0, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void h() {
        this.f409484e.h();
    }

    public final void h0(Collection<? extends k0> collection, boolean z12, StringBuilder sb2) {
        i iVar = this.f409484e;
        int iOrdinal = ((ParameterNameRenderingPolicy) iVar.f409499E.getValue(iVar, i.f409494X[29])).ordinal();
        boolean z13 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z12) {
            }
            z13 = false;
        }
        int size = collection.size();
        u().a(sb2);
        int i12 = 0;
        for (k0 k0Var : collection) {
            u().getClass();
            g0(k0Var, z13, sb2, false);
            u().c(i12, size, sb2);
            i12++;
        }
        u().b(sb2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void i(@Y61.k Set<? extends DescriptorRendererModifier> set) {
        this.f409484e.i(set);
    }

    public final boolean i0(AbstractC42900s abstractC42900s, StringBuilder sb2) {
        if (!r().contains(DescriptorRendererModifier.f409431e)) {
            return false;
        }
        i iVar = this.f409484e;
        j jVar = iVar.f409531n;
        kotlin.reflect.n<?>[] nVarArr = i.f409494X;
        if (((Boolean) jVar.getValue(iVar, nVarArr[12])).booleanValue()) {
            abstractC42900s = abstractC42900s.d();
        }
        if (!((Boolean) iVar.f409532o.getValue(iVar, nVarArr[13])).booleanValue() && kotlin.jvm.internal.L.f(abstractC42900s, r.f407796l)) {
            return false;
        }
        sb2.append(K(abstractC42900s.b()));
        sb2.append(" ");
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void j() {
        this.f409484e.j();
    }

    public final void j0(List<? extends g0> list, StringBuilder sb2) {
        i iVar = this.f409484e;
        if (((Boolean) iVar.f409540w.getValue(iVar, i.f409494X[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (g0 g0Var : list) {
            Iterator it = C42745f0.w(g0Var.getUpperBounds(), 1).iterator();
            while (it.hasNext()) {
                arrayList.add(Q(g0Var.getName(), false) + " : " + Y((O) it.next()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(K("where"));
        sb2.append(" ");
        C42745f0.N(arrayList, sb2, ", ", null, null, null, 124);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void k() {
        this.f409484e.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void l() {
        this.f409484e.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void m(@Y61.k AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.f409484e.m(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void n() {
        this.f409484e.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.h
    public final void o(@Y61.k kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        this.f409484e.o(aVar);
    }

    public final String q(String str) {
        return t().a(str);
    }

    @Y61.k
    public final Set<DescriptorRendererModifier> r() {
        i iVar = this.f409484e;
        return (Set) iVar.f409522e.getValue(iVar, i.f409494X[3]);
    }

    public final boolean s() {
        i iVar = this.f409484e;
        return ((Boolean) iVar.f409523f.getValue(iVar, i.f409494X[4])).booleanValue();
    }

    @Y61.k
    public final RenderingFormat t() {
        i iVar = this.f409484e;
        return (RenderingFormat) iVar.f409498D.getValue(iVar, i.f409494X[28]);
    }

    @Y61.k
    public final b.l u() {
        i iVar = this.f409484e;
        return (b.l) iVar.f409497C.getValue(iVar, i.f409494X[27]);
    }

    public final boolean v() {
        i iVar = this.f409484e;
        return ((Boolean) iVar.f409527j.getValue(iVar, i.f409494X[8])).booleanValue();
    }

    @Y61.k
    public final String x(@Y61.k InterfaceC42882k interfaceC42882k) {
        InterfaceC42882k interfaceC42882kF;
        StringBuilder sb2 = new StringBuilder();
        interfaceC42882k.A(new a(), sb2);
        i iVar = this.f409484e;
        j jVar = iVar.f409520c;
        kotlin.reflect.n<?>[] nVarArr = i.f409494X;
        if (((Boolean) jVar.getValue(iVar, nVarArr[1])).booleanValue() && !(interfaceC42882k instanceof K) && !(interfaceC42882k instanceof P) && (interfaceC42882kF = interfaceC42882k.f()) != null && !(interfaceC42882kF instanceof E)) {
            sb2.append(" ");
            String strK = "defined in";
            int i12 = b.f409487a[t().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strK = AK.c.k("<i>", "defined in", "</i>");
            }
            sb2.append(strK);
            sb2.append(" ");
            kotlin.reflect.jvm.internal.impl.name.d dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42882kF);
            sb2.append(dVarG.f409248a.isEmpty() ? "root package" : I(dVarG));
            if (((Boolean) iVar.f409521d.getValue(iVar, nVarArr[2])).booleanValue() && (interfaceC42882kF instanceof K) && (interfaceC42882k instanceof InterfaceC42885n)) {
                ((InterfaceC42885n) interfaceC42882k).e().a().getClass();
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final String y(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @Y61.l AnnotationUseSiteTarget annotationUseSiteTarget) {
        InterfaceC42850c interfaceC42850cT;
        List<k0> listG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.f407466b + ':');
        }
        O type = cVar.getType();
        sb2.append(Y(type));
        i iVar = this.f409484e;
        iVar.getClass();
        kotlin.reflect.n<?>[] nVarArr = i.f409494X;
        kotlin.reflect.n<?> nVar = nVarArr[38];
        j jVar = iVar.f409508N;
        if (((AnnotationArgumentsRenderingPolicy) jVar.getValue(iVar, nVar)).f409427b) {
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> mapB = cVar.b();
            C42784z0 c42784z0 = null;
            InterfaceC42851d interfaceC42851dD = ((Boolean) iVar.f409503I.getValue(iVar, nVarArr[33])).booleanValue() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(cVar) : null;
            if (interfaceC42851dD != null && (interfaceC42850cT = interfaceC42851dD.t()) != null && (listG = interfaceC42850cT.g()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (((k0) obj).k0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((k0) it.next()).getName());
                }
                c42784z0 = arrayList2;
            }
            if (c42784z0 == null) {
                c42784z0 = C42784z0.f406748b;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : c42784z0) {
                if (!mapB.containsKey((kotlin.reflect.jvm.internal.impl.name.f) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((kotlin.reflect.jvm.internal.impl.name.f) it2.next()).b() + " = ...");
            }
            Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(C42745f0.q(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
                kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.b());
                sb3.append(" = ");
                sb3.append(!c42784z0.contains(fVar) ? C(gVar) : "...");
                arrayList5.add(sb3.toString());
            }
            List listA0 = C42745f0.A0(C42745f0.h0(arrayList5, arrayList4));
            if (((AnnotationArgumentsRenderingPolicy) jVar.getValue(iVar, i.f409494X[38])).f409428c || !listA0.isEmpty()) {
                C42745f0.N(listA0, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (v() && (Q.a(type) || (type.H0().b() instanceof H.b))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public final void z(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (r().contains(DescriptorRendererModifier.f409434h)) {
            boolean z12 = aVar instanceof O;
            i iVar = this.f409484e;
            Set<kotlin.reflect.jvm.internal.impl.name.c> setG = z12 ? iVar.g() : (Set) iVar.f409505K.getValue(iVar, i.f409494X[35]);
            Y41.l lVar = (Y41.l) iVar.f409507M.getValue(iVar, i.f409494X[37]);
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.getAnnotations()) {
                if (!C42745f0.r(setG, cVar.d()) && !kotlin.jvm.internal.L.f(cVar.d(), n.a.f407393s) && (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue())) {
                    sb2.append(y(cVar, annotationUseSiteTarget));
                    if (((Boolean) iVar.f409504J.getValue(iVar, i.f409494X[34])).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }
}
