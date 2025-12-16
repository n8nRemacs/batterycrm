package net.bytebuddy.dynamic;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.NexusAccessor;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.implementation.LoadedTypeInitializer;

/* loaded from: classes8.dex */
public interface TypeResolutionStrategy {

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements TypeResolutionStrategy {

        /* renamed from: b, reason: collision with root package name */
        public final NexusAccessor f416613b = new NexusAccessor();

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.TypeResolutionStrategy$a$a, reason: collision with other inner class name */
        public static class C12008a implements b {

            /* renamed from: b, reason: collision with root package name */
            public final NexusAccessor f416614b;

            /* renamed from: c, reason: collision with root package name */
            public final int f416615c;

            public C12008a(NexusAccessor nexusAccessor, int i12) {
                this.f416614b = nexusAccessor;
                this.f416615c = i12;
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
            public final TypeInitializer b(TypeInitializer typeInitializer) {
                return typeInitializer.d(new NexusAccessor.a(this.f416615c));
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
            public final Map c(a.b.C12043b c12043b, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy) {
                HashMap map = new HashMap(c12043b.J3());
                Map<TypeDescription, Class<?>> mapB = classLoadingStrategy.b(classLoader, c12043b.I0());
                TypeDescription typeDescription = c12043b.f416653b;
                String name = typeDescription.getName();
                ClassLoader classLoader2 = mapB.get(typeDescription).getClassLoader();
                LoadedTypeInitializer loadedTypeInitializer = (LoadedTypeInitializer) map.remove(typeDescription);
                this.f416614b.getClass();
                if (loadedTypeInitializer.c()) {
                    NexusAccessor.f416586a.a(name, classLoader2, this.f416615c, loadedTypeInitializer);
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((LoadedTypeInitializer) entry.getValue()).a(mapB.get(entry.getKey()));
                }
                return mapB;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12008a c12008a = (C12008a) obj;
                return this.f416615c == c12008a.f416615c && this.f416614b.equals(c12008a.f416614b);
            }

            public final int hashCode() {
                return ((this.f416614b.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f416615c;
            }
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        @SuppressFBWarnings(justification = "Avoids thread-contention.", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
        public final b a() {
            return new C12008a(this.f416613b, new Random().nextInt());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416613b.equals(((a) obj).f416613b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416613b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    public interface b {
        TypeInitializer b(TypeInitializer typeInitializer);

        Map c(a.b.C12043b c12043b, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy);
    }

    b a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Disabled implements TypeResolutionStrategy, b {

        /* renamed from: b, reason: collision with root package name */
        public static final Disabled f416608b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Disabled[] f416609c;

        static {
            Disabled disabled = new Disabled("INSTANCE", 0);
            f416608b = disabled;
            f416609c = new Disabled[]{disabled};
        }

        public Disabled() {
            throw null;
        }

        public static Disabled valueOf(String str) {
            return (Disabled) Enum.valueOf(Disabled.class, str);
        }

        public static Disabled[] values() {
            return (Disabled[]) f416609c.clone();
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final Map c(a.b.C12043b c12043b, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy) {
            throw new IllegalStateException("Cannot initialize a dynamic type for a disabled type resolution strategy");
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public final b a() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final TypeInitializer b(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Lazy implements TypeResolutionStrategy, b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Lazy[] f416610b = {new Lazy("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        Lazy EF5;

        public Lazy() {
            throw null;
        }

        public static Lazy valueOf(String str) {
            return (Lazy) Enum.valueOf(Lazy.class, str);
        }

        public static Lazy[] values() {
            return (Lazy[]) f416610b.clone();
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final Map c(a.b.C12043b c12043b, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy) {
            return classLoadingStrategy.b(classLoader, c12043b.I0());
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public final b a() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final TypeInitializer b(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Passive implements TypeResolutionStrategy, b {

        /* renamed from: b, reason: collision with root package name */
        public static final Passive f416611b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Passive[] f416612c;

        static {
            Passive passive = new Passive("INSTANCE", 0);
            f416611b = passive;
            f416612c = new Passive[]{passive};
        }

        public Passive() {
            throw null;
        }

        public static Passive valueOf(String str) {
            return (Passive) Enum.valueOf(Passive.class, str);
        }

        public static Passive[] values() {
            return (Passive[]) f416612c.clone();
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final Map c(a.b.C12043b c12043b, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy) {
            Map<TypeDescription, Class<?>> mapB = classLoadingStrategy.b(classLoader, c12043b.I0());
            for (Map.Entry entry : c12043b.J3().entrySet()) {
                ((LoadedTypeInitializer) entry.getValue()).a(mapB.get(entry.getKey()));
            }
            return new HashMap(mapB);
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public final b a() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.b
        public final TypeInitializer b(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }
}
