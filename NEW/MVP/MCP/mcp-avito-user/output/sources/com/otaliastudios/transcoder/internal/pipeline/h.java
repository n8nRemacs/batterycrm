package com.otaliastudios.transcoder.internal.pipeline;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.d;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import v11.C49143b;

/* compiled from: pipelines.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lib_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class h {

    /* compiled from: pipelines.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d$a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "<anonymous>", "()Lcom/otaliastudios/transcoder/internal/pipeline/d$a;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<d.a<?, com.otaliastudios.transcoder.internal.pipeline.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x11.d f366170l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TrackType f366171m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.otaliastudios.transcoder.time.c f366172n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.otaliastudios.transcoder.sink.a f366173o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrackType trackType, com.otaliastudios.transcoder.sink.a aVar, com.otaliastudios.transcoder.time.c cVar, x11.d dVar) {
            super(0);
            this.f366170l = dVar;
            this.f366171m = trackType;
            this.f366172n = cVar;
            this.f366173o = aVar;
        }

        @Override // Y41.a
        public final d.a<?, com.otaliastudios.transcoder.internal.pipeline.b> invoke() {
            x11.d dVar = this.f366170l;
            TrackType trackType = this.f366171m;
            com.otaliastudios.transcoder.internal.data.b bVar = new com.otaliastudios.transcoder.internal.data.b(dVar, trackType);
            return new d.a(Collections.singletonList(bVar)).a(new com.otaliastudios.transcoder.internal.data.e(trackType, this.f366172n)).a(new com.otaliastudios.transcoder.internal.data.a(dVar.l(trackType))).a(new com.otaliastudios.transcoder.internal.data.g(this.f366173o, trackType));
        }
    }

    /* compiled from: pipelines.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
        }
    }

    @Y61.k
    public static final d a() {
        d.b bVar = d.f366156e;
        e eVar = e.f366162l;
        bVar.getClass();
        return d.b.a("Empty", eVar);
    }

    @Y61.k
    public static final d b(@Y61.k TrackType trackType, @Y61.k com.otaliastudios.transcoder.sink.a aVar, @Y61.k com.otaliastudios.transcoder.time.c cVar, @Y61.k x11.d dVar) {
        d.b bVar = d.f366156e;
        String str = "PassThrough(" + trackType + ')';
        a aVar2 = new a(trackType, aVar, cVar, dVar);
        bVar.getClass();
        return d.b.a(str, aVar2);
    }

    @Y61.k
    public static final d c(@Y61.k TrackType trackType, @Y61.k x11.d dVar, @Y61.k com.otaliastudios.transcoder.sink.a aVar, @Y61.k com.otaliastudios.transcoder.time.c cVar, @Y61.k MediaFormat mediaFormat, @Y61.k com.otaliastudios.transcoder.internal.d dVar2, @Y61.k y11.c cVar2, @Y61.k C49143b c49143b) {
        int iOrdinal = trackType.ordinal();
        if (iOrdinal == 0) {
            d.b bVar = d.f366156e;
            g gVar = new g(dVar, cVar, cVar2, c49143b, mediaFormat, dVar2, aVar);
            bVar.getClass();
            return d.b.a("Audio", gVar);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        d.b bVar2 = d.f366156e;
        i iVar = new i(dVar, cVar, mediaFormat, dVar2, aVar);
        bVar2.getClass();
        return d.b.a("Video", iVar);
    }
}
