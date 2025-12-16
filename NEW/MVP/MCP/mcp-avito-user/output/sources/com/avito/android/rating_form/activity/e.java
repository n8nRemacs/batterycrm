package com.avito.android.rating_form.activity;

import android.view.View;
import com.avito.android.rating_form.activity.RatingFormFullScreenActivity;
import dh0.InterfaceC39727a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f247968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RatingFormFullScreenActivity f247969c;

    public /* synthetic */ e(RatingFormFullScreenActivity ratingFormFullScreenActivity, int i12) {
        this.f247968b = i12;
        this.f247969c = ratingFormFullScreenActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RatingFormFullScreenActivity ratingFormFullScreenActivity = this.f247969c;
        switch (this.f247968b) {
            case 0:
                RatingFormFullScreenActivity.a aVar = RatingFormFullScreenActivity.f247942x;
                ratingFormFullScreenActivity.onBackPressed();
                break;
            default:
                ratingFormFullScreenActivity.d2().accept(InterfaceC39727a.c.f393998a);
                break;
        }
    }
}
