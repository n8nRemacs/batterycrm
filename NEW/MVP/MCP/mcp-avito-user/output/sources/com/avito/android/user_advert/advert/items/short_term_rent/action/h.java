package com.avito.android.user_advert.advert.items.short_term_rent.action;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_advert.advert.items.service_booking.i;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortTermRentActionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/action/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/action/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f310240c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f310241b;

    public h(@k View view) {
        super(view);
        this.f310241b = (Button) view;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.action.g
    public final void S(@k Y41.a<G0> aVar) {
        this.f310241b.setOnClickListener(new i(3, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.action.g
    public final void b(@k String str) {
        com.avito.android.lib.design.button.b.a(this.f310241b, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310241b.setOnClickListener(null);
    }
}
