package p31;

import androidx.view.C23286E0;
import androidx.view.C23310R0;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class i extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public static final i f428169l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        C23286E0 c23286e0 = (C23286E0) obj;
        h hVar = h.f428168l;
        c23286e0.getClass();
        if (C43066x.K("loading_sso_screen")) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        c23286e0.f52773e = "loading_sso_screen";
        c23286e0.f52772d = -1;
        c23286e0.f52774f = false;
        C23310R0 c23310r0 = new C23310R0();
        hVar.invoke(c23310r0);
        c23286e0.f52774f = c23310r0.f52867a;
        c23286e0.f52775g = c23310r0.f52868b;
        return G0.f406611a;
    }
}
