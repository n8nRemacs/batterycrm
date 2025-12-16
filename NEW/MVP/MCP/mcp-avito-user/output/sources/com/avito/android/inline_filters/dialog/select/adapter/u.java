package com.avito.android.inline_filters.dialog.select.adapter;

import TV0.g;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: InlineFiltersDialogMultiselectImageRightBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/u;", "LTV0/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u implements TV0.b<m, i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f172130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f172131b = new g.a<>(R.layout.inline_filters_multiselect_image_right, t.f172129l);

    public u(@Y61.k j jVar) {
        this.f172130a = jVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<m, i> a() {
        return this.f172130a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f172131b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof i) {
            if (((i) aVar).f172095f == InlineItemType.f172057d) {
                return true;
            }
        }
        return false;
    }
}
