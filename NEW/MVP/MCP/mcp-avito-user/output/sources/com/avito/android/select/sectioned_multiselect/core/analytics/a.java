package com.avito.android.select.sectioned_multiselect.core.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionedMultiselectLimitEvent.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/analytics/a;", "", "", "filterId", "", "tabsList", "selectedParamsList", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getFilterId", "()Ljava/lang/String;", "Ljava/util/List;", "getTabsList", "()Ljava/util/List;", "getSelectedParamsList", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("filter_id")
    @l
    private final String filterId;

    @com.google.gson.annotations.c("selected_params_list")
    @l
    private final List<String> selectedParamsList;

    @com.google.gson.annotations.c("tabs_list")
    @l
    private final List<String> tabsList;

    public a(@l String str, @l List<String> list, @l List<String> list2) {
        this.filterId = str;
        this.tabsList = list;
        this.selectedParamsList = list2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.filterId, aVar.filterId) && L.f(this.tabsList, aVar.tabsList) && L.f(this.selectedParamsList, aVar.selectedParamsList);
    }

    public final int hashCode() {
        String str = this.filterId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.tabsList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.selectedParamsList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParamsModel(filterId=");
        sb2.append(this.filterId);
        sb2.append(", tabsList=");
        sb2.append(this.tabsList);
        sb2.append(", selectedParamsList=");
        return H.p(sb2, this.selectedParamsList, ')');
    }
}
