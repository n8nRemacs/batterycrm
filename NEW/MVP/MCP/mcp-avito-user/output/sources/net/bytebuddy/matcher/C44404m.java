package net.bytebuddy.matcher;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CollectionSizeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44404m<T extends Iterable<?>> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f418430b;

    public C44404m(int i12) {
        this.f418430b = i12;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    @SuppressFBWarnings(justification = "Iteration required to count size of an iterable.", value = {"DLS_DEAD_LOCAL_STORE"})
    public final boolean c(Object obj) {
        Iterable iterable = (Iterable) obj;
        boolean z12 = iterable instanceof Collection;
        int i12 = this.f418430b;
        if (!z12) {
            Iterator it = iterable.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                it.next();
                i13++;
            }
            if (i13 == i12) {
                return true;
            }
        } else if (((Collection) iterable).size() == i12) {
            return true;
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
            return this.f418430b == ((C44404m) obj).f418430b;
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f418430b;
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("ofSize("), this.f418430b, ')');
    }
}
