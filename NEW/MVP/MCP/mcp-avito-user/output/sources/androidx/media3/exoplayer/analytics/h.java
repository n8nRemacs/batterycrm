package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C1823b f48660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f48661d;

    public /* synthetic */ h(b.C1823b c1823b, boolean z12, int i12) {
        this.f48659b = i12;
        this.f48660c = c1823b;
        this.f48661d = z12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f48659b) {
            case 0:
                b.C1823b c1823b = this.f48660c;
                bVar.getClass();
                bVar.o(c1823b, this.f48661d);
                break;
            case 1:
                bVar.a(this.f48660c, this.f48661d);
                break;
            case 2:
                bVar.f(this.f48660c, this.f48661d);
                break;
            default:
                bVar.r(this.f48660c, this.f48661d);
                break;
        }
    }
}
