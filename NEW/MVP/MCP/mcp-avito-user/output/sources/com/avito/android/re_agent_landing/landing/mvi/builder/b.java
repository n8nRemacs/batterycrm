package com.avito.android.re_agent_landing.landing.mvi.builder;

import Oh0.C14690a;
import Oh0.C14692c;
import Oh0.f;
import Oh0.h;
import Oh0.i;
import Oh0.j;
import Oh0.l;
import Oh0.m;
import Y61.k;
import com.avito.android.re_agent_landing.generated.api.get_agent_profile_landing_api.Action;
import com.avito.android.re_agent_landing.landing.items.action_block.ActionStatus;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationButton;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationFlow;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationInfoBlock;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import com.avito.android.re_agent_landing.landing.mvi.builder.d;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentProfileCreateLandingItemListBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/builder/b;", "Lcom/avito/android/re_agent_landing/landing/mvi/builder/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.re_agent_landing.landing.mvi.builder.a
    @k
    public final kotlin.collections.builders.b a(@k j jVar) {
        ActionStatus actionStatus;
        ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        m topBlock = jVar.getTopBlock();
        bVarT.add(new com.avito.android.re_agent_landing.landing.items.top_block.c(null, topBlock.getTitle(), topBlock.getDescription(), topBlock.getAnimation(), topBlock.getAnimationDark(), topBlock.getButtonTitle(), 1, null));
        for (l lVar : jVar.d()) {
            bVarT.add(new com.avito.android.re_agent_landing.landing.items.info_block.c(null, lVar.getTitle(), lVar.getDescription(), d.a(lVar.getImage()), 1, null));
        }
        Action action = jVar.getAction();
        int i12 = d.a.f250812a[action.getStatus().ordinal()];
        if (i12 == 1) {
            actionStatus = ActionStatus.f250711b;
        } else if (i12 == 2) {
            actionStatus = ActionStatus.f250712c;
        } else if (i12 == 3) {
            actionStatus = ActionStatus.f250713d;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            actionStatus = ActionStatus.f250714e;
        }
        ActionStatus actionStatus2 = actionStatus;
        String title = action.getTitle();
        String description = action.getDescription();
        UniversalImage universalImageA = d.a(action.getImage());
        h button = action.getButton();
        com.avito.android.re_agent_landing.landing.items.action_block.j jVar2 = button != null ? new com.avito.android.re_agent_landing.landing.items.action_block.j(button.getTitle(), button.getUri()) : null;
        C14690a actions = action.getActions();
        if (actions != null) {
            String title2 = actions.getTitle();
            String title3 = actions.getUpgradeFlow().getTitle();
            UniversalImage universalImageA2 = d.a(actions.getUpgradeFlow().getImage());
            UniversalImage universalImageA3 = d.a(actions.getUpgradeFlow().getImageActive());
            h button2 = actions.getUpgradeFlow().getButton();
            CreationButton creationButton = button2 != null ? new CreationButton(button2.getTitle(), button2.getUri()) : null;
            List<f> listD = actions.getUpgradeFlow().d();
            ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
            for (f fVar : listD) {
                arrayList.add(new CreationInfoBlock(fVar.getTitle(), fVar.getList()));
            }
            CreationFlow creationFlow = new CreationFlow(title3, universalImageA2, universalImageA3, creationButton, arrayList, null, actions.getUpgradeFlow().getLockedByProfileLimit());
            String title4 = actions.getCreateFlow().getTitle();
            UniversalImage universalImageA4 = d.a(actions.getCreateFlow().getImage());
            UniversalImage universalImageA5 = d.a(actions.getCreateFlow().getImageActive());
            h button3 = actions.getCreateFlow().getButton();
            CreationButton creationButton2 = button3 != null ? new CreationButton(button3.getTitle(), button3.getUri()) : null;
            List<C14692c> listE = actions.getCreateFlow().e();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listE, 10));
            for (C14692c c14692c : listE) {
                arrayList2.add(new CreationInfoBlock(c14692c.getTitle(), c14692c.getList()));
            }
            reAgentProfileCreateLandingFlowsData = new ReAgentProfileCreateLandingFlowsData(title2, creationFlow, new CreationFlow(title4, universalImageA4, universalImageA5, creationButton2, arrayList2, actions.getCreateFlow().getDisclaimer(), null));
        } else {
            reAgentProfileCreateLandingFlowsData = null;
        }
        Action.AnalyticsInfo analyticsInfo = action.getAnalyticsInfo();
        bVarT.add(new com.avito.android.re_agent_landing.landing.items.action_block.c(null, actionStatus2, title, description, universalImageA, jVar2, reAgentProfileCreateLandingFlowsData, analyticsInfo != null ? analyticsInfo.f250551b : null, 1, null));
        bVarT.add(new com.avito.android.re_agent_landing.landing.items.header.c(null, jVar.getFaqTitle(), 1, null));
        for (i iVar : jVar.b()) {
            bVarT.add(new com.avito.android.re_agent_landing.landing.items.question.c(null, iVar.getQuestion(), iVar.getAnswer(), 1, null));
        }
        return C42745f0.p(bVarT);
    }
}
