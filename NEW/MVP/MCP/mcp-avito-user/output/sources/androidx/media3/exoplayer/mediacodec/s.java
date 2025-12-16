package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecUtil.f f49397b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pattern pattern = MediaCodecUtil.f49321a;
        MediaCodecUtil.f fVar = this.f49397b;
        return fVar.a(obj2) - fVar.a(obj);
    }
}
