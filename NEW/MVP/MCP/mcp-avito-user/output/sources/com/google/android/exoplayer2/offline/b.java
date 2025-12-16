package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.upstream.cache.a;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: DefaultDownloaderFactory.java */
/* loaded from: classes6.dex */
public class b implements l {
    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(com.google.android.exoplayer2.source.hls.offline.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
    }

    public static Constructor<? extends k> a(Class<?> cls) {
        try {
            return cls.asSubclass(k.class).getConstructor(O.class, a.d.class, Executor.class);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Downloader constructor missing", e12);
        }
    }
}
