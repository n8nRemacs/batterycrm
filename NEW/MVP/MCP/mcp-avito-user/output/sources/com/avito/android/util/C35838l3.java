package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: NavbarBusiness360Visible.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/l3;", "", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.l3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C35838l3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f318922a;

    public C35838l3(boolean z12) {
        this.f318922a = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35838l3) && this.f318922a == ((C35838l3) obj).f318922a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318922a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("NavbarBusiness360Visible(visible="), this.f318922a, ')');
    }
}
