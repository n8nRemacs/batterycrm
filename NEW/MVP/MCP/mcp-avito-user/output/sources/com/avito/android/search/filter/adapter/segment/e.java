package com.avito.android.search.filter.adapter.segment;

import Y61.k;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;

/* compiled from: SegmentItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/segment/e;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements SegmentedControl.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f262567c;

    public e(ParameterElement.v.b bVar, f fVar) {
        this.f262566b = bVar;
        this.f262567c = fVar;
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void kJ(int i12, @k CharSequence charSequence) {
        ParameterElement.v.b bVar = this.f262566b;
        bVar.f262844g = bVar.f262862t.get(i12);
        this.f262567c.f262568b.accept(bVar);
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void KT(int i12, @k CharSequence charSequence) {
    }
}
