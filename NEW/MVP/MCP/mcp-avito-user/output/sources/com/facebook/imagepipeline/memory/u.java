package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.memory.C36391i;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedList;

/* compiled from: LruBitmapPool.java */
@Nullsafe
/* loaded from: classes13.dex */
public class u implements InterfaceC36387e {

    /* renamed from: a, reason: collision with root package name */
    public final C36388f f340483a = new C36388f();

    /* renamed from: b, reason: collision with root package name */
    public final int f340484b;

    /* renamed from: c, reason: collision with root package name */
    public final B f340485c;

    /* renamed from: d, reason: collision with root package name */
    public int f340486d;

    public u(int i12, B b12) {
        this.f340484b = i12;
        this.f340485c = b12;
    }

    @Override // wW0.e, com.facebook.common.references.h
    public final void a(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.f340483a.getClass();
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        if (sizeInBytes <= this.f340484b) {
            this.f340485c.getClass();
            C36388f c36388f = this.f340483a;
            c36388f.getClass();
            if (C36388f.c(bitmap)) {
                synchronized (c36388f) {
                    zAdd = c36388f.f340487a.add(bitmap);
                }
                if (zAdd) {
                    C36391i<T> c36391i = c36388f.f340488b;
                    int sizeInBytes2 = BitmapUtil.getSizeInBytes(bitmap);
                    synchronized (c36391i) {
                        try {
                            C36391i.b bVar = (C36391i.b) c36391i.f340469a.get(sizeInBytes2);
                            if (bVar == null) {
                                C36391i.b bVar2 = new C36391i.b(null, sizeInBytes2, new LinkedList(), null, null);
                                c36391i.f340469a.put(sizeInBytes2, bVar2);
                                bVar = bVar2;
                            }
                            bVar.f340474c.addLast(bitmap);
                            if (c36391i.f340470b != bVar) {
                                c36391i.a(bVar);
                                C36391i.b bVar3 = c36391i.f340470b;
                                if (bVar3 == null) {
                                    c36391i.f340470b = bVar;
                                    c36391i.f340471c = bVar;
                                } else {
                                    bVar.f340475d = bVar3;
                                    bVar3.f340472a = bVar;
                                    c36391i.f340470b = bVar;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.f340486d += sizeInBytes;
            }
        }
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
        d((int) ((1.0d - memoryTrimType.f339833b) * 0));
    }

    public final synchronized void d(int i12) {
        Bitmap bitmapA;
        while (this.f340486d > i12 && (bitmapA = this.f340483a.a()) != null) {
            this.f340483a.getClass();
            this.f340486d -= BitmapUtil.getSizeInBytes(bitmapA);
            this.f340485c.getClass();
        }
    }

    @Override // wW0.e
    public final Bitmap get(int i12) {
        Bitmap bitmapCreateBitmap;
        synchronized (this) {
            try {
                if (this.f340486d > 0) {
                    d(0);
                }
                bitmapCreateBitmap = (Bitmap) this.f340483a.b(i12);
                if (bitmapCreateBitmap != null) {
                    this.f340483a.getClass();
                    this.f340486d -= BitmapUtil.getSizeInBytes(bitmapCreateBitmap);
                    this.f340485c.getClass();
                } else {
                    this.f340485c.getClass();
                    bitmapCreateBitmap = Bitmap.createBitmap(1, i12, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmapCreateBitmap;
    }
}
