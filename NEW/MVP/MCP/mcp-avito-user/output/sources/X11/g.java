package x11;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import j.N;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: FileDescriptorDataSource.java */
/* loaded from: classes7.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    @N
    public final FileDescriptor f442111m;

    /* renamed from: n, reason: collision with root package name */
    public final long f442112n = 576460752303423487L;

    public g(@N FileDescriptor fileDescriptor) {
        this.f442111m = fileDescriptor;
    }

    @Override // x11.f
    public final void m(@N MediaExtractor mediaExtractor) throws IOException {
        mediaExtractor.setDataSource(this.f442111m, 0L, this.f442112n);
    }

    @Override // x11.f
    public final void n(@N MediaMetadataRetriever mediaMetadataRetriever) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(this.f442111m, 0L, this.f442112n);
    }
}
