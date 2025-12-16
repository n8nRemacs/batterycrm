package com.google.net.cronet.okhttptransport;

import j.P;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.InterfaceC44804n;

/* compiled from: CronetTransportResponseBody.java */
/* loaded from: classes14.dex */
abstract class f extends ResponseBody {

    /* renamed from: b, reason: collision with root package name */
    public final ResponseBody f362524b;

    public f(ResponseBody responseBody) {
        this.f362524b = responseBody;
    }

    public abstract void a();

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f362524b.close();
        a();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.f362524b.get$contentLength();
    }

    @Override // okhttp3.ResponseBody
    @P
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f362524b.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final InterfaceC44804n get$this_asResponseBody() {
        return this.f362524b.get$this_asResponseBody();
    }
}
