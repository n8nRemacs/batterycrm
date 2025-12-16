package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.audio.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f48877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23138g f48878d;

    public /* synthetic */ c(h.a aVar, C23138g c23138g, int i12) {
        this.f48876b = i12;
        this.f48877c = aVar;
        this.f48878d = c23138g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48876b) {
            case 0:
                h.a aVar = this.f48877c;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f48896b.k3(this.f48878d);
                break;
            default:
                h.a aVar2 = this.f48877c;
                C23138g c23138g = this.f48878d;
                aVar2.getClass();
                synchronized (c23138g) {
                }
                h hVar = aVar2.f48896b;
                int i13 = M.f47887a;
                hVar.m3(c23138g);
                break;
        }
    }
}
