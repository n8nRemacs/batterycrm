package net.bytebuddy.dynamic.scaffold;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.UserTypeCode;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.field.b;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.a;
import net.bytebuddy.description.type.b;
import net.bytebuddy.description.type.c;
import net.bytebuddy.description.type.d;
import net.bytebuddy.description.type.e;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.M;
import net.bytebuddy.utility.JavaType;

/* loaded from: classes8.dex */
public interface InstrumentedType extends TypeDescription {

    public interface Factory {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements Factory {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f416838b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f416839c;

            public enum a extends Default {
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public final d a(TypeDescription typeDescription) {
                    a.d dVar;
                    TypeDescription typeDescription2;
                    List listEmptyList;
                    String name = typeDescription.getName();
                    int modifiers = typeDescription.getModifiers();
                    TypeDescription.Generic genericC3 = typeDescription.C3();
                    a.InterfaceC11963a.C11964a c11964aC = typeDescription.r().c(C44411u.f(typeDescription));
                    d.f fVarH0 = typeDescription.J0().h0(TypeDescription.Generic.Visitor.d.b.k(typeDescription));
                    a.InterfaceC11963a.C11964a c11964aC2 = typeDescription.x().c(C44411u.f(typeDescription));
                    Map mapEmptyMap = Collections.emptyMap();
                    a.InterfaceC11963a.C11964a c11964aC3 = typeDescription.q().c(C44411u.f(typeDescription));
                    a.InterfaceC11963a.C11964a c11964aC4 = typeDescription.z().c(C44411u.f(typeDescription));
                    net.bytebuddy.description.annotation.a declaredAnnotations = typeDescription.getDeclaredAnnotations();
                    TypeInitializer.None none = TypeInitializer.None.f416957b;
                    LoadedTypeInitializer.NoOp noOp = LoadedTypeInitializer.NoOp.f417353b;
                    TypeDescription typeDescriptionN = typeDescription.n();
                    a.d dVarE3 = typeDescription.e3();
                    TypeDescription typeDescriptionH5 = typeDescription.H5();
                    net.bytebuddy.description.type.d dVarJ2 = typeDescription.J2();
                    net.bytebuddy.description.type.d dVarA2 = typeDescription.B() ? typeDescription.A2() : null;
                    boolean zD5 = typeDescription.D5();
                    boolean zH2 = typeDescription.H();
                    boolean zA2 = typeDescription.A();
                    TypeDescription typeDescriptionG = typeDescription.y3() ? net.bytebuddy.dynamic.c.f416659a : typeDescription.G();
                    if (typeDescription.y3()) {
                        typeDescription2 = typeDescriptionH5;
                        dVar = dVarE3;
                        listEmptyList = typeDescription.L().P1(new M(C44411u.f(typeDescription)));
                    } else {
                        dVar = dVarE3;
                        typeDescription2 = typeDescriptionH5;
                        listEmptyList = Collections.emptyList();
                    }
                    return new b(name, modifiers, genericC3, c11964aC, fVarH0, c11964aC2, mapEmptyMap, c11964aC3, c11964aC4, declaredAnnotations, none, noOp, typeDescriptionN, dVar, typeDescription2, dVarJ2, dVarA2, zD5, zH2, zA2, typeDescriptionG, listEmptyList);
                }
            }

            public enum b extends Default {
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public final d a(TypeDescription typeDescription) {
                    return new c(typeDescription, LoadedTypeInitializer.NoOp.f417353b);
                }
            }

            static {
                a aVar = new a("MODIFIABLE", 0, null);
                f416838b = aVar;
                f416839c = new Default[]{aVar, new b("FROZEN", 1, null)};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f416839c.clone();
            }
        }

        d a(TypeDescription typeDescription);
    }

    public static class b extends TypeDescription.b.a implements d {

