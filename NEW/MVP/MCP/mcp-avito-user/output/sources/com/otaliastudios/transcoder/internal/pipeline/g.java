package com.otaliastudios.transcoder.internal.pipeline;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.d;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import v11.C49143b;

/* compiled from: pipelines.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d$a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "<anonymous>", "()Lcom/otaliastudios/transcoder/internal/pipeline/d$a;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class g extends N implements Y41.a<d.a<?, b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x11.d f366163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.time.c f366164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y11.c f366165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C49143b f366166o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MediaFormat f366167p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.internal.d f366168q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.sink.a f366169r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x11.d dVar, com.otaliastudios.transcoder.time.c cVar, y11.c cVar2, C49143b c49143b, MediaFormat mediaFormat, com.otaliastudios.transcoder.internal.d dVar2, com.otaliastudios.transcoder.sink.a aVar) {
        super(0);
        this.f366163l = dVar;
        this.f366164m = cVar;
        this.f366165n = cVar2;
        this.f366166o = c49143b;
        this.f366167p = mediaFormat;
        this.f366168q = dVar2;
        this.f366169r = aVar;
    }

    @Override // Y41.a
    public final d.a<?, b> invoke() {
        TrackType trackType = TrackType.f365974b;
        x11.d dVar = this.f366163l;
        com.otaliastudios.transcoder.internal.data.b bVar = new com.otaliastudios.transcoder.internal.data.b(dVar, trackType);
        return new d.a(Collections.singletonList(bVar)).a(new com.otaliastudios.transcoder.internal.codec.a(dVar.l(trackType), true)).a(new com.otaliastudios.transcoder.internal.codec.e(trackType, this.f366164m)).a(new com.otaliastudios.transcoder.internal.audio.a(this.f366165n, this.f366166o, this.f366167p)).a(new com.otaliastudios.transcoder.internal.codec.g(this.f366168q, trackType)).a(new com.otaliastudios.transcoder.internal.data.g(this.f366169r, trackType));
    }
}
