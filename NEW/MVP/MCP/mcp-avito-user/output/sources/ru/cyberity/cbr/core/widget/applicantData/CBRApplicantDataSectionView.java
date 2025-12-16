package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.s;

/* compiled from: CBRApplicantDataSectionView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nRF\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSectionView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "", "Lkotlin/G0;", "value", "onLinkClicked", "LY41/l;", "getOnLinkClicked", "()LY41/l;", "setOnLinkClicked", "(LY41/l;)V", "Landroid/widget/TextView;", "getTvDescription", "()Landroid/widget/TextView;", "tvDescription", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getDescription", "setDescription", "description", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataSectionView extends CBRApplicantDataBaseFieldView {

    @l
    private Y41.l<? super String, G0> onLinkClicked;

    public /* synthetic */ CBRApplicantDataSectionView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataSectionViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataSectionView : i13);
    }

    private final TextView getTvDescription() {
        return (TextView) findViewById(R.id.cbr_description);
    }

    @l
    public final CharSequence getDescription() {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            return tvDescription.getText();
        }
        return null;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public Y41.l<String, G0> getOnLinkClicked() {
        return super.getOnLinkClicked();
    }

    public final void setDescription(@l CharSequence charSequence) {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            s.a(tvDescription, charSequence);
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setOnLinkClicked(@l Y41.l<? super String, G0> lVar) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            ExtensionsKt.handleUrlClicks(tvLabel$cyberity_mobile_sdk_ui_release, lVar);
        }
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            ExtensionsKt.handleUrlClicks(tvDescription, lVar);
        }
        this.onLinkClicked = lVar;
    }

    @j
    public CBRApplicantDataSectionView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataSectionView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataSectionView_cbr_applicantDataSectionLayout, R.layout.cbr_layout_applicant_data_section), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
