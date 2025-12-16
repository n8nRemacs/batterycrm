package com.otaliastudios.transcoder.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.appcompat.app.r;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.m0;
import x11.d;

/* compiled from: Tracks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/m;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.m<TrackStatus> f366147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.m<MediaFormat> f366148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.m<TrackStatus> f366149c;

    public m(@Y61.k com.otaliastudios.transcoder.internal.utils.m mVar, @Y61.k e eVar) throws MediaCodec.CryptoException, IOException {
        Q<MediaFormat, TrackStatus> qA2 = a(TrackType.f365974b, (com.otaliastudios.transcoder.strategy.f) mVar.q2(), eVar.g3());
        MediaFormat mediaFormat = qA2.f406619b;
        TrackStatus trackStatus = qA2.f406620c;
        Q<MediaFormat, TrackStatus> qA3 = a(TrackType.f365975c, (com.otaliastudios.transcoder.strategy.f) mVar.u(), eVar.L0());
        MediaFormat mediaFormat2 = qA3.f406619b;
        TrackStatus trackStatus2 = qA3.f406620c;
        com.otaliastudios.transcoder.internal.utils.m<TrackStatus> mVarC = n.c(trackStatus2, trackStatus);
        this.f366147a = mVarC;
        this.f366148b = n.c(mediaFormat2, mediaFormat);
        Objects.toString(trackStatus2);
        Objects.toString(mVarC.u());
        Objects.toString(mediaFormat2);
        Objects.toString(trackStatus);
        Objects.toString(mVarC.q2());
        Objects.toString(mediaFormat);
        TrackStatus trackStatusU = mVarC.u();
        trackStatusU = trackStatusU.a() ? trackStatusU : null;
        TrackStatus trackStatusQ2 = mVarC.q2();
        this.f366149c = n.c(trackStatusU, trackStatusQ2.a() ? trackStatusQ2 : null);
    }

    public final Q<MediaFormat, TrackStatus> a(TrackType trackType, com.otaliastudios.transcoder.strategy.f fVar, List<? extends x11.d> list) throws MediaCodec.CryptoException, IOException {
        String str;
        d.a aVar;
        MediaCodec.BufferInfo bufferInfo;
        Objects.toString(trackType);
        if (list != null) {
            list.size();
        }
        m0.f406844a.b(fVar.getClass()).l0();
        TrackStatus trackStatus = TrackStatus.f365968b;
        if (list == null) {
            return new Q<>(new MediaFormat(), trackStatus);
        }
        new com.otaliastudios.transcoder.internal.media.c();
        ArrayList arrayList = new ArrayList();
        for (x11.d dVar : list) {
            MediaFormat mediaFormatL = dVar.l(trackType);
            MediaFormat mediaFormat = null;
            if (mediaFormatL != null) {
                String str2 = "mime";
                if (!com.otaliastudios.transcoder.internal.media.c.b(trackType, mediaFormatL)) {
                    dVar.f(trackType);
                    try {
                        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(mediaFormatL.getString("mime"));
                        mediaCodecCreateDecoderByType.configure(mediaFormatL, (Surface) null, (MediaCrypto) null, 0);
                        mediaCodecCreateDecoderByType.start();
                        com.otaliastudios.transcoder.internal.media.a aVar2 = new com.otaliastudios.transcoder.internal.media.a(mediaCodecCreateDecoderByType);
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        d.a aVar3 = new d.a();
                        MediaFormat mediaFormatA = null;
                        while (mediaFormatA == null) {
                            mediaFormatA = com.otaliastudios.transcoder.internal.media.c.a(mediaCodecCreateDecoderByType, aVar2, bufferInfo2);
                            if (mediaFormatA != null) {
                                str = str2;
                                aVar = aVar3;
                                bufferInfo = bufferInfo2;
                            } else {
                                if (!dVar.h(trackType)) {
                                    throw new RuntimeException("This should never happen!");
                                }
                                int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(0L);
                                if (iDequeueInputBuffer < 0) {
                                    str = str2;
                                    aVar = aVar3;
                                    bufferInfo = bufferInfo2;
                                } else {
                                    aVar3.f442094a = aVar2.f366150a.getInputBuffer(iDequeueInputBuffer);
                                    dVar.k(aVar3);
                                    str = str2;
                                    aVar = aVar3;
                                    bufferInfo = bufferInfo2;
                                    mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, aVar3.f442094a.position(), aVar3.f442094a.remaining(), aVar3.f442096c, aVar3.f442095b ? 1 : 0);
                                }
                                mediaFormatA = null;
                            }
                            bufferInfo2 = bufferInfo;
                            str2 = str;
                            aVar3 = aVar;
                        }
                        String str3 = str2;
                        dVar.g();
                        dVar.a();
                        if (!com.otaliastudios.transcoder.internal.media.c.b(trackType, mediaFormatA)) {
                            String string = "Could not get a complete format! hasMimeType:" + mediaFormatA.containsKey(str3);
                            if (trackType == TrackType.f365975c) {
                                StringBuilder sbZ = r.z(string, " hasWidth:");
                                sbZ.append(mediaFormatA.containsKey("width"));
                                StringBuilder sbZ2 = r.z(sbZ.toString(), " hasHeight:");
                                sbZ2.append(mediaFormatA.containsKey("height"));
                                StringBuilder sbZ3 = r.z(sbZ2.toString(), " hasFrameRate:");
                                sbZ3.append(mediaFormatA.containsKey("frame-rate"));
                                string = sbZ3.toString();
                            } else if (trackType == TrackType.f365974b) {
                                StringBuilder sbZ4 = r.z(string, " hasChannels:");
                                sbZ4.append(mediaFormatA.containsKey("channel-count"));
                                StringBuilder sbZ5 = r.z(sbZ4.toString(), " hasSampleRate:");
                                sbZ5.append(mediaFormatA.containsKey("sample-rate"));
                                string = sbZ5.toString();
                            }
                            throw new RuntimeException(string);
                        }
                        mediaFormatL = mediaFormatA;
                    } catch (IOException e12) {
                        throw new RuntimeException("Can't decode this track", e12);
                    }
                }
                mediaFormat = mediaFormatL;
            }
            if (mediaFormat != null) {
                arrayList.add(mediaFormat);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return new Q<>(new MediaFormat(), trackStatus);
        }
        if (size == list.size()) {
            MediaFormat mediaFormat2 = new MediaFormat();
            return new Q<>(mediaFormat2, fVar.a(arrayList, mediaFormat2));
        }
        throw new IllegalStateException(("Of all " + trackType + " sources, some have a " + trackType + " track, some don't.").toString());
    }
}
