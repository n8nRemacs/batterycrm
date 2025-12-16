package com.avito.android.registration_self_employment_redirect_screen.mvi;

import aj0.c;
import aj0.d;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelfEmploymentRedirectOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Laj0/c;", "Laj0/d;", "<init>", "()V", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<aj0.c, aj0.d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final aj0.d b(aj0.c cVar) {
        aj0.c cVar2 = cVar;
        if (cVar2 instanceof c.a) {
            return d.a.f21138a;
        }
        if (cVar2 instanceof c.b ? true : cVar2.equals(c.C1505c.f21136a) ? true : cVar2.equals(c.d.f21137a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
