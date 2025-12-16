package androidx.media3.exoplayer.offline;

import android.database.Cursor;
import androidx.media3.common.util.J;

/* compiled from: DefaultDownloadIndex.java */
@J
/* loaded from: classes.dex */
public final class a implements s {

    /* compiled from: DefaultDownloadIndex.java */
    public static final class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public final Cursor f49423b;

        public b(Cursor cursor, C1830a c1830a) {
            this.f49423b = cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f49423b.close();
        }
    }

    static {
        int[] iArr = {3, 4};
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = iArr[i12];
        }
    }
}
