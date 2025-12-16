package com.avito.android.publish.details;

import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.details.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class RunnableC33786s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f234914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f234916e;

    public /* synthetic */ RunnableC33786s(Object obj, int i12, int i13, int i14) {
        this.f234913b = i14;
        this.f234916e = obj;
        this.f234914c = i12;
        this.f234915d = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f234913b) {
            case 0:
                ((C33789t) this.f234916e).f234952l.b2(this.f234914c, this.f234915d);
                break;
            case 1:
                ((com.avito.android.publish.screen.objects.view.m) this.f234916e).f240372o.b2(this.f234914c, this.f234915d);
                break;
            case 2:
                ((com.avito.android.publish.screen.step.params.view.j) this.f234916e).f241619q.b2(this.f234914c, this.f234915d);
                break;
            case 3:
                ((SurfaceTextureHelper) this.f234916e).lambda$setTextureSize$2(this.f234914c, this.f234915d);
                break;
            default:
                ((SurfaceViewRenderer) this.f234916e).lambda$onFrameResolutionChanged$0(this.f234914c, this.f234915d);
                break;
        }
    }
}
