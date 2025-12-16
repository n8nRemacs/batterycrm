package com.avito.android.extended_profile.data;

import Y61.l;
import com.avito.android.extended_profile_widgets.adapter.header.HeaderItem;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/h;", "Lcom/avito/android/extended_profile/data/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h extends g {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f149488c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HeaderItem f149489d;

    public h(@Y61.k String str, @Y61.k HeaderItem headerItem) {
        super(str, Collections.singletonList(headerItem), null);
        this.f149488c = str;
        this.f149489d = headerItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f149488c, hVar.f149488c) && L.f(this.f149489d, hVar.f149489d);
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF149488c() {
        return this.f149488c;
    }

    public final int hashCode() {
        return this.f149489d.hashCode() + (this.f149488c.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "HeaderExtendedProfileWidgetGroup(widgetName=" + this.f149488c + ", item=" + this.f149489d + ')';
    }
}
