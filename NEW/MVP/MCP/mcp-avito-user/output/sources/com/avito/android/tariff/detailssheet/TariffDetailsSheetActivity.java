package com.avito.android.tariff.detailssheet;

import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TariffDetailsSheetActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/detailssheet/TariffDetailsSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffDetailsSheetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: TariffDetailsSheetActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/detailssheet/TariffDetailsSheetActivity$a;", "", "<init>", "()V", "", "KEY_DEEPLINK", "Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra(Constants.DEEPLINK, DeepLink.class) : intent.getParcelableExtra(Constants.DEEPLINK));
            if (deepLink == null) {
                throw new IllegalStateException("deeplink must be set");
            }
            TariffDetailsSheetDialogFragment.f297395n0.getClass();
            TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment = new TariffDetailsSheetDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(Constants.DEEPLINK, deepLink);
            tariffDetailsSheetDialogFragment.setArguments(bundle2);
            tariffDetailsSheetDialogFragment.show(getSupportFragmentManager(), (String) null);
        }
    }
}
