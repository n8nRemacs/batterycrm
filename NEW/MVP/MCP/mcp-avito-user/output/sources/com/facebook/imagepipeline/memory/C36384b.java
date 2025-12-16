package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapCounter.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36384b {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public int f340456a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public long f340457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340459d;

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.common.references.h<Bitmap> f340460e;

    /* compiled from: BitmapCounter.java */
    /* renamed from: com.facebook.imagepipeline.memory.b$a */
    public class a implements com.facebook.common.references.h<Bitmap> {
        public a() {
        }

        @Override // com.facebook.common.references.h
        public final void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                C36384b.this.a(bitmap2);
            } finally {
                bitmap2.recycle();
            }
        }
    }

    public C36384b(int i12, int i13) {
        if (!(i12 > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i13 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f340458c = i12;
        this.f340459d = i13;
        this.f340460e = new a();
    }

    public final synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        com.facebook.common.internal.o.b("No bitmaps registered.", this.f340456a > 0);
        long j12 = sizeInBytes;
        boolean z12 = j12 <= this.f340457b;
        Object[] objArr = {Integer.valueOf(sizeInBytes), Long.valueOf(this.f340457b)};
        if (!z12) {
            throw new IllegalArgumentException(com.facebook.common.internal.o.e("Bitmap size bigger than the total registered size: %d, %d", objArr));
        }
        this.f340457b -= j12;
        this.f340456a--;
    }

    public final synchronized int b() {
        return this.f340459d;
    }
}
