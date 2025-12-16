package net.bytebuddy.implementation.attribute;

import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.method.a;

/* loaded from: classes7.dex */
public interface AnnotationValueFilter {

    public interface b {
        Default a();

        Default b();

        Default d();

        Default e();
    }

    boolean c(AnnotationDescription annotationDescription, a.d dVar);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Default implements AnnotationValueFilter, b {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f417489b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Default[] f417490c;

        /* JADX INFO: Fake field, exist only in values array */
        Default EF2;

        public enum a extends Default {
            @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter
            public final boolean c(AnnotationDescription annotationDescription, a.d dVar) {
                AnnotationValue<?, ?> defaultValue = dVar.getDefaultValue();
                return defaultValue == null || !defaultValue.equals(annotationDescription.d(dVar));
            }
        }

        public enum b extends Default {
            @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter
            public final boolean c(AnnotationDescription annotationDescription, a.d dVar) {
                return true;
            }
        }

        static {
            a aVar = new a("SKIP_DEFAULTS", 0, null);
            b bVar = new b("APPEND_DEFAULTS", 1, null);
            f417489b = bVar;
            f417490c = new Default[]{aVar, bVar};
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
            return (Default[]) f417490c.clone();
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.b
        public final Default a() {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.b
        public final Default b() {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.b
        public final Default d() {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.b
        public final Default e() {
            return this;
        }
    }
}
