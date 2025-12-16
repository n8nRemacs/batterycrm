package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.gif.c;
import com.bumptech.glide.util.m;
import j.N;
import j.P;
import j.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes5.dex */
public class a implements l<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    public static final C10515a f339424f = new C10515a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f339425g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f339426a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f339427b;

    /* renamed from: c, reason: collision with root package name */
    public final b f339428c;

    /* renamed from: d, reason: collision with root package name */
    public final C10515a f339429d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.gif.b f339430e;

    /* compiled from: ByteBufferGifDecoder.java */
    @k0
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    public static class C10515a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    @k0
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f339431a;

        public b() {
            char[] cArr = m.f339649a;
            this.f339431a = new ArrayDeque(0);
        }

        public final synchronized void a(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.f338778b = null;
            dVar.f338779c = null;
            this.f339431a.offer(dVar);
        }
    }

    @k0
    public a() {
        throw null;
    }

    public a(Context context, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        b bVar = f339425g;
        C10515a c10515a = f339424f;
        this.f339426a = context.getApplicationContext();
        this.f339427b = arrayList;
        this.f339429d = c10515a;
        this.f339430e = new com.bumptech.glide.load.resource.gif.b(eVar, jVar);
        this.f339428c = bVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N ByteBuffer byteBuffer, @N k kVar) {
        return !((Boolean) kVar.c(i.f339470b)).booleanValue() && com.bumptech.glide.load.g.e(this.f339427b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.l
    public final w<c> b(@N ByteBuffer byteBuffer, int i12, int i13, @N k kVar) {
        com.bumptech.glide.gifdecoder.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f339428c;
        synchronized (bVar) {
            try {
                com.bumptech.glide.gifdecoder.d dVar2 = (com.bumptech.glide.gifdecoder.d) bVar.f339431a.poll();
                if (dVar2 == null) {
                    dVar2 = new com.bumptech.glide.gifdecoder.d();
                }
                dVar = dVar2;
                dVar.f338778b = null;
                Arrays.fill(dVar.f338777a, (byte) 0);
                dVar.f338779c = new com.bumptech.glide.gifdecoder.c();
                dVar.f338780d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                dVar.f338778b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                dVar.f338778b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return c(byteBuffer2, i12, i13, dVar, kVar);
        } finally {
            this.f339428c.a(dVar);
        }
    }

    @P
    public final e c(ByteBuffer byteBuffer, int i12, int i13, com.bumptech.glide.gifdecoder.d dVar, k kVar) {
        int i14 = com.bumptech.glide.util.g.f339641a;
        SystemClock.elapsedRealtimeNanos();
        try {
            com.bumptech.glide.gifdecoder.c cVarB = dVar.b();
            if (cVarB.f338768c > 0 && cVarB.f338767b == 0) {
                Bitmap.Config config = kVar.c(i.f339469a) == DecodeFormat.f338834c ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(cVarB.f338772g / i13, cVarB.f338771f / i12);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                C10515a c10515a = this.f339429d;
                com.bumptech.glide.load.resource.gif.b bVar = this.f339430e;
                c10515a.getClass();
                com.bumptech.glide.gifdecoder.f fVar = new com.bumptech.glide.gifdecoder.f(bVar, cVarB, byteBuffer, iMax);
                fVar.d(config);
                fVar.a();
                Bitmap nextFrame = fVar.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return null;
                }
                e eVar = new e(new c(new c.a(new g(com.bumptech.glide.b.b(this.f339426a), fVar, i12, i13, com.bumptech.glide.load.resource.c.f339420b, nextFrame))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
