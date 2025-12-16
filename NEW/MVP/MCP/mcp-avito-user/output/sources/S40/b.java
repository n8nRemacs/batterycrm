package S40;

import Y61.k;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.navigation.OrderFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS40/b;", "LS40/a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f14800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R40.a f14801b;

    @Inject
    public b(@k L l12, @k R40.a aVar) {
        this.f14800a = l12;
        this.f14801b = aVar;
    }

    @Override // S40.a
    @k
    public final Intent a(@k String str, @k NavigationTabSetItem navigationTabSetItem, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        if (!z12) {
            return this.f14801b.a(str, false, orderScreenSegment);
        }
        return this.f14800a.d(new OrderFragmentData(str, navigationTabSetItem, orderScreenSegment));
    }
}
