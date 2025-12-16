package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements MediaCodecUtil.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f345618b;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public final int a(Object obj) {
        I i12 = this.f345618b;
        m mVar = (m) obj;
        Pattern pattern = MediaCodecUtil.f345543a;
        try {
            return mVar.c(i12) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }
}
