package ru.cyberity.cbr.presentation.utils;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: ApplicantDataField.InternalFieldToFormItemExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e;", "", "id", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "a", "(Lru/cyberity/cbr/core/data/model/h$e;Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {
    public static /* synthetic */ FormItem a(h.e eVar, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        return a(eVar, str);
    }

    @k
    public static final FormItem a(@k h.e eVar, @l String str) {
        if (!(eVar instanceof h.e.a)) {
            if (eVar instanceof h.e.b) {
                return new FormItem.Description(((h.e.b) eVar).getText().toString(), "appdata");
            }
            throw new NoWhenBranchMatchedException();
        }
        h.e.a aVar = (h.e.a) eVar;
        List<h.e.a.C12451a> listH = aVar.h();
        ArrayList arrayList = new ArrayList(C42745f0.q(listH, 10));
        for (h.e.a.C12451a c12451a : listH) {
            arrayList.add(new o(c12451a.getId(), c12451a.getLabel()));
        }
        ru.cyberity.cbr.core.data.source.applicant.remote.h hVar = new ru.cyberity.cbr.core.data.source.applicant.remote.h(str, aVar.getLabel(), (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, arrayList, 252, (C42822w) null);
        o oVar = (o) C42745f0.K(aVar.getCurrentSelectedItem(), arrayList);
        return new FormItem.SelectDropdown(hVar, "appdata", oVar != null ? oVar.getValue() : null, false, null, 24, null);
    }
}
