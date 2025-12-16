package net.bytebuddy.matcher;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: HasSuperClassMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class A<T extends TypeDescription> extends InterfaceC44410t.a.d<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        TypeDescription typeDescription = (TypeDescription) obj;
        if (typeDescription.E()) {
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            throw null;
        }
        Iterator<TypeDefinition> it = typeDescription.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().P0();
        throw null;
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
        return "hasSuperClass(null)";
    }
}
