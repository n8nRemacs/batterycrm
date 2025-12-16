package com.avito.android.publish.screen.step.params.mvi;

import Ie0.f;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.ActionMode;
import com.avito.android.publish.C0;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: PublishDetailsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/H;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "LIe0/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class H implements com.avito.android.arch.mvi.u<PublishDetailsInternalAction, Ie0.f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f241344b;

    @Inject
    public H(@Y61.k C0 c02) {
        this.f241344b = c02;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.arch.mvi.u
    public final Ie0.f a(PublishDetailsInternalAction publishDetailsInternalAction, Ie0.f fVar) {
        ActionMode actionMode;
        Ie0.f fVarA;
        String shortTitle;
        PublishDetailsInternalAction publishDetailsInternalAction2 = publishDetailsInternalAction;
        Ie0.f fVar2 = fVar;
        if (!(publishDetailsInternalAction2 instanceof PublishDetailsInternalAction.InternalStateAction)) {
            return fVar2;
        }
        PublishDetailsInternalAction.InternalStateAction internalStateAction = (PublishDetailsInternalAction.InternalStateAction) publishDetailsInternalAction2;
        if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.ShowContent) {
            fVarA = Ie0.f.a(fVar2, f.e.b.f8453a, null, false, null, null, null, null, 254);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress) {
            fVarA = Ie0.f.a(fVar2, null, null, ((PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress) internalStateAction).f241454b, null, null, null, null, 251);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.ItemsUpdate) {
            fVarA = Ie0.f.a(fVar2, null, null, false, null, null, null, ((PublishDetailsInternalAction.InternalStateAction.ItemsUpdate) internalStateAction).f241442b, 127);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.ButtonsState) {
            PublishDetailsInternalAction.InternalStateAction.ButtonsState buttonsState = (PublishDetailsInternalAction.InternalStateAction.ButtonsState) internalStateAction;
            fVarA = Ie0.f.a(fVar2, null, null, false, null, new f.a(buttonsState.f241435b, buttonsState.f241436c, buttonsState.f241437d, buttonsState.f241438e, buttonsState.f241439f), null, null, 223);
        } else if (L.f(internalStateAction, PublishDetailsInternalAction.InternalStateAction.HideLoading.f241441b)) {
            fVarA = Ie0.f.a(fVar2, null, f.d.c.f8451a, false, null, null, null, null, 253);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.ErrorAutoDescription) {
            fVarA = Ie0.f.a(fVar2, null, new f.d.a(((PublishDetailsInternalAction.InternalStateAction.ErrorAutoDescription) internalStateAction).f241440b), false, null, null, null, null, 253);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.SetupDownScrollListener) {
            ((PublishDetailsInternalAction.InternalStateAction.SetupDownScrollListener) internalStateAction).getClass();
            fVarA = Ie0.f.a(fVar2, null, null, false, null, null, null, null, 247);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.ShowLoading) {
            PublishDetailsInternalAction.InternalStateAction.ShowLoading showLoading = (PublishDetailsInternalAction.InternalStateAction.ShowLoading) internalStateAction;
            fVarA = Ie0.f.a(fVar2, null, new f.d.b(showLoading.f241446d, showLoading.f241444b, showLoading.f241445c), false, null, null, null, null, 253);
        } else if (L.f(internalStateAction, PublishDetailsInternalAction.InternalStateAction.ShowProgress.f241447b)) {
            fVarA = Ie0.f.a(fVar2, f.e.c.f8454a, null, false, null, null, null, null, 254);
        } else if (L.f(internalStateAction, PublishDetailsInternalAction.InternalStateAction.ShowRetry.f241448b)) {
            fVarA = Ie0.f.a(fVar2, f.e.a.f8452a, null, false, null, null, null, null, 254);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.UpdateEditorNavigationButtonsState) {
            PublishDetailsInternalAction.InternalStateAction.UpdateEditorNavigationButtonsState updateEditorNavigationButtonsState = (PublishDetailsInternalAction.InternalStateAction.UpdateEditorNavigationButtonsState) internalStateAction;
            fVarA = Ie0.f.a(fVar2, null, null, false, null, null, f.c.a(fVar2.f8436h, false, 0, updateEditorNavigationButtonsState.f241449b, updateEditorNavigationButtonsState.f241450c, 3), null, 191);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarFlags) {
            fVarA = Ie0.f.a(fVar2, null, null, false, null, null, f.c.a(fVar2.f8436h, false, ((PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarFlags) internalStateAction).f241451b, false, false, 13), null, 191);
        } else if (internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarVisible) {
            fVarA = Ie0.f.a(fVar2, null, null, false, null, null, f.c.a(fVar2.f8436h, ((PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarVisible) internalStateAction).f241452b, 0, false, false, 14), null, 191);
        } else {
            if (!(internalStateAction instanceof PublishDetailsInternalAction.InternalStateAction.UpdateToolbar)) {
                throw new NoWhenBranchMatchedException();
            }
            CategoryPublishStep categoryPublishStep = ((PublishDetailsInternalAction.InternalStateAction.UpdateToolbar) internalStateAction).f241453b;
            boolean z12 = categoryPublishStep instanceof CategoryPublishStep.Params;
            C0 c02 = this.f241344b;
            int i12 = R.attr.ic_arrowBack24;
            if (z12) {
                CategoryPublishStep.Params params = (CategoryPublishStep.Params) categoryPublishStep;
                CategoryPublishStep.Params.Config config = params.getConfig();
                Boolean isCloseButtonHidden = config != null ? config.getIsCloseButtonHidden() : null;
                actionMode = (isCloseButtonHidden == null || !isCloseButtonHidden.booleanValue()) ? L.f(c02.qe(), Boolean.TRUE) ? ActionMode.f231832b : ActionMode.f231833c : ActionMode.f231836f;
                CategoryPublishStep.Params.Config config2 = params.getConfig();
                String backButtonStyle = config2 != null ? config2.getBackButtonStyle() : null;
                if (!L.f(backButtonStyle, "back") && L.f(backButtonStyle, "close")) {
                    i12 = R.attr.ic_close24;
                }
            } else {
                actionMode = L.f(c02.qe(), Boolean.TRUE) ? ActionMode.f231832b : ActionMode.f231833c;
            }
            if (c02.Be()) {
                if (categoryPublishStep == null || (shortTitle = categoryPublishStep.getShortTitle()) == null) {
                    title = categoryPublishStep != null ? categoryPublishStep.getTitle() : null;
                    if (title == null) {
                        title = "";
                    }
                } else {
                    title = shortTitle;
                }
            }
            fVarA = Ie0.f.a(fVar2, null, null, false, new f.C0480f(title, Integer.valueOf(i12), actionMode), null, null, null, 239);
        }
        return fVarA;
    }
}
