package androidx.media3.session;

import androidx.media3.session.C23206a1;
import androidx.media3.session.C23229i0;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Y implements C23229i0.d, C23206a1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f52343d;

    public /* synthetic */ Y(float f12, int i12, Object obj) {
        this.f52341b = i12;
        this.f52342c = obj;
        this.f52343d = f12;
    }

    @Override // androidx.media3.session.C23206a1.g
    public void b(O0.g gVar) {
        ((C23206a1) this.f52342c).f52357b.f52302p.setPlaybackSpeed(this.f52343d);
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        switch (this.f52341b) {
            case 0:
                interfaceC23246o.k2(((C23229i0) this.f52342c).f52494c, i12, this.f52343d);
                break;
            default:
                interfaceC23246o.j2(((C23229i0) this.f52342c).f52494c, i12, this.f52343d);
                break;
        }
    }
}
