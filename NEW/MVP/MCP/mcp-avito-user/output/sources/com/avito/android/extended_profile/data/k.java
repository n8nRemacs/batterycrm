package com.avito.android.extended_profile.data;

import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/k;", "Lcom/avito/android/extended_profile/data/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class k extends g {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f149499c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<QH.a> f149500d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k String str, @Y61.k List<? extends QH.a> list) {
        super(str, list, null);
        this.f149499c = str;
        this.f149500d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f149499c, kVar.f149499c) && L.f(this.f149500d, kVar.f149500d);
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF149499c() {
        return this.f149499c;
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f149500d;
    }

    public final int hashCode() {
        return this.f149500d.hashCode() + (this.f149499c.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleExtendedProfileWidgetGroup(widgetName=");
        sb2.append(this.f149499c);
        sb2.append(", items=");
        return H.p(sb2, this.f149500d, ')');
    }
}
