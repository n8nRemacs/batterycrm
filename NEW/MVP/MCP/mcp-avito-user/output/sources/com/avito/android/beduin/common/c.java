package com.avito.android.beduin.common;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import l41.o;

/* compiled from: BeduinExecuteRequestHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "it", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f100604b;

    public c(a aVar) {
        this.f100604b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        a aVar = this.f100604b;
        if (!aVar.f99958h.w().invoke().booleanValue() || !(p22 instanceof P2.b)) {
            return p22;
        }
        BeduinActionsResponse beduinActionsResponse = (BeduinActionsResponse) ((P2.b) p22).f318720a;
        if (!O2.a(beduinActionsResponse.getActions())) {
            return p22;
        }
        List<BeduinAction> actions = beduinActionsResponse.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        return new P2.b(beduinActionsResponse.copy(aVar.f99952b.a(actions)));
    }
}
