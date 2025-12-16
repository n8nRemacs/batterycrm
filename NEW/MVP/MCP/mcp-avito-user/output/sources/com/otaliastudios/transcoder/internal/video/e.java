package com.otaliastudios.transcoder.internal.video;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.otaliastudios.transcoder.internal.codec.k;
import com.otaliastudios.transcoder.internal.pipeline.b;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.pipeline.l;
import kotlin.Metadata;

/* compiled from: VideoPublisher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/otaliastudios/transcoder/internal/video/e;", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lcom/otaliastudios/transcoder/internal/codec/l;", "Lcom/otaliastudios/transcoder/internal/codec/k;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements l<Long, com.otaliastudios.transcoder.internal.pipeline.b, com.otaliastudios.transcoder.internal.codec.l, k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b.a f366239b = com.otaliastudios.transcoder.internal.pipeline.b.f366153a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.opengl.core.c f366240c = new com.otaliastudios.opengl.core.c(EGL14.EGL_NO_CONTEXT, 1);

    /* renamed from: d, reason: collision with root package name */
    public s11.e f366241d;

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366239b;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
        s11.e eVar = this.f366241d;
        if (eVar == null) {
            eVar = null;
        }
        EGL14.eglDestroySurface(eVar.f437298a.f365914a.f428959a, eVar.f437299b.f428976a);
        eVar.f437299b = q11.e.f428962c;
        if (eVar.f437301d) {
            Surface surface = eVar.f437300c;
            if (surface != null) {
                surface.release();
            }
            eVar.f437300c = null;
        }
        this.f366240c.a();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.k<com.otaliastudios.transcoder.internal.codec.l> s(@Y61.k k.b<Long> bVar, boolean z12) {
        if (bVar instanceof k.a) {
            com.otaliastudios.transcoder.internal.codec.l.f366085d.getClass();
            return new k.a(com.otaliastudios.transcoder.internal.codec.l.f366086e);
        }
        s11.e eVar = this.f366241d;
        if (eVar == null) {
            eVar = null;
        }
        EGLExt.eglPresentationTimeANDROID(eVar.f437298a.f365914a.f428959a, eVar.f437299b.f428976a, bVar.f366179a.longValue() * 1000);
        s11.e eVar2 = this.f366241d;
        s11.e eVar3 = eVar2 != null ? eVar2 : null;
        EGL14.eglSwapBuffers(eVar3.f437298a.f365914a.f428959a, eVar3.f437299b.f428976a);
        com.otaliastudios.transcoder.internal.codec.l.f366085d.getClass();
        return new k.b(com.otaliastudios.transcoder.internal.codec.l.f366086e);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(com.otaliastudios.transcoder.internal.pipeline.b bVar) {
        s11.e eVar = new s11.e(this.f366240c, ((com.otaliastudios.transcoder.internal.codec.k) bVar).getF366070d(), false);
        this.f366241d = eVar;
        q11.f fVar = eVar.f437299b;
        com.otaliastudios.opengl.core.c cVar = eVar.f437298a;
        q11.d dVar = cVar.f365914a;
        q11.c cVar2 = q11.e.f428960a;
        q11.c cVar3 = cVar.f365915b;
        EGLDisplay eGLDisplay = dVar.f428959a;
        EGLContext eGLContext = cVar3.f428958a;
        EGLSurface eGLSurface = fVar.f428976a;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }
}
