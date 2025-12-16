package com.avito.android.component.advert_badge_bar.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TitleItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/title/g;", "Lcom/avito/android/component/advert_badge_bar/title/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f125016b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f125017c;

    public g(@k View view) {
        super(view);
        this.f125016b = view;
        view.setOnClickListener(new h(this, 7));
    }

    @Override // com.avito.android.component.advert_badge_bar.title.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f125017c = aVar;
    }

    @Override // com.avito.android.component.advert_badge_bar.title.f
    public final void setText(@k String str) {
        ((TextView) this.f125016b).setText(str);
    }
}
