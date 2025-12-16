package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements MediaCodecUtil.f, p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49395b;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
    public int a(Object obj) {
        n nVar = (n) obj;
        switch (this.f49395b) {
            case 0:
                Pattern pattern = MediaCodecUtil.f49321a;
                String str = nVar.f49386a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (M.f47887a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = MediaCodecUtil.f49321a;
                return nVar.f49386a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
