package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import Y41.l;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.J0;

/* compiled from: TypeUtils.kt */
/* loaded from: classes8.dex */
final class c extends N implements l<J0, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f410248l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(J0 j02) {
        InterfaceC42853f interfaceC42853fB = j02.H0().b();
        boolean z12 = false;
        if (interfaceC42853fB != null && ((interfaceC42853fB instanceof f0) || (interfaceC42853fB instanceof g0))) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
