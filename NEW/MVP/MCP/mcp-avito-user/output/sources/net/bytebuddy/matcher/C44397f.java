package net.bytebuddy.matcher;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CachingMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44397f<T> extends InterfaceC44410t.a.AbstractC12113a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f418425b = null;

    /* compiled from: CachingMatcher.java */
    @SuppressFBWarnings(justification = "Equality does not consider eviction size.", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
    /* renamed from: net.bytebuddy.matcher.f$a */
    public static class a<S> extends C44397f<S> {
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        throw null;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44397f)) {
            return false;
        }
        ((C44397f) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        C44397f.class.hashCode();
        throw null;
    }

    public final String toString() {
        return "cached(null)";
    }
}
