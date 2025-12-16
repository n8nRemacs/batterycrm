package com.avito.android.profile_settings_extended.adapter.count;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CountItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/count/d;", "LTV0/d;", "Lcom/avito/android/profile_settings_extended/adapter/count/f;", "Lcom/avito/android/profile_settings_extended/adapter/count/CountItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, CountItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229379b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super yc0.k, G0> lVar) {
        this.f229379b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        f fVar = (f) eVar;
        CountItem countItem = (CountItem) aVar;
        fVar.b(countItem.f229359d);
        Integer num = countItem.f229369n;
        if (num == null) {
            fVar.I7(countItem.f229361f);
            i13 = R.string.extended_profile_geo_add_button;
        } else {
            fVar.ob(num.intValue());
            i13 = R.string.extended_profile_settings_change;
        }
        fVar.le(i13);
        fVar.ec(new c(this, countItem));
        fVar.xT(countItem.f229371p);
    }
}
