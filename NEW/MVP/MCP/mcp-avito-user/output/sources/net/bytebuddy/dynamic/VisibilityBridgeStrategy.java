package net.bytebuddy.dynamic;

/* loaded from: classes8.dex */
public interface VisibilityBridgeStrategy {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Default implements VisibilityBridgeStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f416616b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Default[] f416617c;

        public enum a extends Default {
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return true;
            }
        }

        public enum b extends Default {
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return !aVar.Q();
            }
        }

        public enum c extends Default {
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return false;
            }
        }

        static {
            a aVar = new a("ALWAYS", 0, null);
            f416616b = aVar;
            f416617c = new Default[]{aVar, new b("ON_NON_GENERIC_METHOD", 1, null), new c("NEVER", 2, null)};
        }

        public Default() {
            throw null;
        }

        public Default(String str, int i12, a aVar) {
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) f416617c.clone();
        }
    }

    boolean a(net.bytebuddy.description.method.a aVar);
}
