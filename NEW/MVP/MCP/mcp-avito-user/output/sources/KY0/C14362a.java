package Ky0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LastMinuteOfferState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKy0/a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ky0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14362a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9721a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9722b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9723c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f9724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9725e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f9726f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f9727g;

    public C14362a(boolean z12, @k String str, @k String str2, @k String str3, int i12, @k String str4, @k ArrayList arrayList) {
        this.f9721a = z12;
        this.f9722b = str;
        this.f9723c = str2;
        this.f9724d = str3;
        this.f9725e = i12;
        this.f9726f = str4;
        this.f9727g = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14362a)) {
            return false;
        }
        C14362a c14362a = (C14362a) obj;
        return this.f9721a == c14362a.f9721a && L.f(this.f9722b, c14362a.f9722b) && L.f(this.f9723c, c14362a.f9723c) && L.f(this.f9724d, c14362a.f9724d) && this.f9725e == c14362a.f9725e && L.f(this.f9726f, c14362a.f9726f) && this.f9727g.equals(c14362a.f9727g);
    }

    public final int hashCode() {
        return this.f9727g.hashCode() + H.d(r.e(this.f9725e, H.d(H.d(H.d(Boolean.hashCode(this.f9721a) * 31, 31, this.f9722b), 31, this.f9723c), 31, this.f9724d), 31), 31, this.f9726f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Discount(isEnabled=");
        sb2.append(this.f9721a);
        sb2.append(", enabledText=");
        sb2.append(this.f9722b);
        sb2.append(", title=");
        sb2.append(this.f9723c);
        sb2.append(", limitsTitle=");
        sb2.append(this.f9724d);
        sb2.append(", value=");
        sb2.append(this.f9725e);
        sb2.append(", valueString=");
        sb2.append(this.f9726f);
        sb2.append(", options=");
        return e.p(sb2, this.f9727g, ')');
    }
}
