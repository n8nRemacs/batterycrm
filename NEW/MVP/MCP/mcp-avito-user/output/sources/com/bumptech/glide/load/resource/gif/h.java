package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.bitmap.C36363g;
import j.N;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes5.dex */
public final class h implements l<com.bumptech.glide.gifdecoder.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339468a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f339468a = eVar;
    }

    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N com.bumptech.glide.gifdecoder.a aVar, @N k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public final w<Bitmap> b(@N com.bumptech.glide.gifdecoder.a aVar, int i12, int i13, @N k kVar) {
        return C36363g.d(aVar.getNextFrame(), this.f339468a);
    }
}
