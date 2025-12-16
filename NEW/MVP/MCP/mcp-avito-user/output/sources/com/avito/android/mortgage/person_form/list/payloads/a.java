package com.avito.android.mortgage.person_form.list.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PersonFormEnablingPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/payloads/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f200850a;

    public a(boolean z12) {
        this.f200850a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f200850a == ((a) obj).f200850a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200850a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("PersonFormEnablingPayload(isEnable="), this.f200850a, ')');
    }
}
