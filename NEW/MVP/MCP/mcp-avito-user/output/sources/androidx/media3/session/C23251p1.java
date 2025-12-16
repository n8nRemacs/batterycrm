package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23251p1 implements InterfaceC23119j, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52610d;

    public /* synthetic */ C23251p1(int i12, int i13, int i14) {
        this.f52608b = i14;
        this.f52609c = i12;
        this.f52610d = i13;
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        int i12 = this.f52610d;
        int i13 = this.f52609c;
        G1 g12 = (G1) obj;
        switch (this.f52608b) {
            case 0:
                int i14 = A1.f51915u;
                g12.R(i13, i12);
                break;
            default:
                int i15 = A1.f51915u;
                g12.b0(i13, i12);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).onSurfaceSizeChanged(this.f52609c, this.f52610d);
    }
}
