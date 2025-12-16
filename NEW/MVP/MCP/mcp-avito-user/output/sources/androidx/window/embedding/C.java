package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitPairRule;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: SafeActivityEmbeddingComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
    static {
        new C();
    }

    public C() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @Y61.k
    public final Boolean invoke() throws NoSuchMethodException, SecurityException {
        boolean z12 = false;
        Method method = SplitPairRule.class.getMethod("getFinishPrimaryWithSecondary", new Class[0]);
        Method method2 = SplitPairRule.class.getMethod("getFinishSecondaryWithPrimary", new Class[0]);
        Method method3 = SplitPairRule.class.getMethod("shouldClearTop", new Class[0]);
        androidx.window.reflection.b.f55350a.getClass();
        if (androidx.window.reflection.b.c(method)) {
            Class cls = Integer.TYPE;
            if (androidx.window.reflection.b.a(method, cls) && androidx.window.reflection.b.c(method2) && androidx.window.reflection.b.a(method2, cls) && androidx.window.reflection.b.c(method3) && androidx.window.reflection.b.a(method3, Boolean.TYPE)) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
