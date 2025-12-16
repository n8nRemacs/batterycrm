package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f55326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f55326l = iVar;
    }

    @Override // Y41.a
    public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        i iVar = this.f55326l;
        boolean z12 = false;
        Method method = iVar.f55329c.f55209a.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", new Class[0]);
        Class<?> clsLoadClass = iVar.f55327a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        androidx.window.reflection.b.f55350a.getClass();
        if (androidx.window.reflection.b.c(method) && method.getReturnType().equals(clsLoadClass)) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
