package androidx.media3.exoplayer.video;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.video.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50310b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f50311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f50312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50313e;

    public /* synthetic */ i(l.a aVar, int i12, long j12) {
        this.f50311c = aVar;
        this.f50313e = i12;
        this.f50312d = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f50313e;
        long j12 = this.f50312d;
        l.a aVar = this.f50311c;
        int i13 = this.f50310b;
        aVar.getClass();
        switch (i13) {
            case 0:
                int i14 = M.f47887a;
                aVar.f50322b.g2(i12, j12);
                break;
            default:
                int i15 = M.f47887a;
                aVar.f50322b.R2(i12, j12);
                break;
        }
    }

    public /* synthetic */ i(l.a aVar, long j12, int i12) {
        this.f50311c = aVar;
        this.f50312d = j12;
        this.f50313e = i12;
    }
}
