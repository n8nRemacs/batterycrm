package com.avito.android.delivery_tarifikator.presentation;

import Qv.InterfaceC14937a;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.presentation.main_screen.TarifikatorMainFragment;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import com.avito.android.delivery_tarifikator.presentation.region_screen.TarifikatorRegionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryTarifikatorActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/DeliveryTarifikatorActivity;", "Lcom/avito/android/ui/activity/a;", "LQv/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryTarifikatorActivity extends com.avito.android.ui.activity.a implements InterfaceC14937a, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f135354m = new a(null);

    /* compiled from: DeliveryTarifikatorActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/DeliveryTarifikatorActivity$a;", "", "<init>", "()V", "", "TARIFIKATOR_PARAMS_KEY", "Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // Qv.InterfaceC14937a
    public final void T() {
        getSupportFragmentManager().a0(0, "DeliveryTarifikatorMain");
    }

    @Override // Qv.InterfaceC14937a
    public final void e1(@k String str) {
        Intent intent = getIntent();
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("TARIFIKATOR_PARAMS", DeliveryTarifikatorParams.class) : intent.getParcelableExtra("TARIFIKATOR_PARAMS"));
        if (deliveryTarifikatorParams == null) {
            finish();
            return;
        }
        RegionScreenParams regionScreenParams = new RegionScreenParams(str, deliveryTarifikatorParams);
        TarifikatorRegionFragment.f135744D0.getClass();
        TarifikatorRegionFragment tarifikatorRegionFragmentA = TarifikatorRegionFragment.a.a(regionScreenParams);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, tarifikatorRegionFragmentA, "DeliveryTarifikatorRegion");
        hE2.c("DeliveryTarifikatorRegion");
        hE2.e();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Intent intent = getIntent();
            DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("TARIFIKATOR_PARAMS", DeliveryTarifikatorParams.class) : intent.getParcelableExtra("TARIFIKATOR_PARAMS"));
            if (deliveryTarifikatorParams == null) {
                finish();
                return;
            }
            TarifikatorMainFragment.f135523E0.getClass();
            TarifikatorMainFragment tarifikatorMainFragmentA = TarifikatorMainFragment.a.a(deliveryTarifikatorParams);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, tarifikatorMainFragmentA, "DeliveryTarifikatorMain", 1);
            hE2.c("DeliveryTarifikatorMain");
            hE2.e();
        }
    }
}
