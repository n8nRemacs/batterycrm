package com.bumptech.glide.load.resource;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.avito.android.util.C35767c4;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.bitmap.C36363g;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;
import j.N;
import j.P;
import j.X;

/* compiled from: ImageDecoderResourceDecoder.java */
@X
/* loaded from: classes5.dex */
public abstract class a<T> implements l<ImageDecoder.Source, T> {

    /* renamed from: a, reason: collision with root package name */
    public final u f339310a = u.a();

    /* compiled from: ImageDecoderResourceDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.a$a, reason: collision with other inner class name */
    public class C10513a implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f339311a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f339312b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f339313c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DecodeFormat f339314d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DownsampleStrategy f339315e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ PreferredColorSpace f339316f;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: com.bumptech.glide.load.resource.a$a$a, reason: collision with other inner class name */
        public class C10514a implements ImageDecoder$OnPartialImageListener {
            public final boolean onPartialImage(@N ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C10513a(int i12, int i13, boolean z12, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f339311a = i12;
            this.f339312b = i13;
            this.f339313c = z12;
            this.f339314d = decodeFormat;
            this.f339315e = downsampleStrategy;
            this.f339316f = preferredColorSpace;
        }

        @SuppressLint({"Override"})
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (a.this.f339310a.b(this.f339311a, this.f339312b, this.f339313c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f339314d == DecodeFormat.f338834c) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C10514a());
            Size size = imageInfo.getSize();
            int width = this.f339311a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f339312b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fB2 = this.f339315e.b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fB2);
            int iRound2 = Math.round(fB2 * size.getHeight());
            if (Log.isLoggable("ImageDecoder", 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((this.f339316f == PreferredColorSpace.f338843c && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N ImageDecoder.Source source, @N k kVar) {
        C35767c4.u(source);
        return true;
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final /* bridge */ /* synthetic */ w b(@N ImageDecoder.Source source, int i12, int i13, @N k kVar) {
        return c(C35767c4.g(source), i12, i13, kVar);
    }

    @P
    public final w<T> c(@N ImageDecoder.Source source, int i12, int i13, @N k kVar) {
        DecodeFormat decodeFormat = (DecodeFormat) kVar.c(o.f339375f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) kVar.c(DownsampleStrategy.f339337f);
        j<Boolean> jVar = o.f339378i;
        return d(source, new C10513a(i12, i13, kVar.c(jVar) != null && ((Boolean) kVar.c(jVar)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) kVar.c(o.f339376g)));
    }

    public abstract C36363g d(ImageDecoder.Source source, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener);
}
