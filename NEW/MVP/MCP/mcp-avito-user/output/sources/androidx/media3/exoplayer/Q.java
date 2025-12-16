package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.source.A;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U.a f48555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f48556d;

    public /* synthetic */ Q(U.a aVar, Pair pair, int i12) {
        this.f48554b = i12;
        this.f48555c = aVar;
        this.f48556d = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48554b) {
            case 0:
                androidx.media3.exoplayer.analytics.a aVar = this.f48555c.f48579c.f48573h;
                Pair pair = this.f48556d;
                aVar.l(((Integer) pair.first).intValue(), (A.b) pair.second);
                break;
            case 1:
                androidx.media3.exoplayer.analytics.a aVar2 = this.f48555c.f48579c.f48573h;
                Pair pair2 = this.f48556d;
                aVar2.o(((Integer) pair2.first).intValue(), (A.b) pair2.second);
                break;
            default:
                androidx.media3.exoplayer.analytics.a aVar3 = this.f48555c.f48579c.f48573h;
                Pair pair3 = this.f48556d;
                aVar3.f(((Integer) pair3.first).intValue(), (A.b) pair3.second);
                break;
        }
    }
}
