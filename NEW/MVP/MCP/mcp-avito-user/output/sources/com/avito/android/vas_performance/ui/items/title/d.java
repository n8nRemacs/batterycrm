package com.avito.android.vas_performance.ui.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: VasPerformanceTitleItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/title/d;", "Lcom/avito/android/vas_performance/ui/items/title/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321787b;

    public d(@k View view) {
        super(view);
        this.f321787b = view;
    }

    @Override // com.avito.android.vas_performance.ui.items.title.c
    public final void setTitle(@k String str) {
        ((TextView) this.f321787b).setText(str);
    }
}
