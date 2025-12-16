package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitInfo;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: SafeActivityEmbeddingComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class B extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
    static {
        new B();
    }

    public B() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @Y61.k
    public final Boolean invoke() throws NoSuchMethodException, SecurityException {
        boolean z12 = false;
        Method method = SplitInfo.class.getMethod("getPrimaryActivityStack", new Class[0]);
        Method method2 = SplitInfo.class.getMethod("getSecondaryActivityStack", new Class[0]);
        Method method3 = SplitInfo.class.getMethod("getSplitRatio", new Class[0]);
        androidx.window.reflection.b.f55350a.getClass();
        if (androidx.window.reflection.b.c(method) && androidx.window.reflection.b.a(method, ActivityStack.class) && androidx.window.reflection.b.c(method2) && androidx.window.reflection.b.a(method2, ActivityStack.class) && androidx.window.reflection.b.c(method3) && androidx.window.reflection.b.a(method3, Float.TYPE)) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
