package com.avito.android.tariff_cpt.configure;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.tariff_cpt.configure.forbidden.CptForbiddenFragment;
import com.avito.android.tariff_cpt.configure.landing.TariffCptConfigureLandingFragment;
import com.avito.android.tariff_cpt.configure.levels.TariffCptConfigureLevelsFragment;
import com.avito.android.tariff_cpt.configure.migration.CptMigrationFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/TariffCptConfigureActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCptConfigureActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: TariffCptConfigureActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c cVar = c.f297558b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c cVar2 = c.f297558b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c cVar3 = c.f297558b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void a2(boolean z12) {
        Object serializableExtra;
        Fragment tariffCptConfigureLandingFragment;
        H hE2 = getSupportFragmentManager().e();
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("tariff_cpt_configure_extra_screen", c.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("tariff_cpt_configure_extra_screen");
            if (!(serializableExtra2 instanceof c)) {
                serializableExtra2 = null;
            }
            serializableExtra = (c) serializableExtra2;
        }
        c cVar = (c) serializableExtra;
        if (cVar == null) {
            throw new IllegalArgumentException("tariff_cpt_configure_extra_screen param must not be null");
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Intent extras must not be null");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            TariffCptConfigureLandingFragment.f297658s0.getClass();
            tariffCptConfigureLandingFragment = new TariffCptConfigureLandingFragment();
            tariffCptConfigureLandingFragment.setArguments(extras);
        } else if (iOrdinal == 1) {
            CptForbiddenFragment.f297585y0.getClass();
            tariffCptConfigureLandingFragment = new CptForbiddenFragment();
            tariffCptConfigureLandingFragment.setArguments(new Bundle(extras));
        } else if (iOrdinal == 2) {
            CptMigrationFragment.f297998v0.getClass();
            tariffCptConfigureLandingFragment = new CptMigrationFragment();
            tariffCptConfigureLandingFragment.setArguments(new Bundle(extras));
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TariffCptConfigureLevelsFragment.f297795A0.getClass();
            tariffCptConfigureLandingFragment = new TariffCptConfigureLevelsFragment();
            tariffCptConfigureLandingFragment.setArguments(extras);
        }
        hE2.n(R.id.fragment_container, tariffCptConfigureLandingFragment, null);
        if (z12) {
            hE2.c("TariffCptConfigureActivity");
        }
        hE2.e();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            a2(false);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a2(true);
    }
}
