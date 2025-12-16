package wr;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentStatus;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.confirm_documents_bottom_sheet_public.generated.api.shift_documents_status_v_1.ShiftDocumentsStatusV1ItemsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Document.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwr/c;", "", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wr.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49675c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f441821a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f441822b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DocumentStatus f441823c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f441824d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ParametrizedClickStreamEvent f441825e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ShiftDocumentsStatusV1ItemsItem.Type f441826f;

    public C49675c(@k String str, @k String str2, @k DocumentStatus documentStatus, @k DeepLink deepLink, @k ParametrizedClickStreamEvent parametrizedClickStreamEvent, @k ShiftDocumentsStatusV1ItemsItem.Type type) {
        this.f441821a = str;
        this.f441822b = str2;
        this.f441823c = documentStatus;
        this.f441824d = deepLink;
        this.f441825e = parametrizedClickStreamEvent;
        this.f441826f = type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49675c)) {
            return false;
        }
        C49675c c49675c = (C49675c) obj;
        return L.f(this.f441821a, c49675c.f441821a) && L.f(this.f441822b, c49675c.f441822b) && this.f441823c == c49675c.f441823c && L.f(this.f441824d, c49675c.f441824d) && L.f(this.f441825e, c49675c.f441825e) && this.f441826f == c49675c.f441826f;
    }

    public final int hashCode() {
        return this.f441826f.hashCode() + ((this.f441825e.hashCode() + com.avito.android.actions_sheet.a.e(this.f441824d, (this.f441823c.hashCode() + H.d(this.f441821a.hashCode() * 31, 31, this.f441822b)) * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "Document(title=" + this.f441821a + ", description=" + this.f441822b + ", status=" + this.f441823c + ", deeplink=" + this.f441824d + ", event=" + this.f441825e + ", type=" + this.f441826f + ')';
    }
}
