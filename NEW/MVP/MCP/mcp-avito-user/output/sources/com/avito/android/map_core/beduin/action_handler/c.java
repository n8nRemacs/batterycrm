package com.avito.android.map_core.beduin.action_handler;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.map_core.beduin.BeduinResetMapAction;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinResetMapActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/beduin/action_handler/c;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/map_core/beduin/BeduinResetMapAction;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.beduin_shared.model.action.custom.c<BeduinResetMapAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<List<BeduinResetMapAction.ResetEntity>> f185648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f185649b;

    @Inject
    public c() {
        com.jakewharton.rxrelay3.c<List<BeduinResetMapAction.ResetEntity>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f185648a = cVar;
        this.f185649b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f185648a.accept(((BeduinResetMapAction) beduinAction).getEntitiesToReset());
    }
}
