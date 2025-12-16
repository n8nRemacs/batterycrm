package net.bytebuddy.matcher;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: CollectionErasureMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44401j<T extends Iterable<? extends TypeDefinition>> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final C44403l f418427b;

    public C44401j(C44403l c44403l) {
        this.f418427b = c44403l;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeDefinition) it.next()).f5());
        }
        return this.f418427b.b(arrayList);
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
            return this.f418427b.equals(((C44401j) obj).f418427b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418427b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "erasures(" + this.f418427b + ')';
    }
}
