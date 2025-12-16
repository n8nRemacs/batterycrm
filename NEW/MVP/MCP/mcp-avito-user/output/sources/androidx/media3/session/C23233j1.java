package androidx.media3.session;

import androidx.media3.session.A1;
import androidx.media3.session.O0;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23233j1 implements A1.b, A1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52542d;

    public /* synthetic */ C23233j1(int i12, long j12, Object obj) {
        this.f52542d = obj;
        this.f52540b = i12;
        this.f52541c = j12;
    }

    @Override // androidx.media3.session.A1.b
    public void b(G1 g12, O0.g gVar) {
        int i12 = A1.f51915u;
        g12.g0(((A1) this.f52542d).i4(gVar, g12, this.f52540b), this.f52541c);
    }

    @Override // androidx.media3.session.A1.e
    public Object d(T0 t02, O0.g gVar, int i12) {
        int i13 = A1.f51915u;
        int i14 = this.f52540b;
        return t02.i(gVar, (List) this.f52542d, i14 == -1 ? t02.f52302p.getCurrentMediaItemIndex() : i14, i14 == -1 ? t02.f52302p.getCurrentPosition() : this.f52541c);
    }
}
