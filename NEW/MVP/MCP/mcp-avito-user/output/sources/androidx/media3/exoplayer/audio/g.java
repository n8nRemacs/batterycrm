package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.h;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f48893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48894f;

    public /* synthetic */ g(Object obj, int i12, long j12, long j13, int i13) {
        this.f48890b = i13;
        this.f48894f = obj;
        this.f48891c = i12;
        this.f48892d = j12;
        this.f48893e = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f48894f;
        switch (this.f48890b) {
            case 0:
                h.a aVar = (h.a) obj;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f48896b.F2(this.f48891c, this.f48892d, this.f48893e);
                break;
            default:
                i.a aVar2 = (i.a) obj;
                aVar2.getClass();
                int i13 = U.f348106a;
                aVar2.f343997b.F2(this.f48891c, this.f48892d, this.f48893e);
                break;
        }
    }
}
