package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.common.z;
import androidx.media3.exoplayer.analytics.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C1823b f48648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48649d;

    public /* synthetic */ d(int i12, long j12, b.C1823b c1823b) {
        this.f48647b = 0;
        this.f48648c = c1823b;
        this.f48649d = i12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f48647b) {
            case 0:
                bVar.i(this.f48648c, this.f48649d);
                break;
            case 1:
                b.C1823b c1823b = this.f48648c;
                bVar.getClass();
                bVar.D(c1823b, this.f48649d);
                break;
            case 2:
                bVar.L(this.f48648c, this.f48649d);
                break;
            case 3:
                bVar.e(this.f48648c, this.f48649d);
                break;
            case 4:
                bVar.g(this.f48648c, this.f48649d);
                break;
            case 5:
                bVar.E(this.f48648c, this.f48649d);
                break;
            default:
                bVar.A(this.f48648c, this.f48649d);
                break;
        }
    }

    public /* synthetic */ d(b.C1823b c1823b, int i12, int i13) {
        this.f48647b = i13;
        this.f48648c = c1823b;
        this.f48649d = i12;
    }

    public /* synthetic */ d(b.C1823b c1823b, z zVar, int i12) {
        this.f48647b = 3;
        this.f48648c = c1823b;
        this.f48649d = i12;
    }
}
