package com.avito.android.publish.price_list.items.header;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SelfServicesHeaderRe23ItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/header/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Accordion f238662b;

    public j(@Y61.k View view) {
        super(view);
        Accordion accordion = (Accordion) view.findViewById(R.id.self_services_header);
        this.f238662b = accordion;
        accordion.setHasCustomContent(true);
        accordion.a(true, false);
        accordion.setOnClickListener(null);
        D6.f(accordion, 0, 0, 0, y6.b(0), 7);
    }

    @Override // com.avito.android.publish.price_list.items.header.f
    public final void setTitle(@Y61.k String str) {
        this.f238662b.setTitleText(str);
    }
}
