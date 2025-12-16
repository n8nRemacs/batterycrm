package com.avito.android.bundles.vas_union.item.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasBundlesHeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/header/d;", "Lcom/avito/android/bundles/vas_union/item/header/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f108581b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f108582c;

    public d(@k View view) {
        super(view);
        this.f108581b = (TextView) view.findViewById(R.id.title);
        this.f108582c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.bundles.vas_union.item.header.c
    public final void T(@l CharSequence charSequence) {
        I5.a(this.f108582c, charSequence, false);
    }

    @Override // com.avito.android.bundles.vas_union.item.header.c
    public final void setTitle(@k String str) {
        this.f108581b.setText(str);
    }
}
