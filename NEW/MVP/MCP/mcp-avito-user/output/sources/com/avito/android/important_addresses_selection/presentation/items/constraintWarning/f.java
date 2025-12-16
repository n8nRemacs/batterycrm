package com.avito.android.important_addresses_selection.presentation.items.constraintWarning;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: ImportantAddressesSelectionConstraintWarningView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/constraintWarning/f;", "Lcom/avito/android/important_addresses_selection/presentation/items/constraintWarning/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f169862b;

    public f(@k View view) {
        super(view);
        this.f169862b = (TextView) view.findViewById(R.id.text);
    }

    @Override // com.avito.android.important_addresses_selection.presentation.items.constraintWarning.e
    public final void T3(@k String str) {
        I5.a(this.f169862b, str, false);
    }
}
