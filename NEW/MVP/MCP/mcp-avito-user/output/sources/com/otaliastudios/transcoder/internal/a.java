package com.otaliastudios.transcoder.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.io.IOException;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: Codecs.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/transcoder/internal/a;", "Lcom/otaliastudios/transcoder/internal/utils/m;", "Lkotlin/Q;", "Landroid/media/MediaCodec;", "Landroid/view/Surface;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements com.otaliastudios.transcoder.internal.utils.m<Q<? extends MediaCodec, ? extends Surface>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f366006d;

    /* compiled from: Codecs.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.otaliastudios.transcoder.internal.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10797a {
        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    /* compiled from: Codecs.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Landroid/media/MediaCodec;", "", "<anonymous>", "()Lkotlin/Q;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.a<Q> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f366007l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.f366007l = dVar;
        }

        @Override // Y41.a
        public final Q invoke() throws IOException {
            MediaFormat mediaFormatQ2 = this.f366007l.f366091b.f366148b.q2();
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mediaFormatQ2.getString("mime"));
            mediaCodecCreateEncoderByType.configure(mediaFormatQ2, (Surface) null, (MediaCrypto) null, 1);
            return new Q(mediaCodecCreateEncoderByType, null);
        }
    }

    /* compiled from: Codecs.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Landroid/media/MediaCodec;", "Landroid/view/Surface;", "<anonymous>", "()Lkotlin/Q;"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.a<Q<? extends MediaCodec, ? extends Surface>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f366008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f366008l = dVar;
        }

        @Override // Y41.a
        public final Q<? extends MediaCodec, ? extends Surface> invoke() throws IOException {
            MediaFormat mediaFormatU = this.f366008l.f366091b.f366148b.u();
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mediaFormatU.getString("mime"));
            mediaCodecCreateEncoderByType.configure(mediaFormatU, (Surface) null, (MediaCrypto) null, 1);
            return new Q<>(mediaCodecCreateEncoderByType, mediaCodecCreateEncoderByType.createInputSurface());
        }
    }

    public a(d dVar) {
        this.f366006d = dVar;
        this.f366004b = C42727D.c(new b(dVar));
        this.f366005c = C42727D.c(new c(dVar));
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return this.f366006d.f366091b.f366147a.n6(trackType) == TrackStatus.f365971e;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> L0() {
        return (Q) m.a.a(this, TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return K1(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> c4(TrackType trackType) {
        return (Q) m.a.a(this, trackType);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> g3() {
        return (Q) m.a.a(this, TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean getHasVideo() {
        return K1(TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final int getSize() {
        throw null;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Q<MediaCodec, Surface>> iterator() {
        return m.a.b(this);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> n6(TrackType trackType) {
        int iOrdinal = trackType.ordinal();
        if (iOrdinal == 0) {
            return (Q) this.f366004b.getValue();
        }
        if (iOrdinal == 1) {
            return (Q) this.f366005c.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> q2() {
        return n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Q<? extends MediaCodec, ? extends Surface> u() {
        return n6(TrackType.f365975c);
    }
}
