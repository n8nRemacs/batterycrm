package androidx.media3.exoplayer;

import androidx.media3.common.C23107s;
import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.E;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23177v implements r.a, r.b, E.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f50177c;

    public /* synthetic */ C23177v(A a12, int i12) {
        this.f50176b = i12;
        this.f50177c = a12;
    }

    public void a(E.d dVar) {
        int i12 = A.f48357h0;
        A a12 = this.f50177c;
        a12.getClass();
        a12.f48398i.d(new RunnableC23176u(0, a12, dVar));
    }

    @Override // androidx.media3.common.util.r.b
    public void c(Object obj, C23107s c23107s) {
        int i12 = A.f48357h0;
        this.f50177c.getClass();
        ((H.g) obj).C(new H.f(c23107s));
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f50176b) {
            case 0:
                gVar.E(this.f50177c.f48371N);
                break;
            default:
                gVar.s(this.f50177c.f48369L);
                break;
        }
    }
}
