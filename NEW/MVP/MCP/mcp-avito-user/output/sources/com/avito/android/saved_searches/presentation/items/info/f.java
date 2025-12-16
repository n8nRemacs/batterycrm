package com.avito.android.saved_searches.presentation.items.info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: SavedSearchInfoView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/info/f;", "Lcom/avito/android/saved_searches/presentation/items/info/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f258498b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f258499c;

    public f(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f258498b = aVar;
        this.f258499c = (TextView) view.findViewById(R.id.info);
    }

    @Override // com.avito.android.saved_searches.presentation.items.info.e
    public final void Gx(@l AttributedText attributedText) {
        TextView textView = this.f258499c;
        I5.a(textView, this.f258498b.c(textView.getContext(), attributedText), false);
    }
}
