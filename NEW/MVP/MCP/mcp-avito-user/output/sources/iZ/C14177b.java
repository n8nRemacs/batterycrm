package Iz;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.esia_redirect_screen.models.EsiaRedirectButtonType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIz/b;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14177b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f8670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f8671b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EsiaRedirectButtonType f8672c;

    public C14177b(@k String str, @k DeepLink deepLink, @k EsiaRedirectButtonType esiaRedirectButtonType) {
        this.f8670a = str;
        this.f8671b = deepLink;
        this.f8672c = esiaRedirectButtonType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14177b)) {
            return false;
        }
        C14177b c14177b = (C14177b) obj;
        return L.f(this.f8670a, c14177b.f8670a) && L.f(this.f8671b, c14177b.f8671b) && this.f8672c == c14177b.f8672c;
    }

    public final int hashCode() {
        return this.f8672c.hashCode() + com.avito.android.actions_sheet.a.e(this.f8671b, this.f8670a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "EsiaRedirectButton(title=" + this.f8670a + ", deeplink=" + this.f8671b + ", type=" + this.f8672c + ')';
    }
}
