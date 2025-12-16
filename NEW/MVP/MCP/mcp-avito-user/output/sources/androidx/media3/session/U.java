package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.session.C23206a1;
import androidx.media3.session.C23229i0;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class U implements C23229i0.d, r.a, C23206a1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52318d;

    public /* synthetic */ U(Object obj, Object obj2, Object obj3) {
        this.f52316b = obj;
        this.f52317c = obj2;
        this.f52318d = obj3;
    }

    @Override // androidx.media3.session.C23206a1.g
    public void b(O0.g gVar) {
        C23206a1 c23206a1 = (C23206a1) this.f52316b;
        Bundle bundle = (Bundle) this.f52318d;
        if (bundle == null) {
            int i12 = C23206a1.f52355o;
            bundle = Bundle.EMPTY;
        }
        c23206a1.f52357b.g(gVar, (K1) this.f52317c, bundle);
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        C23229i0 c23229i0 = (C23229i0) this.f52316b;
        c23229i0.getClass();
        interfaceC23246o.M0(c23229i0.f52494c, i12, ((K1) this.f52317c).k(), (Bundle) this.f52318d);
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).t(((Integer) this.f52318d).intValue(), ((MediaControllerImplLegacy.c) this.f52316b).f52163a.f51977d.f52190b, ((MediaControllerImplLegacy.c) this.f52317c).f52163a.f51977d.f52190b);
    }
}
