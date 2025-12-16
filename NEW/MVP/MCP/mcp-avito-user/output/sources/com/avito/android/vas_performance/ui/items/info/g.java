package com.avito.android.vas_performance.ui.items.info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: InfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_performance/ui/items/info/f;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f321692b;

    public g(@k View view) {
        super(view);
        this.f321692b = (TextView) view;
    }

    @Override // com.avito.android.vas_performance.ui.items.info.f
    public final void v0(@k String str) {
        this.f321692b.setText(str);
    }
}
