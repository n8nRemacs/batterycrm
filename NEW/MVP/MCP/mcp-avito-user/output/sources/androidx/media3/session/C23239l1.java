package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23239l1 implements InterfaceC23119j, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.G f52571c;

    public /* synthetic */ C23239l1(androidx.media3.common.G g12, int i12) {
        this.f52570b = i12;
        this.f52571c = g12;
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        int i12 = A1.f51915u;
        ((G1) obj).d(this.f52571c);
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52570b) {
            case 1:
                gVar.m(this.f52571c);
                break;
            default:
                gVar.m(this.f52571c);
                break;
        }
    }
}
