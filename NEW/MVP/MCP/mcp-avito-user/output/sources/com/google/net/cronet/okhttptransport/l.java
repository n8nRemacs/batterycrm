package com.google.net.cronet.okhttptransport;

import android.util.Pair;
import com.google.common.util.concurrent.InterfaceC37564s0;
import com.google.common.util.concurrent.e1;
import com.google.net.cronet.okhttptransport.j;

/* compiled from: RequestBodyConverterImpl.java */
/* loaded from: classes14.dex */
class l implements InterfaceC37564s0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j.c.a f362561a;

    public l(j.c.a aVar) {
        this.f362561a = aVar;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
        r rVar = this.f362561a.f362555c;
        rVar.f362580d.set(th2);
        Pair pair = (Pair) rVar.f362578b.poll();
        if (pair != null) {
            ((e1) pair.second).o(th2);
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void onSuccess(Object obj) {
    }
}
