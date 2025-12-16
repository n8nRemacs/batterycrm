package com.avito.android.inline_filters.dialog;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import kotlin.Metadata;

/* compiled from: InlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/m;", "Lcom/avito/android/select/A;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements com.avito.android.select.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f171848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171849b;

    public m(Y41.a aVar, j jVar) {
        this.f171848a = jVar;
        this.f171849b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, java.lang.Object] */
    @Override // com.avito.android.select.A
    public final void onDialogClose() {
        j jVar = this.f171848a;
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = jVar.f171652h;
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.dismiss();
        }
        jVar.f171652h = null;
        this.f171849b.invoke();
    }

    @Override // com.avito.android.select.A
    public final void a(@Y61.k InlineFilterValue inlineFilterValue) {
    }
}
