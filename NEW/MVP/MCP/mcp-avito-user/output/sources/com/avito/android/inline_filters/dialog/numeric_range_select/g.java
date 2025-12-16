package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class g extends H implements Y41.l<InlineFilterValue.InlineFilterMultiSelectValue, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f171888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f171889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, x xVar, ArrayList arrayList) {
        super(1, L.a.class, "fromValueFromSelect", "setUpDialog$fromValueFromSelect(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterDialog;Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;Ljava/util/List;Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;)V", 0);
        this.f171888b = vVar;
        this.f171889c = xVar;
        this.f171890d = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue) {
        x xVar = this.f171889c;
        r rVar = new r(xVar);
        v vVar = this.f171888b;
        s sVar = new s(1, vVar, v.class, "configureFromSelectState", "configureFromSelectState(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;)V", 0);
        ArrayList arrayList = this.f171890d;
        vVar.getClass();
        List<String> selectedOptions = inlineFilterMultiSelectValue.getSelectedOptions();
        rVar.invoke(v.i(selectedOptions != null ? (String) C42745f0.E(selectedOptions) : null, arrayList));
        sVar.invoke(xVar);
        return G0.f406611a;
    }
}
