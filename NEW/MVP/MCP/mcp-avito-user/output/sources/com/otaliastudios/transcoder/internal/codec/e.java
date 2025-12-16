package com.otaliastudios.transcoder.internal.codec;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import kotlin.Metadata;

/* compiled from: DecoderTimer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/e;", "Lcom/otaliastudios/transcoder/internal/pipeline/c;", "Lcom/otaliastudios/transcoder/internal/codec/c;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e extends com.otaliastudios.transcoder.internal.pipeline.c<c, b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TrackType f366062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.time.c f366063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Long f366064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Long f366065f;

    public e(@Y61.k TrackType trackType, @Y61.k com.otaliastudios.transcoder.time.c cVar) {
        this.f366062c = trackType;
        this.f366063d = cVar;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.k<c> s(@Y61.k k.b<c> bVar, boolean z12) {
        double dLongValue;
        if (bVar instanceof k.a) {
            return bVar;
        }
        c cVar = bVar.f366179a;
        if (cVar instanceof f) {
            throw new IllegalArgumentException("Can't apply DecoderTimer twice.");
        }
        c cVar2 = cVar;
        long j12 = cVar2.f366054b;
        long jA2 = this.f366063d.a(this.f366062c, j12);
        if (this.f366064e == null) {
            dLongValue = 1.0d;
        } else {
            dLongValue = (jA2 - r12.longValue()) / (j12 - this.f366065f.longValue());
        }
        double d12 = dLongValue;
        this.f366064e = Long.valueOf(jA2);
        this.f366065f = Long.valueOf(j12);
        return new k.b(new f(cVar2.f366053a, jA2, d12, cVar2.f366055c));
    }
}
