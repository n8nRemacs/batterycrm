package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes8.dex */
final class x extends N implements Y41.l<O, InterfaceC42851d> {

    /* renamed from: l, reason: collision with root package name */
    public static final x f408237l = new x();

    public x() {
        super(1);
    }

    @Override // Y41.l
    public final InterfaceC42851d invoke(O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fB;
        }
        return null;
    }
}
