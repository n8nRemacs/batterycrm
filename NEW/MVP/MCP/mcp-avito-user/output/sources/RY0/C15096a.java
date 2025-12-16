package Ry0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/a;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ry0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15096a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f14759a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f14760b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f14761c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f14762d;

    public C15096a(@l Integer num, @l Integer num2, @l Integer num3, @k String str) {
        this.f14759a = num;
        this.f14760b = num2;
        this.f14761c = num3;
        this.f14762d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15096a)) {
            return false;
        }
        C15096a c15096a = (C15096a) obj;
        return L.f(this.f14759a, c15096a.f14759a) && L.f(this.f14760b, c15096a.f14760b) && L.f(this.f14761c, c15096a.f14761c) && L.f(this.f14762d, c15096a.f14762d);
    }

    public final int hashCode() {
        Integer num = this.f14759a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f14760b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f14761c;
        return this.f14762d.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountInputInfo(value=");
        sb2.append(this.f14759a);
        sb2.append(", minValue=");
        sb2.append(this.f14760b);
        sb2.append(", maxValue=");
        sb2.append(this.f14761c);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f14762d, ')');
    }
}
