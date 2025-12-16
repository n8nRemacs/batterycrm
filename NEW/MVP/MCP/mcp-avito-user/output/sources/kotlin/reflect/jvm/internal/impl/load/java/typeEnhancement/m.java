package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.types.J0;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes8.dex */
final class m extends N implements Y41.l<J0, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final m f408387l = new m();

    public m() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(J0 j02) {
        InterfaceC42853f interfaceC42853fB = j02.H0().b();
        if (interfaceC42853fB == null) {
            return Boolean.FALSE;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42853fB.getName();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407244g;
        return Boolean.valueOf(L.f(name, cVar.f()) && L.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(interfaceC42853fB), cVar));
    }
}
