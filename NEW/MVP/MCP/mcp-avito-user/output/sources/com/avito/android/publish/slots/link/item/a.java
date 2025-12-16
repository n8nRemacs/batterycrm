package com.avito.android.publish.slots.link.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: LinkSlotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/link/item/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f244482a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244483b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244484c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f244485d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final N f244486e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l String str, @k String str2, @k String str3, @k String str4, @k Y41.a<G0> aVar) {
        this.f244482a = str;
        this.f244483b = str2;
        this.f244484c = str3;
        this.f244485d = str4;
        this.f244486e = (N) aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f244482a, aVar.f244482a) && L.f(this.f244483b, aVar.f244483b) && L.f(this.f244484c, aVar.f244484c) && L.f(this.f244485d, aVar.f244485d) && this.f244486e.equals(aVar.f244486e);
    }

    public final int hashCode() {
        String str = this.f244482a;
        return this.f244486e.hashCode() + H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f244483b), 31, this.f244484c), 31, this.f244485d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LinkAlertParams(title=");
        sb2.append(this.f244482a);
        sb2.append(", message=");
        sb2.append(this.f244483b);
        sb2.append(", confirmText=");
        sb2.append(this.f244484c);
        sb2.append(", cancelText=");
        sb2.append(this.f244485d);
        sb2.append(", confirmListener=");
        return C22026a.d(sb2, this.f244486e, ')');
    }
}
