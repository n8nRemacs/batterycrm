package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23227h1 implements InterfaceC23119j, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f52490c;

    public /* synthetic */ C23227h1(boolean z12, int i12) {
        this.f52489b = i12;
        this.f52490c = z12;
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        boolean z12 = this.f52490c;
        G1 g12 = (G1) obj;
        switch (this.f52489b) {
            case 0:
                int i12 = A1.f51915u;
                g12.setPlayWhenReady(z12);
                break;
            case 1:
                int i13 = A1.f51915u;
                g12.L(z12);
                break;
            default:
                int i14 = A1.f51915u;
                g12.h(z12);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).onShuffleModeEnabledChanged(this.f52490c);
    }
}
