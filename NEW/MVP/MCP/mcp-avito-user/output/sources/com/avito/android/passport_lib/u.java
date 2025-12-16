package com.avito.android.passport_lib;

import com.avito.android.remote.model.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfileIconTypeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport_lib/u;", "", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f213947a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Avatar f213948b;

    public u(boolean z12, @Y61.l Avatar avatar) {
        this.f213947a = z12;
        this.f213948b = avatar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f213947a == uVar.f213947a && L.f(this.f213948b, uVar.f213948b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f213947a) * 31;
        Avatar avatar = this.f213948b;
        return iHashCode + (avatar == null ? 0 : avatar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ProfileIconAvailability(available=" + this.f213947a + ", avatar=" + this.f213948b + ')';
    }

    public /* synthetic */ u(boolean z12, Avatar avatar, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : avatar);
    }
}
