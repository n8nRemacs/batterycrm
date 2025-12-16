package com.avito.android.component.user_hat.items;

import TV0.g;
import com.avito.android.R;
import com.avito.android.component.user_hat.PassportProfileAddItem;
import hw.InterfaceC41178c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: Add.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/user_hat/items/n;", "LTV0/b;", "Lcom/avito/android/component/user_hat/items/t;", "Lcom/avito/android/component/user_hat/PassportProfileAddItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements TV0.b<t, PassportProfileAddItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f125349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<u> f125350b = new g.a<>(R.layout.passport_profiles_add_item, m.f125348l);

    @Inject
    public n(@Y61.k r rVar) {
        this.f125349a = rVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f125349a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<u> b() {
        return this.f125350b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof PassportProfileAddItem;
    }
}
