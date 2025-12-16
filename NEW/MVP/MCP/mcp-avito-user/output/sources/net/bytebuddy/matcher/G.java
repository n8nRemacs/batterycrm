package net.bytebuddy.matcher;

import java.util.HashSet;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.MethodSortMatcher;

/* compiled from: MethodOverrideMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class G<T extends net.bytebuddy.description.method.a> extends InterfaceC44410t.a.d<T> {
    public static void e(net.bytebuddy.description.method.a aVar, TypeDefinition typeDefinition) {
        Iterator<T> it = typeDefinition.q().P1(MethodSortMatcher.Sort.f418389g.f418392c).iterator();
        while (it.hasNext()) {
            if (((net.bytebuddy.description.method.a) it.next()).e().equals(aVar.e())) {
                typeDefinition.P0();
                throw null;
            }
        }
    }

    public static boolean f(net.bytebuddy.description.method.a aVar, d.f fVar, HashSet hashSet) {
        for (TypeDescription.Generic generic : fVar) {
            if (hashSet.add(generic.f5())) {
                e(aVar, generic);
                if (f(aVar, generic.J0(), hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        net.bytebuddy.description.method.a aVar = (net.bytebuddy.description.method.a) obj;
        HashSet hashSet = new HashSet();
        for (TypeDefinition typeDefinition : aVar.n()) {
            e(aVar, typeDefinition);
            if (f(aVar, typeDefinition.J0(), hashSet)) {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        super.hashCode();
        throw null;
    }

    public final String toString() {
        return "isOverriddenFrom(null)";
    }
}
