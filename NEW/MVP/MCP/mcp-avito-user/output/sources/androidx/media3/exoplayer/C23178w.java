package androidx.media3.exoplayer;

import androidx.media3.common.H;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23178w implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f50340c;

    public /* synthetic */ C23178w(boolean z12, int i12) {
        this.f50339b = i12;
        this.f50340c = z12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        boolean z12 = this.f50340c;
        H.g gVar = (H.g) obj;
        switch (this.f50339b) {
            case 0:
                int i12 = A.f48357h0;
                gVar.onShuffleModeEnabledChanged(z12);
                break;
            default:
                gVar.onSkipSilenceEnabledChanged(z12);
                break;
        }
    }
}
