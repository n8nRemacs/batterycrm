package com.avito.android.publish.price_list.items.group;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectPriceListGroupRe23ItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/group/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/group/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f238650d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Accordion f238651b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f238652c;

    public m(@Y61.k View view) {
        super(view);
        Accordion accordion = (Accordion) view.findViewById(R.id.select_price_list_group_container);
        this.f238651b = accordion;
        this.f238652c = true;
        accordion.setHasCustomContent(true);
        D6.f(accordion, 0, 0, 0, y6.b(0), 7);
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f238651b.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(5, aVar));
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void n3(boolean z12) {
        this.f238651b.a(z12, !this.f238652c);
        this.f238652c = false;
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void setTitle(@Y61.k String str) {
        this.f238651b.setTitleText(str);
    }
}
