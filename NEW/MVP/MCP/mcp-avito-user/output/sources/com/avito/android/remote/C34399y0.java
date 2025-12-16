package com.avito.android.remote;

import com.avito.android.remote.model.BuyContactsResponse;
import com.avito.android.remote.model.EarlyAccessResponse;
import com.avito.android.remote.model.FailurePhoneResponse;
import com.avito.android.remote.model.PhoneResponse;
import com.avito.android.remote.model.SpendContactResponse;
import com.avito.android.remote.model.SuccessPhoneResponse;
import com.avito.android.util.C35866p0;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: PhoneResponseJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/y0;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "<init>", "()V", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.y0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34399y0 implements dagger.internal.h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C34399y0 f254409a = new C34399y0();

    @Override // javax.inject.Provider
    public final Object get() {
        C34397x0.f254408a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ok", SuccessPhoneResponse.class);
        linkedHashMap.put("failure", FailurePhoneResponse.class);
        linkedHashMap.put("buy-contacts", BuyContactsResponse.class);
        linkedHashMap.put("spend-contacts", SpendContactResponse.class);
        linkedHashMap.put("early-access", EarlyAccessResponse.class);
        return new C35866p0(PhoneResponse.class, linkedHashMap);
    }
}
