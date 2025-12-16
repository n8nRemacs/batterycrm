package com.avito.android.str_booking.domain;

import androidx.appcompat.app.r;
import com.avito.android.str_booking.network.models.sections.OnboardingTooltip;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/c;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f285573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final OnboardingTooltip f285575c;

    public c(int i12, int i13, @Y61.k OnboardingTooltip onboardingTooltip) {
        this.f285573a = i12;
        this.f285574b = i13;
        this.f285575c = onboardingTooltip;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f285573a == cVar.f285573a && this.f285574b == cVar.f285574b && L.f(this.f285575c, cVar.f285575c);
    }

    public final int hashCode() {
        return this.f285575c.hashCode() + r.e(this.f285574b, Integer.hashCode(this.f285573a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "OnboardingInfo(targetPosition=" + this.f285573a + ", targetChildPosition=" + this.f285574b + ", onboardingTooltip=" + this.f285575c + ')';
    }
}
