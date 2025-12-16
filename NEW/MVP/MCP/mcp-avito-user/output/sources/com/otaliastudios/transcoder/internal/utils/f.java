package com.otaliastudios.transcoder.internal.utils;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import j.P;
import kotlin.Metadata;
import x11.d;

/* compiled from: eos.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/utils/f;", "Lx11/d;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class f implements x11.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x11.d f366216a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f366217b;

    public f(@Y61.k x11.d dVar, @Y61.k Y41.a<Boolean> aVar) {
        this.f366216a = dVar;
        this.f366217b = aVar;
    }

    @Override // x11.d
    public final void a() {
        this.f366216a.a();
    }

    @Override // x11.d
    public final int b() {
        return this.f366216a.b();
    }

    @Override // x11.d
    public final long c() {
        return this.f366216a.c();
    }

    @Override // x11.d
    public final long d() {
        return this.f366216a.d();
    }

    @Override // x11.d
    public final boolean e() {
        return this.f366217b.invoke().booleanValue() || this.f366216a.e();
    }

    @Override // x11.d
    public final void f(@N @Y61.k TrackType trackType) {
        this.f366216a.f(trackType);
    }

    @Override // x11.d
    public final void g() {
        this.f366216a.g();
    }

    @Override // x11.d
    public final boolean h(@N @Y61.k TrackType trackType) {
        return this.f366216a.h(trackType);
    }

    @Override // x11.d
    public final void i(@N @Y61.k TrackType trackType) {
        this.f366216a.i(trackType);
    }

    @Override // x11.d
    public final boolean isInitialized() {
        return this.f366216a.isInitialized();
    }

    @Override // x11.d
    @Y61.l
    @P
    public final double[] j() {
        return this.f366216a.j();
    }

    @Override // x11.d
    public final void k(@N @Y61.k d.a aVar) {
        this.f366216a.k(aVar);
    }

    @Override // x11.d
    @Y61.l
    @P
    public final MediaFormat l(@N @Y61.k TrackType trackType) {
        return this.f366216a.l(trackType);
    }
}
