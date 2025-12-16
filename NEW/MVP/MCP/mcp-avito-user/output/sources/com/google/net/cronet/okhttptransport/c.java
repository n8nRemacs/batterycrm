package com.google.net.cronet.okhttptransport;

import com.google.net.cronet.okhttptransport.b;
import okio.C44800j;

/* compiled from: CronetCallFactory.java */
/* loaded from: classes14.dex */
class c extends C44800j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.C10745b f362517b;

    public c(b.C10745b c10745b) {
        this.f362517b = c10745b;
    }

    @Override // okio.C44800j
    public final void timedOut() {
        this.f362517b.cancel();
    }
}
