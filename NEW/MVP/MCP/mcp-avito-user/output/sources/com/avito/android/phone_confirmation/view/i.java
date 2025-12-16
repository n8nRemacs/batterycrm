package com.avito.android.phone_confirmation.view;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisibilityText.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/view/i;", "", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f216002a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f216003b;

    public i(boolean z12, @l String str) {
        this.f216002a = z12;
        this.f216003b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f216002a == iVar.f216002a && L.f(this.f216003b, iVar.f216003b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f216002a) * 31;
        String str = this.f216003b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisibilityText(visible=");
        sb2.append(this.f216002a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f216003b, ')');
    }
}
