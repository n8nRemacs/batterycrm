package com.avito.android.vas_union.ui.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: VasUnionV2TitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/title/g;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f323264b;

    public h(@k View view) {
        super(view);
        this.f323264b = (TextView) view.findViewById(R.id.vas_union_v2_title_item);
    }

    @Override // com.avito.android.vas_union.ui.items.title.g
    public final void setTitle(@k String str) {
        this.f323264b.setText(str);
    }
}
