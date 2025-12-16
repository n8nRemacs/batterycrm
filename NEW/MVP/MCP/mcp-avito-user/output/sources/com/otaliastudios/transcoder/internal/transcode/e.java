package com.otaliastudios.transcoder.internal.transcode;

import Y41.r;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: DefaultTranscodeEngine.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class e extends H implements r<TrackType, Integer, TrackStatus, MediaFormat, com.otaliastudios.transcoder.internal.pipeline.d> {
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.d f(@Y61.k TrackType trackType, int i12, @Y61.k TrackStatus trackStatus, @Y61.k MediaFormat mediaFormat) {
        a aVar = (a) this.receiver;
        int i13 = a.f366186o;
        aVar.getClass();
        Objects.toString(trackType);
        Objects.toString(trackStatus);
        Objects.toString(mediaFormat);
        aVar.f366192h.getClass();
        com.otaliastudios.transcoder.internal.l lVar = aVar.f366195k;
        LinkedHashMap linkedHashMap = lVar.f366146h;
        Q q12 = new Q(trackType, Integer.valueOf(i12));
        Object iVar = linkedHashMap.get(q12);
        if (iVar == null) {
            iVar = new com.otaliastudios.transcoder.internal.i(i12, lVar, trackType);
            linkedHashMap.put(q12, iVar);
        }
        com.otaliastudios.transcoder.time.c cVar = (com.otaliastudios.transcoder.time.c) iVar;
        List<x11.d> listN6 = aVar.f366187c.n6(trackType);
        x11.d dVarA = com.otaliastudios.transcoder.internal.utils.h.a(listN6.get(i12), new c(aVar, trackType));
        com.otaliastudios.transcoder.sink.a aVarB = com.otaliastudios.transcoder.internal.utils.h.b(aVar.f366188d, new b(i12, listN6));
        int iOrdinal = trackStatus.ordinal();
        if (iOrdinal == 0) {
            return com.otaliastudios.transcoder.internal.pipeline.h.a();
        }
        if (iOrdinal == 1) {
            return com.otaliastudios.transcoder.internal.pipeline.h.a();
        }
        if (iOrdinal == 2) {
            return com.otaliastudios.transcoder.internal.pipeline.h.b(trackType, aVarB, cVar, dVarA);
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return com.otaliastudios.transcoder.internal.pipeline.h.c(trackType, dVarA, aVarB, cVar, mediaFormat, aVar.f366196l, aVar.f366190f, aVar.f366191g);
    }

    @Override // Y41.r
    public final /* bridge */ /* synthetic */ com.otaliastudios.transcoder.internal.pipeline.d invoke(TrackType trackType, Integer num, TrackStatus trackStatus, MediaFormat mediaFormat) {
        return f(trackType, num.intValue(), trackStatus, mediaFormat);
    }
}
