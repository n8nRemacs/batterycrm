package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.C36363g;
import com.bumptech.glide.util.k;
import j.N;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes5.dex */
public class f implements n<c> {

    /* renamed from: b, reason: collision with root package name */
    public final n<Bitmap> f339445b;

    public f(n<Bitmap> nVar) {
        k.c(nVar, "Argument must not be null");
        this.f339445b = nVar;
    }

    @Override // com.bumptech.glide.load.n
    @N
    public final w<c> a(@N Context context, @N w<c> wVar, int i12, int i13) {
        c cVar = wVar.get();
        w<Bitmap> c36363g = new C36363g(cVar.c(), com.bumptech.glide.b.b(context).f338682b);
        n<Bitmap> nVar = this.f339445b;
        w<Bitmap> wVarA = nVar.a(context, c36363g, i12, i13);
        if (!c36363g.equals(wVarA)) {
            c36363g.c();
        }
        cVar.f339434b.f339444a.c(nVar, wVarA.get());
        return wVar;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        this.f339445b.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f339445b.equals(((f) obj).f339445b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f339445b.hashCode();
    }
}
