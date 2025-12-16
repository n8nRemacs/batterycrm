package com.avito.android.advert_core.discount.item.group_title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupTitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/discount/item/group_title/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/discount/item/group_title/d;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f83399b;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.group_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83399b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert_core.discount.item.group_title.d
    public final void setTitle(@k String str) {
        this.f83399b.setText(str);
    }
}
