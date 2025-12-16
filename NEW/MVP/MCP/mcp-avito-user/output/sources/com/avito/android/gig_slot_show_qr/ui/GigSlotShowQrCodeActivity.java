package com.avito.android.gig_slot_show_qr.ui;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.gig_slot_show_qr.ui.GigSlotShowQrFragment;
import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GigSlotShowQrCodeActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/GigSlotShowQrCodeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotShowQrCodeActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f160919n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f160920m = C35961v3.a(this);

    /* compiled from: GigSlotShowQrCodeActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/GigSlotShowQrCodeActivity$a;", "", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            GigSlotShowQrFragment.a aVar = GigSlotShowQrFragment.f160921q0;
            GigSlotShowQrOpenParams gigSlotShowQrOpenParams = (GigSlotShowQrOpenParams) this.f160920m.getValue();
            aVar.getClass();
            GigSlotShowQrFragment gigSlotShowQrFragment = new GigSlotShowQrFragment();
            gigSlotShowQrFragment.f160925p0.setValue(gigSlotShowQrFragment, GigSlotShowQrFragment.f160922r0[0], gigSlotShowQrOpenParams);
            hE2.n(R.id.fragment_container, gigSlotShowQrFragment, null);
            hE2.e();
        }
    }
}
