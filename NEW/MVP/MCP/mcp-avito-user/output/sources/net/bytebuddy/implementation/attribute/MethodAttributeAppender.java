package net.bytebuddy.implementation.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.attribute.a;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44394c;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.M;

/* loaded from: classes7.dex */
public interface MethodAttributeAppender {

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements MethodAttributeAppender {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417504b = new ArrayList();

        public b(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MethodAttributeAppender methodAttributeAppender = (MethodAttributeAppender) it.next();
                if (methodAttributeAppender instanceof b) {
                    this.f417504b.addAll(((b) methodAttributeAppender).f417504b);
                } else if (!(methodAttributeAppender instanceof NoOp)) {
                    this.f417504b.add(methodAttributeAppender);
                }
            }
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public final void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter) {
            Iterator it = this.f417504b.iterator();
            while (it.hasNext()) {
                ((MethodAttributeAppender) it.next()).c(sVar, aVar, annotationValueFilter);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417504b.equals(((b) obj).f417504b);
        }

        public final int hashCode() {
            return this.f417504b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    public interface c {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements c {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f417505b;

            public a(c... cVarArr) {
                this((List<? extends c>) Arrays.asList(cVarArr));
            }

            @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.c
            public final MethodAttributeAppender a(TypeDescription typeDescription) {
                ArrayList arrayList = this.f417505b;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((c) it.next()).a(typeDescription));
                }
                return new b(arrayList2);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f417505b.equals(((a) obj).f417505b);
            }

            public final int hashCode() {
                return this.f417505b.hashCode() + (getClass().hashCode() * 31);
            }

            public a(List<? extends c> list) {
                this.f417505b = new ArrayList();
                for (c cVar : list) {
                    if (cVar instanceof a) {
                        this.f417505b.addAll(((a) cVar).f417505b);
                    } else if (!(cVar instanceof NoOp)) {
                        this.f417505b.add(cVar);
                    }
                }
            }
        }

        MethodAttributeAppender a(TypeDescription typeDescription);
    }

