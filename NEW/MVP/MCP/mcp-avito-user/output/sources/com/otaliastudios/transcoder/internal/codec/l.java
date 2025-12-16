package com.otaliastudios.transcoder.internal.codec;

import androidx.appcompat.app.r;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Encoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/l;", "", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class l {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f366085d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final l f366086e = new l(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ByteBuffer f366087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366088b;

    /* renamed from: c, reason: collision with root package name */
    public final long f366089c;

    /* compiled from: Encoder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/l$a;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.l ByteBuffer byteBuffer, long j12, int i12) {
        this.f366087a = byteBuffer;
        this.f366088b = i12;
        this.f366089c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f366087a, lVar.f366087a) && this.f366088b == lVar.f366088b && this.f366089c == lVar.f366089c;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.f366087a;
        return Long.hashCode(this.f366089c) + r.e(this.f366088b, (byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EncoderData(buffer=");
        sb2.append(this.f366087a);
        sb2.append(", id=");
        sb2.append(this.f366088b);
        sb2.append(", timeUs=");
        return r.u(sb2, this.f366089c, ')');
    }
}
