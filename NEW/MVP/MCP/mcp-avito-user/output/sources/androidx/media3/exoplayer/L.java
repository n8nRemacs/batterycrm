package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23171w;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48534e;

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, int i12) {
        this.f48531b = i12;
        this.f48532c = obj;
        this.f48533d = obj2;
        this.f48534e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48531b) {
            case 0:
                M m12 = (M) this.f48532c;
                m12.getClass();
                m12.f48537c.Bc(((AbstractC37401r1.a) this.f48533d).i(), (A.b) this.f48534e);
                break;
            case 1:
                androidx.media3.exoplayer.analytics.a aVar = ((U.a) this.f48532c).f48579c.f48573h;
                Pair pair = (Pair) this.f48533d;
                aVar.B(((Integer) pair.first).intValue(), (A.b) pair.second, (Exception) this.f48534e);
                break;
            default:
                androidx.media3.exoplayer.analytics.a aVar2 = ((U.a) this.f48532c).f48579c.f48573h;
                Pair pair2 = (Pair) this.f48533d;
                aVar2.u(((Integer) pair2.first).intValue(), (A.b) pair2.second, (C23171w) this.f48534e);
                break;
        }
    }
}
