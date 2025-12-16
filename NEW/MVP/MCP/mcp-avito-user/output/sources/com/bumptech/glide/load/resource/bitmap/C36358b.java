package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import j.N;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36358b implements com.bumptech.glide.load.m<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339362a;

    /* renamed from: b, reason: collision with root package name */
    public final C36361e f339363b;

    public C36358b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, C36361e c36361e) {
        this.f339362a = eVar;
        this.f339363b = c36361e;
    }

    @Override // com.bumptech.glide.load.a
    public final boolean a(@N Object obj, @N File file, @N com.bumptech.glide.load.k kVar) {
        return this.f339363b.a(new C36363g(((BitmapDrawable) ((com.bumptech.glide.load.engine.w) obj).get()).getBitmap(), this.f339362a), file, kVar);
    }

    @Override // com.bumptech.glide.load.m
    @N
    public final EncodeStrategy b(@N com.bumptech.glide.load.k kVar) {
        return EncodeStrategy.f338838c;
    }
}
