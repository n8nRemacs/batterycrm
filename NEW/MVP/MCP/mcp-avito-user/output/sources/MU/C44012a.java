package mU;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartMenuIconAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU/a;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mU.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C44012a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414513a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f414514b;

    @Inject
    public C44012a(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f414513a = interfaceC28373a;
        this.f414514b = e12;
    }

    public static void a(C44012a c44012a, String str, String str2, String str3, int i12) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        if ((i12 & 4) != 0) {
            str3 = null;
        }
        String strA = c44012a.f414514b.a();
        if (str3 == null) {
            str3 = "";
        }
        c44012a.f414513a.c(new C44014c(strA, str, str2, str3));
    }
}
