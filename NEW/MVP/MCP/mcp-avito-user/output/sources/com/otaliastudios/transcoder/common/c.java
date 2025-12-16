package com.otaliastudios.transcoder.common;

import Y61.k;
import Y61.l;
import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: TrackType.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lib_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    @l
    public static final TrackType a(@k MediaFormat mediaFormat) {
        if (C43066x.h0(mediaFormat.getString("mime"), "audio/", false)) {
            return TrackType.f365974b;
        }
        if (C43066x.h0(mediaFormat.getString("mime"), "video/", false)) {
            return TrackType.f365975c;
        }
        return null;
    }
}
