package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.J;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@J
/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f49099b;

    public MediaDrmCallbackException(androidx.media3.datasource.o oVar, Uri uri, Map map, long j12, Exception exc) {
        super(exc);
        this.f49099b = map;
    }
}
