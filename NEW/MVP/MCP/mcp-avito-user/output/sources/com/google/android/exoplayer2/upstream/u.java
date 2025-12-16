package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.v;
import j.P;

/* compiled from: DefaultDataSourceFactory.java */
@Deprecated
/* loaded from: classes6.dex */
public final class u implements InterfaceC36583m.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f347995a;

    /* renamed from: b, reason: collision with root package name */
    public final v.b f347996b;

    public u(Context context, @P String str) {
        v.b bVar = new v.b();
        bVar.f348012b = str;
        this.f347995a = context.getApplicationContext();
        this.f347996b = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
    public final InterfaceC36583m a() {
        return new t(this.f347995a, this.f347996b.a());
    }
}
