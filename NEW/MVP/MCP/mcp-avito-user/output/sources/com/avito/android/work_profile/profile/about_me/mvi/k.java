package com.avito.android.work_profile.profile.about_me.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import hQ0.C40868c;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: AboutMeReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "LhQ0/c;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<AboutMeInternalAction, C40868c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40868c a(AboutMeInternalAction aboutMeInternalAction, C40868c c40868c) {
        C40868c.a bVar;
        C40868c.a c11258c;
        AboutMeInternalAction aboutMeInternalAction2 = aboutMeInternalAction;
        C40868c c40868c2 = c40868c;
        if (aboutMeInternalAction2 instanceof AboutMeInternalAction.StartLoading) {
            return new C40868c(new C40868c.a.C11258c(false, 1, null));
        }
        if (aboutMeInternalAction2 instanceof AboutMeInternalAction.Error) {
            return new C40868c(new C40868c.a.b());
        }
        if (!(aboutMeInternalAction2 instanceof AboutMeInternalAction.HandleBeduinState)) {
            return c40868c2;
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((AboutMeInternalAction.HandleBeduinState) aboutMeInternalAction2).f330801b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            c11258c = new C40868c.a.C11258c(false);
        } else {
            if (abstractC40048c instanceof AbstractC40048c.a) {
                bVar = new C40868c.a.C11257a(((AbstractC40048c.a) abstractC40048c).getF395211c());
            } else {
                if (!(abstractC40048c instanceof AbstractC40048c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z.n(((AbstractC40048c.b) abstractC40048c).f395216b);
                bVar = new C40868c.a.b();
            }
            c11258c = bVar;
        }
        return new C40868c(c11258c);
    }
}
