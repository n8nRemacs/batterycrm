package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataMutilselectFieldView;

/* compiled from: MultiselectView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataMutilselectFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiSelect;", "item", "", "", "aValues", "Lkotlin/G0;", "setValuesFromQuestionnaire", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataMutilselectFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiSelect;Ljava/util/List;)V", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiselectViewKt {
    public static final void setValuesFromQuestionnaire(@k CBRApplicantDataMutilselectFieldView cBRApplicantDataMutilselectFieldView, @k FormItem.MultiSelect multiSelect, @l List<String> list) {
        h.e.a.C12451a c12451a;
        Object next;
        List<o> listR = multiSelect.getItem().r();
        if (listR == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<T> it = listR.iterator();
            while (true) {
                c12451a = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (L.f(str, ((o) next).getValue())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            o oVar = (o) next;
            if (oVar != null) {
                String value = oVar.getValue();
                if (value == null) {
                    value = "";
                }
                String title = oVar.getTitle();
                c12451a = new h.e.a.C12451a(value, title != null ? title : "");
            }
            if (c12451a != null) {
                arrayList.add(c12451a);
            }
        }
        cBRApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
    }
}
