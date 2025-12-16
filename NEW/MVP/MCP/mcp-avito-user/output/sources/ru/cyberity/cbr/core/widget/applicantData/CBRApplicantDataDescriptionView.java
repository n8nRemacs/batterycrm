package ru.cyberity.cbr.core.widget.applicantData;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.widget.CBRSubtitle2TextView;

/* compiled from: CBRApplicantDataDescriptionView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDescriptionView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "label", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "subtitleView", "Lru/cyberity/cbr/core/widget/CBRSubtitle2TextView;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataDescriptionView extends CBRApplicantDataBaseFieldView {

    @k
    private final CBRSubtitle2TextView subtitleView;

    public CBRApplicantDataDescriptionView(@k Context context) throws Resources.NotFoundException {
        super(context, null, 0, 0, 14, null);
        removeAllViews();
        CBRSubtitle2TextView cBRSubtitle2TextView = new CBRSubtitle2TextView(context, null, 0, 0, 14, null);
        cBRSubtitle2TextView.setPadding(cBRSubtitle2TextView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium), cBRSubtitle2TextView.getPaddingRight(), cBRSubtitle2TextView.getPaddingBottom());
        this.subtitleView = cBRSubtitle2TextView;
        addView(cBRSubtitle2TextView);
        onInitializationFinished();
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        return this.subtitleView.getText();
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        this.subtitleView.setText(charSequence);
    }
}
