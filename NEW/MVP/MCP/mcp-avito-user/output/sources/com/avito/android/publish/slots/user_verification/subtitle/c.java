package com.avito.android.publish.slots.user_verification.subtitle;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationSubtitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/subtitle/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245135b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f245136c;

    public c(@k String str, @k String str2) {
        this.f245135b = str;
        this.f245136c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f245135b, cVar.f245135b) && L.f(this.f245136c, cVar.f245136c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF173901b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173901b() {
        return this.f245135b;
    }

    public final int hashCode() {
        return this.f245136c.hashCode() + (this.f245135b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserVerificationSubtitleItem(stringId=");
        sb2.append(this.f245135b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f245136c, ')');
    }
}
