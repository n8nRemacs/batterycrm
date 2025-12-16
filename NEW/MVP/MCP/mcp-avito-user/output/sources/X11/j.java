package x11;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import j.N;
import java.io.IOException;
import java.util.Map;

/* compiled from: UriDataSource.java */
/* loaded from: classes7.dex */
public class j extends f {

    /* renamed from: m, reason: collision with root package name */
    @N
    public final Context f442115m;

    /* renamed from: n, reason: collision with root package name */
    @N
    public final Uri f442116n;

    public j(@N Context context, @N Uri uri) {
        this.f442115m = context.getApplicationContext();
        this.f442116n = uri;
    }

    @Override // x11.f
    public final void m(@N MediaExtractor mediaExtractor) throws IOException {
        mediaExtractor.setDataSource(this.f442115m, this.f442116n, (Map<String, String>) null);
    }

    @Override // x11.f
    public final void n(@N MediaMetadataRetriever mediaMetadataRetriever) throws SecurityException, IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(this.f442115m, this.f442116n);
    }
}
