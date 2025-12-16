package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wg0.InterfaceC49619a;
import zz.InterfaceC50647a;

/* compiled from: RatingAddAnswerPhotoActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lwg0/a;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC49619a, RatingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.answer.photo.a f246716a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.answer.upload.a f246717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f246718c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RatingAddAnswerPhotoArguments f246719d;

    @Inject
    public d(@Y61.k com.avito.android.rating.details.answer.photo.a aVar, @Y61.k com.avito.android.rating.details.answer.upload.a aVar2, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments) {
        this.f246716a = aVar;
        this.f246717b = aVar2;
        this.f246718c = interfaceC50647a;
        this.f246719d = ratingAddAnswerPhotoArguments;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RatingAddAnswerPhotoInternalAction> b(InterfaceC49619a interfaceC49619a, RatingAddAnswerPhotoState ratingAddAnswerPhotoState) {
        InterfaceC49619a interfaceC49619a2 = interfaceC49619a;
        RatingAddAnswerPhotoState ratingAddAnswerPhotoState2 = ratingAddAnswerPhotoState;
        if (interfaceC49619a2.equals(InterfaceC49619a.C12824a.f441736a)) {
            return new C43210w(RatingAddAnswerPhotoInternalAction.TrackPhotoPickerOpen.f246735b);
        }
        if (interfaceC49619a2.equals(InterfaceC49619a.b.f441737a)) {
            return C43175k.G(new c(this, ratingAddAnswerPhotoState2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
