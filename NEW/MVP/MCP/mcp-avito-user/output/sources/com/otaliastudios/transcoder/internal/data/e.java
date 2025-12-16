package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import kotlin.Metadata;

/* compiled from: ReaderTimer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/e;", "Lcom/otaliastudios/transcoder/internal/pipeline/c;", "Lcom/otaliastudios/transcoder/internal/data/d;", "Lcom/otaliastudios/transcoder/internal/data/c;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e extends com.otaliastudios.transcoder.internal.pipeline.c<d, c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrackType f366107c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.otaliastudios.transcoder.time.c f366108d;

    public e(@k TrackType trackType, @k com.otaliastudios.transcoder.time.c cVar) {
        this.f366107c = trackType;
        this.f366108d = cVar;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @k
    public final com.otaliastudios.transcoder.internal.pipeline.k<d> s(@k k.b<d> bVar, boolean z12) {
        if (bVar instanceof k.a) {
            return bVar;
        }
        d dVar = bVar.f366179a;
        dVar.f366105a.f442096c = this.f366108d.a(this.f366107c, dVar.f366105a.f442096c);
        return bVar;
    }
}
