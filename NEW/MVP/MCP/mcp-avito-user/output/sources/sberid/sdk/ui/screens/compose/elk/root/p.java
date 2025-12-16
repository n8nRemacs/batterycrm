package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;

/* loaded from: classes9.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b.k f437830a;

    public p(InterfaceC40658b.k kVar) {
        this.f437830a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f437830a.equals(((p) obj).f437830a);
    }

    public final int hashCode() {
        return this.f437830a.hashCode();
    }

    public final String toString() {
        return "ShowError(elkData=" + this.f437830a + ")";
    }
}
