package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.t;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ug0.C49056b;
import wg0.InterfaceC49620b;

/* compiled from: RatingAddAnswerPhotoOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lwg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements t<RatingAddAnswerPhotoInternalAction, InterfaceC49620b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246767b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f246768c;

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.l Long l12) {
        this.f246767b = interfaceC28373a;
        this.f246768c = l12;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49620b b(RatingAddAnswerPhotoInternalAction ratingAddAnswerPhotoInternalAction) {
        RatingAddAnswerPhotoInternalAction ratingAddAnswerPhotoInternalAction2 = ratingAddAnswerPhotoInternalAction;
        if (ratingAddAnswerPhotoInternalAction2.equals(RatingAddAnswerPhotoInternalAction.TrackPhotoPickerOpen.f246735b)) {
            this.f246767b.c(new C49056b(this.f246768c));
            return null;
        }
        if (ratingAddAnswerPhotoInternalAction2 instanceof RatingAddAnswerPhotoInternalAction.ShowErrorToastBar) {
            RatingAddAnswerPhotoInternalAction.ShowErrorToastBar showErrorToastBar = (RatingAddAnswerPhotoInternalAction.ShowErrorToastBar) ratingAddAnswerPhotoInternalAction2;
            return new InterfaceC49620b.c(showErrorToastBar.f246729b, showErrorToastBar.f246730c);
        }
        if (ratingAddAnswerPhotoInternalAction2.equals(RatingAddAnswerPhotoInternalAction.HideToastBar.f246726b)) {
            return InterfaceC49620b.C12825b.f441739a;
        }
        if (ratingAddAnswerPhotoInternalAction2 instanceof RatingAddAnswerPhotoInternalAction.ShowUserDialog) {
            return new InterfaceC49620b.d(((RatingAddAnswerPhotoInternalAction.ShowUserDialog) ratingAddAnswerPhotoInternalAction2).f246732b);
        }
        if (ratingAddAnswerPhotoInternalAction2 instanceof RatingAddAnswerPhotoInternalAction.Finish) {
            return new InterfaceC49620b.a(((RatingAddAnswerPhotoInternalAction.Finish) ratingAddAnswerPhotoInternalAction2).f246724b);
        }
        return null;
    }
}
