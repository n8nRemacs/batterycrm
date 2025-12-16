package net.bytebuddy.dynamic.scaffold;

import com.yandex.div2.D8;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes8.dex */
public interface TypeInitializer extends net.bytebuddy.implementation.bytecode.a {

    public interface a {

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.TypeInitializer$a$a, reason: collision with other inner class name */
        public static class C12062a implements a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f416959b;

            /* renamed from: c, reason: collision with root package name */
            public final MethodRegistry.a f416960c;

            /* renamed from: d, reason: collision with root package name */
            public final AnnotationValueFilter.b f416961d;

            public C12062a(TypeDescription typeDescription, MethodRegistry.a aVar, AnnotationValueFilter.b bVar) {
                this.f416959b = typeDescription;
                this.f416960c = aVar;
                this.f416961d = bVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.a
            public final void b(f fVar, TypeInitializer typeInitializer, Implementation.Context.a.AbstractC12078a abstractC12078a) {
                typeInitializer.k(this.f416960c.a(new a.f.C11977a(this.f416959b))).g(fVar, abstractC12078a, this.f416961d);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12062a c12062a = (C12062a) obj;
                return this.f416959b.equals(c12062a.f416959b) && this.f416960c.equals(c12062a.f416960c) && this.f416961d.equals(c12062a.f416961d);
            }

            public final int hashCode() {
                return this.f416961d.hashCode() + ((this.f416960c.hashCode() + D8.j(this.f416959b, getClass().hashCode() * 31, 31)) * 31);
            }
        }

        void b(f fVar, TypeInitializer typeInitializer, Implementation.Context.a.AbstractC12078a abstractC12078a);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements TypeInitializer {

        /* renamed from: b, reason: collision with root package name */
        public final net.bytebuddy.implementation.bytecode.a f416962b;

        public b(net.bytebuddy.implementation.bytecode.a aVar) {
            this.f416962b = aVar;
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final boolean a() {
            return true;
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final b d(net.bytebuddy.implementation.bytecode.a aVar) {
            return new b(new a.C12102a(this.f416962b, aVar));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416962b.equals(((b) obj).f416962b);
            }
            return false;
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            return this.f416962b.h(sVar, context, aVar);
        }

        public final int hashCode() {
            return this.f416962b.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final TypeWriter.MethodPool.Record k(TypeWriter.MethodPool.Record record) {
            return record.b(this.f416962b);
        }
    }

    boolean a();

    b d(net.bytebuddy.implementation.bytecode.a aVar);

    TypeWriter.MethodPool.Record k(TypeWriter.MethodPool.Record record);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class None implements TypeInitializer {

        /* renamed from: b, reason: collision with root package name */
        public static final None f416957b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ None[] f416958c;

        static {
            None none = new None("INSTANCE", 0);
            f416957b = none;
            f416958c = new None[]{none};
        }

        public None() {
            throw null;
        }

        public static None valueOf(String str) {
            return (None) Enum.valueOf(None.class, str);
        }

        public static None[] values() {
            return (None[]) f416958c.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final boolean a() {
            return false;
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final b d(net.bytebuddy.implementation.bytecode.a aVar) {
            return new b(aVar);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            return a.c.f417848c;
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public final TypeWriter.MethodPool.Record k(TypeWriter.MethodPool.Record record) {
            return record;
        }
    }
}
