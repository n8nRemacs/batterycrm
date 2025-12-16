package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class zw8 implements yw8 {
    public final int a;
    public MediaCodecInfo[] b;

    public zw8(boolean z, boolean z2, boolean z3) {
        this.a = (z || z2 || z3) ? 1 : 0;
    }

    @Override // defpackage.yw8
    public MediaCodecInfo b(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.yw8
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.yw8
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.yw8
    public int p() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.yw8
    public boolean q() {
        return true;
    }

    public zw8(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }
}
