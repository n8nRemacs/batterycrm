package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import hL0.C40846a;
import hL0.C40848c;
import jL0.C42282c;
import javax.inject.Inject;
import kotlin.Metadata;
import wZ.C49578b;

/* compiled from: AutoprolongReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "LjL0/c;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements u<AutoprolongInternalAction, C42282c> {
    @Inject
    public m() {
    }

    public static C42282c.a b(C40846a c40846a, boolean z12) {
        if (c40846a == null) {
            return null;
        }
        if (z12) {
            return new C42282c.a(new l(c40846a.getActions().getNext()), c40846a.getActions().getNext().getTitle());
        }
        return new C42282c.a(new l(c40846a.getActions().getSkip()), c40846a.getActions().getSkip().getTitle());
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42282c a(AutoprolongInternalAction autoprolongInternalAction, C42282c c42282c) {
        hL0.g toggleSection;
        AutoprolongInternalAction autoprolongInternalAction2 = autoprolongInternalAction;
        C42282c c42282c2 = c42282c;
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.MainLoading) {
            return C42282c.a(c42282c2, null, true, false, null, null, null, null, null, null, null, 1020);
        }
        boolean z12 = false;
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.MainContent) {
            C40846a c40846a = ((AutoprolongInternalAction.MainContent) autoprolongInternalAction2).f319538b;
            hL0.e navBar = c40846a.getNavBar();
            Double progress = navBar.getProgress();
            Float fValueOf = progress != null ? Float.valueOf((float) progress.doubleValue()) : null;
            C40848c button = navBar.getButton();
            wZ.j jVar = new wZ.j(fValueOf, button != null ? new C49578b(button.getTitle(), button.getUri(), null, null, 12, null) : null);
            String title = c40846a.getTitle();
            C42282c.C11561c c11561c = new C42282c.C11561c(c40846a.getServiceSection().getIcon(), c40846a.getServiceSection().getTitle(), c40846a.getServiceSection().getDescription());
            hL0.g toggleSection2 = c40846a.getToggleSection();
            return C42282c.a(c42282c2, null, false, false, c40846a, jVar, title, c11561c, toggleSection2 != null ? new C42282c.d(toggleSection2.getTitle(), toggleSection2.getDescription(), toggleSection2.getIsAutoprolongEnabled()) : null, b(c40846a, false), c40846a.getPlanningInfo(), 4);
        }
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.MainError) {
            return C42282c.a(c42282c2, ((AutoprolongInternalAction.MainError) autoprolongInternalAction2).f319539b, false, false, null, null, null, null, null, null, null, 1020);
        }
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.PostLoading) {
            return C42282c.a(c42282c2, null, false, true, null, null, null, null, null, null, null, 1019);
        }
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.PostContent) {
            return C42282c.a(c42282c2, null, false, false, null, null, null, null, null, null, null, 1019);
        }
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.PostError) {
            return C42282c.a(c42282c2, null, false, false, null, null, null, null, null, null, null, 1019);
        }
        if (!(autoprolongInternalAction2 instanceof AutoprolongInternalAction.ToggleChanged)) {
            return c42282c2;
        }
        boolean z13 = ((AutoprolongInternalAction.ToggleChanged) autoprolongInternalAction2).f319544b;
        C42282c.d dVar = c42282c2.f405572i;
        C42282c.d dVar2 = dVar != null ? new C42282c.d(dVar.f405580a, dVar.f405581b, z13) : null;
        C40846a c40846a2 = c42282c2.f405568e;
        if (c40846a2 != null && (toggleSection = c40846a2.getToggleSection()) != null && z13 == toggleSection.getIsAutoprolongEnabled()) {
            z12 = true;
        }
        return C42282c.a(c42282c2, null, false, false, null, null, null, null, dVar2, b(c40846a2, !z12), null, 639);
    }
}
