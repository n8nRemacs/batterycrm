package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.U;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o implements MediaCodecUtil.f, n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f345617b;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public int a(Object obj) {
        m mVar = (m) obj;
        switch (this.f345617b) {
            case 0:
                Pattern pattern = MediaCodecUtil.f345543a;
                String str = mVar.f345608a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (U.f348106a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = MediaCodecUtil.f345543a;
                return mVar.f345608a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
