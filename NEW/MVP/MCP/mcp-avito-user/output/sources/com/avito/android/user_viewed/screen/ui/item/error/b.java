package com.avito.android.user_viewed.screen.ui.item.error;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserViewedErrorBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/error/b;", "LTV0/b;", "Lcom/avito/android/user_viewed/screen/ui/item/error/g;", "Lcom/avito/android/user_viewed/screen/ui/item/error/UserViewedErrorItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<g, UserViewedErrorItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f318494a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f318495b = new g.a<>(R.layout.user_viewed_error_item, a.f318493l);

    @Inject
    public b(@k e eVar) {
        this.f318494a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f318494a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f318495b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof UserViewedErrorItem;
    }
}
