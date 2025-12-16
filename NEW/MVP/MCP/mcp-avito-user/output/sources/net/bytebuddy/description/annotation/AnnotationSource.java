package net.bytebuddy.description.annotation;

import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.a;

/* loaded from: classes8.dex */
public interface AnnotationSource {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Empty implements AnnotationSource {

        /* renamed from: b, reason: collision with root package name */
        public static final Empty f416052b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Empty[] f416053c;

        static {
            Empty empty = new Empty("INSTANCE", 0);
            f416052b = empty;
            f416053c = new Empty[]{empty};
        }

        public Empty() {
            throw null;
        }

        public static Empty valueOf(String str) {
            return (Empty) Enum.valueOf(Empty.class, str);
        }

        public static Empty[] values() {
            return (Empty[]) f416053c.clone();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.b();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements AnnotationSource {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416054b;

        public a(List<? extends AnnotationDescription> list) {
            this.f416054b = list;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416054b.equals(((a) obj).f416054b);
            }
            return false;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416054b);
        }

        public final int hashCode() {
            return this.f416054b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    net.bytebuddy.description.annotation.a getDeclaredAnnotations();
}
