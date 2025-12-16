package com.avito.android.user_adverts_common.safety;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: AfterPublishWarningSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_common/safety/a;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f315915a;

    public a(long j12) {
        this.f315915a = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f315915a == ((a) obj).f315915a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f315915a);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("AfterPublishWarningSession(lastShowTimestamp="), this.f315915a, ')');
    }
}
