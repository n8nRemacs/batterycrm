package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import II0.b;
import II0.c;
import com.avito.android.remote.model.JobOnboardingButton;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PanelConfigOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "LII0/b;", "LII0/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A implements com.avito.android.arch.mvi.t<II0.b, II0.c> {
    @Inject
    public A() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final II0.c b(II0.b bVar) {
        JobOnboardingButton jobOnboardingButton;
        II0.b bVar2 = bVar;
        if (bVar2 instanceof b.e) {
            return new c.b(((b.e) bVar2).f8093a);
        }
        if (bVar2 instanceof b.f) {
            return c.C0456c.f8101a;
        }
        if (!(bVar2 instanceof b.C0455b) || (jobOnboardingButton = ((b.C0455b) bVar2).f8088a.f6424k) == null) {
            return null;
        }
        return new c.a(jobOnboardingButton);
    }
}
