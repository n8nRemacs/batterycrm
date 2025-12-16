package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import com.avito.android.mortgage.api.model.DictionariesResult;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PreApprovalFormDataBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/b;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {
    @Y61.k
    Map a(@Y61.k String str, @Y61.k String str2, @Y61.k Map map);

    @Y61.k
    Map b(@Y61.k Map map, @Y61.k String str, float f12);

    @Y61.k
    Map c(int i12, @Y61.k String str, @Y61.k Map map);

    @Y61.k
    HashMap d(@Y61.k PreApprovalArguments preApprovalArguments, @Y61.k DictionariesResult dictionariesResult);

    @Y61.k
    LinkedHashMap e(@Y61.k Map map, @Y61.k LinkedHashMap linkedHashMap);

    @Y61.k
    Map<String, P00.a> f(@Y61.k Map<String, ? extends P00.a> map, @Y61.k String str, @Y61.k DictionariesResult dictionariesResult);
}
