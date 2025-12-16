package com.avito.android.publish.items.iac_for_pro_enabled;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacForProEnabledItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f236947a;

    public c(@l Boolean bool) {
        this.f236947a = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f236947a, ((c) obj).f236947a);
    }

    public final int hashCode() {
        Boolean bool = this.f236947a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public final String toString() {
        return C0.g(new StringBuilder("IacForProEnabledItemPayload(deviceChecked="), this.f236947a, ')');
    }
}
