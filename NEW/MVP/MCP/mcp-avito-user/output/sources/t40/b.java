package T40;

import Y61.k;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.navigation.v2.RedesignedOrderFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RedesignedOrderIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT40/b;", "LT40/a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f15347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R40.a f15348b;

    @Inject
    public b(@k L l12, @k R40.a aVar) {
        this.f15347a = l12;
        this.f15348b = aVar;
    }

    @Override // T40.a
    @k
    public final Intent a(@k String str, @k NavigationTabSetItem navigationTabSetItem, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        if (!z12) {
            return this.f15348b.a(str, true, orderScreenSegment);
        }
        return this.f15347a.d(new RedesignedOrderFragmentData(str, navigationTabSetItem, orderScreenSegment));
    }
}
