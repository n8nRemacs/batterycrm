package Ax0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.status_doc.mvi.entities.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigStatusDocState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx0/a;", "", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ax0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13097a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ButtonStyle f714a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f716c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ParametrizedClickStreamEvent f717d;

    public C13097a(@k ButtonStyle buttonStyle, @k String str, @k DeepLink deepLink, @l ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        this.f714a = buttonStyle;
        this.f715b = str;
        this.f716c = deepLink;
        this.f717d = parametrizedClickStreamEvent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13097a)) {
            return false;
        }
        C13097a c13097a = (C13097a) obj;
        return this.f714a == c13097a.f714a && L.f(this.f715b, c13097a.f715b) && L.f(this.f716c, c13097a.f716c) && L.f(this.f717d, c13097a.f717d);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f716c, H.d(this.f714a.hashCode() * 31, 31, this.f715b), 31);
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f717d;
        return iE2 + (parametrizedClickStreamEvent == null ? 0 : parametrizedClickStreamEvent.hashCode());
    }

    @k
    public final String toString() {
        return "ActionButton(style=" + this.f714a + ", title=" + this.f715b + ", deeplink=" + this.f716c + ", event=" + this.f717d + ')';
    }
}
