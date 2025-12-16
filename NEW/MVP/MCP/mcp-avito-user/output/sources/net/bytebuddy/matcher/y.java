package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: FieldTypeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class y<T extends net.bytebuddy.description.field.a> extends InterfaceC44410t.a.d<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        ((net.bytebuddy.description.field.a) obj).getType();
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
        return "ofType(" + ((Object) null) + ")";
    }
}