        /* renamed from: A, reason: collision with root package name */
        public static final HashSet f416841A = new HashSet(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", BooleanParameter.TYPE, "do", "if", UserTypeCode.PRIVATE, "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", IntParameter.TYPE, "short", "try", CharParameter.TYPE, "final", "interface", "static", "void", "class", "finally", Constants.LONG, "strictfp", "volatile", "const", "float", "native", "super", "while"));

        /* renamed from: e, reason: collision with root package name */
        public final String f416842e;

        /* renamed from: f, reason: collision with root package name */
        public final int f416843f;

        /* renamed from: g, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic f416844g;

        /* renamed from: h, reason: collision with root package name */
        public final List<? extends e> f416845h;

        /* renamed from: i, reason: collision with root package name */
        public final List<? extends TypeDescription.Generic> f416846i;

        /* renamed from: j, reason: collision with root package name */
        public final List<? extends a.g> f416847j;

        /* renamed from: k, reason: collision with root package name */
        public final Map<String, Object> f416848k;

        /* renamed from: l, reason: collision with root package name */
        public final List<? extends a.h> f416849l;

        /* renamed from: m, reason: collision with root package name */
        public final List<? extends b.f> f416850m;

        /* renamed from: n, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416851n;

        /* renamed from: o, reason: collision with root package name */
        public final TypeInitializer f416852o;

        /* renamed from: p, reason: collision with root package name */
        public final LoadedTypeInitializer f416853p;

        /* renamed from: q, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription f416854q;

        /* renamed from: r, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final a.d f416855r;

        /* renamed from: s, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription f416856s;

        /* renamed from: t, reason: collision with root package name */
        public final List<? extends TypeDescription> f416857t;

        /* renamed from: u, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final List<? extends TypeDescription> f416858u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f416859v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f416860w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f416861x;

        /* renamed from: y, reason: collision with root package name */
        public final TypeDescription f416862y;

        /* renamed from: z, reason: collision with root package name */
        public final List<? extends TypeDescription> f416863z;

        public b(String str, int i12, @net.bytebuddy.utility.nullability.b TypeDescription.Generic generic, List<? extends e> list, List<? extends TypeDescription.Generic> list2, List<? extends a.g> list3, Map<String, Object> map, List<? extends a.h> list4, List<? extends b.f> list5, List<? extends AnnotationDescription> list6, TypeInitializer typeInitializer, LoadedTypeInitializer loadedTypeInitializer, @net.bytebuddy.utility.nullability.b TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b a.d dVar, @net.bytebuddy.utility.nullability.b TypeDescription typeDescription2, List<? extends TypeDescription> list7, @net.bytebuddy.utility.nullability.b List<? extends TypeDescription> list8, boolean z12, boolean z13, boolean z14, TypeDescription typeDescription3, List<? extends TypeDescription> list9) {
            this.f416842e = str;
            this.f416843f = i12;
            this.f416845h = list;
            this.f416844g = generic;
            this.f416846i = list2;
            this.f416847j = list3;
            this.f416848k = map;
            this.f416849l = list4;
            this.f416850m = list5;
            this.f416851n = list6;
            this.f416852o = typeInitializer;
            this.f416853p = loadedTypeInitializer;
            this.f416854q = typeDescription;
            this.f416855r = dVar;
            this.f416856s = typeDescription2;
            this.f416857t = list7;
            this.f416858u = list8;
            this.f416859v = z12;
            this.f416860w = z13;
            this.f416861x = z14;
            this.f416862y = typeDescription3;
            this.f416863z = list9;
        }

        public static boolean z0(String str) {
            if (f416841A.contains(str) || str.length() == 0 || !Character.isJavaIdentifierStart(str.charAt(0))) {
                return false;
            }
            if (str.equals("package-info")) {
                return true;
            }
            for (int i12 = 1; i12 < str.length(); i12++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i12))) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean A() {
            return this.f416861x && this.f416844g != null && ((TypeDescription.Generic.b.i) C3()).f416454c.f5().equals(JavaType.f418908l.f418912b);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            List<? extends TypeDescription> list = this.f416858u;
            return list == null ? new d.c() : new d.C12001d(list);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean B() {
            return this.f416858u != null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d B0(ArrayList arrayList) {
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, this.f416849l, this.f416850m, net.bytebuddy.utility.a.a(this.f416851n, arrayList), this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic C3() {
            TypeDescription.Generic generic = this.f416844g;
            if (generic != null) {
                return new TypeDescription.Generic.b.i(generic, new TypeDescription.Generic.Visitor.d.a((TypeDescription) this, (TypeVariableSource) this), generic);
            }
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            return this.f416859v;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            TypeDescription typeDescription = this.f416862y;
            return typeDescription.Q2(net.bytebuddy.dynamic.c.class) ? this : typeDescription;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            return this.f416860w;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription H5() {
            return this.f416856s;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            return new d.f.C12002d.b(this.f416846i, new TypeDescription.Generic.Visitor.d.a((TypeDescription) this, (TypeVariableSource) this));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            return new d.C12001d(this.f416857t);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final LoadedTypeInitializer K3() {
            return this.f416853p;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            TypeDescription typeDescription = this.f416862y;
            return typeDescription.Q2(net.bytebuddy.dynamic.c.class) ? new d.C12001d((List<? extends TypeDescription>) net.bytebuddy.utility.a.c(this, this.f416863z)) : typeDescription.L();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d N3(d.f fVar) {
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, net.bytebuddy.utility.a.a(this.f416846i, fVar.h0(TypeDescription.Generic.Visitor.d.b.k(this))), this.f416847j, this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d R3(String str) {
            return new b(str, this.f416843f, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d U2(net.bytebuddy.implementation.bytecode.a aVar) {
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o.d(aVar), this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final TypeInitializer W5() {
            return this.f416852o;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            return this.f416855r;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416851n);
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416843f;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416842e;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDefinition n() {
            return this.f416854q;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d n3(int i12) {
            return new b(this.f416842e, i12, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d o5(TypeDescription typeDescription) {
            TypeDescription typeDescription2 = typeDescription;
            if (typeDescription2.equals(this)) {
                typeDescription2 = net.bytebuddy.dynamic.c.f416659a;
            }
            TypeDescription typeDescription3 = typeDescription2;
            List listEmptyList = Collections.emptyList();
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, typeDescription3, listEmptyList);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            return new b.e(this, this.f416849l);
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            int i12 = d.f.C12002d.f416532d;
            return new d.f.C12002d.a(this, this.f416845h, new TypeDescription.Generic.Visitor.d.a((TypeDescription) this, (TypeVariableSource) this));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final InstrumentedType r3(a.g gVar, Object obj) {
            HashMap map = new HashMap(this.f416848k);
            String str = gVar.f416153a;
            Object objPut = map.put(str, obj);
            if (objPut == null) {
                return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, net.bytebuddy.utility.a.d(this.f416847j, gVar.a(TypeDescription.Generic.Visitor.d.b.k(this))), map, this.f416849l, this.f416850m, this.f416851n, this.f416852o, new LoadedTypeInitializer.a(this.f416853p, new LoadedTypeInitializer.b(str, obj)), this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
            }
            if (objPut == obj) {
                return this;
            }
            throw new IllegalStateException("Field " + str + " for " + this + " already mapped to " + objPut + " and not " + obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:209:0x0570, code lost:
        
            throw new java.lang.IllegalStateException("Cannot add " + r8 + " on " + r30);
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x026e, code lost:
        
            throw new java.lang.IllegalStateException("Illegal interface bound " + r6 + " of " + r9 + " for " + r30);
         */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final net.bytebuddy.description.type.TypeDescription u5() {
            /*
                Method dump skipped, instructions count: 3609
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.InstrumentedType.b.u5():net.bytebuddy.description.type.TypeDescription");
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            return new b.e(this, this.f416847j);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            String str = this.f416842e;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            return new a.c(str.substring(0, iLastIndexOf));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            return new c.e(this, this.f416850m);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final d W(a.g gVar) {
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, net.bytebuddy.utility.a.d(this.f416847j, gVar.a(TypeDescription.Generic.Visitor.d.b.k(this))), this.f416848k, this.f416849l, this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription n() {
            return this.f416854q;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final d n0(a.h hVar) {
            return new b(this.f416842e, this.f416843f, this.f416844g, this.f416845h, this.f416846i, this.f416847j, this.f416848k, net.bytebuddy.utility.a.d(this.f416849l, hVar.a(TypeDescription.Generic.Visitor.d.b.k(this))), this.f416850m, this.f416851n, this.f416852o, this.f416853p, this.f416854q, this.f416855r, this.f416856s, this.f416857t, this.f416858u, this.f416859v, this.f416860w, this.f416861x, this.f416862y, this.f416863z);
        }
    }

    public static class c extends TypeDescription.b.a implements d {

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription f416864e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f416865f;

        public c(TypeDescription typeDescription, LoadedTypeInitializer loadedTypeInitializer) {
            this.f416864e = typeDescription;
            this.f416865f = loadedTypeInitializer;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            return this.f416864e.A();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            return this.f416864e.A2();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean B() {
            return this.f416864e.B();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d B0(ArrayList arrayList) {
            throw new IllegalStateException("Cannot add annotation to frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic C3() {
            return this.f416864e.C3();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            return this.f416864e.D5();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            return this.f416864e.G();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            return this.f416864e.H();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription H5() {
            return this.f416864e.H5();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            return this.f416864e.J0();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            return this.f416864e.J2();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, net.bytebuddy.implementation.LoadedTypeInitializer] */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final LoadedTypeInitializer K3() {
            return this.f416865f;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            return this.f416864e.L();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d N3(d.f fVar) {
            throw new IllegalStateException("Cannot add interfaces for frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d R3(String str) {
            throw new IllegalStateException("Cannot change name of frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d U2(net.bytebuddy.implementation.bytecode.a aVar) {
            throw new IllegalStateException("Cannot add initializer to frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final /* bridge */ /* synthetic */ InstrumentedType W(a.g gVar) {
            W(gVar);
            throw null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final TypeInitializer W5() {
            return TypeInitializer.None.f416957b;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            return this.f416864e.e3();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final int f(boolean z12) {
            return this.f416864e.f(z12);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return this.f416864e.getDeclaredAnnotations();
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416864e.getModifiers();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416864e.getName();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public final String h() {
            return this.f416864e.h();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription n() {
            return this.f416864e.n();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final /* bridge */ /* synthetic */ InstrumentedType n0(a.h hVar) {
            n0(hVar);
            throw null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d n3(int i12) {
            throw new IllegalStateException("Cannot change modifiers for frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d
        public final d o5(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set nest host of frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            return this.f416864e.q();
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return this.f416864e.r();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final InstrumentedType r3(a.g gVar, Object obj) {
            throw new IllegalStateException("Cannot define auxiliary field for frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final TypeDescription u5() {
            return this.f416864e;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            return this.f416864e.x();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            return this.f416864e.y5();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            return this.f416864e.z();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final d W(a.g gVar) {
            throw new IllegalStateException("Cannot define field for frozen type: " + this.f416864e);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.d, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public final d n0(a.h hVar) {
            throw new IllegalStateException("Cannot define method for frozen type: " + this.f416864e);
        }
    }

    public interface d extends InstrumentedType {
        d B0(ArrayList arrayList);

        d N3(d.f fVar);

        d R3(String str);

        d U2(net.bytebuddy.implementation.bytecode.a aVar);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        d W(a.g gVar);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        d n0(a.h hVar);

        d n3(int i12);

        d o5(TypeDescription typeDescription);
    }

    LoadedTypeInitializer K3();

    InstrumentedType W(a.g gVar);

    TypeInitializer W5();

    InstrumentedType n0(a.h hVar);

    InstrumentedType r3(a.g gVar, Object obj);

    TypeDescription u5();

    public interface Prepareable {
        InstrumentedType e(InstrumentedType instrumentedType);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Prepareable {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f416840b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f416840b.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }
}
