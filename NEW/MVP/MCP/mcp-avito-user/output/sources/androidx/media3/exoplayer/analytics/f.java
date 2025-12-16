package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements r.a, C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48655e;

    public /* synthetic */ f(Object obj, int i12, long j12, long j13, int i13) {
        this.f48652b = i13;
        this.f48655e = obj;
        this.f48653c = i12;
        this.f48654d = j12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        switch (this.f48652b) {
            case 0:
                ((b) obj).h(this.f48653c, this.f48654d, (b.C1823b) this.f48655e);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.b) obj).Uz(this.f48653c, this.f48654d, (b.C10568b) this.f48655e);
                break;
        }
    }
}
