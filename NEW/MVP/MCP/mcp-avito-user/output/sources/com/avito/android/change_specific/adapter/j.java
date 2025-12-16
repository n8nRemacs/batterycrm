package com.avito.android.change_specific.adapter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/adapter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/change_specific/adapter/i;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f117900b;

    public j(@Y61.k View view) {
        super(view);
        this.f117900b = (TextView) view.findViewById(R.id.change_specific_item_header_title);
    }

    @Override // com.avito.android.change_specific.adapter.i
    public final void d80() {
        this.f117900b.setText(R.string.extended_profile_change_specific_title);
    }
}
