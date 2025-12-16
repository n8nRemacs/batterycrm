package com.avito.android.mortgage.person_form.list.items.nav_button.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: NavButtonPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/nav_button/payloads/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f200741a;

    public a(boolean z12) {
        this.f200741a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f200741a == ((a) obj).f200741a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200741a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("NavButtonPayload(isLoading="), this.f200741a, ')');
    }
}
