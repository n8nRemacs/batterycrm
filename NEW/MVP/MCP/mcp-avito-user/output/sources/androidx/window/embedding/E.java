package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitAttributes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: SafeActivityEmbeddingComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
    static {
        new E();
    }

    public E() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @Y61.k
    public final Boolean invoke() throws NoSuchMethodException, SecurityException {
        Class cls = Float.TYPE;
        Constructor declaredConstructor = SplitAttributes.SplitType.RatioSplitType.class.getDeclaredConstructor(cls);
        boolean z12 = false;
        Method method = SplitAttributes.SplitType.RatioSplitType.class.getMethod("getRatio", new Class[0]);
        Method method2 = SplitAttributes.SplitType.RatioSplitType.class.getMethod("splitEqually", new Class[0]);
        Constructor declaredConstructor2 = SplitAttributes.SplitType.HingeSplitType.class.getDeclaredConstructor(SplitAttributes.SplitType.class);
        Method method3 = SplitAttributes.SplitType.HingeSplitType.class.getMethod("getFallbackSplitType", new Class[0]);
        Constructor declaredConstructor3 = SplitAttributes.SplitType.ExpandContainersSplitType.class.getDeclaredConstructor(new Class[0]);
        androidx.window.reflection.b.f55350a.getClass();
        if (androidx.window.reflection.b.b(declaredConstructor) && androidx.window.reflection.b.c(method) && androidx.window.reflection.b.a(method, cls) && androidx.window.reflection.b.b(declaredConstructor2) && androidx.window.reflection.b.c(method2) && androidx.window.reflection.b.a(method2, SplitAttributes.SplitType.RatioSplitType.class) && androidx.window.reflection.b.c(method3) && androidx.window.reflection.b.a(method3, SplitAttributes.SplitType.class) && androidx.window.reflection.b.b(declaredConstructor3)) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
