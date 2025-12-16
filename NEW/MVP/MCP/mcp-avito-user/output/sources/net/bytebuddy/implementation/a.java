package net.bytebuddy.implementation;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.jar.asm.s;

/* compiled from: DefaultMethodCall.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class a implements Implementation {

    /* compiled from: DefaultMethodCall.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.implementation.a$a, reason: collision with other inner class name */
    public static class C12083a implements net.bytebuddy.implementation.bytecode.a {
        public C12083a() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            aVar.e();
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        getClass().hashCode();
        throw null;
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        target.getClass();
        throw null;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
