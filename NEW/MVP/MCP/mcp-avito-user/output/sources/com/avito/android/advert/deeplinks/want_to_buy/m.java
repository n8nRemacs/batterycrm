package com.avito.android.advert.deeplinks.want_to_buy;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AdvertWantToBuyResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/deeplinks/want_to_buy/m;", "", "", "success", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("success")
    private final boolean success;

    public m(boolean z12) {
        this.success = z12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.success == ((m) obj).success;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.success);
    }

    @Y61.k
    public final String toString() {
        return r.x(new StringBuilder("AdvertWantToBuyResponse(success="), this.success, ')');
    }
}
