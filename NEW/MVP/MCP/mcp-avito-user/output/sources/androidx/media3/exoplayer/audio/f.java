package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.h;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;
import com.my.tracker.obfuscated.C37848w;
import com.my.tracker.obfuscated.g1;
import com.yandex.mobile.ads.impl.cv;
import com.yandex.mobile.ads.impl.pc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48889d;

    public /* synthetic */ f(int i12, long j12, Object obj) {
        this.f48887b = i12;
        this.f48889d = obj;
        this.f48888c = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j12 = this.f48888c;
        Object obj = this.f48889d;
        switch (this.f48887b) {
            case 0:
                h.a aVar = (h.a) obj;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f48896b.f3(j12);
                break;
            case 1:
                i.a aVar2 = (i.a) obj;
                aVar2.getClass();
                int i13 = U.f348106a;
                aVar2.f343997b.f3(j12);
                break;
            case 2:
                ((g1) obj).b(j12);
                break;
            case 3:
                ((C37848w) obj).a(j12);
                break;
            case 4:
                cv.a(j12, (Y41.a) obj);
                break;
            default:
                ((pc.a) obj).a(j12);
                break;
        }
    }

    public /* synthetic */ f(long j12, Y41.a aVar) {
        this.f48887b = 4;
        this.f48888c = j12;
        this.f48889d = aVar;
    }
}
