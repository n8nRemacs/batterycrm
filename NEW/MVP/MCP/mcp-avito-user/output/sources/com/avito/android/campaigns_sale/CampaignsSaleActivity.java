package com.avito.android.campaigns_sale;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CampaignsSaleActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/campaigns_sale/CampaignsSaleActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/campaigns_sale/x;", "<init>", "()V", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CampaignsSaleActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, x {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f113812m = new a(null);

    /* compiled from: CampaignsSaleActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/campaigns_sale/CampaignsSaleActivity$a;", "", "<init>", "()V", "", "SALE_EXTRA_KEY", "Ljava/lang/String;", "SALE_SEARCH_EXTRA_KEY", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_campaigns_sale;
    }

    @Override // com.avito.android.campaigns_sale.x
    public final void V0() {
        setResult(-1, new Intent().putExtra("reloadPreviousScreen", true));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("saleData", CampaignsSaleArguments.class) : intent.getParcelableExtra("saleData");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CampaignsSaleArguments campaignsSaleArguments = (CampaignsSaleArguments) parcelableExtra;
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            CampaignsSaleFragment.f113813B0.getClass();
            CampaignsSaleFragment campaignsSaleFragment = new CampaignsSaleFragment();
            C35966w1.a(campaignsSaleFragment, -1, new C29296c(campaignsSaleArguments));
            hE2.j(R.id.fragment_container, campaignsSaleFragment, null, 1);
            hE2.e();
        }
    }
}
