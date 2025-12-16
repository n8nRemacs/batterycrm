package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.B;
import com.google.android.exoplayer2.util.I;
import java.io.IOException;

/* compiled from: SegmentDownloader.java */
/* loaded from: classes6.dex */
class p extends I<m<Object>, IOException> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.upstream.cache.a f345826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.upstream.p f345827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f345828k;

    public p(q qVar, com.google.android.exoplayer2.upstream.cache.a aVar, com.google.android.exoplayer2.upstream.p pVar) {
        this.f345828k = qVar;
        this.f345826i = aVar;
        this.f345827j = pVar;
    }

    @Override // com.google.android.exoplayer2.util.I
    public final m<Object> c() throws IOException {
        B b12 = new B(this.f345826i, this.f345827j, this.f345828k.f345830b);
        b12.load();
        T t12 = b12.f347715f;
        t12.getClass();
        return (m) t12;
    }
}
