package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;

/* loaded from: classes9.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC40658b.k f437828a;

    public n(InterfaceC40658b.k kVar) {
        this.f437828a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f437828a.equals(((n) obj).f437828a);
    }

    public final int hashCode() {
        return this.f437828a.hashCode();
    }

    public final String toString() {
        return "HideScreen(elkData=" + this.f437828a + ")";
    }
}
