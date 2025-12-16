package com.avito.android.developments_agency_search.screen.big_filters.converter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.MultiSelectSearchParam;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.StringSearchParam;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.search.filter.w1;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AgencySearchParametersTreeToSearchParamsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/converter/a;", "Lcom/avito/android/search/filter/w1;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements w1 {
    @Inject
    public a() {
    }

    public static void b(LinkedHashMap linkedHashMap, EditableParameter editableParameter) {
        String id2 = editableParameter.getId();
        String strP0 = C43066x.p0(C43066x.l0('[', id2, id2), ']');
        SearchParam stringSearchParam = null;
        if (editableParameter instanceof MultiselectParameter) {
            List<? extends String> value = ((MultiselectParameter) editableParameter).getValue();
            if (value != null && !value.isEmpty()) {
                stringSearchParam = new MultiSelectSearchParam(value);
            }
        } else if (editableParameter instanceof BooleanParameter) {
            Boolean value2 = ((BooleanParameter) editableParameter).getValue();
            if (value2 != null) {
                stringSearchParam = new StringSearchParam(value2.booleanValue() ? "1" : "0");
            }
        } else {
            Object value3 = editableParameter.getValue();
            if (value3 != null) {
                stringSearchParam = new StringSearchParam(value3.toString());
            }
        }
        if (stringSearchParam != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    @Override // com.avito.android.search.filter.w1
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.SearchParams a(@Y61.k com.avito.android.remote.model.filters_parameter.ParametersTree r39) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.converter.a.a(com.avito.android.remote.model.filters_parameter.ParametersTree):com.avito.android.remote.model.SearchParams");
    }
}
