package com.avito.android.wallet.page.history.details.remote.adapter;

import UO0.b;
import Y61.k;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PaymentOperationTargetTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/history/details/remote/adapter/PaymentOperationTargetTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "LUO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentOperationTargetTypeAdapter extends RuntimeTypeAdapter<b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f327967a;

    public PaymentOperationTargetTypeAdapter() {
        super(null, null, null, 7, null);
        this.f327967a = P0.g(new Q("item", b.a.class), new Q("base", b.C1122b.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends UO0.b>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends b>> getMapping() {
        return this.f327967a;
    }
}
