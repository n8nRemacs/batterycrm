package com.avito.android.async_phone;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.serp.adapter.InAppCallsAwareItem;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: LegacyAsyncPhoneInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/u;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface u {

    /* compiled from: LegacyAsyncPhoneInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    B0 a(@Y61.k String str, @Y61.l String str2, @Y61.k InAppCallsAwareItem inAppCallsAwareItem, @Y61.k ContactSource contactSource, @Y61.l String str3, @Y61.l Boolean bool);

    @Y61.k
    B0 b(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2, @Y61.l String str3);
}
