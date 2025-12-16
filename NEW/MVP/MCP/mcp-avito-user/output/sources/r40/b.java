package R40;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.order.OrderScreenSegment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderActivityIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR40/b;", "LR40/a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f14103a;

    @Inject
    public b(@k Context context) {
        this.f14103a = context;
    }

    @Override // R40.a
    @k
    public final Intent a(@k String str, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        return com.avito.android.order.feature.b.a(this.f14103a, str, z12, orderScreenSegment);
    }
}
