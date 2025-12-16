package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: ServiceOrdersManagementPanelsItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/f;", "Lcom/avito/conveyor_item/a;", "a", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f279302b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f279303c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f279304d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f279305e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f279306f;

    /* compiled from: ServiceOrdersManagementPanelsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/f$a;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f279307a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279308b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279309c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f279310d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f279311e;

        public a(@k String str, @l String str2, @l String str3, @k DeepLink deepLink, @k String str4) {
            this.f279307a = str;
            this.f279308b = str2;
            this.f279309c = str3;
            this.f279310d = deepLink;
            this.f279311e = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f279307a, aVar.f279307a) && L.f(this.f279308b, aVar.f279308b) && L.f(this.f279309c, aVar.f279309c) && L.f(this.f279310d, aVar.f279310d) && L.f(this.f279311e, aVar.f279311e);
        }

        public final int hashCode() {
            int iHashCode = this.f279307a.hashCode() * 31;
            String str = this.f279308b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f279309c;
            return this.f279311e.hashCode() + com.avito.android.actions_sheet.a.e(this.f279310d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Panel(title=");
            sb2.append(this.f279307a);
            sb2.append(", subTitle=");
            sb2.append(this.f279308b);
            sb2.append(", status=");
            sb2.append(this.f279309c);
            sb2.append(", uri=");
            sb2.append(this.f279310d);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.f279311e, ')');
        }
    }

    public f(@k LinkedHashMap linkedHashMap, @k String str) {
        this.f279302b = str;
        this.f279303c = linkedHashMap;
        this.f279304d = (a) linkedHashMap.get("left");
        this.f279305e = (a) linkedHashMap.get("rightTop");
        this.f279306f = (a) linkedHashMap.get("rightBottom");
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f279302b, fVar.f279302b) && this.f279303c.equals(fVar.f279303c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF280528b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF280528b() {
        return this.f279302b;
    }

    public final int hashCode() {
        return this.f279303c.hashCode() + (this.f279302b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersManagementPanelsItem(stringId=");
        sb2.append(this.f279302b);
        sb2.append(", panels=");
        return h.e(sb2, this.f279303c, ')');
    }
}
