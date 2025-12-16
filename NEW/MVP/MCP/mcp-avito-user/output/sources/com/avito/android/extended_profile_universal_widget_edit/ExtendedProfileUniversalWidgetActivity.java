package com.avito.android.extended_profile_universal_widget_edit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.extended_profile_universal_widget_edit.create.UniversalWidgetCreateFragment;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileUniversalWidgetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/ExtendedProfileUniversalWidgetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileUniversalWidgetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f153646m = new a(null);

    /* compiled from: ExtendedProfileUniversalWidgetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/ExtendedProfileUniversalWidgetActivity$a;", "", "<init>", "()V", "", "EXTRA_CREATE_ARGS", "Ljava/lang/String;", "EXTRA_EDIT_SECTION_ARGS", "EXTRA_SCREEN_NAME", "SCREEN_CREATE", "SCREEN_EDIT_SECTION", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    public final void a2(Intent intent) {
        String stringExtra = intent.getStringExtra("extended_profile.universal_widget.screen_name");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -749079804) {
                if (iHashCode == -335991792 && stringExtra.equals("extended_profile.universal_widget.edit_section_screen")) {
                    UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extended_profile.universal_widget.edit_section_args", UniversalWidgetEditArguments.class) : intent.getParcelableExtra("extended_profile.universal_widget.edit_section_args"));
                    if (universalWidgetEditArguments == null) {
                        return;
                    }
                    H hE2 = getSupportFragmentManager().e();
                    UniversalWidgetEditFragment.f153776u0.getClass();
                    hE2.n(R.id.fragment_container, UniversalWidgetEditFragment.a.a(universalWidgetEditArguments), null);
                    hE2.c(null);
                    hE2.e();
                    return;
                }
            } else if (stringExtra.equals("extended_profile.universal_widget.create_screen")) {
                UniversalWidgetCreateArguments universalWidgetCreateArguments = (UniversalWidgetCreateArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extended_profile.universal_widget.create_args", UniversalWidgetCreateArguments.class) : intent.getParcelableExtra("extended_profile.universal_widget.create_args"));
                if (universalWidgetCreateArguments == null) {
                    return;
                }
                H hE3 = getSupportFragmentManager().e();
                UniversalWidgetCreateFragment.f153661t0.getClass();
                hE3.n(R.id.fragment_container, UniversalWidgetCreateFragment.a.a(universalWidgetCreateArguments), null);
                hE3.e();
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
            if (obj instanceof com.avito.android.ui.fragments.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
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
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2(getIntent());
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        a2(intent);
    }
}
