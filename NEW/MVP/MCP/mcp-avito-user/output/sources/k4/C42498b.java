package k4;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsCombinationState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C42498b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42501e f406058a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC40048c f406059b;

    public C42498b(@k C42501e c42501e, @k AbstractC40048c abstractC40048c) {
        this.f406058a = c42501e;
        this.f406059b = abstractC40048c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42498b)) {
            return false;
        }
        C42498b c42498b = (C42498b) obj;
        return L.f(this.f406058a, c42498b.f406058a) && L.f(this.f406059b, c42498b.f406059b);
    }

    public final int hashCode() {
        return this.f406059b.hashCode() + (this.f406058a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsCombinationState(advertDetailsState=" + this.f406058a + ", beduinState=" + this.f406059b + ')';
    }
}
