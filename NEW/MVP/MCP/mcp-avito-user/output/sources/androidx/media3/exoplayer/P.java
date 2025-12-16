package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.source.C23171w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U.a f48550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f48551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C23167s f48552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C23171w f48553f;

    public /* synthetic */ P(U.a aVar, Pair pair, C23167s c23167s, C23171w c23171w, int i12) {
        this.f48549b = i12;
        this.f48550c = aVar;
        this.f48551d = pair;
        this.f48552e = c23167s;
        this.f48553f = c23171w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48549b) {
            case 0:
                androidx.media3.exoplayer.analytics.a aVar = this.f48550c.f48579c.f48573h;
                Pair pair = this.f48551d;
                aVar.h(((Integer) pair.first).intValue(), (A.b) pair.second, this.f48552e, this.f48553f);
                break;
            case 1:
                androidx.media3.exoplayer.analytics.a aVar2 = this.f48550c.f48579c.f48573h;
                Pair pair2 = this.f48551d;
                aVar2.x(((Integer) pair2.first).intValue(), (A.b) pair2.second, this.f48552e, this.f48553f);
                break;
            default:
                androidx.media3.exoplayer.analytics.a aVar3 = this.f48550c.f48579c.f48573h;
                Pair pair3 = this.f48551d;
                aVar3.n(((Integer) pair3.first).intValue(), (A.b) pair3.second, this.f48552e, this.f48553f);
                break;
        }
    }
}
