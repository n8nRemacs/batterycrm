package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/d;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f279293a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f279294b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ServiceOrdersListSnippetItem.Status f279295c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f279296d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f279297e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f279298f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f279299g;

    public d(@l String str, @l AttributedText attributedText, @l ServiceOrdersListSnippetItem.Status status, @l DeepLink deepLink, @l String str2, @l String str3, @l ArrayList arrayList) {
        this.f279293a = str;
        this.f279294b = attributedText;
        this.f279295c = status;
        this.f279296d = deepLink;
        this.f279297e = str2;
        this.f279298f = str3;
        this.f279299g = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f279293a, dVar.f279293a) && L.f(this.f279294b, dVar.f279294b) && this.f279295c == dVar.f279295c && L.f(null, null) && L.f(this.f279296d, dVar.f279296d) && L.f(this.f279297e, dVar.f279297e) && L.f(this.f279298f, dVar.f279298f) && L.f(this.f279299g, dVar.f279299g);
    }

    public final int hashCode() {
        String str = this.f279293a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f279294b;
        int iHashCode2 = (this.f279295c.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 961;
        DeepLink deepLink = this.f279296d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.f279297e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f279298f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList arrayList = this.f279299g;
        return iHashCode5 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersListSnippetPayload(statusText=");
        sb2.append(this.f279293a);
        sb2.append(", extendedStatus=");
        sb2.append(this.f279294b);
        sb2.append(", status=");
        sb2.append(this.f279295c);
        sb2.append(", moreBtnDeepLink=null, actionLink=");
        sb2.append(this.f279296d);
        sb2.append(", actionTitle=");
        sb2.append(this.f279297e);
        sb2.append(", commentText=");
        sb2.append(this.f279298f);
        sb2.append(", contacts=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f279299g, ')');
    }
}
