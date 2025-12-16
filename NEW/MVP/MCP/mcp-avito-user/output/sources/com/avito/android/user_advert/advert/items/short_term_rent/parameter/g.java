package com.avito.android.user_advert.advert.items.short_term_rent.parameter;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: ShortTermRentParameterItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/parameter/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/parameter/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f310247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f310248c;

    public g(@k View view) {
        super(view);
        this.f310247b = (TextView) view.findViewById(R.id.key_view);
        this.f310248c = (TextView) view.findViewById(R.id.value_view);
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.parameter.f
    public final void j10(@k String str, @k String str2) {
        I5.a(this.f310247b, str, false);
        I5.a(this.f310248c, str2, false);
    }
}
