package com.avito.android.beduin.common.component.inline_filter.item;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: InlineFilterItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/k;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f101522b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f101523c;

    public k(@Y61.k View view) {
        super(view);
        this.f101522b = view;
        this.f101523c = (Button) view.findViewById(R.id.btn_filter);
    }
}
