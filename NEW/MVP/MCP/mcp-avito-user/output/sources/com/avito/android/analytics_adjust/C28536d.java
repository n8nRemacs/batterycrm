package com.avito.android.analytics_adjust;

import com.avito.android.analytics_adjust.utils.AdjustContentType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdjustEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics_adjust/d;", "Lcom/avito/android/analytics_adjust/c;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics_adjust.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final /* data */ class C28536d implements InterfaceC28535c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f91207b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f91208c;

    public C28536d(@Y61.k String str, @Y61.k q qVar) {
        this.f91207b = str;
        this.f91208c = qVar;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c a(@Y61.l Double d12) {
        if (d12 != null) {
            this.f91208c.put("value", String.valueOf(d12.doubleValue()));
        }
        return this;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c c() {
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        this.f91208c.put("content_type", "product");
        return this;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c d(@Y61.l Map<String, String> map) {
        if (map != null) {
            this.f91208c.putAll(map);
        }
        return this;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c e() {
        this.f91208c.put("trg_feed", "3221614_72");
        return this;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28536d)) {
            return false;
        }
        C28536d c28536d = (C28536d) obj;
        return L.f(this.f91207b, c28536d.f91207b) && L.f(this.f91208c, c28536d.f91208c);
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c f(@Y61.k String str) {
        this.f91208c.put("content_ids", str);
        return this;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c g(@Y61.k String str) {
        q qVar = this.f91208c;
        EventParams[] eventParamsArr = EventParams.f91199b;
        qVar.put("revenue", str);
        return this;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF91207b() {
        return this.f91207b;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    /* renamed from: getParams, reason: from getter */
    public final q getF91208c() {
        return this.f91208c;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28535c
    @Y61.k
    public final InterfaceC28535c h() {
        Integer num = 1;
        getF91208c().put("quantity", num.toString());
        return this;
    }

    public final int hashCode() {
        return this.f91208c.hashCode() + (this.f91207b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "AdjustEventImpl(name=" + this.f91207b + ", params=" + this.f91208c + ')';
    }
}
