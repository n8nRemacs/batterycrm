package net.bytebuddy.matcher;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CollectionItemMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44402k<T> extends InterfaceC44410t.a.d<Iterable<? extends T>> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.d f418428b;

    public C44402k(InterfaceC44410t.a.d dVar) {
        this.f418428b = dVar;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        Iterator<T> it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            if (this.f418428b.b(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418428b.equals(((C44402k) obj).f418428b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418428b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "whereOne(" + this.f418428b + ")";
    }
}
