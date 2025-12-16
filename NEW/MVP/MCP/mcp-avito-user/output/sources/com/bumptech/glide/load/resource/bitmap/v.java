package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import j.P;
import j.X;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: ImageReader.java */
/* loaded from: classes5.dex */
interface v {

    /* compiled from: ImageReader.java */
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f339404a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.j f339405b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f339406c;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.j jVar, InputStream inputStream, ArrayList arrayList) {
            com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
            this.f339405b = jVar;
            com.bumptech.glide.util.k.c(arrayList, "Argument must not be null");
            this.f339406c = arrayList;
            this.f339404a = new com.bumptech.glide.load.data.k(inputStream, jVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final void a() {
            z zVar = this.f339404a.f338870a;
            synchronized (zVar) {
                zVar.f339416d = zVar.f339414b.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @P
        public final Bitmap b(BitmapFactory.Options options) {
            z zVar = this.f339404a.f338870a;
            zVar.reset();
            return BitmapFactory.decodeStream(zVar, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final int c() {
            z zVar = this.f339404a.f338870a;
            zVar.reset();
            return com.bumptech.glide.load.g.a(this.f339405b, zVar, this.f339406c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final ImageHeaderParser.ImageType d() {
            z zVar = this.f339404a.f338870a;
            zVar.reset();
            return com.bumptech.glide.load.g.c(this.f339405b, zVar, this.f339406c);
        }
    }

    void a();

    @P
    Bitmap b(BitmapFactory.Options options);

    int c();

    ImageHeaderParser.ImageType d();

    /* compiled from: ImageReader.java */
    @X
    public static final class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.j f339407a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f339408b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.m f339409c;

        public b(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
            com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
            this.f339407a = jVar;
            com.bumptech.glide.util.k.c(arrayList, "Argument must not be null");
            this.f339408b = arrayList;
            this.f339409c = new com.bumptech.glide.load.data.m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @P
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f339409c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final int c() {
            return com.bumptech.glide.load.g.b(this.f339408b, this.f339409c, this.f339407a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.g.d(this.f339408b, this.f339409c, this.f339407a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public final void a() {
        }
    }
}
