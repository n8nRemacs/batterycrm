package wZ;

import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzButtonAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/d;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wZ.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49580d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f441550a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f441551b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f441552c;

    public C49580d(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l Boolean bool) {
        this.f441550a = str;
        this.f441551b = deepLink;
        this.f441552c = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49580d)) {
            return false;
        }
        C49580d c49580d = (C49580d) obj;
        return L.f(this.f441550a, c49580d.f441550a) && L.f(this.f441551b, c49580d.f441551b) && L.f(this.f441552c, c49580d.f441552c);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f441551b, this.f441550a.hashCode() * 31, 31);
        Boolean bool = this.f441552c;
        return iE2 + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzButtonActionV2(title=");
        sb2.append(this.f441550a);
        sb2.append(", deeplink=");
        sb2.append(this.f441551b);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f441552c, ')');
    }

    public /* synthetic */ C49580d(String str, DeepLink deepLink, Boolean bool, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? null : bool);
    }
}
