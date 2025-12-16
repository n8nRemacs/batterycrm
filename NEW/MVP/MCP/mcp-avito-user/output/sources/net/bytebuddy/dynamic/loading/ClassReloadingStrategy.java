package net.bytebuddy.dynamic.loading;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.util.HashMap;
import java.util.Map;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class ClassReloadingStrategy implements ClassLoadingStrategy<ClassLoader> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f416782b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f416783c;

    public interface BootstrapInjection {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Disabled implements BootstrapInjection {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Disabled[] f416784b = {new Disabled("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Disabled EF5;

            public Disabled() {
                throw null;
            }

            public static Disabled valueOf(String str) {
                return (Disabled) Enum.valueOf(Disabled.class, str);
            }

            public static Disabled[] values() {
                return (Disabled[]) f416784b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements BootstrapInjection {
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Strategy {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f416785b = {new a("REDEFINITION", 0, true, null), new b("RETRANSFORMATION", 1, false, null)};

        /* JADX INFO: Fake field, exist only in values array */
        Strategy EF7;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ClassResettingTransformer implements ClassFileTransformer {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ClassResettingTransformer[] f416786b = {new ClassResettingTransformer("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ClassResettingTransformer EF5;

            public ClassResettingTransformer() {
                throw null;
            }

            public static ClassResettingTransformer valueOf(String str) {
                return (ClassResettingTransformer) Enum.valueOf(ClassResettingTransformer.class, str);
            }

            public static ClassResettingTransformer[] values() {
                return (ClassResettingTransformer[]) f416786b.clone();
            }
        }

        public enum a extends Strategy {
        }

        public enum b extends Strategy {
        }

        public static class c implements ClassFileTransformer {
            public c() {
                throw null;
            }
        }

        public Strategy() {
            throw null;
        }

        public Strategy(String str, int i12, boolean z12, a aVar) {
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f416785b.clone();
        }
    }

    @JavaDispatcher.i("java.lang.instrument.Instrumentation")
    public interface b {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.f416783c = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.f416783c = r0
        L19:
            java.lang.Class<net.bytebuddy.dynamic.loading.ClassReloadingStrategy$b> r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.b.class
            net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
            boolean r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.f416783c
            if (r1 == 0) goto L28
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto L2c
        L28:
            java.lang.Object r0 = r0.run()
        L2c:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$b r0 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.b) r0
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.f416782b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassReloadingStrategy.<clinit>():void");
    }

    @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
    public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
        Instrumentation instrumentation = null;
        new HashMap((Map) null);
        instrumentation.getInitiatedClasses(classLoader);
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
