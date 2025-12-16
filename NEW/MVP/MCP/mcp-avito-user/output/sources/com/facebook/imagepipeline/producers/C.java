package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.V;
import java.util.concurrent.Future;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes15.dex */
class C extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Future f340527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V.a f340528b;

    public C(Future future, V.a aVar) {
        this.f340527a = future;
        this.f340528b = aVar;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        if (this.f340527a.cancel(false)) {
            this.f340528b.b();
        }
    }
}
