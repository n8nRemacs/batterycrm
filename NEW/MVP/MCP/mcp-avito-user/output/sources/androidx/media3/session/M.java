package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.session.C23229i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class M implements C23229i0.d, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23229i0 f52129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52130d;

    public /* synthetic */ M(C23229i0 c23229i0, int i12, int i13) {
        this.f52128b = i13;
        this.f52129c = c23229i0;
        this.f52130d = i12;
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        switch (this.f52128b) {
            case 0:
                interfaceC23246o.i2(this.f52129c.f52494c, i12, this.f52130d);
                break;
            case 4:
                interfaceC23246o.H1(this.f52129c.f52494c, i12, this.f52130d);
                break;
            case 6:
                interfaceC23246o.h0(this.f52129c.f52494c, i12, this.f52130d);
                break;
            default:
                interfaceC23246o.a1(this.f52129c.f52494c, i12, this.f52130d);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52128b) {
            case 1:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
            case 2:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
            case 3:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
            case 4:
            case 6:
            case 7:
            default:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
            case 5:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
            case 8:
                gVar.onDeviceVolumeChanged(this.f52130d, this.f52129c.f52505n.f51993t);
                break;
        }
    }
}
