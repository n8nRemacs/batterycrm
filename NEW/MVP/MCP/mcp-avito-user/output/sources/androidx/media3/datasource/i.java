package androidx.media3.datasource;

import androidx.media3.common.util.J;

/* compiled from: DataSink.java */
@J
/* loaded from: classes.dex */
public interface i {

    /* compiled from: DataSink.java */
    public interface a {
    }

    void close();

    void e(o oVar);

    void write(byte[] bArr, int i12, int i13);
}
