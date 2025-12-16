package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.C23108t;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements MediaCodecUtil.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23108t f49396b;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
    public final int a(Object obj) {
        n nVar = (n) obj;
        Pattern pattern = MediaCodecUtil.f49321a;
        nVar.getClass();
        C23108t c23108t = this.f49396b;
        String str = c23108t.f47757m;
        String str2 = nVar.f49387b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.b(c23108t))) && nVar.c(c23108t, false)) ? 1 : 0;
    }
}
