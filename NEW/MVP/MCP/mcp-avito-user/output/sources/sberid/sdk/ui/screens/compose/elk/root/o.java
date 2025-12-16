package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;

/* loaded from: classes9.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b.k f437829a;

    public o(InterfaceC40658b.k kVar) {
        this.f437829a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f437829a.equals(((o) obj).f437829a);
    }

    public final int hashCode() {
        return this.f437829a.hashCode();
    }

    public final String toString() {
        return "ReloadData(elkData=" + this.f437829a + ")";
    }
}
