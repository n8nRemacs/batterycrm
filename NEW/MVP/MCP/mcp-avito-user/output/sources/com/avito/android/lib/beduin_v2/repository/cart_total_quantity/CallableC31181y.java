package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class CallableC31181y implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f176543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f176544c;

    public /* synthetic */ CallableC31181y(F f12, int i12) {
        this.f176543b = i12;
        this.f176544c = f12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f176543b) {
            case 0:
                F f12 = this.f176544c;
                f12.f176446a.remove("cart_icon_count_data");
                f12.f176447b.b(new C31169l(null, true));
                return G0.f406611a;
            case 1:
                Set<String> setF = this.f176544c.f176446a.f("cart_icon_supported_categories");
                if (setF == null) {
                    setF = B0.f406639b;
                }
                return C42745f0.M0(setF);
            default:
                return Boolean.valueOf(this.f176544c.f176446a.getBoolean("cart_icon_click", false));
        }
    }
}
