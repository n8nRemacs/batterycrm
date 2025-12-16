package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;
import j.N;
import j.P;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC10499a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339432a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339433b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @P com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339432a = eVar;
        this.f339433b = jVar;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    @N
    public final byte[] a(int i12) {
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339433b;
        return jVar == null ? new byte[i12] : (byte[]) jVar.d(byte[].class, i12);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    @N
    public final int[] b(int i12) {
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339433b;
        return jVar == null ? new int[i12] : (int[]) jVar.d(int[].class, i12);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    public final void c(@N byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339433b;
        if (jVar == null) {
            return;
        }
        jVar.i(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    public final void d(@N int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339433b;
        if (jVar == null) {
            return;
        }
        jVar.i(iArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    @N
    public final Bitmap e(int i12, int i13, @N Bitmap.Config config) {
        return this.f339432a.d(i12, i13, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC10499a
    public final void f(@N Bitmap bitmap) {
        this.f339432a.b(bitmap);
    }
}
