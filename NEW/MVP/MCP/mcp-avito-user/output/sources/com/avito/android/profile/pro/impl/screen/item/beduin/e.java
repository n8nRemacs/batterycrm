package com.avito.android.profile.pro.impl.screen.item.beduin;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabBeduinMarkerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/beduin/e;", "Lcom/avito/conveyor_item/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223078b;

    public e(@k String str) {
        this.f223078b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f223078b, ((e) obj).f223078b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF223078b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223078b() {
        return this.f223078b;
    }

    public final int hashCode() {
        return this.f223078b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ProfileTabBeduinMarkerItem(beduinItemId="), this.f223078b, ')');
    }
}
