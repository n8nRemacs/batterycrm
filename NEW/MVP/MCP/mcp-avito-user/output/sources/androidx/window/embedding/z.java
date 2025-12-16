package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityRule;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: SafeActivityEmbeddingComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class z extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
    static {
        new z();
    }

    public z() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @Y61.k
    public final Boolean invoke() throws NoSuchMethodException, SecurityException {
        boolean z12 = false;
        Method method = ActivityRule.class.getMethod("shouldAlwaysExpand", new Class[0]);
        Class cls = Boolean.TYPE;
        Method method2 = ActivityRule.Builder.class.getMethod("setShouldAlwaysExpand", cls);
        androidx.window.reflection.b.f55350a.getClass();
        if (androidx.window.reflection.b.c(method) && androidx.window.reflection.b.a(method, cls) && androidx.window.reflection.b.c(method2)) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
