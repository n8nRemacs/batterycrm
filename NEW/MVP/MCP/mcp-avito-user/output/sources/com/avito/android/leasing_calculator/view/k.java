package com.avito.android.leasing_calculator.view;

import android.content.DialogInterface;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import oR.AbstractC44682a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class k implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f175156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f175157c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f175158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f175159e;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i12) {
        this.f175156b = i12;
        this.f175159e = obj;
        this.f175157c = obj2;
        this.f175158d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.f175158d;
        Object obj2 = this.f175157c;
        Object obj3 = this.f175159e;
        switch (this.f175156b) {
            case 0:
                ((u) obj3).a();
                if (!((o) obj2).f175168b) {
                    ((l) obj).f175161b.f();
                    break;
                }
                break;
            case 1:
                ((InterfaceC31101a) obj3).a();
                if (!((o) obj2).f175168b) {
                    l lVar = (l) obj;
                    lVar.f175161b.b();
                    lVar.f175162c.a(AbstractC44682a.C12189a.f419770b);
                    break;
                }
                break;
            default:
                RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
                ((RatingDetailsFragment) obj3).E5().accept(new a.v((BaseRatingReviewItem) obj2, (BaseRatingReviewItem.ReviewAction) obj));
                break;
        }
    }
}
