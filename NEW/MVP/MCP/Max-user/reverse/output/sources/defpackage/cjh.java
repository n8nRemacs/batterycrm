package defpackage;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class cjh extends VolumeProvider {
    public final /* synthetic */ v79 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjh(v79 v79Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = v79Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        v79 v79Var = this.a;
        zxg.a0(v79Var.f, new u79(v79Var.g, i, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        v79 v79Var = this.a;
        zxg.a0(v79Var.f, new u79(v79Var.g, i, 0));
    }
}
