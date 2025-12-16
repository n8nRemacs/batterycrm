package com.avito.android.imv_cars_details.presentation;

import Y61.l;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f170010n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f170011m = C35961v3.a(this);

    /* compiled from: ImvCarsDetailsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsActivity$a;", "", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ImvCarsDetailsParams imvCarsDetailsParams = (ImvCarsDetailsParams) this.f170011m.getValue();
            H hE2 = getSupportFragmentManager().e();
            ImvCarsDetailsFragment.f170012x0.getClass();
            ImvCarsDetailsFragment imvCarsDetailsFragment = new ImvCarsDetailsFragment();
            imvCarsDetailsFragment.f170020t0.setValue(imvCarsDetailsFragment, ImvCarsDetailsFragment.f170013y0[0], imvCarsDetailsParams);
            hE2.n(R.id.content, imvCarsDetailsFragment, null);
            hE2.e();
        }
    }
}
