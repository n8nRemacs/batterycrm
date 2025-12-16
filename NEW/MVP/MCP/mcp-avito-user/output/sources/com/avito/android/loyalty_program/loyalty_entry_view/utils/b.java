package com.avito.android.loyalty_program.loyalty_entry_view.utils;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.serp.Onboarding;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoyaltyParanjaOnboarding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/utils/b;", "", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f184193a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Onboarding f184194b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f184195c;

    public b(@k View view, @k Onboarding onboarding, @k DeepLink deepLink) {
        this.f184193a = view;
        this.f184194b = onboarding;
        this.f184195c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f184193a, bVar.f184193a) && L.f(this.f184194b, bVar.f184194b) && L.f(this.f184195c, bVar.f184195c);
    }

    public final int hashCode() {
        return this.f184195c.hashCode() + ((this.f184194b.hashCode() + (this.f184193a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoyaltyParanjaOnboardingParams(targetView=");
        sb2.append(this.f184193a);
        sb2.append(", onboarding=");
        sb2.append(this.f184194b);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f184195c, ')');
    }
}
