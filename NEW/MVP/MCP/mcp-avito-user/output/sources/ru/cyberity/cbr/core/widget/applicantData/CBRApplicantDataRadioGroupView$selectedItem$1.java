package ru.cyberity.cbr.core.widget.applicantData;

import Y41.l;
import Y61.k;
import android.widget.RadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CBRApplicantDataRadioGroupView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/widget/RadioButton;", "Lkotlin/internal/i;", "it", "", "invoke", "(Landroid/widget/RadioButton;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataRadioGroupView$selectedItem$1 extends N implements l<RadioButton, Boolean> {
    public static final CBRApplicantDataRadioGroupView$selectedItem$1 INSTANCE = new CBRApplicantDataRadioGroupView$selectedItem$1();

    public CBRApplicantDataRadioGroupView$selectedItem$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final Boolean invoke(@k RadioButton radioButton) {
        return Boolean.valueOf(radioButton.isChecked());
    }
}
