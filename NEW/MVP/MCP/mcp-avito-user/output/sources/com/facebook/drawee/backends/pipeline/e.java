package com.facebook.drawee.backends.pipeline;

import aX0.InterfaceC19835f;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.n;
import com.facebook.common.internal.o;
import com.facebook.common.internal.r;
import com.facebook.drawee.drawable.s;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Map;
import uW0.C48986a;

/* compiled from: PipelineDraweeController.java */
/* loaded from: classes.dex */
public class e extends com.facebook.drawee.controller.b<com.facebook.common.references.a<YW0.b>, YW0.f> {

    /* renamed from: A, reason: collision with root package name */
    @I41.h
    public ImageRequest f339917A;

    /* renamed from: B, reason: collision with root package name */
    @I41.h
    public ImageRequest f339918B;

    /* renamed from: s, reason: collision with root package name */
    public final b f339919s;

    /* renamed from: t, reason: collision with root package name */
    @I41.h
    public final B f339920t;

    /* renamed from: u, reason: collision with root package name */
    public com.facebook.cache.common.c f339921u;

    /* renamed from: v, reason: collision with root package name */
    public r<com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>>> f339922v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f339923w;

    /* renamed from: x, reason: collision with root package name */
    @J41.a
    @I41.h
    public HashSet f339924x;

    /* renamed from: y, reason: collision with root package name */
    @J41.a
    @I41.h
    public DW0.e f339925y;

    /* renamed from: z, reason: collision with root package name */
    public CW0.b f339926z;

    public e(Resources resources, com.facebook.drawee.components.a aVar, WW0.a aVar2, com.facebook.common.executors.i iVar, @I41.h B b12) {
        super(aVar, iVar);
        this.f339919s = new b(resources, aVar2);
        this.f339920t = b12;
    }

    public final synchronized void A(InterfaceC19835f interfaceC19835f) {
        HashSet hashSet = this.f339924x;
        if (hashSet == null) {
            return;
        }
        hashSet.remove(interfaceC19835f);
    }

