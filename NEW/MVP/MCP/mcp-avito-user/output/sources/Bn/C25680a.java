package bn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingAnalyticsTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbn/a;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C25680a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f57421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Srcp f57422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FromPage f57423c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E f57424d;

    @Inject
    public C25680a(@k InterfaceC28373a interfaceC28373a, @k Srcp srcp, @k FromPage fromPage, @k E e12) {
        this.f57421a = interfaceC28373a;
        this.f57422b = srcp;
        this.f57423c = fromPage;
        this.f57424d = e12;
    }
}
