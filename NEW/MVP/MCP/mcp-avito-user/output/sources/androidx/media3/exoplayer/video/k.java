package androidx.media3.exoplayer.video;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.video.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f50319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23138g f50320d;

    public /* synthetic */ k(l.a aVar, C23138g c23138g, int i12) {
        this.f50318b = i12;
        this.f50319c = aVar;
        this.f50320d = c23138g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50318b) {
            case 0:
                l.a aVar = this.f50319c;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f50322b.h3(this.f50320d);
                break;
            default:
                l.a aVar2 = this.f50319c;
                C23138g c23138g = this.f50320d;
                aVar2.getClass();
                synchronized (c23138g) {
                }
                l lVar = aVar2.f50322b;
                int i13 = M.f47887a;
                lVar.j3(c23138g);
                break;
        }
    }
}
