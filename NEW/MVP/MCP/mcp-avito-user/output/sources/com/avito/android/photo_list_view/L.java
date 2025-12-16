package com.avito.android.photo_list_view;

import android.net.Uri;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlaceholderImageData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/L;", "Lcom/avito/android/photo_list_view/b;", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class L implements InterfaceC33208b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f218092a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f218093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33208b.InterfaceC6540b f218094c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<InterfaceC33208b.a> f218095d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f218096e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f218097f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f218098g;

    public L() {
        throw null;
    }

    public L(String str, Uri uri, InterfaceC33208b.InterfaceC6540b interfaceC6540b, List list, Integer num, Integer num2, Integer num3, int i12, C42822w c42822w) {
        interfaceC6540b = (i12 & 4) != 0 ? InterfaceC33208b.InterfaceC6540b.d.f218120a : interfaceC6540b;
        list = (i12 & 8) != 0 ? C42784z0.f406748b : list;
        num = (i12 & 16) != 0 ? null : num;
        num2 = (i12 & 32) != 0 ? null : num2;
        num3 = (i12 & 64) != 0 ? null : num3;
        this.f218092a = str;
        this.f218093b = uri;
        this.f218094c = interfaceC6540b;
        this.f218095d = list;
        this.f218096e = num;
        this.f218097f = num2;
        this.f218098g = num3;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    public final List<InterfaceC33208b.a> a() {
        return this.f218095d;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Uri getF218093b() {
        return this.f218093b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l12 = (L) obj;
        return kotlin.jvm.internal.L.f(this.f218092a, l12.f218092a) && kotlin.jvm.internal.L.f(this.f218093b, l12.f218093b) && kotlin.jvm.internal.L.f(this.f218094c, l12.f218094c) && kotlin.jvm.internal.L.f(this.f218095d, l12.f218095d) && kotlin.jvm.internal.L.f(this.f218096e, l12.f218096e) && kotlin.jvm.internal.L.f(this.f218097f, l12.f218097f) && kotlin.jvm.internal.L.f(this.f218098g, l12.f218098g);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF218092a() {
        return this.f218092a;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final InterfaceC33208b.InterfaceC6540b getF218094c() {
        return this.f218094c;
    }

    public final int hashCode() {
        int iHashCode = this.f218092a.hashCode() * 31;
        Uri uri = this.f218093b;
        int iE2 = androidx.compose.foundation.H.e((this.f218094c.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31, 31, this.f218095d);
        Integer num = this.f218096e;
        int iHashCode2 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f218097f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f218098g;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaceholderImageData(id=");
        sb2.append(this.f218092a);
        sb2.append(", localUri=");
        sb2.append(this.f218093b);
        sb2.append(", state=");
        sb2.append(this.f218094c);
        sb2.append(", labels=");
        sb2.append(this.f218095d);
        sb2.append(", placeholderText=");
        sb2.append(this.f218096e);
        sb2.append(", placeholderIcon=");
        sb2.append(this.f218097f);
        sb2.append(", backgroundColor=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f218098g, ')');
    }
}
