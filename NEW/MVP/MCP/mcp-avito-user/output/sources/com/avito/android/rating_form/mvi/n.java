package com.avito.android.rating_form.mvi;

import ch0.InterfaceC27196b;
import com.avito.android.arch.mvi.u;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import com.avito.android.rating_form.mvi.entity.Screen;
import com.avito.android.rating_form.step.t;
import com.avito.android.rating_form.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingFormReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<RatingFormInternalAction, RatingFormState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y f248795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f248796c;

    @Inject
    public n(@Y61.k y yVar, @Y61.k t tVar) {
        this.f248795b = yVar;
        this.f248796c = tVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final RatingFormState a(RatingFormInternalAction ratingFormInternalAction, RatingFormState ratingFormState) {
        RatingFormState.RatingFormStepProgress ratingFormStepProgress;
        RatingFormState.RatingFormStepProgress progress;
        RatingFormInternalAction ratingFormInternalAction2 = ratingFormInternalAction;
        RatingFormState ratingFormState2 = ratingFormState;
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.DraftCreated) {
            return RatingFormState.a(ratingFormState2, null, ((RatingFormInternalAction.DraftCreated) ratingFormInternalAction2).f248716b, null, null, null, null, null, null, null, false, false, null, null, 6653);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Info) {
            RatingFormInternalAction.Info info = (RatingFormInternalAction.Info) ratingFormInternalAction2;
            return RatingFormState.a(ratingFormState2, null, 0, null, null, info.f248729b, info.f248730c, info.f248731d, info.f248732e, Screen.f248761c, false, false, RatingFormState.RatingFormStepProgress.Empty.f248757b, info.f248734g, 15);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.SelectItem) {
            RatingFormInternalAction.SelectItem selectItem = (RatingFormInternalAction.SelectItem) ratingFormInternalAction2;
            return RatingFormState.a(ratingFormState2, selectItem.f248735b, 0, selectItem.f248737d, null, null, null, null, null, Screen.f248760b, false, false, null, null, 6394);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Step) {
            RatingFormInternalAction.Step step = (RatingFormInternalAction.Step) ratingFormInternalAction2;
            return RatingFormState.a(ratingFormState2, step.f248739b, 0, step.f248741d, step.f248742e, null, null, null, null, null, false, false, null, null, 6642);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.ShowProgress) {
            InterfaceC27196b interfaceC27196b = ((RatingFormInternalAction.ShowProgress) ratingFormInternalAction2).f248738b;
            if (interfaceC27196b instanceof InterfaceC27196b.c) {
                progress = new RatingFormState.RatingFormStepProgress.Title(((InterfaceC27196b.c) interfaceC27196b).f58103a);
            } else {
                if (!(interfaceC27196b instanceof InterfaceC27196b.C2057b)) {
                    if (!(interfaceC27196b instanceof InterfaceC27196b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ratingFormStepProgress = RatingFormState.RatingFormStepProgress.Empty.f248757b;
                    return RatingFormState.a(ratingFormState2, null, 0, null, null, null, null, null, null, null, false, false, ratingFormStepProgress, null, 6143);
                }
                progress = new RatingFormState.RatingFormStepProgress.Progress(((InterfaceC27196b.C2057b) interfaceC27196b).f58102a);
            }
            ratingFormStepProgress = progress;
            return RatingFormState.a(ratingFormState2, null, 0, null, null, null, null, null, null, null, false, false, ratingFormStepProgress, null, 6143);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Loading) {
            return RatingFormState.a(ratingFormState2, null, 0, null, null, null, null, null, null, null, true, false, null, null, 7679);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Error) {
            return RatingFormState.a(ratingFormState2, null, 0, null, null, null, null, null, null, null, false, true, null, null, 6655);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Back) {
            int i12 = ((RatingFormInternalAction.Back) ratingFormInternalAction2).f248710c;
            StepIdentifier stepIdentifierM = this.f248795b.b(i12).m();
            return RatingFormState.a(ratingFormState2, null, 0, stepIdentifierM, this.f248796c.a(i12, stepIdentifierM), null, null, null, null, null, false, false, null, null, 8179);
        }
        if (ratingFormInternalAction2 instanceof RatingFormInternalAction.Empty ? true : ratingFormInternalAction2 instanceof RatingFormInternalAction.CloseForm ? true : ratingFormInternalAction2 instanceof RatingFormInternalAction.DonePseudoStep ? true : ratingFormInternalAction2 instanceof RatingFormInternalAction.DoneWithToast ? true : ratingFormInternalAction2 instanceof RatingFormInternalAction.FinishWithResult) {
            return ratingFormState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
