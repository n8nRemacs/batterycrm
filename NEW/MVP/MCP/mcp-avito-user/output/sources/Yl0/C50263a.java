package yl0;

import Y61.k;
import com.avito.android.remote.reseller.model.MessageLinkResponse;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: AutoResellerJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyl0/a;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "<init>", "()V", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50263a implements h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C50263a f443485a = new C50263a();

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.reseller.model.a.f254336a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ok", MessageLinkResponse.OpenLink.class);
        linkedHashMap.put("buy-contacts", MessageLinkResponse.BuyContact.class);
        linkedHashMap.put("spend-contacts", MessageLinkResponse.SpendContact.class);
        linkedHashMap.put("early-access", MessageLinkResponse.EarlyAccessResponse.class);
        return new C35866p0(MessageLinkResponse.class, linkedHashMap);
    }
}
