package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;

/* compiled from: ParsingLoadable.java */
/* loaded from: classes6.dex */
public final class B<T> implements Loader.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f347710a;

    /* renamed from: b, reason: collision with root package name */
    public final p f347711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347712c;

    /* renamed from: d, reason: collision with root package name */
    public final J f347713d;

    /* renamed from: e, reason: collision with root package name */
    public final a<? extends T> f347714e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public volatile T f347715f;

    /* compiled from: ParsingLoadable.java */
    public interface a<T> {
        Object a(Uri uri, C36584n c36584n);
    }

    public B(InterfaceC36583m interfaceC36583m, Uri uri, a aVar) {
        p.b bVar = new p.b();
        bVar.f347939a = uri;
        bVar.f347947i = 1;
        this(interfaceC36583m, bVar.a(), aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws IOException {
        this.f347713d.f347752b = 0L;
        C36584n c36584n = new C36584n(this.f347713d, this.f347711b);
        try {
            c36584n.a();
            Uri uri = this.f347713d.f347751a.getUri();
            uri.getClass();
            this.f347715f = (T) this.f347714e.a(uri, c36584n);
        } finally {
            U.h(c36584n);
        }
    }

    public B(InterfaceC36583m interfaceC36583m, p pVar, a aVar) {
        this.f347713d = new J(interfaceC36583m);
        this.f347711b = pVar;
        this.f347712c = 4;
        this.f347714e = aVar;
        this.f347710a = C36554q.f346661b.getAndIncrement();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
    }
}
