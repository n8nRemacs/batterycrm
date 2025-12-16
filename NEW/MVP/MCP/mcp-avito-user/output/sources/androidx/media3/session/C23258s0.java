package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.O0;
import androidx.media3.session.T0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23258s0 implements BinderC23267v0.a, T0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H.c f52632b;

    public /* synthetic */ C23258s0(H.c cVar) {
        this.f52632b = cVar;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) {
        int i12 = BinderC23267v0.f52647p;
        if (c23229i0.isConnected()) {
            H.c cVar = c23229i0.f52509r;
            H.c cVar2 = this.f52632b;
            if (androidx.media3.common.util.M.a(cVar, cVar2)) {
                return;
            }
            c23229i0.f52509r = cVar2;
            H.c cVar3 = c23229i0.f52510s;
            H.c cVarG = C23229i0.G(c23229i0.f52508q, cVar2);
            c23229i0.f52510s = cVarG;
            if (cVarG.equals(cVar3)) {
                return;
            }
            c23229i0.f52499h.f(13, new W(c23229i0, 9));
        }
    }

    @Override // androidx.media3.session.T0.c
    public void b(O0.f fVar, int i12) {
        int i13 = T0.f52286w;
        fVar.e(i12, this.f52632b);
    }
}
