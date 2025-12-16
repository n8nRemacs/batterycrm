package com.avito.android.vas_performance.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPerformanceHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/header/e;", "Lcom/avito/android/vas_performance/ui/items/header/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f321683b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f321684c;

    public e(@k View view) {
        super(view);
        this.f321683b = (TextView) view.findViewById(R.id.title);
        this.f321684c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.vas_performance.ui.items.header.d
    public final void T(@l CharSequence charSequence) {
        I5.a(this.f321684c, charSequence, false);
    }

    @Override // com.avito.android.vas_performance.ui.items.header.d
    public final boolean lv() {
        CharSequence text = this.f321684c.getText();
        return !(text == null || text.length() == 0);
    }

    @Override // com.avito.android.vas_performance.ui.items.header.d
    public final void setTitle(@k String str) {
        this.f321683b.setText(str);
    }
}
