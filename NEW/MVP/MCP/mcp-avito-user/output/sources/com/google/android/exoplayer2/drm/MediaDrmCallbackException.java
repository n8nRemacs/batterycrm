package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f344328b;

    public MediaDrmCallbackException(com.google.android.exoplayer2.upstream.p pVar, Uri uri, Map map, long j12, Exception exc) {
        super(exc);
        this.f344328b = map;
    }
}
