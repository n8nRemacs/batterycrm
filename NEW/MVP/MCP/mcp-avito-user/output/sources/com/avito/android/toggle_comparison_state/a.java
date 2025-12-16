package com.avito.android.toggle_comparison_state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/a;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f301568a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f301569b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f301570c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f301571d;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l String str3) {
        this.f301568a = str;
        this.f301569b = str2;
        this.f301570c = deepLink;
        this.f301571d = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f301568a, aVar.f301568a) && L.f(this.f301569b, aVar.f301569b) && L.f(this.f301570c, aVar.f301570c) && L.f(this.f301571d, aVar.f301571d);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f301570c, H.d(this.f301568a.hashCode() * 31, 31, this.f301569b), 31);
        String str = this.f301571d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Alert(buttonTitle=");
        sb2.append(this.f301568a);
        sb2.append(", title=");
        sb2.append(this.f301569b);
        sb2.append(", link=");
        sb2.append(this.f301570c);
        sb2.append(", url=");
        return C22026a.c(sb2, this.f301571d, ')');
    }
}
