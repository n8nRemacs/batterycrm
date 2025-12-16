package com.avito.android.rating_form.item.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/header/i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f248454b;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.header_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248454b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.rating_form.item.header.i
    public final void setText(@k String str) {
        this.f248454b.setText(str);
    }

    @Override // com.avito.android.rating_form.item.header.i
    public final void x00(boolean z12) {
        this.f248454b.setGravity(z12 ? 1 : 8388611);
    }
}
