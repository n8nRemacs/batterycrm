package com.avito.android.component.user_hat.items;

import TV0.g;
import com.avito.android.R;
import com.avito.android.component.user_hat.PassportParticularProfileItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParticularProfile.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/user_hat/items/d;", "LTV0/b;", "Lcom/avito/android/component/user_hat/items/j;", "Lcom/avito/android/component/user_hat/PassportParticularProfileItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.component.user_hat.items.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29576d implements TV0.b<j, PassportParticularProfileItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f125328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f125329b = new g.a<>(R.layout.passport_profile_item, C29575c.f125327l);

    @Inject
    public C29576d(@Y61.k h hVar) {
        this.f125328a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f125328a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f125329b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof PassportParticularProfileItem;
    }
}
