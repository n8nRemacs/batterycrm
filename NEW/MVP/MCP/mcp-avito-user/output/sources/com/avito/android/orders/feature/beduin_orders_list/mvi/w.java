package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Z40.c;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: BeduinOrdersReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/w;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "LZ40/c;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements com.avito.android.arch.mvi.u<BeduinOrdersInternalAction, Z40.c> {
    @Inject
    public w() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Z40.c a(BeduinOrdersInternalAction beduinOrdersInternalAction, Z40.c cVar) {
        c.a aVarA;
        BeduinOrdersInternalAction beduinOrdersInternalAction2 = beduinOrdersInternalAction;
        Z40.c cVar2 = cVar;
        if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.LoadingStarted) {
            return new c.d(null, 1, null);
        }
        if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.ContentLoaded) {
            if (!(cVar2 instanceof c.a)) {
                BeduinOrdersInternalAction.ContentLoaded contentLoaded = (BeduinOrdersInternalAction.ContentLoaded) beduinOrdersInternalAction2;
                C42784z0 c42784z0 = C42784z0.f406748b;
                return new c.a(contentLoaded.f210098b, c42784z0, contentLoaded.f210099c, c42784z0, contentLoaded.f210100d, c42784z0, false, contentLoaded.f210101e, false, null);
            }
            BeduinOrdersInternalAction.ContentLoaded contentLoaded2 = (BeduinOrdersInternalAction.ContentLoaded) beduinOrdersInternalAction2;
            aVarA = c.a.a((c.a) cVar2, contentLoaded2.f210098b, null, contentLoaded2.f210099c, null, contentLoaded2.f210100d, null, false, contentLoaded2.f210101e, false, null, 874);
        } else {
            if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.LoadingFailed) {
                return new c.b(((BeduinOrdersInternalAction.LoadingFailed) beduinOrdersInternalAction2).f210103b);
            }
            if (!(beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.ContentChanged)) {
                if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.ExecuteRequestStateChanged) {
                    return cVar2 instanceof c.a ? c.a.a((c.a) cVar2, null, null, null, null, null, null, ((BeduinOrdersInternalAction.ExecuteRequestStateChanged) beduinOrdersInternalAction2).f210102b, null, false, null, 959) : cVar2;
                }
                if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.RefreshingScreenStateChanged) {
                    return cVar2 instanceof c.a ? c.a.a((c.a) cVar2, null, null, null, null, null, null, false, null, ((BeduinOrdersInternalAction.RefreshingScreenStateChanged) beduinOrdersInternalAction2).f210106b, null, 767) : cVar2;
                }
                if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.RefreshScreenFailed) {
                    return cVar2;
                }
                if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.ApplyNewContentPlaceholderState) {
                    return cVar2 instanceof c.a ? c.a.a((c.a) cVar2, null, null, null, null, null, null, false, null, false, ((BeduinOrdersInternalAction.ApplyNewContentPlaceholderState) beduinOrdersInternalAction2).f210091b, 511) : cVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(cVar2 instanceof c.a)) {
                BeduinOrdersInternalAction.ContentChanged contentChanged = (BeduinOrdersInternalAction.ContentChanged) beduinOrdersInternalAction2;
                return new c.a(contentChanged.f210092b, contentChanged.f210093c, contentChanged.f210094d, contentChanged.f210095e, contentChanged.f210096f, contentChanged.f210097g, false, C42784z0.f406748b, false, null);
            }
            BeduinOrdersInternalAction.ContentChanged contentChanged2 = (BeduinOrdersInternalAction.ContentChanged) beduinOrdersInternalAction2;
            aVarA = c.a.a((c.a) cVar2, null, contentChanged2.f210093c, null, contentChanged2.f210095e, null, contentChanged2.f210097g, false, null, false, null, 981);
        }
        return aVarA;
    }
}
