package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import g60.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectBusinessVrfOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lg60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements t<SelectBusinessVrfInternalAction, g60.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213478b;

    @Inject
    public n(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213478b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final g60.b b(SelectBusinessVrfInternalAction selectBusinessVrfInternalAction) {
        g60.b cVar;
        SelectBusinessVrfInternalAction selectBusinessVrfInternalAction2 = selectBusinessVrfInternalAction;
        if (selectBusinessVrfInternalAction2.equals(SelectBusinessVrfInternalAction.Close.f213432b)) {
            return b.a.f396293a;
        }
        if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.MergeFinished) {
            SelectBusinessVrfInternalAction.MergeFinished mergeFinished = (SelectBusinessVrfInternalAction.MergeFinished) selectBusinessVrfInternalAction2;
            cVar = new b.d(mergeFinished.f213441c, mergeFinished.f213440b);
        } else {
            if (!(selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.MergeError)) {
                if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.OpenDeepLink) {
                    SelectBusinessVrfInternalAction.OpenDeepLink openDeepLink = (SelectBusinessVrfInternalAction.OpenDeepLink) selectBusinessVrfInternalAction2;
                    b.a.a(this.f213478b, openDeepLink.f213444b, openDeepLink.f213445c, null, 4);
                } else {
                    if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.CloseFlow) {
                        return b.C11191b.f396294a;
                    }
                    if (!(selectBusinessVrfInternalAction2.equals(SelectBusinessVrfInternalAction.NoChoiceError.f213443b) ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.Loading ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.BusinessVrfDataLoaded ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.NewSearch ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.ItemClick ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.LoadingError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            }
            cVar = new b.c(((SelectBusinessVrfInternalAction.MergeError) selectBusinessVrfInternalAction2).f213438b);
        }
        return cVar;
    }
}
