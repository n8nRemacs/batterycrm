package com.google.android.exoplayer2;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f345863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f345864c;

    public /* synthetic */ r(boolean z12, int i12) {
        this.f345863b = i12;
        this.f345864c = z12;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        boolean z12 = this.f345864c;
        d0.g gVar = (d0.g) obj;
        switch (this.f345863b) {
            case 0:
                int i12 = C.f343308n0;
                gVar.onShuffleModeEnabledChanged(z12);
                break;
            default:
                gVar.onSkipSilenceEnabledChanged(z12);
                break;
        }
    }
}
