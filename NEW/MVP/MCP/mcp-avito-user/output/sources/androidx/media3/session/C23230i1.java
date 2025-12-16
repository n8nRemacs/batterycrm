package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23230i1 implements InterfaceC23119j, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f52526c;

    public /* synthetic */ C23230i1(float f12, int i12) {
        this.f52525b = i12;
        this.f52526c = f12;
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        float f12 = this.f52526c;
        G1 g12 = (G1) obj;
        switch (this.f52525b) {
            case 0:
                int i12 = A1.f51915u;
                g12.setPlaybackSpeed(f12);
                break;
            default:
                int i13 = A1.f51915u;
                g12.setVolume(f12);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).onVolumeChanged(this.f52526c);
    }
}
