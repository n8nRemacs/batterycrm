package net.bytebuddy.dynamic.scaffold;

import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.b;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.LatentMatcher;

/* loaded from: classes8.dex */
public interface RecordComponentRegistry {

    public interface Compiled extends TypeWriter.RecordComponentPool {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Compiled {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f416953b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f416953b.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public final TypeWriter.RecordComponentPool.a a(b bVar) {
                return new TypeWriter.RecordComponentPool.a.b(bVar);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements RecordComponentRegistry {

        /* renamed from: a, reason: collision with root package name */
        public final List<b> f416954a = Collections.emptyList();

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$a$a, reason: collision with other inner class name */
        public static class C12060a implements Compiled {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f416955b;

            /* renamed from: c, reason: collision with root package name */
            public final ArrayList f416956c;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$a$a$a, reason: collision with other inner class name */
            public static class C12061a implements InterfaceC44410t<net.bytebuddy.description.type.b> {
                public C12061a() {
                    throw null;
                }

                @Override // net.bytebuddy.matcher.InterfaceC44410t
                public final boolean b(@net.bytebuddy.utility.nullability.b net.bytebuddy.description.type.b bVar) {
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

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            public C12060a(TypeDescription typeDescription, ArrayList arrayList) {
                this.f416955b = typeDescription;
                this.f416956c = arrayList;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public final TypeWriter.RecordComponentPool.a a(net.bytebuddy.description.type.b bVar) {
                Iterator it = this.f416956c.iterator();
                if (!it.hasNext()) {
                    return new TypeWriter.RecordComponentPool.a.b(bVar);
                }
                ((C12061a) it.next()).getClass();
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12060a c12060a = (C12060a) obj;
                return this.f416955b.equals(c12060a.f416955b) && this.f416956c.equals(c12060a.f416956c);
            }

            public final int hashCode() {
                return this.f416956c.hashCode() + D8.j(this.f416955b, getClass().hashCode() * 31, 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements LatentMatcher<net.bytebuddy.description.type.b> {
            public b() {
                throw null;
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public final InterfaceC44410t<? super net.bytebuddy.description.type.b> a(TypeDescription typeDescription) {
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

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }
        }

        @Override // net.bytebuddy.dynamic.scaffold.RecordComponentRegistry
        public final C12060a a(TypeDescription typeDescription) {
            List<b> list = this.f416954a;
            ArrayList arrayList = new ArrayList(list.size());
            new HashMap();
            Iterator<b> it = list.iterator();
            if (!it.hasNext()) {
                return new C12060a(typeDescription, arrayList);
            }
            it.next();
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416954a.equals(((a) obj).f416954a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416954a.hashCode() + (getClass().hashCode() * 31);
        }
    }

    a.C12060a a(TypeDescription typeDescription);
}
