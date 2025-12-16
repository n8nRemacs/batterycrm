package com.avito.android.work_profile.profile.about_me.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import hQ0.InterfaceC40867b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AboutMeOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "LhQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<AboutMeInternalAction, InterfaceC40867b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40867b b(AboutMeInternalAction aboutMeInternalAction) {
        AboutMeInternalAction aboutMeInternalAction2 = aboutMeInternalAction;
        if (aboutMeInternalAction2 instanceof AboutMeInternalAction.ContentLoaded) {
            return new InterfaceC40867b.a(((AboutMeInternalAction.ContentLoaded) aboutMeInternalAction2).f330798b);
        }
        if (aboutMeInternalAction2 instanceof AboutMeInternalAction.HandleBeduinEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent = ((AboutMeInternalAction.HandleBeduinEvent) aboutMeInternalAction2).f330800b;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                return new InterfaceC40867b.e((BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.c) {
                return InterfaceC40867b.C11256b.f397193a;
            }
        }
        return null;
    }
}
