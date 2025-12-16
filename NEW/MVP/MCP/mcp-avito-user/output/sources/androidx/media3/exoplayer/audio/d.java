package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f48880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f48881d;

    public /* synthetic */ d(h.a aVar, Exception exc, int i12) {
        this.f48879b = i12;
        this.f48880c = aVar;
        this.f48881d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.f48881d;
        h.a aVar = this.f48880c;
        int i12 = this.f48879b;
        aVar.getClass();
        switch (i12) {
            case 0:
                int i13 = M.f47887a;
                aVar.f48896b.l2(exc);
                break;
            default:
                int i14 = M.f47887a;
                aVar.f48896b.b1(exc);
                break;
        }
    }
}
