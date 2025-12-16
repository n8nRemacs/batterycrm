package mB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmB0/c;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f414375a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f414376b;

    public c(@k AttributedText attributedText, @k DeepLink deepLink) {
        this.f414375a = attributedText;
        this.f414376b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f414375a, cVar.f414375a) && L.f(this.f414376b, cVar.f414376b);
    }

    public final int hashCode() {
        return this.f414376b.hashCode() + (this.f414375a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureAdvanceNavBarButton(title=");
        sb2.append(this.f414375a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f414376b, ')');
    }
}
