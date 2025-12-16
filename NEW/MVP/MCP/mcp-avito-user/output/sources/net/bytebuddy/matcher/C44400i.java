package net.bytebuddy.matcher;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CollectionElementMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44400i<T> extends InterfaceC44410t.a.d<Iterable<? extends T>> {

    /* renamed from: b, reason: collision with root package name */
    public final C44413w f418426b;

    public C44400i(C44413w c44413w) {
        this.f418426b = c44413w;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        Iterator<T> it = ((Iterable) obj).iterator();
        return it.hasNext() && this.f418426b.b(it.next());
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f418426b.equals(((C44400i) obj).f418426b);
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418426b.hashCode() + (super.hashCode() * 961);
    }

    public final String toString() {
        return "with(0 matches " + this.f418426b + ")";
    }
}
