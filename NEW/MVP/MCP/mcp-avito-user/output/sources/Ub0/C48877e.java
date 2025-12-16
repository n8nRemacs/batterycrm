package uB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoCardContentTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/e;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48877e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f439848a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f439849b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48878f f439850c;

    public C48877e(@k AttributedText attributedText, @l DeepLink deepLink, @l C48878f c48878f) {
        this.f439848a = attributedText;
        this.f439849b = deepLink;
        this.f439850c = c48878f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48877e)) {
            return false;
        }
        C48877e c48877e = (C48877e) obj;
        return L.f(this.f439848a, c48877e.f439848a) && L.f(this.f439849b, c48877e.f439849b) && L.f(this.f439850c, c48877e.f439850c);
    }

    public final int hashCode() {
        int iHashCode = this.f439848a.hashCode() * 31;
        DeepLink deepLink = this.f439849b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        C48878f c48878f = this.f439850c;
        return iHashCode2 + (c48878f != null ? c48878f.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TariffCpxInfoCardContentTextItem(text=" + this.f439848a + ", deepLink=" + this.f439849b + ", icon=" + this.f439850c + ')';
    }
}
