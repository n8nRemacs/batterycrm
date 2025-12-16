package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class CallableC31182z implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f176545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f176546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f176547d;

    public /* synthetic */ CallableC31182z(String str, Integer num, F f12) {
        this.f176545b = str;
        this.f176546c = num;
        this.f176547d = f12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f176545b;
        Integer num = this.f176546c;
        Q q12 = new Q(str, jCurrentTimeMillis, jCurrentTimeMillis + Constants.THIRTY_MINUTES, num);
        F f12 = this.f176547d;
        f12.f176446a.putString("cart_icon_count_data", ((Gson) f12.f176448c.getValue()).l(q12));
        f12.f176447b.b(new C31169l(num, true));
        return G0.f406611a;
    }
}
