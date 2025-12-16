package com.avito.android.saved_searches.presentation.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: SavedSearchHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/header/f;", "Lcom/avito/android/saved_searches/presentation/items/header/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f258487b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f258488c;

    public f(@k View view) {
        super(view);
        this.f258487b = (TextView) view.findViewById(R.id.title);
        this.f258488c = (TextView) view.findViewById(R.id.subtitle);
    }

    @Override // com.avito.android.saved_searches.presentation.items.header.e
    public final void b(@l String str) {
        I5.a(this.f258487b, str, false);
    }

    @Override // com.avito.android.saved_searches.presentation.items.header.e
    public final void j(@l String str) {
        I5.a(this.f258488c, str, false);
    }
}
