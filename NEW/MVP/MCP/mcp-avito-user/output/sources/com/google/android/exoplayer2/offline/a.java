package com.google.android.exoplayer2.offline;

import android.database.Cursor;

/* compiled from: DefaultDownloadIndex.java */
/* loaded from: classes6.dex */
public final class a implements r {

    /* compiled from: DefaultDownloadIndex.java */
    public static final class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public final Cursor f345803b;

        public b(Cursor cursor, C10588a c10588a) {
            this.f345803b = cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f345803b.close();
        }
    }

    static {
        int[] iArr = {3, 4};
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = iArr[i12];
        }
    }
}
