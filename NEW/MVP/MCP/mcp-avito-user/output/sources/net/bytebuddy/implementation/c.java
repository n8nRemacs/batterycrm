package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import java.lang.reflect.InvocationHandler;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.jar.asm.s;

/* compiled from: InvocationHandlerAdapter.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public abstract class c implements Implementation.b {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeDescription.Generic f418101b = TypeDescription.Generic.d.b.y0(InvocationHandler.class);

    /* compiled from: InvocationHandlerAdapter.java */
    public interface a extends Implementation.b {
    }

    /* compiled from: InvocationHandlerAdapter.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.implementation.c$c, reason: collision with other inner class name */
    public static class C12106c extends c implements d {

        /* compiled from: InvocationHandlerAdapter.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.c$c$a */
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f418102b;

            public a(TypeDescription typeDescription) {
                this.f418102b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f418102b.equals(aVar.f418102b) && C12106c.this.equals(C12106c.this);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                this.f418102b.x();
                throw null;
            }

            public final int hashCode() {
                return C12106c.this.hashCode() + D8.j(this.f418102b, getClass().hashCode() * 31, 31);
            }
        }

        @Override // net.bytebuddy.implementation.Implementation.b
        public final Implementation.b c(Implementation.b bVar) {
            throw null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            instrumentedType.x();
            throw null;
        }

        @Override // net.bytebuddy.implementation.c
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

        @Override // net.bytebuddy.implementation.c
        public final int hashCode() {
            super.hashCode();
            throw null;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a());
        }
    }

    /* compiled from: InvocationHandlerAdapter.java */
    public interface d extends a {
    }

    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        getClass().hashCode();
        throw null;
    }

    /* compiled from: InvocationHandlerAdapter.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends c implements d {

        /* compiled from: InvocationHandlerAdapter.java */
        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {
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
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }
        }

        @Override // net.bytebuddy.implementation.Implementation.b
        public final Implementation.b c(Implementation.b bVar) {
            throw null;
        }

        @Override // net.bytebuddy.implementation.c
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

        @Override // net.bytebuddy.implementation.c
        public final int hashCode() {
            super.hashCode();
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
}
