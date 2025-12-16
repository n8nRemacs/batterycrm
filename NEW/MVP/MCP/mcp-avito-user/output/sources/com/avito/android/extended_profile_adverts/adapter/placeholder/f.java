package com.avito.android.extended_profile_adverts.adapter.placeholder;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlaceholderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/placeholder/f;", "Lcom/avito/android/extended_profile_adverts/adapter/placeholder/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f150594b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.placeholder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f150594b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_adverts.adapter.placeholder.e
    public final void setText(@k String str) {
        I5.a(this.f150594b, str, false);
    }
}
