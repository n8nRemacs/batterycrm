package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* renamed from: com.google.android.exoplayer2.upstream.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36583m extends InterfaceC36580j {

    /* compiled from: DataSource.java */
    /* renamed from: com.google.android.exoplayer2.upstream.m$a */
    public interface a {
        InterfaceC36583m a();
    }

    default Map<String, List<String>> c() {
        return Collections.emptyMap();
    }

    void close();

    long e(p pVar);

    @P
    Uri getUri();

    void k(M m12);
}
