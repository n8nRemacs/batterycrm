package com.avito.android.extended_profile_serp.adapter.search_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchHeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/search_header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_serp/adapter/search_header/f;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f152644b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.search_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152644b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_serp.adapter.search_header.f
    public final void Eb(int i12) {
        TextView textView = this.f152644b;
        I5.a(textView, textView.getResources().getQuantityString(R.plurals.extended_profile_serp_search_header, i12, Integer.valueOf(i12)), false);
    }
}
