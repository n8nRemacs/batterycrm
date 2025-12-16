package com.avito.android.vas_performance.screens.visual.item.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: VisualVasHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/header/h;", "Lcom/avito/android/vas_performance/screens/visual/item/header/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f321048b;

    public h(@k View view) {
        super(view);
        this.f321048b = (TextView) view.findViewById(R.id.visual_vas_header_title);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.header.g
    public final void setTitle(@k String str) {
        this.f321048b.setText(str);
    }
}
