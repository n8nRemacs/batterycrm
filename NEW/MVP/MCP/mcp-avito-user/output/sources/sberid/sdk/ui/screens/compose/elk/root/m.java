package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b f437827a;

    public m(InterfaceC40658b interfaceC40658b) {
        this.f437827a = interfaceC40658b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f437827a, ((m) obj).f437827a);
    }

    public final int hashCode() {
        return this.f437827a.hashCode();
    }

    public final String toString() {
        return "FirstShow(elkData=" + this.f437827a + ")";
    }
}
