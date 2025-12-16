package com.google.net.cronet.okhttptransport;

import com.google.common.collect.H1;
import java.util.concurrent.Callable;
import okhttp3.Request;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Request f362574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f362575c;

    public /* synthetic */ p(q qVar, Request request, g gVar) {
        this.f362574b = request;
        this.f362575c = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        H1<String> h12 = q.f362576a;
        return q.a(this.f362574b, this.f362575c);
    }
}
