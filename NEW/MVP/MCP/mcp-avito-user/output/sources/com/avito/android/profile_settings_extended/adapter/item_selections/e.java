package com.avito.android.profile_settings_extended.adapter.item_selections;

import TV0.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import jc0.C42355a;
import jc0.C42356b;
import kotlin.Metadata;

/* compiled from: SelectionsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/e;", "LTV0/b;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/k;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/SelectionsItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.b<k, SelectionsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f229621a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42356b f229622b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f229623c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f229624d = new g.a<>(R.layout.ext_profile_selections_item, new d(this));

    @Inject
    public e(@Y61.k g gVar, @C42355a.b @Y61.k C42356b c42356b, @C42355a.b @Y61.k com.avito.konveyor.a aVar) {
        this.f229621a = gVar;
        this.f229622b = c42356b;
        this.f229623c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f229621a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f229624d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SelectionsItem;
    }
}
