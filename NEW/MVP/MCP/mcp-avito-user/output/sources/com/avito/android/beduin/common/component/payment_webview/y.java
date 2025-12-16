package com.avito.android.beduin.common.component.payment_webview;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WebPaymentPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/y;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f101906b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f101907a;

    /* compiled from: WebPaymentPayload.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/y$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public y(@Y61.l Map<String, ? extends Object> map) {
        this.f101907a = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && L.f(this.f101907a, ((y) obj).f101907a);
    }

    public final int hashCode() {
        Map<String, Object> map = this.f101907a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("WebPaymentPayload(postMessageParams="), this.f101907a, ')');
    }
}