    void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter);

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements MethodAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public final Target f417495b;

        /* renamed from: c, reason: collision with root package name */
        public final net.bytebuddy.description.annotation.a f417496c;

        public interface Target {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class OnMethod implements Target {

                /* renamed from: b, reason: collision with root package name */
                public static final OnMethod f417497b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ OnMethod[] f417498c;

                static {
                    OnMethod onMethod = new OnMethod("INSTANCE", 0);
                    f417497b = onMethod;
                    f417498c = new OnMethod[]{onMethod};
                }

                public OnMethod() {
                    throw null;
                }

                public static OnMethod valueOf(String str) {
                    return (OnMethod) Enum.valueOf(OnMethod.class, str);
                }

                public static OnMethod[] values() {
                    return (OnMethod[]) f417498c.clone();
                }

                @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public final a.d a(s sVar, net.bytebuddy.description.method.a aVar) {
                    return new a.d.b(sVar);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Target {

                /* renamed from: b, reason: collision with root package name */
                public final int f417499b;

                public a(int i12) {
                    this.f417499b = i12;
                }

                @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public final a.d a(s sVar, net.bytebuddy.description.method.a aVar) {
                    int size = aVar.getParameters().size();
                    int i12 = this.f417499b;
                    if (i12 < size) {
                        return new a.d.c(i12, sVar);
                    }
                    throw new IllegalArgumentException("Method " + aVar + " has less then " + i12 + " parameters");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417499b == ((a) obj).f417499b;
                    }
                    return false;
                }

                public final int hashCode() {
                    return (getClass().hashCode() * 31) + this.f417499b;
                }
            }

            a.d a(s sVar, net.bytebuddy.description.method.a aVar);
        }

        public Explicit() {
            throw null;
        }

        public Explicit(Target target, net.bytebuddy.description.annotation.a aVar) {
            this.f417495b = target;
            this.f417496c = aVar;
        }

        public static c.a b(net.bytebuddy.description.method.a aVar) {
            Explicit explicit = new Explicit(Target.OnMethod.f417497b, aVar.getDeclaredAnnotations());
            net.bytebuddy.description.method.d<?> parameters = aVar.getParameters();
            ArrayList arrayList = new ArrayList(parameters.size());
            Iterator<?> it = parameters.iterator();
            while (it.hasNext()) {
                net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                arrayList.add(new Explicit(new Target.a(cVar.getIndex()), cVar.getDeclaredAnnotations()));
            }
            return new c.a(explicit, new c.a(arrayList));
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public final void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter) {
            a.b bVar = new a.b(this.f417495b.a(sVar, aVar));
            Iterator<AnnotationDescription> it = this.f417496c.iterator();
            while (it.hasNext()) {
                bVar.a(it.next(), annotationValueFilter);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Explicit explicit = (Explicit) obj;
            return this.f417495b.equals(explicit.f417495b) && this.f417496c.equals(explicit.f417496c);
        }

        public final int hashCode() {
            return this.f417496c.hashCode() + ((this.f417495b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.c
        public final MethodAttributeAppender a(TypeDescription typeDescription) {
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ForInstrumentedMethod implements MethodAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final ForInstrumentedMethod f417500b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ForInstrumentedMethod[] f417501c;

        /* JADX INFO: Fake field, exist only in values array */
        ForInstrumentedMethod EF2;

        public enum b extends ForInstrumentedMethod {
            @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod
            public final net.bytebuddy.implementation.attribute.a b(net.bytebuddy.implementation.attribute.a aVar, AnnotationValueFilter annotationValueFilter, net.bytebuddy.description.method.a aVar2) {
                TypeDescription.Generic genericL = aVar2.l();
                return genericL == null ? aVar : (net.bytebuddy.implementation.attribute.a) genericL.h0(new a.c(aVar, annotationValueFilter, 352321536, ""));
            }
        }

        static {
            a aVar = new a("EXCLUDING_RECEIVER", 0, null);
            b bVar = new b("INCLUDING_RECEIVER", 1, null);
            f417500b = bVar;
            f417501c = new ForInstrumentedMethod[]{aVar, bVar};
        }

        public ForInstrumentedMethod() {
            throw null;
        }

        public ForInstrumentedMethod(String str, int i12, a aVar) {
        }

        public static ForInstrumentedMethod valueOf(String str) {
            return (ForInstrumentedMethod) Enum.valueOf(ForInstrumentedMethod.class, str);
        }

        public static ForInstrumentedMethod[] values() {
            return (ForInstrumentedMethod[]) f417501c.clone();
        }

        public abstract net.bytebuddy.implementation.attribute.a b(net.bytebuddy.implementation.attribute.a aVar, AnnotationValueFilter annotationValueFilter, net.bytebuddy.description.method.a aVar2);

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public final void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter) {
            int i12 = 0;
            net.bytebuddy.implementation.attribute.a aVarG = a.c.g((net.bytebuddy.implementation.attribute.a) aVar.getReturnType().h0(new a.c(new a.b(new a.d.b(sVar)), annotationValueFilter, 335544320, "")), annotationValueFilter, false, 0, aVar.r());
            Iterator<AnnotationDescription> it = aVar.getDeclaredAnnotations().P1(new M(new C44394c(C44411u.w("jdk.internal.")))).iterator();
            while (it.hasNext()) {
                aVarG = aVarG.a(it.next(), annotationValueFilter);
            }
            Iterator<?> it2 = aVar.getParameters().iterator();
            while (it2.hasNext()) {
                net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it2.next();
                net.bytebuddy.implementation.attribute.a aVarA = (net.bytebuddy.implementation.attribute.a) cVar.getType().h0(new a.c(new a.b(new a.d.c(cVar.getIndex(), sVar)), annotationValueFilter, (cVar.getIndex() << 16) | 369098752, ""));
                Iterator<AnnotationDescription> it3 = cVar.getDeclaredAnnotations().iterator();
                while (it3.hasNext()) {
                    aVarA = aVarA.a(it3.next(), annotationValueFilter);
                }
            }
            net.bytebuddy.implementation.attribute.a aVarB = b(aVarG, annotationValueFilter, aVar);
            Iterator<TypeDescription.Generic> it4 = aVar.N().iterator();
            while (it4.hasNext()) {
                aVarB = (net.bytebuddy.implementation.attribute.a) it4.next().h0(new a.c(aVarB, annotationValueFilter, (i12 << 8) | 385875968, ""));
                i12++;
            }
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.c
        public final MethodAttributeAppender a(TypeDescription typeDescription) {
            return this;
        }

        public enum a extends ForInstrumentedMethod {
            @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod
            public final net.bytebuddy.implementation.attribute.a b(net.bytebuddy.implementation.attribute.a aVar, AnnotationValueFilter annotationValueFilter, net.bytebuddy.description.method.a aVar2) {
                return aVar;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements MethodAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f417502b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f417503c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f417502b = noOp;
            f417503c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f417503c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.c
        public final MethodAttributeAppender a(TypeDescription typeDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public final void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter) {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements MethodAttributeAppender, c {
        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public final void c(s sVar, net.bytebuddy.description.method.a aVar, AnnotationValueFilter annotationValueFilter) {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.c
        public final MethodAttributeAppender a(TypeDescription typeDescription) {
            return this;
        }
    }
}
