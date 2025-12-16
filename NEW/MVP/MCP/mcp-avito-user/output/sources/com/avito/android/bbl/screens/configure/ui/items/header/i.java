package com.avito.android.bbl.screens.configure.ui.items.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: BblConfigureHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/bbl/screens/configure/ui/items/header/h;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f99263b;

    public i(@k View view) {
        super(view);
        this.f99263b = (TextView) view.findViewById(R.id.bbl_configure_header_title);
    }

    @Override // com.avito.android.bbl.screens.configure.ui.items.header.h
    public final void e(@k AttributedText attributedText) {
        j.c(this.f99263b, attributedText, null);
    }
}
