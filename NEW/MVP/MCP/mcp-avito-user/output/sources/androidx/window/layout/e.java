package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f55323l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(0);
        this.f55323l = iVar;
    }

    @Override // Y41.a
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> clsLoadClass = this.f55323l.f55327a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        boolean z12 = false;
        Method method = clsLoadClass.getMethod("getBounds", new Class[0]);
        Method method2 = clsLoadClass.getMethod("getType", new Class[0]);
        Method method3 = clsLoadClass.getMethod("getState", new Class[0]);
        androidx.window.reflection.b bVar = androidx.window.reflection.b.f55350a;
        n0 n0Var = m0.f406844a;
        kotlin.reflect.d dVarB = n0Var.b(Rect.class);
        bVar.getClass();
        if (androidx.window.reflection.b.a(method, ((InterfaceC42819t) dVarB).f()) && Modifier.isPublic(method.getModifiers())) {
            Class cls = Integer.TYPE;
            if (androidx.window.reflection.b.a(method2, ((InterfaceC42819t) n0Var.b(cls)).f()) && Modifier.isPublic(method2.getModifiers()) && androidx.window.reflection.b.a(method3, ((InterfaceC42819t) n0Var.b(cls)).f()) && Modifier.isPublic(method3.getModifiers())) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
