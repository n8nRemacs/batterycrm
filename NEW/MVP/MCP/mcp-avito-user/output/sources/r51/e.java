package r51;

import Y61.l;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes8.dex */
public class e implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42851d f429619a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42851d f429620b;

    public e(@Y61.k InterfaceC42851d interfaceC42851d) {
        this.f429619a = interfaceC42851d;
        this.f429620b = interfaceC42851d;
    }

    public final boolean equals(@l Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        return L.f(this.f429619a, eVar != null ? eVar.f429619a : null);
    }

    @Override // r51.h
    public final O getType() {
        return this.f429619a.q();
    }

    public final int hashCode() {
        return this.f429619a.hashCode();
    }

    @Override // r51.j
    @Y61.k
    public final InterfaceC42851d k() {
        return this.f429619a;
    }

    @Y61.k
    public final String toString() {
        return "Class{" + this.f429619a.q() + '}';
    }
}
