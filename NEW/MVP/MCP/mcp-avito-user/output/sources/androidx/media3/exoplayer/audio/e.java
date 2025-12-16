package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.h;
import androidx.media3.exoplayer.video.l;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.n;
import com.my.tracker.obfuscated.n1;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.pc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f48885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48886f;

    public /* synthetic */ e(n1 n1Var, long j12, long j13, String str) {
        this.f48882b = 4;
        this.f48886f = n1Var;
        this.f48884d = j12;
        this.f48885e = j13;
        this.f48883c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f48886f;
        switch (this.f48882b) {
            case 0:
                h.a aVar = (h.a) obj;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f48896b.d2(this.f48884d, this.f48885e, this.f48883c);
                break;
            case 1:
                l.a aVar2 = (l.a) obj;
                aVar2.getClass();
                int i13 = M.f47887a;
                aVar2.f50322b.E2(this.f48884d, this.f48885e, this.f48883c);
                break;
            case 2:
                i.a aVar3 = (i.a) obj;
                aVar3.getClass();
                int i14 = U.f348106a;
                aVar3.f343997b.d2(this.f48884d, this.f48885e, this.f48883c);
                break;
            case 3:
                n.a aVar4 = (n.a) obj;
                aVar4.getClass();
                int i15 = U.f348106a;
                aVar4.f348319b.E2(this.f48884d, this.f48885e, this.f48883c);
                break;
            case 4:
                ((n1) obj).c(this.f48884d, this.f48885e, this.f48883c);
                break;
            case 5:
                ((fi1.a) obj).b(this.f48883c, this.f48884d, this.f48885e);
                break;
            default:
                ((pc.a) obj).b(this.f48883c, this.f48884d, this.f48885e);
                break;
        }
    }

    public /* synthetic */ e(Object obj, String str, long j12, long j13, int i12) {
        this.f48882b = i12;
        this.f48886f = obj;
        this.f48883c = str;
        this.f48884d = j12;
        this.f48885e = j13;
    }
}
