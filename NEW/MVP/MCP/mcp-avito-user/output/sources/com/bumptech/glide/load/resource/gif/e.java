package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.gif.g;
import j.N;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes5.dex */
public class e extends com.bumptech.glide.load.resource.drawable.b<c> implements s {
    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.s
    public final void a() {
        ((c) this.f339422b).c().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<c> b() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
        c cVar = (c) this.f339422b;
        cVar.stop();
        cVar.f339437e = true;
        g gVar = cVar.f339434b.f339444a;
        gVar.f339448c.clear();
        Bitmap bitmap = gVar.f339457l;
        if (bitmap != null) {
            gVar.f339450e.b(bitmap);
            gVar.f339457l = null;
        }
        gVar.f339451f = false;
        g.a aVar = gVar.f339454i;
        com.bumptech.glide.j jVar = gVar.f339449d;
        if (aVar != null) {
            jVar.i(aVar);
            gVar.f339454i = null;
        }
        g.a aVar2 = gVar.f339456k;
        if (aVar2 != null) {
            jVar.i(aVar2);
            gVar.f339456k = null;
        }
        g.a aVar3 = gVar.f339459n;
        if (aVar3 != null) {
            jVar.i(aVar3);
            gVar.f339459n = null;
        }
        com.bumptech.glide.gifdecoder.f fVar = gVar.f339446a;
        fVar.f338792l = null;
        byte[] bArr = fVar.f338789i;
        a.InterfaceC10499a interfaceC10499a = fVar.f338783c;
        if (bArr != null) {
            interfaceC10499a.c(bArr);
        }
        int[] iArr = fVar.f338790j;
        if (iArr != null) {
            interfaceC10499a.d(iArr);
        }
        Bitmap bitmap2 = fVar.f338793m;
        if (bitmap2 != null) {
            interfaceC10499a.f(bitmap2);
        }
        fVar.f338793m = null;
        fVar.f338784d = null;
        fVar.f338799s = null;
        byte[] bArr2 = fVar.f338785e;
        if (bArr2 != null) {
            interfaceC10499a.c(bArr2);
        }
        gVar.f339455j = true;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        g gVar = ((c) this.f339422b).f339434b.f339444a;
        com.bumptech.glide.gifdecoder.f fVar = gVar.f339446a;
        return (fVar.f338790j.length * 4) + fVar.f338784d.limit() + fVar.f338789i.length + gVar.f339460o;
    }
}
