package com.avito.android.suggest_addresses.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;
import oA0.InterfaceC44610a;

/* compiled from: SuggestAddressesComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/di/c;", "Lcom/avito/android/di/h;", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface c extends InterfaceC29971h {

    /* compiled from: SuggestAddressesComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/di/c$a;", "", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k InterfaceC30106l7 interfaceC30106l7, @k d dVar, @h31.b @k C28478k c28478k, @h31.b @k SuggestAddressesParams suggestAddressesParams, @h31.b @k l<? super InterfaceC44610a, G0> lVar);
    }

    void yd(@k SuggestAddressesFragment suggestAddressesFragment);
}
