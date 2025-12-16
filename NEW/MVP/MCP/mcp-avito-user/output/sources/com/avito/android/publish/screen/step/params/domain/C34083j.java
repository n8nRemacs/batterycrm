package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.beduin.custom_actions.ContinuePublishAction;
import com.avito.android.publish.details.beduin.custom_actions.a;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/a$a;", "params", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/details/beduin/custom_actions/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34083j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241280b;

    public C34083j(C34076c c34076c) {
        this.f241280b = c34076c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.publish.slots.card_select.item.k cVar;
        ContinuePublishAction continuePublishAction = ((a.C7085a) obj).f233557a;
        if (continuePublishAction == null) {
            return;
        }
        if (continuePublishAction instanceof ContinuePublishAction.PerformDeeplink) {
            cVar = new k.a(null, ((ContinuePublishAction.PerformDeeplink) continuePublishAction).getDeeplink(), CategoryPublishStep.Params.NavigationButtonAction.PERFORM_DEEP_LINK);
        } else {
            if (!(continuePublishAction instanceof ContinuePublishAction.ContinuePublish)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new k.c(CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH);
        }
        this.f241280b.f241185O.C(new C34082i(cVar));
    }
}
