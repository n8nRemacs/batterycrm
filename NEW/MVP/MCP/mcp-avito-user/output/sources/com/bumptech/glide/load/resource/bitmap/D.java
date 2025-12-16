package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.v;
import j.N;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes5.dex */
public class D implements com.bumptech.glide.load.l<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final o f339323a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339324b;

    /* compiled from: StreamBitmapDecoder.java */
    public static class a implements o.b {

        /* renamed from: a, reason: collision with root package name */
        public final z f339325a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.util.d f339326b;

        public a(z zVar, com.bumptech.glide.util.d dVar) {
            this.f339325a = zVar;
            this.f339326b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public final void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
            IOException iOException = this.f339326b.f339637c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                eVar.b(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public final void b() {
            z zVar = this.f339325a;
            synchronized (zVar) {
                zVar.f339416d = zVar.f339414b.length;
            }
        }
    }

    public D(o oVar, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339323a = oVar;
        this.f339324b = jVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N InputStream inputStream, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N InputStream inputStream, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        z zVar;
        boolean z12;
        com.bumptech.glide.util.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof z) {
            z12 = false;
            zVar = (z) inputStream2;
        } else {
            zVar = new z(inputStream2, this.f339324b);
            z12 = true;
        }
        ArrayDeque arrayDeque = com.bumptech.glide.util.d.f339635d;
        synchronized (arrayDeque) {
            dVar = (com.bumptech.glide.util.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new com.bumptech.glide.util.d();
        }
        com.bumptech.glide.util.d dVar2 = dVar;
        dVar2.f339636b = zVar;
        com.bumptech.glide.util.i iVar = new com.bumptech.glide.util.i(dVar2);
        a aVar = new a(zVar, dVar2);
        try {
            o oVar = this.f339323a;
            C36363g c36363gA = oVar.a(new v.a(oVar.f339385c, iVar, oVar.f339386d), i12, i13, kVar, aVar);
            dVar2.f339637c = null;
            dVar2.f339636b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z12) {
                zVar.b();
            }
            return c36363gA;
        } catch (Throwable th2) {
            dVar2.f339637c = null;
            dVar2.f339636b = null;
            ArrayDeque arrayDeque2 = com.bumptech.glide.util.d.f339635d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z12) {
                    zVar.b();
                }
                throw th2;
            }
        }
    }
}
