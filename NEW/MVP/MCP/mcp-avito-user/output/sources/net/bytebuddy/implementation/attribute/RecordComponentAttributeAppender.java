package net.bytebuddy.implementation.attribute;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.implementation.attribute.a;
import net.bytebuddy.jar.asm.x;

/* loaded from: classes7.dex */
public interface RecordComponentAttributeAppender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ForInstrumentedRecordComponent implements RecordComponentAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final ForInstrumentedRecordComponent f417506b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ForInstrumentedRecordComponent[] f417507c;

        static {
            ForInstrumentedRecordComponent forInstrumentedRecordComponent = new ForInstrumentedRecordComponent("INSTANCE", 0);
            f417506b = forInstrumentedRecordComponent;
            f417507c = new ForInstrumentedRecordComponent[]{forInstrumentedRecordComponent};
        }

        public ForInstrumentedRecordComponent() {
            throw null;
        }

        public static ForInstrumentedRecordComponent valueOf(String str) {
            return (ForInstrumentedRecordComponent) Enum.valueOf(ForInstrumentedRecordComponent.class, str);
        }

        public static ForInstrumentedRecordComponent[] values() {
            return (ForInstrumentedRecordComponent[]) f417507c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public final void a(x xVar, net.bytebuddy.description.type.b bVar, AnnotationValueFilter annotationValueFilter) {
            net.bytebuddy.implementation.attribute.a aVarA = (net.bytebuddy.implementation.attribute.a) bVar.getType().h0(new a.c(new a.b(new a.d.C12086d(xVar)), annotationValueFilter, 318767104, ""));
            Iterator<AnnotationDescription> it = bVar.getDeclaredAnnotations().iterator();
            while (it.hasNext()) {
                aVarA = aVarA.a(it.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements RecordComponentAttributeAppender {
        public a() {
            throw null;
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public final void a(x xVar, net.bytebuddy.description.type.b bVar, AnnotationValueFilter annotationValueFilter) {
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
    public static class b implements RecordComponentAttributeAppender, c {
        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public final void a(x xVar, net.bytebuddy.description.type.b bVar, AnnotationValueFilter annotationValueFilter) {
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

    void a(x xVar, net.bytebuddy.description.type.b bVar, AnnotationValueFilter annotationValueFilter);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements RecordComponentAttributeAppender, c {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f417508b = {new NoOp("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoOp EF5;

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f417508b.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public final void a(x xVar, net.bytebuddy.description.type.b bVar, AnnotationValueFilter annotationValueFilter) {
        }
    }
}
