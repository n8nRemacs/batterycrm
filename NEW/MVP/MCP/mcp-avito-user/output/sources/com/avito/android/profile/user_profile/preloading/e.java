package com.avito.android.profile.user_profile.preloading;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: UserProfileDataPreloadable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/preloading/e;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f226578a;

    public e(boolean z12) {
        this.f226578a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f226578a == ((e) obj).f226578a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226578a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("UserProfilePreloadParams(isRefresh="), this.f226578a, ')');
    }
}
