package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RequestReviewError.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f190646a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ApiError f190647b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f190648c;

    public a(String str, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
        apiError = (i12 & 2) != 0 ? null : apiError;
        th2 = (i12 & 4) != 0 ? null : th2;
        this.f190646a = str;
        this.f190647b = apiError;
        this.f190648c = th2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f190646a, aVar.f190646a) && L.f(this.f190647b, aVar.f190647b) && L.f(this.f190648c, aVar.f190648c);
    }

    public final int hashCode() {
        int iHashCode = this.f190646a.hashCode() * 31;
        ApiError apiError = this.f190647b;
        int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
        Throwable th2 = this.f190648c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestReviewError(message=");
        sb2.append(this.f190646a);
        sb2.append(", typedError=");
        sb2.append(this.f190647b);
        sb2.append(", throwable=");
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f190648c, ')');
    }
}
