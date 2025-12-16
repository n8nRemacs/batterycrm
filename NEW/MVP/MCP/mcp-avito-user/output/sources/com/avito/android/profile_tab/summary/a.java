package com.avito.android.profile_tab.summary;

import Y61.k;
import Y61.l;
import com.avito.android.profile_tab.summary.e;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryFeatureParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/a;", "", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e.b f230846a;

    public a(@k e.b bVar) {
        this.f230846a = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f230846a, aVar.f230846a);
    }

    public final int hashCode() {
        this.f230846a.getClass();
        return -1714971181;
    }

    @k
    public final String toString() {
        return "ProfileSummaryFeatureParams(featureName=ProfileTab, itemViewType=ProfileTabBeduinItemView, params=" + this.f230846a + ')';
    }
}
