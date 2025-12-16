package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.resource.bitmap.C36363g;
import j.N;
import j.P;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes5.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339477a;

    /* renamed from: b, reason: collision with root package name */
    public final a f339478b;

    /* renamed from: c, reason: collision with root package name */
    public final d f339479c;

    public c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N a aVar, @N d dVar) {
        this.f339477a = eVar;
        this.f339478b = aVar;
        this.f339479c = dVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public final w<byte[]> a(@N w<Drawable> wVar, @N k kVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f339478b.a(C36363g.d(((BitmapDrawable) drawable).getBitmap(), this.f339477a), kVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f339479c.a(wVar, kVar);
        }
        return null;
    }
}
