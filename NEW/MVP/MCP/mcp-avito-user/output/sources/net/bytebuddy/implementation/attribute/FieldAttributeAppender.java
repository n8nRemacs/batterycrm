package net.bytebuddy.implementation.attribute;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.implementation.attribute.a;
import net.bytebuddy.jar.asm.m;

/* loaded from: classes7.dex */
public interface FieldAttributeAppender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ForInstrumentedField implements FieldAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final ForInstrumentedField f417491b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ForInstrumentedField[] f417492c;

        static {
            ForInstrumentedField forInstrumentedField = new ForInstrumentedField("INSTANCE", 0);
            f417491b = forInstrumentedField;
            f417492c = new ForInstrumentedField[]{forInstrumentedField};
        }

        public ForInstrumentedField() {
            throw null;
        }

        public static ForInstrumentedField valueOf(String str) {
            return (ForInstrumentedField) Enum.valueOf(ForInstrumentedField.class, str);
        }

        public static ForInstrumentedField[] values() {
            return (ForInstrumentedField[]) f417492c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public final void a(m mVar, net.bytebuddy.description.field.a aVar, AnnotationValueFilter annotationValueFilter) {
            net.bytebuddy.implementation.attribute.a aVarA = (net.bytebuddy.implementation.attribute.a) aVar.getType().h0(new a.c(new a.b(new a.d.C12085a(mVar)), annotationValueFilter, 318767104, ""));
            Iterator<AnnotationDescription> it = aVar.getDeclaredAnnotations().iterator();
            while (it.hasNext()) {
                aVarA = aVarA.a(it.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements FieldAttributeAppender {
        public a() {
            throw null;
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public final void a(m mVar, net.bytebuddy.description.field.a aVar, AnnotationValueFilter annotationValueFilter) {
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
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements FieldAttributeAppender, c {
        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public final void a(m mVar, net.bytebuddy.description.field.a aVar, AnnotationValueFilter annotationValueFilter) {
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
    }

    public interface c {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements c {
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
        }
    }

    void a(m mVar, net.bytebuddy.description.field.a aVar, AnnotationValueFilter annotationValueFilter);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements FieldAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f417493b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f417494c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f417493b = noOp;
            f417494c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f417494c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public final void a(m mVar, net.bytebuddy.description.field.a aVar, AnnotationValueFilter annotationValueFilter) {
        }
    }
}
