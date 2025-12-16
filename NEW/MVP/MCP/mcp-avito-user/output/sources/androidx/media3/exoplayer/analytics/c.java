package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C1823b f48645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f48646d;

    public /* synthetic */ c(b.C1823b c1823b, String str, int i12) {
        this.f48644b = i12;
        this.f48645c = c1823b;
        this.f48646d = str;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f48644b) {
            case 0:
                bVar.B(this.f48645c, this.f48646d);
                break;
            case 1:
                bVar.N(this.f48645c, this.f48646d);
                break;
            case 2:
                bVar.G(this.f48645c, this.f48646d);
                break;
            default:
                bVar.z(this.f48645c, this.f48646d);
                break;
        }
    }

    public /* synthetic */ c(b.C1823b c1823b, String str, long j12, long j13, int i12) {
        this.f48644b = i12;
        this.f48645c = c1823b;
        this.f48646d = str;
    }
}
