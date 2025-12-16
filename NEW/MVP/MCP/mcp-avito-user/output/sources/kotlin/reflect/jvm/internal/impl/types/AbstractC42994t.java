package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;

/* compiled from: ClassifierBasedTypeConstructor.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42994t implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f410246a;

    public abstract boolean d(@Y61.k InterfaceC42853f interfaceC42853f);

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0) || obj.hashCode() != hashCode()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (q0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC42853f interfaceC42853fB = b();
        InterfaceC42853f interfaceC42853fB2 = q0Var.b();
        if (interfaceC42853fB2 == null || kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42853fB) || kotlin.reflect.jvm.internal.impl.resolve.j.o(interfaceC42853fB) || kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42853fB2) || kotlin.reflect.jvm.internal.impl.resolve.j.o(interfaceC42853fB2)) {
            return false;
        }
        return d(interfaceC42853fB2);
    }

    public final int hashCode() {
        int i12 = this.f410246a;
        if (i12 != 0) {
            return i12;
        }
        InterfaceC42853f interfaceC42853fB = b();
        int iIdentityHashCode = (kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42853fB) || kotlin.reflect.jvm.internal.impl.resolve.j.o(interfaceC42853fB)) ? System.identityHashCode(this) : kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42853fB).f409248a.hashCode();
        this.f410246a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
