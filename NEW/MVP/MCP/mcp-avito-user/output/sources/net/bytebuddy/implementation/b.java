package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.Throw;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.s;

/* compiled from: ExceptionMethod.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b implements Implementation, net.bytebuddy.implementation.bytecode.a {

    /* compiled from: ExceptionMethod.java */
    public interface a {

        /* compiled from: ExceptionMethod.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.b$a$a, reason: collision with other inner class name */
        public static class C12090a implements a {
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
        }

        /* compiled from: ExceptionMethod.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.b$a$b, reason: collision with other inner class name */
        public static class C12091b implements a {
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
                D8.h(null, D8.j(null, getClass().hashCode() * 31, 31), 31);
                throw null;
            }
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

    @Override // net.bytebuddy.implementation.bytecode.a
    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
        return new a.c(new StackManipulation.b(new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(null), Duplication.f417792d, new net.bytebuddy.implementation.bytecode.constant.c(null), MethodInvocation.b(null)), Throw.f417844b).n(sVar, context).f417834b, aVar.p());
    }

    public final int hashCode() {
        getClass().hashCode();
        throw null;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return this;
    }
}
