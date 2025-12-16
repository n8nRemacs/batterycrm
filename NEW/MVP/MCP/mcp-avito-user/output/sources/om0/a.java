package OM0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.common.VerificationAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FetchInvoiceState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/a;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UU.a f12204a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f12205b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final VerificationAction.Style f12206c;

    public a(@k UU.a aVar, @k DeepLink deepLink, @k VerificationAction.Style style) {
        this.f12204a = aVar;
        this.f12205b = deepLink;
        this.f12206c = style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12204a, aVar.f12204a) && L.f(this.f12205b, aVar.f12205b) && this.f12206c == aVar.f12206c;
    }

    public final int hashCode() {
        return this.f12206c.hashCode() + com.avito.android.actions_sheet.a.e(this.f12205b, this.f12204a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "ActionButtonState(baseState=" + this.f12204a + ", deeplink=" + this.f12205b + ", style=" + this.f12206c + ')';
    }
}
