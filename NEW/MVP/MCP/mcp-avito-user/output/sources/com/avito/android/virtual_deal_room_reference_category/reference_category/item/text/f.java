package com.avito.android.virtual_deal_room_reference_category.reference_category.item.text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/item/text/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/virtual_deal_room_reference_category/reference_category/item/text/e;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f327261b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.reference_category_test);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f327261b = textView;
        textView.getLayoutParams().width = -2;
    }

    @Override // com.avito.android.virtual_deal_room_reference_category.reference_category.item.text.e
    public final void setTitle(@k String str) {
        this.f327261b.setText(str);
    }
}
