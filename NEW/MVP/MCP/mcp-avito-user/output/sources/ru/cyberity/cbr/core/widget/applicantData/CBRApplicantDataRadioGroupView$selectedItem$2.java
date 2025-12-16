package ru.cyberity.cbr.core.widget.applicantData;

import Y41.l;
import Y61.k;
import android.widget.RadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CBRApplicantDataRadioGroupView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/widget/RadioButton;", "Lkotlin/internal/i;", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Landroid/widget/RadioButton;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataRadioGroupView$selectedItem$2 extends N implements l<RadioButton, Object> {
    public static final CBRApplicantDataRadioGroupView$selectedItem$2 INSTANCE = new CBRApplicantDataRadioGroupView$selectedItem$2();

    public CBRApplicantDataRadioGroupView$selectedItem$2() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(@k RadioButton radioButton) {
        return radioButton.getTag();
    }
}