    @Override // com.facebook.drawee.controller.b
    public final Drawable c(com.facebook.common.references.a<YW0.b> aVar) {
        com.facebook.common.references.a<YW0.b> aVar2 = aVar;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            o.d(com.facebook.common.references.a.k(aVar2));
            YW0.b bVarI = aVar2.i();
            z(bVarI);
            Drawable drawableA = this.f339919s.a(bVarI);
            if (drawableA != null) {
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + bVarI);
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    @Override // com.facebook.drawee.controller.b
    @I41.h
    public final com.facebook.common.references.a<YW0.b> d() {
        com.facebook.cache.common.c cVar;
        com.facebook.imagepipeline.systrace.b.a();
        try {
            B b12 = this.f339920t;
            if (b12 != null && (cVar = this.f339921u) != null) {
                com.facebook.common.references.a<YW0.b> aVar = b12.get(cVar);
                if (aVar == null || aVar.i().a().a()) {
                    return aVar;
                }
                aVar.close();
            }
            return null;
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    @Override // com.facebook.drawee.controller.b
    public final com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> f() {
        com.facebook.imagepipeline.systrace.b.a();
        if (C48986a.f440079a.a(2)) {
            C48986a.g(Integer.valueOf(System.identityHashCode(this)), e.class, "controller %x: getDataSource");
        }
        com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar = this.f339922v.get();
        com.facebook.imagepipeline.systrace.b.a();
        return fVar;
    }

    @Override // com.facebook.drawee.controller.b
    public final int g(@I41.h com.facebook.common.references.a<YW0.b> aVar) {
        com.facebook.common.references.a<YW0.b> aVar2 = aVar;
        if (aVar2 == null || !aVar2.j()) {
            return 0;
        }
        return System.identityHashCode(aVar2.f339841c.b());
    }

    @Override // com.facebook.drawee.controller.b
    public final YW0.f h(Object obj) {
        com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
        o.d(com.facebook.common.references.a.k(aVar));
        return (YW0.f) aVar.i();
    }

    @Override // com.facebook.drawee.controller.b
    @I41.h
    public final Uri i() {
        Uri uriApply;
        ImageRequest imageRequest = this.f339917A;
        ImageRequest imageRequest2 = this.f339918B;
        com.facebook.common.internal.i<ImageRequest, Uri> iVar = ImageRequest.f340780o;
        if (imageRequest != null && (uriApply = iVar.apply(imageRequest)) != null) {
            return uriApply;
        }
        if (imageRequest2 != null) {
            return iVar.apply(imageRequest2);
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.b, IW0.a
    public final void i2(@I41.h IW0.b bVar) {
        super.i2(bVar);
        z(null);
    }

    @Override // com.facebook.drawee.controller.b
    @I41.h
    public final Map o(YW0.f fVar) {
        YW0.f fVar2 = fVar;
        if (fVar2 == null) {
            return null;
        }
        return fVar2.getExtras();
    }

    @Override // com.facebook.drawee.controller.b
    public final void q(Object obj, String str) {
        synchronized (this) {
            try {
                DW0.e eVar = this.f339925y;
                if (eVar != null) {
                    eVar.a(6, str, "PipelineDraweeController", true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.controller.b
    public final void s(@I41.h Drawable drawable) {
        if (drawable instanceof AW0.a) {
            ((AW0.a) drawable).a();
        }
    }

    @Override // com.facebook.drawee.controller.b
    public final String toString() {
        n.b bVarB = n.b(this);
        bVarB.b(super.toString(), "super");
        bVarB.b(this.f339922v, "dataSourceSupplier");
        return bVarB.toString();
    }

    @Override // com.facebook.drawee.controller.b
    public final void u(@I41.h com.facebook.common.references.a<YW0.b> aVar) {
        com.facebook.common.references.a.c(aVar);
    }

    public final synchronized void x(DW0.e eVar) {
        try {
            DW0.e eVar2 = this.f339925y;
            if (eVar2 instanceof DW0.a) {
                DW0.a aVar = (DW0.a) eVar2;
                synchronized (aVar) {
                    aVar.f3222a.add(eVar);
                }
            } else if (eVar2 != null) {
                this.f339925y = new DW0.a(eVar2, eVar);
            } else {
                this.f339925y = eVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void y(r rVar, String str, com.facebook.cache.common.c cVar) {
        com.facebook.imagepipeline.systrace.b.a();
        j(str);
        this.f340006n = false;
        this.f339922v = rVar;
        z(null);
        this.f339921u = cVar;
        synchronized (this) {
            this.f339925y = null;
        }
        z(null);
        x(null);
        com.facebook.imagepipeline.systrace.b.a();
    }

    public final void z(@I41.h YW0.b bVar) {
        String str;
        com.facebook.drawee.drawable.r rVarA;
        if (this.f339923w) {
            if (this.f339999g == null) {
                EW0.a aVar = new EW0.a();
                FW0.a aVar2 = new FW0.a();
                aVar2.f4723c = -1L;
                aVar2.f4724d = aVar;
                this.f339926z = new CW0.b();
                a(aVar2);
                this.f339999g = aVar;
                IW0.c cVar = this.f339998f;
                if (cVar != null) {
                    cVar.e(aVar);
                }
            }
            if (this.f339925y == null) {
                x(this.f339926z);
            }
            EW0.a aVar3 = this.f339999g;
            if (aVar3 != null) {
                String str2 = this.f340000h;
                aVar3.getClass();
                if (str2 == null) {
                    str2 = "none";
                }
                aVar3.f4039b = str2;
                aVar3.invalidateSelf();
                IW0.c cVar2 = this.f339998f;
                s.c cVar3 = null;
                if (cVar2 != null && (rVarA = s.a(cVar2.a())) != null) {
                    cVar3 = rVarA.f340122f;
                }
                aVar3.f4043f = cVar3;
                int i12 = this.f339926z.f2200a;
                switch (i12) {
                    case 2:
                        str = "network";
                        break;
                    case 3:
                        str = "disk";
                        break;
                    case 4:
                        str = "memory_encoded";
                        break;
                    case 5:
                        str = "memory_bitmap";
                        break;
                    case 6:
                        str = "memory_bitmap_shortcut";
                        break;
                    case 7:
                        str = "local";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
                int i13 = CW0.a.f2199a.get(i12, -1);
                aVar3.f4058u = str;
                aVar3.f4059v = i13;
                aVar3.invalidateSelf();
                if (bVar == null) {
                    aVar3.b();
                    return;
                }
                YW0.c cVar4 = (YW0.c) bVar;
                int width = cVar4.getWidth();
                int height = cVar4.getHeight();
                aVar3.f4040c = width;
                aVar3.f4041d = height;
                aVar3.invalidateSelf();
                aVar3.f4042e = bVar.b();
            }
        }
    }
}
