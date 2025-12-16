package com.avito.android.extended_profile;

import Hr.InterfaceC14024a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.extended_profile.di.C30396a;
import com.avito.android.extended_profile.di.InterfaceC30424d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile/ExtendedProfileActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC14024a f149277m;

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C30396a.a().a((InterfaceC30424d) C29972i.a(C29972i.b(this), InterfaceC30424d.class)).a(this);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                ExtendedProfileArguments extendedProfileArguments = (ExtendedProfileArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("extra_args", ExtendedProfileArguments.class) : extras.getParcelable("extra_args"));
                if (extendedProfileArguments != null) {
                    ExtendedProfileFragment.f149283Y0.getClass();
                    ExtendedProfileFragment extendedProfileFragmentA = ExtendedProfileFragment.a.a(extendedProfileArguments);
                    androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
                    hE2.j(R.id.fragment_container, extendedProfileFragmentA, null, 1);
                    hE2.f();
                    return;
                }
            }
            throw new IllegalArgumentException("Arguments must be specified");
        }
    }
}
