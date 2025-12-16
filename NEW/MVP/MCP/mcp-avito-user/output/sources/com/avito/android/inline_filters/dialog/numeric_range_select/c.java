package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.A;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/numeric_range_select/c;", "Lcom/avito/android/select/A;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f171880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f171881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f171882c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f171883d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.l<? super InlineFilterValue.InlineFilterMultiSelectValue, G0> lVar, v vVar, x xVar, Y41.a<G0> aVar) {
        this.f171880a = (H) lVar;
        this.f171881b = vVar;
        this.f171882c = xVar;
        this.f171883d = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.android.select.A
    public final void a(@Y61.k InlineFilterValue inlineFilterValue) {
        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = inlineFilterValue instanceof InlineFilterValue.InlineFilterMultiSelectValue ? (InlineFilterValue.InlineFilterMultiSelectValue) inlineFilterValue : null;
        if (inlineFilterMultiSelectValue == null) {
            return;
        }
        this.f171880a.invoke(inlineFilterMultiSelectValue);
        x xVar = this.f171882c;
        String strW = xVar.w();
        String strX = xVar.x();
        v vVar = this.f171881b;
        v.h(vVar, xVar, strW, strX);
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = vVar.f171933d;
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.f265015r0 = null;
        }
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.dismiss();
        }
        this.f171883d.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.android.select.A
    public final void onDialogClose() {
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f171881b.f171933d;
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.f265015r0 = null;
        }
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.dismiss();
        }
        this.f171883d.invoke();
    }
}
