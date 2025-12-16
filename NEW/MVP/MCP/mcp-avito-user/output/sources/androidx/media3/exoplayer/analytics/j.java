package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements r.a, C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f48668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48669f;

    public /* synthetic */ j(Object obj, int i12, long j12, long j13, int i13) {
        this.f48665b = i13;
        this.f48669f = obj;
        this.f48666c = i12;
        this.f48667d = j12;
        this.f48668e = j13;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        switch (this.f48665b) {
            case 0:
                ((b) obj).M((b.C1823b) this.f48669f, this.f48666c, this.f48667d, this.f48668e);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.b) obj).YO((b.C10568b) this.f48669f, this.f48666c, this.f48667d, this.f48668e);
                break;
        }
    }
}
