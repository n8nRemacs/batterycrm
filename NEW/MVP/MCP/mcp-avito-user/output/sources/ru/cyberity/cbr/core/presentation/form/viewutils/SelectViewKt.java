package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataRadioGroupView;

/* compiled from: SelectView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataRadioGroupView;", "", "aValue", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataRadioGroupView;Ljava/lang/String;)V", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class SelectViewKt {
    public static final void setValueFromItem(@k CBRApplicantDataRadioGroupView cBRApplicantDataRadioGroupView, @l String str) {
        Object next;
        Iterator<T> it = cBRApplicantDataRadioGroupView.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((h.e.a.C12451a) next).getId(), str)) {
                    break;
                }
            }
        }
        cBRApplicantDataRadioGroupView.setSelectedItem((h.e.a.C12451a) next);
    }
}
