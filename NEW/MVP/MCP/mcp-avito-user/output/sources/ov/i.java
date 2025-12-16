package Ov;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorUiData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/i;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f12692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f12693b;

    public i(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f12692a = str;
        this.f12693b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f12692a, iVar.f12692a) && L.f(this.f12693b, iVar.f12693b);
    }

    public final int hashCode() {
        return this.f12693b.hashCode() + (this.f12692a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingButton(text=");
        sb2.append(this.f12692a);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f12693b, ')');
    }
}
