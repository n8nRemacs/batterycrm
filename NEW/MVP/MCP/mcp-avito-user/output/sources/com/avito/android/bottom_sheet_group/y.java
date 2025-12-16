package com.avito.android.bottom_sheet_group;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OutsideCheckbox.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/y;", "", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f107423a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f107424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f107425c;

    public y(boolean z12, @Y61.k String str, @Y61.k String str2) {
        this.f107423a = z12;
        this.f107424b = str;
        this.f107425c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f107423a == yVar.f107423a && L.f(this.f107424b, yVar.f107424b) && L.f(this.f107425c, yVar.f107425c);
    }

    public final int hashCode() {
        return this.f107425c.hashCode() + H.d(Boolean.hashCode(this.f107423a) * 31, 31, this.f107424b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutsideCheckboxWithState(selected=");
        sb2.append(this.f107423a);
        sb2.append(", paramId=");
        sb2.append(this.f107424b);
        sb2.append(", valueId=");
        return C22026a.c(sb2, this.f107425c, ')');
    }
}
