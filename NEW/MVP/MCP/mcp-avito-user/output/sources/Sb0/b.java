package sB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxConfigureLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f437509a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f437510b;

    public b(@k AttributedText attributedText, @k DeepLink deepLink) {
        this.f437509a = attributedText;
        this.f437510b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f437509a, bVar.f437509a) && L.f(this.f437510b, bVar.f437510b);
    }

    public final int hashCode() {
        return this.f437510b.hashCode() + (this.f437509a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppBarButton(title=");
        sb2.append(this.f437509a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f437510b, ')');
    }
}
