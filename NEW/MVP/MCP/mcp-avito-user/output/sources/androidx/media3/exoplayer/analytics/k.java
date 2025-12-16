package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements r.a, C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f48671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48673e;

    public /* synthetic */ k(Object obj, boolean z12, int i12, int i13) {
        this.f48670b = i13;
        this.f48673e = obj;
        this.f48671c = z12;
        this.f48672d = i12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        switch (this.f48670b) {
            case 0:
                ((b) obj).u((b.C1823b) this.f48673e, this.f48672d, this.f48671c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.b) obj).Xi((b.C10568b) this.f48673e, this.f48672d, this.f48671c);
                break;
        }
    }
}
