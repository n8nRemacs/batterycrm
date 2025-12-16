package com.avito.android.rating.details;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating.details.mvi.entity.b;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements SwipeRefreshLayout.f, C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f246477b;

    public /* synthetic */ a(RatingDetailsFragment ratingDetailsFragment) {
        this.f246477b = ratingDetailsFragment;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        this.f246477b.E5().accept(new a.s(b.e.C7423b.f247441a, false, 2, null));
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        ReviewActionNetworkRequestResult.Info info = (ReviewActionNetworkRequestResult.Info) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_info_result", ReviewActionNetworkRequestResult.Info.class) : bundle.getParcelable("key_info_result"));
        if (info != null) {
            this.f246477b.E5().accept(new a.j(info));
        }
    }
}
