package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b f437826a;

    public l(InterfaceC40658b interfaceC40658b) {
        this.f437826a = interfaceC40658b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && L.f(this.f437826a, ((l) obj).f437826a);
    }

    public final int hashCode() {
        return this.f437826a.hashCode();
    }

    public final String toString() {
        return "DataShow(elkData=" + this.f437826a + ")";
    }
}
