package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final s f437831f = new s(true, false, false, new N41.g(), new InterfaceC40658b.m(0, 0, null, null, null, null, 63, null));

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437832a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437833b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437834c;

    /* renamed from: d, reason: collision with root package name */
    public final N41.g f437835d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC40658b f437836e;

    public s(boolean z12, boolean z13, boolean z14, N41.g gVar, InterfaceC40658b interfaceC40658b) {
        this.f437832a = z12;
        this.f437833b = z13;
        this.f437834c = z14;
        this.f437835d = gVar;
        this.f437836e = interfaceC40658b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f437832a == sVar.f437832a && this.f437833b == sVar.f437833b && this.f437834c == sVar.f437834c && L.f(this.f437835d, sVar.f437835d) && L.f(this.f437836e, sVar.f437836e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z12 = this.f437832a;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = i12 * 31;
        boolean z13 = this.f437833b;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z14 = this.f437834c;
        return this.f437836e.hashCode() + ((this.f437835d.hashCode() + ((i15 + (z14 ? 1 : z14 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ELKState(isLoading=" + this.f437832a + ", isError=" + this.f437833b + ", isAnyChildWasLoaded=" + this.f437834c + ", property=" + this.f437835d + ", elkData=" + this.f437836e + ")";
    }
}
