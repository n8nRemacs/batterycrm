package androidx.media3.exoplayer.video;

import android.view.Surface;
import android.view.View;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.video.l;
import androidx.metrics.performance.b;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.n;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.C37848w;
import com.yandex.mobile.ads.impl.fi1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f50315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f50316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f50317e;

    public /* synthetic */ j(int i12, Object obj, long j12, Object obj2) {
        this.f50314b = i12;
        this.f50316d = obj;
        this.f50317e = obj2;
        this.f50315c = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50314b) {
            case 0:
                l.a aVar = (l.a) this.f50316d;
                aVar.getClass();
                int i12 = M.f47887a;
                aVar.f50322b.a2(this.f50315c, this.f50317e);
                return;
            case 1:
                View view = (View) this.f50316d;
                androidx.metrics.performance.b bVar = (androidx.metrics.performance.b) this.f50317e;
                b.a aVar2 = androidx.metrics.performance.b.f52693b;
                System.nanoTime();
                androidx.metrics.performance.b.f52693b.getClass();
                b.a.a(view);
                synchronized (bVar) {
                    throw null;
                }
            case 2:
                n.a aVar3 = (n.a) this.f50316d;
                aVar3.getClass();
                int i13 = U.f348106a;
                aVar3.f348319b.a2(this.f50315c, this.f50317e);
                return;
            case 3:
                ((C37848w) this.f50316d).a((String) this.f50317e, this.f50315c);
                return;
            case 4:
                ((C37848w) this.f50316d).a((AdEvent) this.f50317e, this.f50315c);
                return;
            case 5:
                ((C37848w) this.f50316d).a((MiniAppEvent) this.f50317e, this.f50315c);
                return;
            default:
                ((fi1.a) this.f50316d).a((Surface) this.f50317e, this.f50315c);
                return;
        }
    }
}
