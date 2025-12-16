package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import TJ0.a;
import com.avito.android.arch.mvi.t;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConstructorTabOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<ConstructorTabInternalAction, TJ0.a> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final TJ0.a b(ConstructorTabInternalAction constructorTabInternalAction) {
        List<String> list;
        ConstructorTabInternalAction constructorTabInternalAction2 = constructorTabInternalAction;
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ContentItems) {
            ConstructorTabInternalAction.ContentItems contentItems = (ConstructorTabInternalAction.ContentItems) constructorTabInternalAction2;
            StatsConfig statsConfig = contentItems.f318175c;
            boolean z12 = (statsConfig != null ? statsConfig.f317165o : null) == SegmentType.f317718c;
            boolean z13 = contentItems.f318174b.getItemsCount() == 0;
            if (z12 && z13) {
                return a.d.f15579a;
            }
            return null;
        }
        if ((constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ErrorItems) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ErrorChart) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.LoadingItems) || constructorTabInternalAction2.equals(ConstructorTabInternalAction.ShowLoadingIfEmptyData.f318204b)) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.HandleDeeplink) {
            return new a.C1061a(((ConstructorTabInternalAction.HandleDeeplink) constructorTabInternalAction2).f318184b);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ShowABUxFeedback) {
            return a.g.f15582a;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ShowVisitUxFeedback) {
            return a.n.f15591a;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ShowOneStatsOpenUxFeedback) {
            return a.k.f15588a;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ShowSplitUxFeedback) {
            return new a.l(((ConstructorTabInternalAction.ShowSplitUxFeedback) constructorTabInternalAction2).f318206b);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnColumnClick) {
            return new a.e(((ConstructorTabInternalAction.OnColumnClick) constructorTabInternalAction2).f318189c);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnSelectedPeriod) {
            return new a.e(((ConstructorTabInternalAction.OnSelectedPeriod) constructorTabInternalAction2).f318195b);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnPeriodClick) {
            return new a.f(((ConstructorTabInternalAction.OnPeriodClick) constructorTabInternalAction2).f318193b);
        }
        if ((constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ContentChart) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnOpenVasesClick)) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ContentChartV2) {
            ConstructorTabInternalAction.ContentChartV2 contentChartV2 = (ConstructorTabInternalAction.ContentChartV2) constructorTabInternalAction2;
            YJ0.l alertContent = contentChartV2.f318172b.getAlertContent();
            StatsConfig statsConfig2 = contentChartV2.f318173c;
            if (statsConfig2 != null && (list = statsConfig2.f317159i) != null && (!list.isEmpty())) {
                return a.m.f15590a;
            }
            if (alertContent == null) {
                return null;
            }
            AttributedText text = alertContent.getText();
            YJ0.m button = alertContent.getButton();
            AttributedText text2 = button != null ? button.getText() : null;
            YJ0.m button2 = alertContent.getButton();
            return new a.i(button2 != null ? button2.getAction() : null, text, text2);
        }
        if ((constructorTabInternalAction2 instanceof ConstructorTabInternalAction.LoadingChart) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnCloseSplitDialog)) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ShowEmptyTodayToast) {
            return a.h.f15583a;
        }
        if ((constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ContentCategoriesSplit) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ContentLocationsSplit)) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnSplitClick) {
            return new a.c(((ConstructorTabInternalAction.OnSplitClick) constructorTabInternalAction2).f318196b);
        }
        if ((constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnHideTooltipClick) || (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnSplitItemClick)) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnSplitDialogClick) {
            return new a.f(((ConstructorTabInternalAction.OnSplitDialogClick) constructorTabInternalAction2).f318198c);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.ScreenOpened) {
            return null;
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnSplitHintClick) {
            return new a.j(((ConstructorTabInternalAction.OnSplitHintClick) constructorTabInternalAction2).f318199b);
        }
        if (constructorTabInternalAction2 instanceof ConstructorTabInternalAction.OnMetricHintClick) {
            return new a.b(((ConstructorTabInternalAction.OnMetricHintClick) constructorTabInternalAction2).f318191b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
