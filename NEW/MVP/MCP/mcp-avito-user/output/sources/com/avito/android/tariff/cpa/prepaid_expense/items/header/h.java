package com.avito.android.tariff.cpa.prepaid_expense.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/prepaid_expense/items/header/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f295055b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f295056c;

    public h(@k View view) {
        super(view);
        this.f295055b = (TextView) view.findViewById(R.id.title);
        this.f295056c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.items.header.g
    public final void T(@l CharSequence charSequence) {
        I5.a(this.f295056c, charSequence, false);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.items.header.g
    public final void setTitle(@k String str) {
        this.f295055b.setText(str);
    }
}
