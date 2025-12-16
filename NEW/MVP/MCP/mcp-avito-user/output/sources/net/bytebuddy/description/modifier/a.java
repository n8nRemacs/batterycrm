package net.bytebuddy.description.modifier;

import java.util.Collection;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: ModifierContributor.java */
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: ModifierContributor.java */
    /* renamed from: net.bytebuddy.description.modifier.a$a, reason: collision with other inner class name */
    public interface InterfaceC11985a extends a {
    }

    /* compiled from: ModifierContributor.java */
    public interface b extends a {
    }

    /* compiled from: ModifierContributor.java */
    public interface c extends a {
    }

    /* compiled from: ModifierContributor.java */
    public interface d extends a {
    }

    /* compiled from: ModifierContributor.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class e<T extends a> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<? extends T> f416306a;

        public e(Collection<? extends T> collection) {
            this.f416306a = collection;
        }

        public final int a(int i12) {
            for (T t12 : this.f416306a) {
                i12 = (i12 & (~t12.b())) | t12.a();
            }
            return i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416306a.equals(((e) obj).f416306a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416306a.hashCode() + (getClass().hashCode() * 31);
        }
    }

    int a();

    int b();
}
