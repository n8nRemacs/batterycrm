package com.avito.android.map_core.beduin.action_handler;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.map_core.beduin.BeduinUpdateSelectedPinAction;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;

/* compiled from: BeduinUpdateSelectedPinActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/beduin/action_handler/o;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/map_core/beduin/BeduinUpdateSelectedPinAction;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements com.avito.android.beduin_shared.model.action.custom.c<BeduinUpdateSelectedPinAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f185661a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f185662b;

    public o() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f185661a = cVar;
        this.f185662b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f185661a.accept(((BeduinUpdateSelectedPinAction) beduinAction).getIconType());
    }
}
