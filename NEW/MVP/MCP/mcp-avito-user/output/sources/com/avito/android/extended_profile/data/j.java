package com.avito.android.extended_profile.data;

import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/j;", "Lcom/avito/android/extended_profile/data/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class j extends g {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f149496c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<QH.a> f149497d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final i f149498e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k String str, @Y61.k List<? extends QH.a> list, @Y61.k i iVar) {
        super(str, list, null);
        this.f149496c = str;
        this.f149497d = list;
        this.f149498e = iVar;
    }

    public static j a(j jVar, List list, i iVar, int i12) {
        String str = jVar.f149496c;
        if ((i12 & 2) != 0) {
            list = jVar.f149497d;
        }
        if ((i12 & 4) != 0) {
            iVar = jVar.f149498e;
        }
        jVar.getClass();
        return new j(str, list, iVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f149496c, jVar.f149496c) && L.f(this.f149497d, jVar.f149497d) && L.f(this.f149498e, jVar.f149498e);
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF149496c() {
        return this.f149496c;
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f149497d;
    }

    public final int hashCode() {
        return this.f149498e.hashCode() + H.e(this.f149496c.hashCode() * 31, 31, this.f149497d);
    }

    @Y61.k
    public final String toString() {
        return "SearchExtendedProfileWidgetGroup(widgetName=" + this.f149496c + ", items=" + this.f149497d + ", searchMarker=" + this.f149498e + ')';
    }
}
