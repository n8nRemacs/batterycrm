package androidx.media;

import android.media.VolumeProvider;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
class H extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f47014a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j12, int i12, int i13, int i14, String str) {
        super(i12, i13, i14, str);
        this.f47014a = j12;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i12) {
        this.f47014a.b(i12);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i12) {
        this.f47014a.c(i12);
    }
}
