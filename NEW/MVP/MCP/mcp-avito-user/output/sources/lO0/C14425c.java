package Lo0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSubscriptionResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLo0/c;", "", "_avito_saved-searches-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14425c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f10126a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f10127b;

    public C14425c(@l String str, @l DeepLink deepLink) {
        this.f10126a = str;
        this.f10127b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14425c)) {
            return false;
        }
        C14425c c14425c = (C14425c) obj;
        return L.f(this.f10126a, c14425c.f10126a) && L.f(this.f10127b, c14425c.f10127b);
    }

    public final int hashCode() {
        String str = this.f10126a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.f10127b;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchSubscriptionResult(id=");
        sb2.append(this.f10126a);
        sb2.append(", searchSubscriptionAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f10127b, ')');
    }
}
