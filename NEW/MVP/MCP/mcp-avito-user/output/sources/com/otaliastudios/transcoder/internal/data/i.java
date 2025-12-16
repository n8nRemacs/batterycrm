package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Writer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/i;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ByteBuffer f366113a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366115c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final N f366116d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@k ByteBuffer byteBuffer, long j12, int i12, @k Y41.a<G0> aVar) {
        this.f366113a = byteBuffer;
        this.f366114b = j12;
        this.f366115c = i12;
        this.f366116d = (N) aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f366113a, iVar.f366113a) && this.f366114b == iVar.f366114b && this.f366115c == iVar.f366115c && L.f(this.f366116d, iVar.f366116d);
    }

    public final int hashCode() {
        return this.f366116d.hashCode() + r.e(this.f366115c, r.g(this.f366113a.hashCode() * 31, 31, this.f366114b), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WriterData(buffer=");
        sb2.append(this.f366113a);
        sb2.append(", timeUs=");
        sb2.append(this.f366114b);
        sb2.append(", flags=");
        sb2.append(this.f366115c);
        sb2.append(", release=");
        return C22026a.d(sb2, this.f366116d, ')');
    }
}
