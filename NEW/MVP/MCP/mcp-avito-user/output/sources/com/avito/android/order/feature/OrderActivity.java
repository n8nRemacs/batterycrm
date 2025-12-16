package com.avito.android.order.feature;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.feature.OrderFragment;
import com.avito.android.orderBeduinV2.OrderFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;

/* compiled from: OrderActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/order/feature/OrderActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrderActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f209480m = C35961v3.a(this);

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        Fragment fragmentA;
        super.onCreate(bundle);
        setContentView(R.layout.order_activity);
        if (bundle == null) {
            ?? r42 = this.f209480m;
            if (((OrderScreenParams) r42.getValue()).f209506c) {
                OrderFragment.a aVar = com.avito.android.orderBeduinV2.OrderFragment.f209724F0;
                String str = ((OrderScreenParams) r42.getValue()).f209505b;
                OrderScreenSegment orderScreenSegment = ((OrderScreenParams) r42.getValue()).f209507d;
                aVar.getClass();
                fragmentA = OrderFragment.a.a(str, orderScreenSegment);
            } else {
                OrderFragment.a aVar2 = OrderFragment.f209481G0;
                String str2 = ((OrderScreenParams) r42.getValue()).f209505b;
                OrderScreenSegment orderScreenSegment2 = ((OrderScreenParams) r42.getValue()).f209507d;
                aVar2.getClass();
                fragmentA = OrderFragment.a.a(str2, orderScreenSegment2);
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, fragmentA, null);
            hE2.e();
        }
    }
}
