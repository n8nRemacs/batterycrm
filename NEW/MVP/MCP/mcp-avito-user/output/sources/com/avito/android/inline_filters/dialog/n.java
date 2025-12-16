package com.avito.android.inline_filters.dialog;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.sectioned_multiselect.core.SectionedMultiselectCoreFragment;
import kotlin.Metadata;

/* compiled from: InlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/n;", "Lcom/avito/android/select/A;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements com.avito.android.select.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f171874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171875b;

    public n(Y41.a aVar, j jVar) {
        this.f171874a = jVar;
        this.f171875b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, java.lang.Object] */
    @Override // com.avito.android.select.A
    public final void onDialogClose() {
        j jVar = this.f171874a;
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = jVar.f171653i;
        if (sectionedMultiselectCoreFragment != null) {
            sectionedMultiselectCoreFragment.dismiss();
        }
        jVar.f171653i = null;
        this.f171875b.invoke();
    }

    @Override // com.avito.android.select.A
    public final void a(@Y61.k InlineFilterValue inlineFilterValue) {
    }
}
