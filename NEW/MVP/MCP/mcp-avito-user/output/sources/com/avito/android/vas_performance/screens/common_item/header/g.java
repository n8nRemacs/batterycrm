package com.avito.android.vas_performance.screens.common_item.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: VasPerformanceHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/common_item/header/g;", "Lcom/avito/android/vas_performance/screens/common_item/header/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f320405b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f320406c;

    public g(@k View view) {
        super(view);
        this.f320405b = (TextView) view.findViewById(R.id.title);
        this.f320406c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.vas_performance.screens.common_item.header.f
    public final void T(@l CharSequence charSequence) {
        I5.a(this.f320406c, charSequence, false);
    }

    @Override // com.avito.android.vas_performance.screens.common_item.header.f
    public final void setTitle(@k String str) {
        this.f320405b.setText(str);
    }
}
