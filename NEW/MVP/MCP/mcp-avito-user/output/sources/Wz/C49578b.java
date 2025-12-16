package wZ;

import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzButtonAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/b;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49578b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f441546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f441547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f441548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f441549d;

    public C49578b(@Y61.k String str, @Y61.l DeepLink deepLink, @Y61.l String str2, @Y61.l Boolean bool) {
        this.f441546a = str;
        this.f441547b = deepLink;
        this.f441548c = str2;
        this.f441549d = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49578b)) {
            return false;
        }
        C49578b c49578b = (C49578b) obj;
        return L.f(this.f441546a, c49578b.f441546a) && L.f(this.f441547b, c49578b.f441547b) && L.f(this.f441548c, c49578b.f441548c) && L.f(this.f441549d, c49578b.f441549d);
    }

    public final int hashCode() {
        int iHashCode = this.f441546a.hashCode() * 31;
        DeepLink deepLink = this.f441547b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f441548c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f441549d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzButtonAction(title=");
        sb2.append(this.f441546a);
        sb2.append(", deeplink=");
        sb2.append(this.f441547b);
        sb2.append(", style=");
        sb2.append(this.f441548c);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f441549d, ')');
    }

    public /* synthetic */ C49578b(String str, DeepLink deepLink, String str2, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool);
    }
}
