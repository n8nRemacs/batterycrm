package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* loaded from: classes8.dex */
class d implements InterfaceC42970f.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f409608a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC42848a f409609b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC42848a f409610c;

    public d(InterfaceC42848a interfaceC42848a, InterfaceC42848a interfaceC42848a2, boolean z12) {
        this.f409608a = z12;
        this.f409609b = interfaceC42848a;
        this.f409610c = interfaceC42848a2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f.a
    public final boolean a(q0 q0Var, q0 q0Var2) {
        h hVar = h.f409624a;
        if (q0Var.equals(q0Var2)) {
            return true;
        }
        InterfaceC42853f interfaceC42853fB = q0Var.b();
        InterfaceC42853f interfaceC42853fB2 = q0Var2.b();
        if (!(interfaceC42853fB instanceof g0) || !(interfaceC42853fB2 instanceof g0)) {
            return false;
        }
        f fVar = new f(this.f409609b, this.f409610c);
        return h.f409624a.b((g0) interfaceC42853fB, (g0) interfaceC42853fB2, this.f409608a, fVar);
    }
}
