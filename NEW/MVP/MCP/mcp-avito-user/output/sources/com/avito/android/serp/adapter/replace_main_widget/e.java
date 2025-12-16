package com.avito.android.serp.adapter.replace_main_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.replace_main_widget.ReplaceMainPageWidget;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ym0.InterfaceC50270b;

/* compiled from: ReplaceMainWidgetConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/e;", "Lcom/avito/android/serp/adapter/replace_main_widget/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50270b f270686a;

    @Inject
    public e(@Y61.k InterfaceC50270b interfaceC50270b) {
        this.f270686a = interfaceC50270b;
    }

    @Override // com.avito.android.serp.adapter.replace_main_widget.d
    @Y61.l
    public final ReplaceMainWidgetItem a(@Y61.k ReplaceMainPageWidget replaceMainPageWidget) {
        if (!this.f270686a.a()) {
            return null;
        }
        if (replaceMainPageWidget instanceof ReplaceMainPageWidget.ReplaceMain) {
            ReplaceMainPageWidget.ReplaceMain replaceMain = (ReplaceMainPageWidget.ReplaceMain) replaceMainPageWidget;
            return new ReplaceMainWidgetItem.ReplaceMain("replace_main", new ReplaceMainItem.ReplaceMain(replaceMain.getText(), replaceMain.getButton().getButtonTitle(), replaceMain.getButton().getClearShowId(), false, 8, null), replaceMainPageWidget.getAnalytics(), replaceMainPageWidget.getSettings());
        }
        if (!(replaceMainPageWidget instanceof ReplaceMainPageWidget.ShowAvito)) {
            throw new NoWhenBranchMatchedException();
        }
        ReplaceMainPageWidget.ShowAvito showAvito = (ReplaceMainPageWidget.ShowAvito) replaceMainPageWidget;
        return new ReplaceMainWidgetItem.ShowAvito("replace_main", new ReplaceMainItem.ShowAvito(showAvito.getText(), showAvito.getDeeplink()), replaceMainPageWidget.getAnalytics(), replaceMainPageWidget.getSettings());
    }
}
