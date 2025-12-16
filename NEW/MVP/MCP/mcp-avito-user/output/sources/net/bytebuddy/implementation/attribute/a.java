package net.bytebuddy.implementation.attribute;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.x;

/* compiled from: AnnotationAppender.java */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: AnnotationAppender.java */
    /* renamed from: net.bytebuddy.implementation.attribute.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C12084a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417517a;

        static {
            int[] iArr = new int[RetentionPolicy.values().length];
            f417517a = iArr;
            try {
                iArr[RetentionPolicy.RUNTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417517a[RetentionPolicy.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417517a[RetentionPolicy.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: AnnotationAppender.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final d f417518a;

        public b(d dVar) {
            this.f417518a = dVar;
        }

        public static void c(AbstractC44388a abstractC44388a, TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b String str, Object obj) {
            if (typeDescription.w2()) {
                AbstractC44388a abstractC44388aC = abstractC44388a.c(str);
                int length = Array.getLength(obj);
                TypeDescription typeDescriptionM = typeDescription.m();
                for (int i12 = 0; i12 < length; i12++) {
                    c(abstractC44388aC, typeDescriptionM, null, Array.get(obj, i12));
                }
                abstractC44388aC.d();
                return;
            }
            if (typeDescription.X()) {
                d(abstractC44388a.b(str, typeDescription.getDescriptor()), (AnnotationDescription) obj, AnnotationValueFilter.Default.f417489b);
                return;
            }
            if (typeDescription.I()) {
                abstractC44388a.e(str, typeDescription.getDescriptor(), ((net.bytebuddy.description.enumeration.a) obj).getValue());
            } else if (typeDescription.Q2(Class.class)) {
                abstractC44388a.a(B.v(((TypeDescription) obj).getDescriptor()), str);
            } else {
                abstractC44388a.a(obj, str);
            }
        }

        public static void d(AbstractC44388a abstractC44388a, AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter) {
            for (a.d dVar : annotationDescription.a().q()) {
                if (annotationValueFilter.c(annotationDescription, dVar)) {
                    c(abstractC44388a, dVar.getReturnType().f5(), dVar.getName(), annotationDescription.d(dVar).a());
                }
            }
            abstractC44388a.d();
        }

        @Override // net.bytebuddy.implementation.attribute.a
        public final b a(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter) {
            int i12 = C12084a.f417517a[annotationDescription.g().ordinal()];
            d dVar = this.f417518a;
            if (i12 == 1) {
                AbstractC44388a abstractC44388aB = dVar.b(annotationDescription.a().getDescriptor(), true);
                if (abstractC44388aB != null) {
                    d(abstractC44388aB, annotationDescription, annotationValueFilter);
                }
            } else if (i12 == 2) {
                AbstractC44388a abstractC44388aB2 = dVar.b(annotationDescription.a().getDescriptor(), false);
                if (abstractC44388aB2 != null) {
                    d(abstractC44388aB2, annotationDescription, annotationValueFilter);
                }
            } else if (i12 != 3) {
                throw new IllegalStateException("Unexpected retention policy: " + annotationDescription.g());
            }
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.a
        public final b b(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter, int i12, String str) {
            int i13 = C12084a.f417517a[annotationDescription.g().ordinal()];
            d dVar = this.f417518a;
            if (i13 == 1) {
                AbstractC44388a abstractC44388aA = dVar.a(i12, annotationDescription.a().getDescriptor(), str, true);
                if (abstractC44388aA != null) {
                    d(abstractC44388aA, annotationDescription, annotationValueFilter);
                }
            } else if (i13 == 2) {
                AbstractC44388a abstractC44388aA2 = dVar.a(i12, annotationDescription.a().getDescriptor(), str, false);
                if (abstractC44388aA2 != null) {
                    d(abstractC44388aA2, annotationDescription, annotationValueFilter);
                }
            } else if (i13 != 3) {
                throw new IllegalStateException("Unexpected retention policy: " + annotationDescription.g());
            }
            return this;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417518a.equals(((b) obj).f417518a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417518a.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* compiled from: AnnotationAppender.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements TypeDescription.Generic.Visitor<a> {

        /* renamed from: b, reason: collision with root package name */
        public final a f417519b;

        /* renamed from: c, reason: collision with root package name */
        public final AnnotationValueFilter f417520c;

        /* renamed from: d, reason: collision with root package name */
        public final int f417521d;

        /* renamed from: e, reason: collision with root package name */
        public final String f417522e;

        public c(a aVar, AnnotationValueFilter annotationValueFilter, int i12, String str) {
            this.f417519b = aVar;
            this.f417520c = annotationValueFilter;
            this.f417521d = i12;
            this.f417522e = str;
        }

        public static a g(a aVar, AnnotationValueFilter annotationValueFilter, boolean z12, int i12, d.f fVar) {
            int i13;
            int i14;
            if (z12) {
                i13 = 17;
                i14 = 0;
            } else {
                i13 = 18;
                i14 = 1;
            }
            for (TypeDescription.Generic generic : fVar.subList(i12, fVar.size())) {
                int i15 = i12 << 16;
                int i16 = (i14 << 24) | i15;
                Iterator<AnnotationDescription> it = generic.getDeclaredAnnotations().iterator();
                while (it.hasNext()) {
                    aVar = aVar.b(it.next(), annotationValueFilter, i16, "");
                }
                int i17 = (generic.getUpperBounds().get(0).o().c() || !generic.getUpperBounds().get(0).E()) ? 0 : 1;
                Iterator<TypeDescription.Generic> it2 = generic.getUpperBounds().iterator();
                while (it2.hasNext()) {
                    aVar = (a) it2.next().h0(new c(aVar, annotationValueFilter, (i17 << 8) | (i13 << 24) | i15, ""));
                    i17++;
                }
                i12++;
            }
            return aVar;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object a(TypeDescription.Generic.OfParameterizedType ofParameterizedType) {
            String str = this.f417522e;
            StringBuilder sb2 = new StringBuilder(str);
            int i12 = 0;
            for (int i13 = 0; i13 < ofParameterizedType.f5().G5(); i13++) {
                sb2.append('.');
            }
            a aVarF = f(ofParameterizedType, sb2.toString());
            TypeDescription.Generic ownerType = ofParameterizedType.getOwnerType();
            int i14 = this.f417521d;
            AnnotationValueFilter annotationValueFilter = this.f417520c;
            if (ownerType != null) {
                aVarF = (a) ownerType.h0(new c(aVarF, annotationValueFilter, i14, str));
            }
            Iterator<TypeDescription.Generic> it = ofParameterizedType.J().iterator();
            while (it.hasNext()) {
                aVarF = (a) it.next().h0(new c(aVarF, annotationValueFilter, i14, sb2.toString() + i12 + ';'));
                i12++;
            }
            return aVarF;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final Object b(TypeDescription.Generic.c cVar) {
            TypeDescription.Generic genericM = cVar.m();
            String str = this.f417522e;
            return (a) genericM.h0(new c(f(cVar, str), this.f417520c, this.f417521d, str + '['));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object c(TypeDescription.Generic.f fVar) {
            d.f lowerBounds = fVar.getLowerBounds();
            TypeDescription.Generic genericM2 = lowerBounds.isEmpty() ? fVar.getUpperBounds().M2() : lowerBounds.M2();
            String str = this.f417522e;
            return (a) genericM2.h0(new c(f(fVar, str), this.f417520c, this.f417521d, str + '*'));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object d(TypeDescription.Generic.a aVar) {
            String str = this.f417522e;
            StringBuilder sb2 = new StringBuilder(str);
            for (int i12 = 0; i12 < aVar.f5().G5(); i12++) {
                sb2.append('.');
            }
            a aVarF = f(aVar, sb2.toString());
            TypeDescription.Generic genericM = aVar.m();
            if (genericM == null) {
                return aVarF;
            }
            return (a) genericM.h0(new c(aVarF, this.f417520c, this.f417521d, str + '['));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object e(TypeDescription.Generic.a aVar) {
            return f(aVar, this.f417522e);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f417521d == cVar.f417521d && this.f417522e.equals(cVar.f417522e) && this.f417519b.equals(cVar.f417519b) && this.f417520c.equals(cVar.f417520c);
        }

        public final a f(TypeDescription.Generic.a aVar, String str) {
            Iterator<AnnotationDescription> it = aVar.getDeclaredAnnotations().iterator();
            a aVarB = this.f417519b;
            while (it.hasNext()) {
                aVarB = aVarB.b(it.next(), this.f417520c, this.f417521d, str);
            }
            return aVarB;
        }

        public final int hashCode() {
            return this.f417522e.hashCode() + ((((this.f417520c.hashCode() + ((this.f417519b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31) + this.f417521d) * 31);
        }
    }

    /* compiled from: AnnotationAppender.java */
    public interface d {

        /* compiled from: AnnotationAppender.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.attribute.a$d$a, reason: collision with other inner class name */
        public static class C12085a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final m f417523a;

            public C12085a(m mVar) {
                this.f417523a = mVar;
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(int i12, String str, String str2, boolean z12) {
                return this.f417523a.d(i12, C.a(str2), str, z12);
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, boolean z12) {
                return this.f417523a.a(str, z12);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417523a.equals(((C12085a) obj).f417523a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417523a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        /* compiled from: AnnotationAppender.java */
        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements d {

            /* renamed from: a, reason: collision with root package name */
            public final s f417524a;

            public b(s sVar) {
                this.f417524a = sVar;
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(int i12, String str, String str2, boolean z12) {
                return this.f417524a.H(i12, C.a(str2), str, z12);
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, boolean z12) {
                return this.f417524a.e(str, z12);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417524a.equals(((b) obj).f417524a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417524a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        /* compiled from: AnnotationAppender.java */
        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements d {

            /* renamed from: a, reason: collision with root package name */
            public final s f417525a;

            /* renamed from: b, reason: collision with root package name */
            public final int f417526b;

            public c(int i12, s sVar) {
                this.f417525a = sVar;
                this.f417526b = i12;
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(int i12, String str, String str2, boolean z12) {
                return this.f417525a.H(i12, C.a(str2), str, z12);
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, boolean z12) {
                return this.f417525a.D(this.f417526b, str, z12);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f417526b == cVar.f417526b && this.f417525a.equals(cVar.f417525a);
            }

            public final int hashCode() {
                return ((this.f417525a.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f417526b;
            }
        }

        /* compiled from: AnnotationAppender.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.attribute.a$d$d, reason: collision with other inner class name */
        public static class C12086d implements d {

            /* renamed from: a, reason: collision with root package name */
            public final x f417527a;

            public C12086d(x xVar) {
                this.f417527a = xVar;
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(int i12, String str, String str2, boolean z12) {
                return this.f417527a.d(i12, C.a(str2), str, z12);
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, boolean z12) {
                return this.f417527a.a(str, z12);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417527a.equals(((C12086d) obj).f417527a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417527a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        /* compiled from: AnnotationAppender.java */
        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements d {

            /* renamed from: a, reason: collision with root package name */
            public final f f417528a;

            public e(f fVar) {
                this.f417528a = fVar;
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(int i12, String str, String str2, boolean z12) {
                return this.f417528a.q(i12, C.a(str2), str, z12);
            }

            @Override // net.bytebuddy.implementation.attribute.a.d
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, boolean z12) {
                return this.f417528a.d(str, z12);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417528a.equals(((e) obj).f417528a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417528a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @net.bytebuddy.utility.nullability.b
        AbstractC44388a a(int i12, String str, String str2, boolean z12);

        @net.bytebuddy.utility.nullability.b
        AbstractC44388a b(String str, boolean z12);
    }

    b a(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter);

    b b(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter, int i12, String str);
}
