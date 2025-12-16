package com.avito.android.edit_carousel;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.util.C35966w1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditCarouselActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_carousel/EditCarouselActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditCarouselActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && (fragment instanceof com.avito.android.ui.fragments.c)) {
                break;
            }
        }
        com.avito.android.ui.fragments.c cVar = (com.avito.android.ui.fragments.c) (next instanceof com.avito.android.ui.fragments.c ? next : null);
        if (cVar == null || !cVar.i0()) {
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        CarouselEditorData carouselEditorData;
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                carouselEditorData = (CarouselEditorData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("data", CarouselEditorData.class) : extras.getParcelable("data"));
            } else {
                carouselEditorData = null;
            }
            if (carouselEditorData == null) {
                throw new IllegalArgumentException("Data must be specified");
            }
            EditCarouselFragment.f146208s0.getClass();
            EditCarouselFragment editCarouselFragment = new EditCarouselFragment();
            C35966w1.a(editCarouselFragment, -1, new C30310b(carouselEditorData));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, editCarouselFragment, "edit_carousel_fragment", 1);
            hE2.f();
        }
    }
}
