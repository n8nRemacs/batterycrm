package com.avito.android.rating.details;

import android.view.View;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating.details.mvi.entity.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f246908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f246909c;

    public /* synthetic */ b(RatingDetailsFragment ratingDetailsFragment, int i12) {
        this.f246908b = i12;
        this.f246909c = ratingDetailsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RatingDetailsFragment ratingDetailsFragment = this.f246909c;
        switch (this.f246908b) {
            case 0:
                RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
                ratingDetailsFragment.E5().accept(a.C34182d.f247387a);
                break;
            default:
                RatingDetailsFragment.C34165a c34165a2 = RatingDetailsFragment.f246422S0;
                ratingDetailsFragment.E5().accept(new a.s(b.e.a.f247440a, false, 2, null));
                break;
        }
    }
}
