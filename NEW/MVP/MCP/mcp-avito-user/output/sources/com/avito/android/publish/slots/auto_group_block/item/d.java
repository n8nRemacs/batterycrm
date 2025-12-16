package com.avito.android.publish.slots.auto_group_block.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoGroupBlockPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/item/d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f243105a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f243106b;

    public d(@l String str, @l String str2) {
        this.f243105a = str;
        this.f243106b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f243105a, dVar.f243105a) && L.f(this.f243106b, dVar.f243106b);
    }

    public final int hashCode() {
        String str = this.f243105a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f243106b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoGroupBlockPayload(description=");
        sb2.append(this.f243105a);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f243106b, ')');
    }
}
