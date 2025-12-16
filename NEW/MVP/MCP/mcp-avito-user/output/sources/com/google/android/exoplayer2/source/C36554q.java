package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
/* renamed from: com.google.android.exoplayer2.source.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36554q {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f346661b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f346662a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C36554q(long j12, com.google.android.exoplayer2.upstream.p pVar) {
        this(j12, Collections.emptyMap());
        Uri uri = pVar.f347929a;
    }

    public C36554q(long j12, Map map) {
        this.f346662a = map;
    }
}
