package com.otaliastudios.transcoder.internal.pipeline;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.d;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: pipelines.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d$a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "<anonymous>", "()Lcom/otaliastudios/transcoder/internal/pipeline/d$a;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class i extends N implements Y41.a<d.a<?, b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x11.d f366174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.time.c f366175m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MediaFormat f366176n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.internal.d f366177o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.otaliastudios.transcoder.sink.a f366178p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x11.d dVar, com.otaliastudios.transcoder.time.c cVar, MediaFormat mediaFormat, com.otaliastudios.transcoder.internal.d dVar2, com.otaliastudios.transcoder.sink.a aVar) {
        super(0);
        this.f366174l = dVar;
        this.f366175m = cVar;
        this.f366176n = mediaFormat;
        this.f366177o = dVar2;
        this.f366178p = aVar;
    }

    @Override // Y41.a
    public final d.a<?, b> invoke() {
        TrackType trackType = TrackType.f365975c;
        x11.d dVar = this.f366174l;
        com.otaliastudios.transcoder.internal.data.b bVar = new com.otaliastudios.transcoder.internal.data.b(dVar, trackType);
        return new d.a(Collections.singletonList(bVar)).a(new com.otaliastudios.transcoder.internal.codec.a(dVar.l(trackType), true)).a(new com.otaliastudios.transcoder.internal.codec.e(trackType, this.f366175m)).a(new com.otaliastudios.transcoder.internal.video.g(dVar.b(), 0, this.f366176n, false, 8, null)).a(new com.otaliastudios.transcoder.internal.video.e()).a(new com.otaliastudios.transcoder.internal.codec.g(this.f366177o, trackType)).a(new com.otaliastudios.transcoder.internal.data.g(this.f366178p, trackType));
    }
}
