package net.bytebuddy.description.enumeration;

import net.bytebuddy.build.k;
import net.bytebuddy.description.d;
import net.bytebuddy.description.type.TypeDescription;

/* compiled from: EnumerationDescription.java */
/* loaded from: classes8.dex */
public interface a extends d {

    /* compiled from: EnumerationDescription.java */
    /* renamed from: net.bytebuddy.description.enumeration.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11970a implements a {

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f416138b;

        @Override // net.bytebuddy.description.d
        public final String R() {
            return getValue();
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return w().equals(aVar.w()) && getValue().equals(aVar.getValue());
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416138b != 0 ? 0 : getValue().hashCode() + (w().hashCode() * 31);
            if (iHashCode == 0) {
                return this.f416138b;
            }
            this.f416138b = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            return getValue();
        }
    }

    /* compiled from: EnumerationDescription.java */
    public static class b extends AbstractC11970a {

        /* renamed from: c, reason: collision with root package name */
        public final Enum<?> f416139c;

        public b(Enum<?> r12) {
            this.f416139c = r12;
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final <T extends Enum<T>> T a0(Class<T> cls) {
            T t12 = (T) this.f416139c;
            return t12.getDeclaringClass() == cls ? t12 : (T) Enum.valueOf(cls, t12.name());
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final String getValue() {
            return this.f416139c.name();
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final TypeDescription w() {
            return TypeDescription.d.A0(this.f416139c.getDeclaringClass());
        }
    }

    /* compiled from: EnumerationDescription.java */
    public static class c extends AbstractC11970a {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription f416140c;

        /* renamed from: d, reason: collision with root package name */
        public final String f416141d;

        public c(String str, TypeDescription typeDescription) {
            this.f416140c = typeDescription;
            this.f416141d = str;
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final <T extends Enum<T>> T a0(Class<T> cls) {
            TypeDescription typeDescription = this.f416140c;
            if (typeDescription.Q2(cls)) {
                return (T) Enum.valueOf(cls, this.f416141d);
            }
            throw new IllegalArgumentException(cls + " does not represent " + typeDescription);
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final String getValue() {
            return this.f416141d;
        }

        @Override // net.bytebuddy.description.enumeration.a
        public final TypeDescription w() {
            return this.f416140c;
        }
    }

    <T extends Enum<T>> T a0(Class<T> cls);

    String getValue();

    TypeDescription w();
}
