package cw0;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/e;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39428e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f393086a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f393087b;

    public C39428e(@k AttributedText attributedText, @l Long l12) {
        this.f393086a = attributedText;
        this.f393087b = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39428e)) {
            return false;
        }
        C39428e c39428e = (C39428e) obj;
        return L.f(this.f393086a, c39428e.f393086a) && L.f(this.f393087b, c39428e.f393087b);
    }

    public final int hashCode() {
        int iHashCode = this.f393086a.hashCode() * 31;
        Long l12 = this.f393087b;
        return iHashCode + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(title=");
        sb2.append(this.f393086a);
        sb2.append(", toPageId=");
        return m.m(sb2, this.f393087b, ')');
    }
}
