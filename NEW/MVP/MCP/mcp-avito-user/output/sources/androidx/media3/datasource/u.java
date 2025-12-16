package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import j.P;
import java.io.IOException;

/* compiled from: PlaceholderDataSource.java */
@J
/* loaded from: classes.dex */
public final class u implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final u f48313a = new u();

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return null;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
    }
}
