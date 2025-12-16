package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.m;
import java.util.Collections;
import java.util.List;

/* compiled from: HlsPlaylist.java */
/* loaded from: classes6.dex */
public abstract class h implements m<h> {

    /* renamed from: a, reason: collision with root package name */
    public final String f346530a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f346531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f346532c;

    public h(String str, List<String> list, boolean z12) {
        this.f346530a = str;
        this.f346531b = Collections.unmodifiableList(list);
        this.f346532c = z12;
    }
}
