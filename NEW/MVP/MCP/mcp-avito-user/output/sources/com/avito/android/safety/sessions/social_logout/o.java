package com.avito.android.safety.sessions.social_logout;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.error.z;
import com.avito.android.safety.sessions.social_logout.i;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: SessionsSocialLogoutPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class o extends H implements Y41.l<P2<? super G0>, G0> {
    public final void f(@Y61.k P2<? super G0> p22) {
        q qVar = (q) this.receiver;
        qVar.getClass();
        if (!(p22 instanceof P2.b)) {
            if (!(p22 instanceof P2.a)) {
                boolean z12 = p22 instanceof P2.c;
                return;
            }
            z.g(((P2.a) p22).f318719a, new l(qVar), null, new m(qVar), new n(qVar), null, 18);
            return;
        }
        SessionsSocialLogoutFragment sessionsSocialLogoutFragment = qVar.f258052h;
        if (sessionsSocialLogoutFragment != null) {
            SessionsInfoLink.SessionsInfoMode sessionsInfoMode = SessionsInfoLink.SessionsInfoMode.f133964b;
            i.b bVar = qVar.f258046b;
            SessionsInfoLink.SessionsInfoParams sessionsInfoParams = new SessionsInfoLink.SessionsInfoParams(sessionsInfoMode, bVar.f258038f, bVar.f258037e, qVar.f258045a.a(), bVar.f258035c);
            com.avito.android.safety.sessions.g gVar = sessionsSocialLogoutFragment.f257999r0;
            if (gVar == null) {
                gVar = null;
            }
            sessionsSocialLogoutFragment.startActivity(gVar.a(sessionsInfoParams));
            ActivityC22955m activityC22955mL1 = sessionsSocialLogoutFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(P2<? super G0> p22) {
        f(p22);
        return G0.f406611a;
    }
}
