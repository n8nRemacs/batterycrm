package ru.cyberity.cbr.core.widget.applicantData;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.G0;
import kotlin.Metadata;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.d;
import ru.cyberity.cbr.core.widget.CBRSubtitle2TextView;

/* compiled from: CBRApplicantDataSubtitleView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bRF\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSubtitleView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/cyberity/cbr/core/widget/CBRSubtitle2TextView;", "subtitleView", "Lru/cyberity/cbr/core/widget/CBRSubtitle2TextView;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "value", "onLinkClicked", "LY41/l;", "getOnLinkClicked", "()LY41/l;", "setOnLinkClicked", "(LY41/l;)V", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataSubtitleView extends CBRApplicantDataBaseFieldView {

    @l
    private Y41.l<? super String, G0> onLinkClicked;

    @l
    private final CBRSubtitle2TextView subtitleView;

    public CBRApplicantDataSubtitleView(@k Context context) {
        String metricStyle;
        super(context, null, 0, 0, 14, null);
        removeAllViews();
        CBRSubtitle2TextView cBRSubtitle2TextView = new CBRSubtitle2TextView(context, null, 0, 0, 14, null);
        cBRSubtitle2TextView.setPadding(cBRSubtitle2TextView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium), cBRSubtitle2TextView.getPaddingRight(), cBRSubtitle2TextView.getPaddingBottom());
        cBRSubtitle2TextView.setGravity(17);
        this.subtitleView = cBRSubtitle2TextView;
        cBRSubtitle2TextView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        addView(cBRSubtitle2TextView);
        onInitializationFinished();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (metricStyle = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SECTION_HEADER_ALIGNMENT)) == null) {
            return;
        }
        themeHelper.applyThemeGravity(cBRSubtitle2TextView, metricStyle);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CBRSubtitle2TextView cBRSubtitle2TextView = this.subtitleView;
        if (cBRSubtitle2TextView != null) {
            return cBRSubtitle2TextView.getText();
        }
        return null;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public Y41.l<String, G0> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        CBRSubtitle2TextView cBRSubtitle2TextView = this.subtitleView;
        if (cBRSubtitle2TextView == null) {
            return;
        }
        cBRSubtitle2TextView.setText(charSequence);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setOnLinkClicked(@l Y41.l<? super String, G0> lVar) {
        CBRSubtitle2TextView cBRSubtitle2TextView = this.subtitleView;
        if (cBRSubtitle2TextView != null) {
            ExtensionsKt.handleUrlClicks(cBRSubtitle2TextView, lVar);
        }
        this.onLinkClicked = lVar;
    }
}
