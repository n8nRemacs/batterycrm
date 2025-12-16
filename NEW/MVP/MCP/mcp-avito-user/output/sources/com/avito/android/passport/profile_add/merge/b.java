package com.avito.android.passport.profile_add.merge;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.BusinessVrfDuplicationFragment;
import com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportMergeAccountsRouter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_passport_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    public static final void a(@k ActivityC22955m activityC22955m) {
        FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
        if (supportFragmentManager.L() > 1) {
            supportFragmentManager.Y();
        } else {
            activityC22955m.finish();
        }
    }

    public static final void b(ActivityC22955m activityC22955m) {
        if (activityC22955m.getSupportFragmentManager().L() < 1) {
            return;
        }
        activityC22955m.getSupportFragmentManager().a0(1, activityC22955m.getSupportFragmentManager().K(0).getName());
    }

    public static void c(ActivityC22955m activityC22955m, boolean z12, PrintableText printableText) {
        Intent intent = activityC22955m.getIntent();
        intent.putExtra("PassportMergeAccountsActivity_mergeSuccessText", printableText);
        intent.putExtra("PassportMergeAccountsActivity_closedByCross", false);
        if (z12) {
            activityC22955m.setResult(-1, intent);
        } else {
            activityC22955m.setResult(0, intent);
        }
        activityC22955m.finish();
    }

    @l
    public static final PrintableText d(@l Intent intent) {
        if (intent != null) {
            return (PrintableText) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("PassportMergeAccountsActivity_mergeSuccessText", PrintableText.class) : intent.getParcelableExtra("PassportMergeAccountsActivity_mergeSuccessText"));
        }
        return null;
    }

    public static final void e(@k ActivityC22955m activityC22955m) {
        b(activityC22955m);
        H hE2 = activityC22955m.getSupportFragmentManager().e();
        hE2.c(CheckMergePossibilityFragment.class.getName());
        CheckMergePossibilityFragment.f212597x0.getClass();
        hE2.n(R.id.fragment_container, new CheckMergePossibilityFragment(), null);
        hE2.e();
    }

    public static final void f(@k ActivityC22955m activityC22955m, @k BusinessVrfDuplication businessVrfDuplication) {
        H hE2 = activityC22955m.getSupportFragmentManager().e();
        hE2.c(BusinessVrfDuplicationFragment.class.getName());
        BusinessVrfDuplicationFragment.f212459D0.getClass();
        hE2.n(R.id.fragment_container, BusinessVrfDuplicationFragment.a.a(businessVrfDuplication), null);
        hE2.e();
    }

    public static final void g(@k ActivityC22955m activityC22955m, @k List<MergeAccountsProfile> list) {
        H hE2 = activityC22955m.getSupportFragmentManager().e();
        hE2.c(ProfileToConvertFragment.class.getName());
        ProfileToConvertFragment.f213078w0.getClass();
        hE2.n(R.id.fragment_container, ProfileToConvertFragment.a.a(list), null);
        hE2.e();
    }
}
