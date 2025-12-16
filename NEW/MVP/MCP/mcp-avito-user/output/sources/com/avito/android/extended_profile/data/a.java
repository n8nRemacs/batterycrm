package com.avito.android.extended_profile.data;

import Y61.l;
import com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/a;", "Lcom/avito/android/extended_profile/data/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a extends g {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f149464c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BaseInfoMlItem f149465d;

    public a(@Y61.k String str, @Y61.k BaseInfoMlItem baseInfoMlItem) {
        super(str, Collections.singletonList(baseInfoMlItem), null);
        this.f149464c = str;
        this.f149465d = baseInfoMlItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f149464c, aVar.f149464c) && L.f(this.f149465d, aVar.f149465d);
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF149464c() {
        return this.f149464c;
    }

    public final int hashCode() {
        return this.f149465d.hashCode() + (this.f149464c.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "BaseInfoMlWidgetGroup(widgetName=" + this.f149464c + ", item=" + this.f149465d + ')';
    }
}
