package com.otaliastudios.transcoder.sink;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.camera.camera2.internal.G;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.k;
import com.otaliastudios.transcoder.internal.utils.n;
import j.N;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: DefaultDataSink.java */
/* loaded from: classes7.dex */
public class b implements com.otaliastudios.transcoder.sink.a {

    /* renamed from: b, reason: collision with root package name */
    public final MediaMuxer f366251b;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f366253d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f366250a = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f366252c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final k<TrackStatus> f366254e = n.a();

    /* renamed from: f, reason: collision with root package name */
    public final k<MediaFormat> f366255f = n.a();

    /* renamed from: g, reason: collision with root package name */
    public final k<Integer> f366256g = n.a();

    /* renamed from: h, reason: collision with root package name */
    public final c f366257h = new c();

    /* compiled from: DefaultDataSink.java */
    /* renamed from: com.otaliastudios.transcoder.sink.b$b, reason: collision with other inner class name */
    public static class C10804b {

        /* renamed from: a, reason: collision with root package name */
        public final TrackType f366258a;

        /* renamed from: b, reason: collision with root package name */
        public final int f366259b;

        /* renamed from: c, reason: collision with root package name */
        public final long f366260c;

        /* renamed from: d, reason: collision with root package name */
        public final int f366261d;

        public C10804b(TrackType trackType, MediaCodec.BufferInfo bufferInfo, a aVar) {
            this.f366258a = trackType;
            this.f366259b = bufferInfo.size;
            this.f366260c = bufferInfo.presentationTimeUs;
            this.f366261d = bufferInfo.flags;
        }
    }

    public b(@N String str) {
        try {
            this.f366251b = new MediaMuxer(str, 0);
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.otaliastudios.transcoder.sink.a
    public final void a(@N TrackType trackType, @N MediaFormat mediaFormat) {
        Objects.toString(trackType);
        Objects.toString(mediaFormat);
        k<TrackStatus> kVar = this.f366254e;
        TrackStatus trackStatusN6 = kVar.n6(trackType);
        TrackStatus trackStatus = TrackStatus.f365971e;
        TrackType trackType2 = TrackType.f365974b;
        TrackType trackType3 = TrackType.f365975c;
        int i12 = 0;
        if (trackStatusN6 == trackStatus) {
            this.f366257h.getClass();
            if (trackType == trackType3) {
                String string = mediaFormat.getString("mime");
                if (!"video/avc".equals(string)) {
                    throw new InvalidOutputFormatException(G.f("Video codecs other than AVC is not supported, actual mime type: ", string));
                }
                ByteBuffer byteBufferAsReadOnlyBuffer = mediaFormat.getByteBuffer("csd-0").asReadOnlyBuffer();
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(byteBufferAsReadOnlyBuffer.limit()).order(byteBufferAsReadOnlyBuffer.order());
                byteBufferOrder.put(byteBufferAsReadOnlyBuffer);
                byteBufferOrder.flip();
                byte[] bArr = new byte[3];
                byteBufferOrder.get(bArr);
                if (!Arrays.equals(bArr, com.otaliastudios.transcoder.internal.utils.a.f366213a)) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, 4);
                    bArrCopyOf[3] = byteBufferOrder.get();
                    if (!Arrays.equals(bArrCopyOf, com.otaliastudios.transcoder.internal.utils.a.f366214b)) {
                        throw new IllegalStateException("AVC NAL start code not found in csd.");
                    }
                }
                byte b12 = byteBufferOrder.get();
                if (b12 != 103 && b12 != 39 && b12 != 71) {
                    throw new IllegalStateException("Got non SPS NAL data.");
                }
                byteBufferOrder.slice().get(0);
            } else if (trackType == trackType2) {
                String string2 = mediaFormat.getString("mime");
                if (!"audio/mp4a-latm".equals(string2)) {
                    throw new InvalidOutputFormatException(G.f("Audio codecs other than AAC is not supported, actual mime type: ", string2));
                }
            }
        }
        k<MediaFormat> kVar2 = this.f366255f;
        kVar2.a5(trackType, mediaFormat);
        if (this.f366250a) {
            return;
        }
        boolean zA2 = kVar.n6(trackType3).a();
        boolean zA3 = kVar.n6(trackType2).a();
        MediaFormat mediaFormatC4 = kVar2.c4(trackType3);
        MediaFormat mediaFormatC42 = kVar2.c4(trackType2);
        boolean z12 = (mediaFormatC4 == null && zA2) ? false : true;
        boolean z13 = (mediaFormatC42 == null && zA3) ? false : true;
        if (z12 && z13) {
            k<Integer> kVar3 = this.f366256g;
            MediaMuxer mediaMuxer = this.f366251b;
            if (zA2) {
                kVar3.j1(Integer.valueOf(mediaMuxer.addTrack(mediaFormatC4)));
                mediaFormatC4.getString("mime");
            }
            if (zA3) {
                kVar3.D3(Integer.valueOf(mediaMuxer.addTrack(mediaFormatC42)));
                mediaFormatC42.getString("mime");
            }
            mediaMuxer.start();
            this.f366250a = true;
            ArrayList arrayList = this.f366252c;
            if (arrayList.isEmpty()) {
                return;
            }
            this.f366253d.flip();
            arrayList.size();
            this.f366253d.limit();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C10804b c10804b = (C10804b) it.next();
                bufferInfo.set(i12, c10804b.f366259b, c10804b.f366260c, c10804b.f366261d);
                b(c10804b.f366258a, this.f366253d, bufferInfo);
                i12 += c10804b.f366259b;
            }
            arrayList.clear();
            this.f366253d = null;
        }
    }

    @Override // com.otaliastudios.transcoder.sink.a
    public final void b(@N TrackType trackType, @N ByteBuffer byteBuffer, @N MediaCodec.BufferInfo bufferInfo) {
        if (this.f366250a) {
            this.f366251b.writeSampleData(this.f366256g.n6(trackType).intValue(), byteBuffer, bufferInfo);
            return;
        }
        if (this.f366253d == null) {
            this.f366253d = ByteBuffer.allocateDirect(262144).order(ByteOrder.nativeOrder());
        }
        Objects.toString(trackType);
        int i12 = bufferInfo.offset;
        byteBuffer.position();
        byteBuffer.remaining();
        this.f366253d.remaining();
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        this.f366253d.put(byteBuffer);
        this.f366252c.add(new C10804b(trackType, bufferInfo, null));
    }

    public final void c(@N TrackType trackType, @N TrackStatus trackStatus) {
        this.f366254e.a5(trackType, trackStatus);
    }
}
