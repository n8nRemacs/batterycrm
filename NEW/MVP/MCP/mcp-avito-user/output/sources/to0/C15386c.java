package To0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.create.model.Offer;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/c;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: To0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15386c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Long f15897a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Offer f15898b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15899c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15900d;

    public C15386c(@l Long l12, @k Offer offer, @k String str, @k String str2) {
        this.f15897a = l12;
        this.f15898b = offer;
        this.f15899c = str;
        this.f15900d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15386c)) {
            return false;
        }
        C15386c c15386c = (C15386c) obj;
        return L.f(this.f15897a, c15386c.f15897a) && L.f(this.f15898b, c15386c.f15898b) && L.f(this.f15899c, c15386c.f15899c) && L.f(this.f15900d, c15386c.f15900d);
    }

    public final int hashCode() {
        Long l12 = this.f15897a;
        return this.f15900d.hashCode() + H.d((this.f15898b.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31)) * 31, 31, this.f15899c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastChip(discountValue=");
        sb2.append(this.f15897a);
        sb2.append(", offer=");
        sb2.append(this.f15898b);
        sb2.append(", slug=");
        sb2.append(this.f15899c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f15900d, ')');
    }
}
