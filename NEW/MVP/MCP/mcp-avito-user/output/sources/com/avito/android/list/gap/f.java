package com.avito.android.list.gap;

import Y61.k;
import android.view.View;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: GapItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/gap/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/list/gap/e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f181561b;

    public f(@k View view) {
        super(view);
        this.f181561b = view;
    }

    @Override // com.avito.android.list.gap.e
    public final void yb(int i12) {
        View view = this.f181561b;
        view.getLayoutParams().height = D6.j(view, i12);
    }
}
