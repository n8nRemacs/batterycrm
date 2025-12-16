package androidx.media3.session;

import androidx.media3.session.C23206a1;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements C23206a1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23206a1 f52326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52327d;

    public /* synthetic */ V0(C23206a1 c23206a1, long j12, int i12) {
        this.f52325b = i12;
        this.f52326c = c23206a1;
        this.f52327d = j12;
    }

    @Override // androidx.media3.session.C23206a1.g
    public final void b(O0.g gVar) {
        switch (this.f52325b) {
            case 0:
                this.f52326c.f52357b.f52302p.h0((int) this.f52327d);
                break;
            default:
                this.f52326c.f52357b.f52302p.seekTo(this.f52327d);
                break;
        }
    }
}
