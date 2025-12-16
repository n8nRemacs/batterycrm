package com.avito.android.payment.items.submit_button_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmitButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/items/submit_button_item/c;", "Lcom/avito/conveyor_item/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f214499b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f214500c;

    public c(@k String str, @k String str2) {
        this.f214499b = str;
        this.f214500c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f214499b.equals(cVar.f214499b) && L.f(this.f214500c, cVar.f214500c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return getF212447d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF212447d() {
        return this.f214499b;
    }

    public final int hashCode() {
        return this.f214500c.hashCode() + r.i(this.f214499b.hashCode() * 31, 31, true);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitButtonItem(stringId=");
        sb2.append(this.f214499b);
        sb2.append(", isEnabled=true, text=");
        return C22026a.c(sb2, this.f214500c, ')');
    }
}
