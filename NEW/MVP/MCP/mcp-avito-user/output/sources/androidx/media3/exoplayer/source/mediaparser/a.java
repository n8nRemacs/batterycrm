package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.j;
import j.P;
import j.X;

/* compiled from: InputReaderAdapterV30.java */
@SuppressLint({"Override"})
@J
@X
/* loaded from: classes.dex */
public final class a implements MediaParser$SeekableInputReader {

    /* renamed from: a, reason: collision with root package name */
    @P
    public j f49795a;

    /* renamed from: b, reason: collision with root package name */
    public long f49796b;

    /* renamed from: c, reason: collision with root package name */
    public long f49797c;

    /* renamed from: d, reason: collision with root package name */
    public long f49798d;

    public final long getLength() {
        return this.f49796b;
    }

    public final long getPosition() {
        return this.f49797c;
    }

    public final int read(byte[] bArr, int i12, int i13) {
        j jVar = this.f49795a;
        int i14 = M.f47887a;
        int i15 = jVar.read(bArr, i12, i13);
        this.f49797c += i15;
        return i15;
    }

    public final void seekToPosition(long j12) {
        this.f49798d = j12;
    }
}
