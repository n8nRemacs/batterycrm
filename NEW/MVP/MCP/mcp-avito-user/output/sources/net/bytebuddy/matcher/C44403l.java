package net.bytebuddy.matcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CollectionOneToOneMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44403l<T> extends InterfaceC44410t.a.d<Iterable<? extends T>> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f418429b;

    public C44403l(ArrayList arrayList) {
        this.f418429b = arrayList;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        Iterable iterable = (Iterable) obj;
        boolean z12 = iterable instanceof Collection;
        ArrayList arrayList = this.f418429b;
        if (z12 && ((Collection) iterable).size() != arrayList.size()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        for (T t12 : iterable) {
            if (!it.hasNext() || !((InterfaceC44410t) it.next()).b(t12)) {
                return false;
            }
        }
        return true;
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
            return this.f418429b.equals(((C44403l) obj).f418429b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418429b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("containing(");
        Iterator it = this.f418429b.iterator();
        boolean z12 = true;
        while (it.hasNext()) {
            Object next = it.next();
            if (z12) {
                z12 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append(')');
        return sb2.toString();
    }
}
