package com.avito.android.rating.details.answer.text.mvi;

import Y61.l;
import com.avito.android.arch.mvi.a;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextInternalAction;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import xg0.InterfaceC49941a;

/* compiled from: RatingAddAnswerTextActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lxg0/a;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49941a, RatingAddAnswerTextInternalAction, RatingAddAnswerTextState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingAddAnswerTextValidationInteractor f246860a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f246861b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f246862c;

    @Inject
    public a(@Y61.k RatingAddAnswerTextValidationInteractor ratingAddAnswerTextValidationInteractor, @l Long l12, @Y61.k String str) {
        this.f246860a = ratingAddAnswerTextValidationInteractor;
        this.f246861b = l12;
        this.f246862c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RatingAddAnswerTextInternalAction> b(InterfaceC49941a interfaceC49941a, RatingAddAnswerTextState ratingAddAnswerTextState) {
        int i12 = 1;
        InterfaceC49941a interfaceC49941a2 = interfaceC49941a;
        RatingAddAnswerTextState ratingAddAnswerTextState2 = ratingAddAnswerTextState;
        boolean z12 = interfaceC49941a2 instanceof InterfaceC49941a.b;
        RatingAddAnswerTextValidationInteractor ratingAddAnswerTextValidationInteractor = this.f246860a;
        if (z12) {
            String str = ((InterfaceC49941a.b) interfaceC49941a2).f442599a;
            return new C43210w(new RatingAddAnswerTextInternalAction.UpdateState(str, ratingAddAnswerTextValidationInteractor.a(str, false)));
        }
        if (!interfaceC49941a2.equals(InterfaceC49941a.C12875a.f442598a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ratingAddAnswerTextState2.f246883b;
        RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResultA = ratingAddAnswerTextValidationInteractor.a(str2, true);
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (validationTextResultA instanceof RatingAddAnswerTextValidationInteractor.ValidationTextResult.Ok) {
            return new C43207v(new RatingAddAnswerTextInternalAction[]{RatingAddAnswerTextInternalAction.HideKeyboard.f246879b, new RatingAddAnswerTextInternalAction.UpdateState(str3, validationTextResultA, i12, objArr3 == true ? 1 : 0), new RatingAddAnswerTextInternalAction.Continue(new RatingAddAnswerPhotoArguments(this.f246861b, str2, this.f246862c))});
        }
        if (validationTextResultA instanceof RatingAddAnswerTextValidationInteractor.ValidationTextResult.Failure) {
            return new C43210w(new RatingAddAnswerTextInternalAction.UpdateState(objArr2 == true ? 1 : 0, validationTextResultA, i12, objArr == true ? 1 : 0));
        }
        throw new NoWhenBranchMatchedException();
    }
}
