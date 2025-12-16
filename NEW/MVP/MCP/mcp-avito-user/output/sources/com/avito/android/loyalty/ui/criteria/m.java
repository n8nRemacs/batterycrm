package com.avito.android.loyalty.ui.criteria;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: TabLayoutView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/m;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements com.avito.android.lib.deprecated_design.tab.adapter.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f183521a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f183522b;

    public m(@Y61.k View view) {
        this.f183521a = view;
        TextView textView = (TextView) view.findViewById(R.id.tab_title);
        this.f183522b = textView;
        textView.setTextAppearance(C35835l0.j(R.attr.textH30, view.getContext()));
        textView.setTextColor(view.getContext().getColorStateList(R.color.tab_title_redesign_color));
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.a
    public final void a(@Y61.l String str, @Y61.l String str2) {
        I5.a(this.f183522b, str, false);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
        this.f183522b.setSelected(z12);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF183521a() {
        return this.f183521a;
    }
}
