package com.otaliastudios.transcoder.internal.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import j.B;

/* compiled from: FrameDrawer.java */
/* loaded from: classes7.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f366224a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f366225b;

    /* renamed from: c, reason: collision with root package name */
    public com.otaliastudios.opengl.program.g f366226c;

    /* renamed from: d, reason: collision with root package name */
    public com.otaliastudios.opengl.draw.h f366227d;

    /* renamed from: i, reason: collision with root package name */
    @B
    public boolean f366232i;

    /* renamed from: e, reason: collision with root package name */
    public float f366228e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f366229f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f366230g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f366231h = false;

    /* renamed from: j, reason: collision with root package name */
    public final Object f366233j = new Object();

    /* compiled from: FrameDrawer.java */
    /* renamed from: com.otaliastudios.transcoder.internal.video.a$a, reason: collision with other inner class name */
    public class C10803a implements SurfaceTexture.OnFrameAvailableListener {
        public C10803a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            synchronized (a.this.f366233j) {
                try {
                    a aVar = a.this;
                    if (aVar.f366232i) {
                        throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                    }
                    aVar.f366232i = true;
                    aVar.f366233j.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public a() {
        com.otaliastudios.opengl.texture.c cVar = new com.otaliastudios.opengl.texture.c();
        com.otaliastudios.opengl.program.g gVar = new com.otaliastudios.opengl.program.g();
        this.f366226c = gVar;
        gVar.f365958o = cVar;
        this.f366227d = new com.otaliastudios.opengl.draw.h();
        SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f365965g);
        this.f366224a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C10803a());
        this.f366225b = new Surface(this.f366224a);
    }
}
