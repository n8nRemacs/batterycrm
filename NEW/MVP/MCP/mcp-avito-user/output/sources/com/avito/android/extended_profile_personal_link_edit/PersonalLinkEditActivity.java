package com.avito.android.extended_profile_personal_link_edit;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PersonalLinkEditActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalLinkEditActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: PersonalLinkEditActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditActivity$a;", "", "<init>", "()V", "", "EXTRA_ARGS", "Ljava/lang/String;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                PersonalLinkEditConfig personalLinkEditConfig = (PersonalLinkEditConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("extra_args", PersonalLinkEditConfig.class) : extras.getParcelable("extra_args"));
                if (personalLinkEditConfig != null) {
                    PersonalLinkEditFragment.f151444y0.getClass();
                    PersonalLinkEditFragment personalLinkEditFragment = new PersonalLinkEditFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("extended_profile_personal_link_edit.args", personalLinkEditConfig);
                    personalLinkEditFragment.setArguments(bundle2);
                    H hE2 = getSupportFragmentManager().e();
                    hE2.j(R.id.fragment_container, personalLinkEditFragment, null, 1);
                    hE2.f();
                    return;
                }
            }
            throw new IllegalArgumentException("Arguments must be specified");
        }
    }
}
