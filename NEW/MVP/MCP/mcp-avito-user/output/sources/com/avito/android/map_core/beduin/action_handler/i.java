package com.avito.android.map_core.beduin.action_handler;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.map_core.beduin.BeduinShowMapTooltipAction;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinShowMapTooltipActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/beduin/action_handler/i;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/map_core/beduin/BeduinShowMapTooltipAction;", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements com.avito.android.beduin_shared.model.action.custom.c<BeduinShowMapTooltipAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f185654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<BeduinShowMapTooltipAction> f185655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f185656c;

    @Inject
    public i(@Y61.k com.avito.android.onboarding_manager.f fVar) {
        this.f185654a = fVar;
        com.jakewharton.rxrelay3.c<BeduinShowMapTooltipAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f185655b = cVar;
        this.f185656c = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        BeduinShowMapTooltipAction beduinShowMapTooltipAction = (BeduinShowMapTooltipAction) beduinAction;
        String onceShowId = beduinShowMapTooltipAction.getOnceShowId();
        com.jakewharton.rxrelay3.c<BeduinShowMapTooltipAction> cVar = this.f185655b;
        if (onceShowId == null) {
            cVar.accept(beduinShowMapTooltipAction);
            return;
        }
        com.avito.android.onboarding_manager.f fVar = this.f185654a;
        if (fVar.b(onceShowId)) {
            return;
        }
        cVar.accept(beduinShowMapTooltipAction);
        fVar.e(onceShowId);
    }
}
