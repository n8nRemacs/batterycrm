package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.session.C23229i0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23208b0 implements r.a, C23229i0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23229i0 f52388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f52389d;

    public /* synthetic */ C23208b0(C23229i0 c23229i0, boolean z12, int i12) {
        this.f52387b = i12;
        this.f52388c = c23229i0;
        this.f52389d = z12;
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        switch (this.f52387b) {
            case 1:
                interfaceC23246o.a3(this.f52388c.f52494c, i12, this.f52389d);
                break;
            case 2:
                interfaceC23246o.C3(this.f52388c.f52494c, i12, this.f52389d);
                break;
            default:
                interfaceC23246o.E0(this.f52388c.f52494c, i12, this.f52389d);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52387b) {
            case 0:
                gVar.onDeviceVolumeChanged(this.f52388c.f52505n.f51992s, this.f52389d);
                break;
            default:
                gVar.onDeviceVolumeChanged(this.f52388c.f52505n.f51992s, this.f52389d);
                break;
        }
    }
}
