package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.m;
import com.google.android.exoplayer2.upstream.B;
import com.google.android.exoplayer2.upstream.C36584n;
import j.P;
import java.util.List;

/* compiled from: FilteringManifestParser.java */
/* loaded from: classes6.dex */
public final class n<T extends m<T>> implements B.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final B.a<? extends T> f345821a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final List<StreamKey> f345822b;

    public n(B.a<? extends T> aVar, @P List<StreamKey> list) {
        this.f345821a = aVar;
        this.f345822b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.B.a
    public final Object a(Uri uri, C36584n c36584n) {
        m mVar = (m) this.f345821a.a(uri, c36584n);
        List<StreamKey> list = this.f345822b;
        return (list == null || list.isEmpty()) ? mVar : (m) mVar.a(list);
    }
}
