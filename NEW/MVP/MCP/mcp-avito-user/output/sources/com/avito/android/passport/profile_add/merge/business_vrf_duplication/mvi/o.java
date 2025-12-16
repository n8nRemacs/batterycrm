package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkWithActionName.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/o;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f212574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f212575b;

    public o(@Y61.k DeepLink deepLink, @Y61.k String str) {
        this.f212574a = deepLink;
        this.f212575b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f212574a, oVar.f212574a) && L.f(this.f212575b, oVar.f212575b);
    }

    public final int hashCode() {
        return this.f212575b.hashCode() + (this.f212574a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeeplinkWithActionName(deeplink=");
        sb2.append(this.f212574a);
        sb2.append(", actionName=");
        return C22026a.c(sb2, this.f212575b, ')');
    }
}
