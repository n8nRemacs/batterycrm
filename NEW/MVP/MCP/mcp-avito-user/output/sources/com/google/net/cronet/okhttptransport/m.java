package com.google.net.cronet.okhttptransport;

import com.google.net.cronet.okhttptransport.n;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RequestResponseConverter.java */
/* loaded from: classes14.dex */
class m implements n.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Request f362562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f362563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f362564c;

    public m(n nVar, Request request, g gVar) {
        this.f362564c = nVar;
        this.f362562a = request;
        this.f362563b = gVar;
    }

    public final Response a() {
        q qVar = this.f362564c.f362567c;
        return q.a(this.f362562a, this.f362563b);
    }
}
