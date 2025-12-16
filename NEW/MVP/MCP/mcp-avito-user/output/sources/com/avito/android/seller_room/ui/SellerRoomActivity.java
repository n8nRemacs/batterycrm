package com.avito.android.seller_room.ui;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.seller_room.ui.SellerRoomFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;

/* compiled from: SellerRoomActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_room/ui/SellerRoomActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellerRoomActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f268216m = C35961v3.a(this);

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.overlay_fragment_container;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            SellerRoomFragment.a aVar = SellerRoomFragment.f268217x0;
            SellerRoomOpenParams sellerRoomOpenParams = (SellerRoomOpenParams) this.f268216m.getValue();
            aVar.getClass();
            SellerRoomFragment sellerRoomFragment = new SellerRoomFragment();
            sellerRoomFragment.f268221q0.setValue(sellerRoomFragment, SellerRoomFragment.f268218y0[0], sellerRoomOpenParams);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, sellerRoomFragment, null);
            hE2.e();
        }
    }
}
