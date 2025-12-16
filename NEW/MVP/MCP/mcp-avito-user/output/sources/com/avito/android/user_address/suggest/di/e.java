package com.avito.android.user_address.suggest.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.user_address.suggest.UserAddressSuggestFragment;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAddressSuggestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/di/e;", "Lcom/avito/android/user_address/di/e;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface e extends com.avito.android.user_address.di.e {

    /* compiled from: UserAddressSuggestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/di/e$a;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        e a(@h31.b @k Resources resources, @h31.b @k l<? super Integer, G0> lVar, @h31.b @k com.avito.android.user_address.g gVar, @b @h31.b @k String str, @h31.b @k r rVar, @k f fVar, @k com.avito.android.user_address.di.b bVar);
    }

    void a(@k UserAddressSuggestFragment userAddressSuggestFragment);
}
