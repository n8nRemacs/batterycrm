package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinCloseModuleAction;
import com.avito.android.beduin_models.BeduinAction;
import gj.C40690a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: BeduinCloseModuleHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/w;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinCloseModuleAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28784w implements InterfaceC15523b<BeduinCloseModuleAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C40690a> f100507a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f100508b;

    @Inject
    public C28784w() {
        com.jakewharton.rxrelay3.c<C40690a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100507a = cVar;
        this.f100508b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinCloseModuleAction beduinCloseModuleAction = (BeduinCloseModuleAction) beduinAction;
        List<BeduinAction> parentModuleActions = beduinCloseModuleAction.getParentModuleActions();
        if (parentModuleActions == null) {
            parentModuleActions = C42784z0.f406748b;
        }
        Map<String, Object> resultParams = beduinCloseModuleAction.getResultParams();
        if (resultParams == null) {
            resultParams = kotlin.collections.P0.c();
        }
        this.f100507a.accept(new C40690a(parentModuleActions, resultParams));
    }
}
