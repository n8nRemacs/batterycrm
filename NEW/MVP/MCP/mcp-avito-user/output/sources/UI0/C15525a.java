package Ui0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi0/a;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ui0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C15525a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f16556a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f16557b;

    /* JADX WARN: Multi-variable type inference failed */
    public C15525a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15525a)) {
            return false;
        }
        C15525a c15525a = (C15525a) obj;
        return L.f(this.f16556a, c15525a.f16556a) && L.f(this.f16557b, c15525a.f16557b);
    }

    public final int hashCode() {
        return this.f16557b.hashCode() + (this.f16556a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Button(text=");
        sb2.append(this.f16556a);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f16557b, ')');
    }

    public C15525a(@k String str, @k DeepLink deepLink) {
        this.f16556a = str;
        this.f16557b = deepLink;
    }

    public /* synthetic */ C15525a(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? new EmptyDeepLink() : deepLink);
    }
}
