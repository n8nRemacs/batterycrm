package androidx.window.layout;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f55325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(0);
        this.f55325l = iVar;
    }

    @Override // Y41.a
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> clsLoadClass = this.f55325l.f55327a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        androidx.window.reflection.b.f55350a.getClass();
        return Boolean.valueOf(androidx.window.reflection.b.c(method) && androidx.window.reflection.b.c(method2));
    }
}
