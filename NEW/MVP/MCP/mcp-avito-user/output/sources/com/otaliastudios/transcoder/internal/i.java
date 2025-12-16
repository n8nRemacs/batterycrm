package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/i;", "Lcom/otaliastudios/transcoder/time/c;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i implements com.otaliastudios.transcoder.time.c {

    /* renamed from: a, reason: collision with root package name */
    public long f366133a;

    /* renamed from: b, reason: collision with root package name */
    public long f366134b = Long.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final long f366135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f366136d;

    public i(int i12, l lVar, TrackType trackType) {
        this.f366136d = lVar;
        this.f366135c = i12 == 0 ? 0L : ((com.otaliastudios.transcoder.time.c) lVar.f366146h.get(new Q(trackType, Integer.valueOf(i12 - 1)))).a(trackType, Long.MAX_VALUE) + 10;
    }

    @Override // com.otaliastudios.transcoder.time.c
    public final long a(@Y61.k TrackType trackType, long j12) {
        if (j12 == Long.MAX_VALUE) {
            return this.f366133a;
        }
        if (this.f366134b == Long.MAX_VALUE) {
            this.f366134b = j12;
        }
        long j13 = (j12 - this.f366134b) + this.f366135c;
        this.f366133a = j13;
        this.f366136d.f366139a.getClass();
        return j13;
    }
}
