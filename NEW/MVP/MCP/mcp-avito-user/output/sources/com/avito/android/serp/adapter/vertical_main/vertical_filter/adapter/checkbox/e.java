package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox;

import Y61.k;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.serp.adapter.vertical_main.p;
import kotlin.Metadata;

/* compiled from: VerticalFilterCheckboxItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/checkbox/e;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/checkbox/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f273450b;

    public e(@k p pVar) {
        this.f273450b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String displayTitle;
        f fVar = (f) eVar;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e eVar2 = (com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) aVar;
        Filter filter = eVar2.f273466c;
        if (filter == null || (displayTitle = filter.getTitle()) == null) {
            Filter filter2 = eVar2.f273466c;
            displayTitle = filter2 != null ? filter2.getDisplayTitle() : null;
            if (displayTitle == null) {
                displayTitle = "";
            }
        }
        fVar.setTitle(displayTitle);
        Filter filter3 = eVar2.f273466c;
        Parcelable value = filter3 != null ? filter3.getValue() : null;
        InlineFilterValue.InlineFilterBooleanValue inlineFilterBooleanValue = value instanceof InlineFilterValue.InlineFilterBooleanValue ? (InlineFilterValue.InlineFilterBooleanValue) value : null;
        fVar.Z1(inlineFilterBooleanValue != null ? inlineFilterBooleanValue.getValue() : false);
        fVar.d7(new d(eVar2, this));
    }
}
