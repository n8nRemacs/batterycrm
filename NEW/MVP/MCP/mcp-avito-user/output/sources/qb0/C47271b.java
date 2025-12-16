package qB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqB0/b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47271b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f429084a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f429085b;

    public C47271b(@k AttributedText attributedText, @k DeepLink deepLink) {
        this.f429084a = attributedText;
        this.f429085b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47271b)) {
            return false;
        }
        C47271b c47271b = (C47271b) obj;
        return L.f(this.f429084a, c47271b.f429084a) && L.f(this.f429085b, c47271b.f429085b);
    }

    public final int hashCode() {
        return this.f429085b.hashCode() + (this.f429084a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppBarButton(title=");
        sb2.append(this.f429084a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f429085b, ')');
    }
}
