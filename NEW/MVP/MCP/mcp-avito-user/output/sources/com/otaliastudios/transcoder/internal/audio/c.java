package com.otaliastudios.transcoder.internal.audio;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.nio.ShortBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: chunks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/audio/c;", "", "b", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f366024e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f366025f = new c(ShortBuffer.allocate(0), 0, 0.0d, a.f366030l);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ShortBuffer f366026a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366027b;

    /* renamed from: c, reason: collision with root package name */
    public final double f366028c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f366029d;

    /* compiled from: chunks.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f366030l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: chunks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/audio/c$b;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public c(@k ShortBuffer shortBuffer, long j12, double d12, @k Y41.a<G0> aVar) {
        this.f366026a = shortBuffer;
        this.f366027b = j12;
        this.f366028c = d12;
        this.f366029d = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f366026a, cVar.f366026a) && this.f366027b == cVar.f366027b && Double.valueOf(this.f366028c).equals(Double.valueOf(cVar.f366028c)) && L.f(this.f366029d, cVar.f366029d);
    }

    public final int hashCode() {
        return this.f366029d.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(r.g(this.f366026a.hashCode() * 31, 31, this.f366027b), 31, this.f366028c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Chunk(buffer=");
        sb2.append(this.f366026a);
        sb2.append(", timeUs=");
        sb2.append(this.f366027b);
        sb2.append(", timeStretch=");
        sb2.append(this.f366028c);
        sb2.append(", release=");
        return r.v(sb2, this.f366029d, ')');
    }
}
