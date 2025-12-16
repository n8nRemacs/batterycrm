package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.w;
import j.N;
import j.P;

/* compiled from: LruResourceCache.java */
/* loaded from: classes5.dex */
public class n extends com.bumptech.glide.util.h<com.bumptech.glide.load.h, w<?>> implements o {

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.load.engine.m f338971d;

    @Override // com.bumptech.glide.util.h
    public final int c(@P w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.getSize();
    }

    @Override // com.bumptech.glide.util.h
    public final void d(@N com.bumptech.glide.load.h hVar, @P w<?> wVar) {
        w<?> wVar2 = wVar;
        com.bumptech.glide.load.engine.m mVar = this.f338971d;
        if (mVar == null || wVar2 == null) {
            return;
        }
        mVar.e(wVar2);
    }
}
