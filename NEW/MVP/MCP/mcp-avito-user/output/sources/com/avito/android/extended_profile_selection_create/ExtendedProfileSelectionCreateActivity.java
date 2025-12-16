package com.avito.android.extended_profile_selection_create;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameFragment;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment;
import com.avito.android.ui.fragments.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSelectionCreateActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/ExtendedProfileSelectionCreateActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSelectionCreateActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f151610m = new a(null);

    /* compiled from: ExtendedProfileSelectionCreateActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/ExtendedProfileSelectionCreateActivity$a;", "", "<init>", "()V", "", "EXTRA_CREATE_SELECTION_ARGS", "Ljava/lang/String;", "EXTRA_SCREEN_NAME", "EXTRA_SET_SELECTION_IMAGE_ARGS", "EXTRA_SET_SELECTION_NAME_ARGS", "SCREEN_CREATE_SELECTION", "SCREEN_SET_SELECTION_IMAGE", "SCREEN_SET_SELECTION_NAME", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public final void a2(Intent intent) {
        String stringExtra = intent.getStringExtra("extended_profile.selection.screen_name");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -1634361770) {
                if (iHashCode != -1008904222) {
                    if (iHashCode == 624976090 && stringExtra.equals("extended_profile.selection.set_image_screen")) {
                        ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig = (ExtendedProfileSetSelectionImageConfig) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extended_profile.selection.set_selection_image_args", ExtendedProfileSetSelectionImageConfig.class) : intent.getParcelableExtra("extended_profile.selection.set_selection_image_args"));
                        if (extendedProfileSetSelectionImageConfig == null) {
                            return;
                        }
                        H hE2 = getSupportFragmentManager().e();
                        ExtendedProfileSetSelectionImageFragment.f151634E0.getClass();
                        ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = new ExtendedProfileSetSelectionImageFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("extended_profile_set_selection_image.args", extendedProfileSetSelectionImageConfig);
                        extendedProfileSetSelectionImageFragment.setArguments(bundle);
                        hE2.n(R.id.fragment_container, extendedProfileSetSelectionImageFragment, null);
                        hE2.c(null);
                        hE2.e();
                        return;
                    }
                } else if (stringExtra.equals("extended_profile.selection.create_screen")) {
                    ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = (ExtendedProfileSelectionCreateConfig) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extended_profile.selection.create_selection_args", ExtendedProfileSelectionCreateConfig.class) : intent.getParcelableExtra("extended_profile.selection.create_selection_args"));
                    if (extendedProfileSelectionCreateConfig == null) {
                        return;
                    }
                    H hE3 = getSupportFragmentManager().e();
                    ExtendedProfileSelectionCreateFragment.f151942L0.getClass();
                    ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment = new ExtendedProfileSelectionCreateFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("extended_profile_selection_create.args", extendedProfileSelectionCreateConfig);
                    extendedProfileSelectionCreateFragment.setArguments(bundle2);
                    hE3.n(R.id.fragment_container, extendedProfileSelectionCreateFragment, null);
                    hE3.c(null);
                    hE3.e();
                    return;
                }
            } else if (stringExtra.equals("extended_profile.selection.set_name_screen")) {
                ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig = (ExtendedProfileSetSelectionNameConfig) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extended_profile.selection.set_selection_name_args", ExtendedProfileSetSelectionNameConfig.class) : intent.getParcelableExtra("extended_profile.selection.set_selection_name_args"));
                if (extendedProfileSetSelectionNameConfig == null) {
                    return;
                }
                H hE4 = getSupportFragmentManager().e();
                ExtendedProfileSetSelectionNameFragment.f151810A0.getClass();
                ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment = new ExtendedProfileSetSelectionNameFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("extended_profile_set_selection_name.args", extendedProfileSetSelectionNameConfig);
                extendedProfileSetSelectionNameFragment.setArguments(bundle3);
                hE4.n(R.id.fragment_container, extendedProfileSetSelectionNameFragment, null);
                hE4.c(null);
                hE4.e();
                return;
            }
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).i0()) {
                return;
            }
        }
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2(getIntent());
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent);
    }
}
