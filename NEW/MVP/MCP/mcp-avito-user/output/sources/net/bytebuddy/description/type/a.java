package net.bytebuddy.description.type;

import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.d;

/* compiled from: PackageDescription.java */
/* loaded from: classes8.dex */
public interface a extends d.InterfaceC11969d, AnnotationSource {

    /* compiled from: PackageDescription.java */
    /* renamed from: net.bytebuddy.description.type.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11998a implements a {
        @Override // net.bytebuddy.description.d
        public final String R() {
            return getName();
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            return this == obj || ((obj instanceof a) && getName().equals(((a) obj).getName()));
        }

        public final int hashCode() {
            return getName().hashCode();
        }

        public final String toString() {
            return "package " + getName();
        }
    }

    /* compiled from: PackageDescription.java */
    public static class b extends AbstractC11998a {

        /* renamed from: b, reason: collision with root package name */
        public final Package f416512b;

        public b(Package r12) {
            this.f416512b = r12;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.d(this.f416512b.getDeclaredAnnotations());
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416512b.getName();
        }
    }

    /* compiled from: PackageDescription.java */
    public static class c extends AbstractC11998a {

        /* renamed from: b, reason: collision with root package name */
        public final String f416513b;

        public c(String str) {
            this.f416513b = str;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.b();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416513b;
        }
    }
}
