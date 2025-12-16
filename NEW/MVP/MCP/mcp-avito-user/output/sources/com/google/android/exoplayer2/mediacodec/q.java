package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Comparator;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecUtil.f f345619b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pattern pattern = MediaCodecUtil.f345543a;
        MediaCodecUtil.f fVar = this.f345619b;
        return fVar.a(obj2) - fVar.a(obj);
    }
}
