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
final /* synthetic */ class k extends H implements Y41.l<InlineFilterValue.InlineFilterMultiSelectValue, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f171905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f171906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, x xVar, ArrayList arrayList) {
        super(1, L.a.class, "fromValueToSelect", "setUpDialog$fromValueToSelect(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterDialog;Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;Ljava/util/List;Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;)V", 0);
        this.f171905b = vVar;
        this.f171906c = xVar;
        this.f171907d = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue) {
        x xVar = this.f171906c;
        t tVar = new t(xVar);
        v vVar = this.f171905b;
        u uVar = new u(1, vVar, v.class, "configureToSelectState", "configureToSelectState(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;)V", 0);
        ArrayList arrayList = this.f171907d;
        vVar.getClass();
        List<String> selectedOptions = inlineFilterMultiSelectValue.getSelectedOptions();
        tVar.invoke(v.i(selectedOptions != null ? (String) C42745f0.E(selectedOptions) : null, arrayList));
        uVar.invoke(xVar);
        return G0.f406611a;
    }
}
