package com.avito.android.advert.specifications;

import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.advert.specifications.SpecificationsFragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.ModelSpecifications;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationsActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/specifications/SpecificationsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpecificationsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: SpecificationsActivity.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/specifications/SpecificationsActivity$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("specifications");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException(("specifications should be provided to " + this).toString());
            }
            H hE2 = getSupportFragmentManager().e();
            new SpecificationsFragment.a();
            SpecificationsFragment specificationsFragment = new SpecificationsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("specifications", (ModelSpecifications) parcelableExtra);
            specificationsFragment.setArguments(bundle2);
            hE2.j(R.id.fragment_container, specificationsFragment, null, 1);
            hE2.e();
        }
    }
}
