package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f55324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(0);
        this.f55324l = iVar;
    }

    @Override // Y41.a
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> clsLoadClass;
        i iVar = this.f55324l;
        try {
            clsLoadClass = iVar.f55328b.f55184a.loadClass("java.util.function.Consumer");
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            return Boolean.FALSE;
        }
        Class<?> clsLoadClass2 = iVar.f55327a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        Method method = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass);
        Method method2 = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsLoadClass);
        androidx.window.reflection.b.f55350a.getClass();
        return Boolean.valueOf(androidx.window.reflection.b.c(method) && androidx.window.reflection.b.c(method2));
    }
}
