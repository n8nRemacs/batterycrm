package Ju;

import Ju.InterfaceC14247a;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkNotFoundResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJu/b;", "LJu/a$a;", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ju.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14248b implements InterfaceC14247a.InterfaceC0545a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f9168b;

    public C14248b(@k DeepLink deepLink) {
        this.f9168b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14248b) && L.f(this.f9168b, ((C14248b) obj).f9168b);
    }

    public final int hashCode() {
        return this.f9168b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkNotFoundResult(deeplink="), this.f9168b, ')');
    }
}
