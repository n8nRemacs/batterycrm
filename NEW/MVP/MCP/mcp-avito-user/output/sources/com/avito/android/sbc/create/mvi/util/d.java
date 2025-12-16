package com.avito.android.sbc.create.mvi.util;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClickableText.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/d;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f259910a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final c f259911b;

    public d(@Y61.k CharSequence charSequence, @Y61.l c cVar) {
        this.f259910a = charSequence;
        this.f259911b = cVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f259910a, dVar.f259910a) && L.f(this.f259911b, dVar.f259911b);
    }

    public final int hashCode() {
        int iHashCode = this.f259910a.hashCode() * 31;
        c cVar = this.f259911b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ClickableText(text=" + ((Object) this.f259910a) + ", clickInfo=" + this.f259911b + ')';
    }
}
