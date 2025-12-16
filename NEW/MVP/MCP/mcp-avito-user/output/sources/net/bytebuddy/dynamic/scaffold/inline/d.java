package net.bytebuddy.dynamic.scaffold.inline;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: MethodNameTransformer.java */
/* loaded from: classes8.dex */
public interface d {

    /* compiled from: MethodNameTransformer.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f417154a = "original";

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417154a.equals(((a) obj).f417154a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417154a.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* compiled from: MethodNameTransformer.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f417155a;

        public b(String str) {
            this.f417155a = str;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417155a.equals(((b) obj).f417155a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417155a.hashCode() + (getClass().hashCode() * 31);
        }
    }
}
