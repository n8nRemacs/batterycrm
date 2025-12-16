package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.compose.foundation.text.selection.C21030p;
import com.bumptech.glide.load.j;
import j.N;
import j.P;
import j.X;
import j.k0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* loaded from: classes5.dex */
public class J<T> implements com.bumptech.glide.load.l<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Long> f339351d = new com.bumptech.glide.load.j<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Integer> f339352e = new com.bumptech.glide.load.j<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    public static final e f339353f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final f<T> f339354a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339355b;

    /* renamed from: c, reason: collision with root package name */
    public final e f339356c;

    /* compiled from: VideoDecoder.java */
    public class a implements j.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f339357a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.j.b
        public final void a(@N byte[] bArr, @N Long l12, @N MessageDigest messageDigest) {
            Long l13 = l12;
            messageDigest.update(bArr);
            synchronized (this.f339357a) {
                this.f339357a.position(0);
                messageDigest.update(this.f339357a.putLong(l13.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public class b implements j.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f339358a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.j.b
        public final void a(@N byte[] bArr, @N Integer num, @N MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f339358a) {
                this.f339358a.position(0);
                messageDigest.update(this.f339358a.putInt(num2.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class c implements f<AssetFileDescriptor> {
        public c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.J.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: VideoDecoder.java */
    @X
    public static final class d implements f<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.J.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new K(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    @k0
    public static class e {
    }

    /* compiled from: VideoDecoder.java */
    @k0
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t12);
    }

    /* compiled from: VideoDecoder.java */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.J.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    @k0
    public J() {
        throw null;
    }

    public J(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar) {
        e eVar2 = f339353f;
        this.f339355b = eVar;
        this.f339354a = fVar;
        this.f339356c = eVar2;
    }

    public static J c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new J(eVar, new c(null));
    }

    @X
    public static J d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new J(eVar, new d());
    }

    @P
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j12, int i12, int i13, int i14, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime = null;
        if (i13 != Integer.MIN_VALUE && i14 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f339335d) {
            try {
                int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i17 == 90 || i17 == 270) {
                    i16 = i15;
                    i15 = i16;
                }
                float fB2 = downsampleStrategy.b(i15, i16, i13, i14);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j12, i12, Math.round(i15 * fB2), Math.round(fB2 * i16));
            } catch (Throwable unused) {
                Log.isLoggable("VideoDecoder", 3);
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j12, i12) : scaledFrameAtTime;
    }

    public static J f(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new J(eVar, new g());
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N T t12, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N T t12, int i12, int i13, @N com.bumptech.glide.load.k kVar) throws IOException {
        long jLongValue = ((Long) kVar.c(f339351d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(C21030p.a(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) kVar.c(f339352e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) kVar.c(DownsampleStrategy.f339337f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f339336e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.f339356c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f339354a.a(mediaMetadataRetriever, t12);
                Bitmap bitmapE = e(mediaMetadataRetriever, jLongValue, num.intValue(), i12, i13, downsampleStrategy2);
                mediaMetadataRetriever.release();
                return C36363g.d(bitmapE, this.f339355b);
            } catch (RuntimeException e12) {
                throw new IOException(e12);
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }
}
