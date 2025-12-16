package net.bytebuddy.implementation.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.attribute.a;
import net.bytebuddy.jar.asm.f;
import okhttp3.internal.http2.Settings;

/* loaded from: classes7.dex */
public interface TypeAttributeAppender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ForInstrumentedType implements TypeAttributeAppender {

        /* renamed from: b, reason: collision with root package name */
        public static final ForInstrumentedType f417509b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ForInstrumentedType[] f417510c;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements TypeAttributeAppender {

            /* renamed from: b, reason: collision with root package name */
            public final int f417511b;

            /* renamed from: c, reason: collision with root package name */
            public final int f417512c;

            /* renamed from: d, reason: collision with root package name */
            public final int f417513d;

            public a(TypeDescription typeDescription) {
                int size = typeDescription.getDeclaredAnnotations().size();
                int size2 = typeDescription.r().size();
                int size3 = typeDescription.J0().size();
                this.f417511b = size;
                this.f417512c = size2;
                this.f417513d = size3;
            }

            @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
            public final void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
                net.bytebuddy.implementation.attribute.a bVar = new a.b(new a.d.e(fVar));
                a.c.g(bVar, annotationValueFilter, true, this.f417512c, typeDescription.r());
                d.f fVarJ0 = typeDescription.J0();
                int size = fVarJ0.size();
                int i12 = this.f417513d;
                Iterator<TypeDescription.Generic> it = fVarJ0.subList(i12, size).iterator();
                while (it.hasNext()) {
                    bVar = (net.bytebuddy.implementation.attribute.a) it.next().h0(new a.c(bVar, annotationValueFilter, ((i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 8) | 268435456, ""));
                    i12++;
                }
                net.bytebuddy.description.annotation.a declaredAnnotations = typeDescription.getDeclaredAnnotations();
                Iterator<AnnotationDescription> it2 = declaredAnnotations.subList(this.f417511b, declaredAnnotations.size()).iterator();
                while (it2.hasNext()) {
                    bVar = bVar.a(it2.next(), annotationValueFilter);
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417511b == aVar.f417511b && this.f417512c == aVar.f417512c && this.f417513d == aVar.f417513d;
            }

            public final int hashCode() {
                return (((((getClass().hashCode() * 31) + this.f417511b) * 31) + this.f417512c) * 31) + this.f417513d;
            }
        }

        static {
            ForInstrumentedType forInstrumentedType = new ForInstrumentedType("INSTANCE", 0);
            f417509b = forInstrumentedType;
            f417510c = new ForInstrumentedType[]{forInstrumentedType};
        }

        public ForInstrumentedType() {
            throw null;
        }

        public static ForInstrumentedType valueOf(String str) {
            return (ForInstrumentedType) Enum.valueOf(ForInstrumentedType.class, str);
        }

        public static ForInstrumentedType[] values() {
            return (ForInstrumentedType[]) f417510c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public final void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            int i12 = 0;
            net.bytebuddy.implementation.attribute.a aVarG = a.c.g(new a.b(new a.d.e(fVar)), annotationValueFilter, true, 0, typeDescription.r());
            TypeDescription.Generic genericC3 = typeDescription.C3();
            if (genericC3 != null) {
                aVarG = (net.bytebuddy.implementation.attribute.a) genericC3.h0(new a.c(aVarG, annotationValueFilter, 285212416, ""));
            }
            Iterator<TypeDescription.Generic> it = typeDescription.J0().iterator();
            while (it.hasNext()) {
                aVarG = (net.bytebuddy.implementation.attribute.a) it.next().h0(new a.c(aVarG, annotationValueFilter, ((i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 8) | 268435456, ""));
                i12++;
            }
            Iterator<AnnotationDescription> it2 = typeDescription.getDeclaredAnnotations().iterator();
            while (it2.hasNext()) {
                aVarG = aVarG.a(it2.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements TypeAttributeAppender {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417515b;

        public a() {
            throw null;
        }

        public a(TypeAttributeAppender... typeAttributeAppenderArr) {
            List<TypeAttributeAppender> listAsList = Arrays.asList(typeAttributeAppenderArr);
            this.f417515b = new ArrayList();
            for (TypeAttributeAppender typeAttributeAppender : listAsList) {
                if (typeAttributeAppender instanceof a) {
                    this.f417515b.addAll(((a) typeAttributeAppender).f417515b);
                } else if (!(typeAttributeAppender instanceof NoOp)) {
                    this.f417515b.add(typeAttributeAppender);
                }
            }
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public final void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            Iterator it = this.f417515b.iterator();
            while (it.hasNext()) {
                ((TypeAttributeAppender) it.next()).a(fVar, typeDescription, annotationValueFilter);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417515b.equals(((a) obj).f417515b);
        }

        public final int hashCode() {
            return this.f417515b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements TypeAttributeAppender {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417516b;

        public b(ArrayList arrayList) {
            this.f417516b = arrayList;
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public final void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            a.b bVar = new a.b(new a.d.e(fVar));
            Iterator it = this.f417516b.iterator();
            while (it.hasNext()) {
                bVar.a((AnnotationDescription) it.next(), annotationValueFilter);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417516b.equals(((b) obj).f417516b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417516b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements TypeAttributeAppender {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f417514b = {new NoOp("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoOp EF5;

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f417514b.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public final void a(f fVar, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
        }
    }
}
