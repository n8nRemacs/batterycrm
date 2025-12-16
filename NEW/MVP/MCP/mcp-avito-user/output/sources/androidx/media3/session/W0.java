package androidx.media3.session;

import androidx.media3.session.C23206a1;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements C23206a1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23206a1 f52331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52332d;

    public /* synthetic */ W0(C23206a1 c23206a1, int i12, int i13) {
        this.f52330b = i13;
        this.f52331c = c23206a1;
        this.f52332d = i12;
    }

    @Override // androidx.media3.session.C23206a1.g
    public final void b(O0.g gVar) {
        int i12 = this.f52332d;
        C23206a1 c23206a1 = this.f52331c;
        switch (this.f52330b) {
            case 0:
                c23206a1.f52357b.f52302p.setRepeatMode(C1.w(i12));
                break;
            case 1:
                if (i12 >= 0) {
                    c23206a1.f52357b.f52302p.c0(i12);
                    break;
                } else {
                    int i13 = C23206a1.f52355o;
                    androidx.media3.common.util.s.g();
                    break;
                }
            default:
                c23206a1.f52357b.f52302p.h(C1.x(i12));
                break;
        }
    }
}
