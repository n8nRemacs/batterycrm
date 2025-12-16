package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackStatus;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/l;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.time.a f366139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f366140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f366141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.k f366142d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final j f366143e = new j(this);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h f366144f = new h(this);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final k f366145g = new k(this);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f366146h = new LinkedHashMap();

    public l(@Y61.k com.otaliastudios.transcoder.time.a aVar, @Y61.k e eVar, @Y61.k m mVar, @Y61.k com.otaliastudios.transcoder.internal.utils.k kVar) {
        this.f366139a = aVar;
        this.f366140b = eVar;
        this.f366141c = mVar;
        this.f366142d = kVar;
    }

    public final long a() {
        com.otaliastudios.transcoder.internal.utils.m<TrackStatus> mVar = this.f366141c.f366149c;
        boolean hasVideo = mVar.getHasVideo();
        h hVar = this.f366144f;
        return Math.min(hasVideo ? ((Number) hVar.u()).longValue() : Long.MAX_VALUE, mVar.b3() ? ((Number) hVar.q2()).longValue() : Long.MAX_VALUE);
    }
}
