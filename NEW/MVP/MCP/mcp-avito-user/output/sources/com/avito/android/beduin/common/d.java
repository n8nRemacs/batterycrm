package com.avito.android.beduin.common;

import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.actionhandler.C28770o0;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pj.InterfaceC47100c;

/* compiled from: BeduinExecuteRequestHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeduinExecuteRequestAction f103273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f103274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47100c f103275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C28770o0 f103276e;

    public d(a aVar, BeduinExecuteRequestAction beduinExecuteRequestAction, C28770o0 c28770o0, InterfaceC47100c interfaceC47100c) {
        this.f103273b = beduinExecuteRequestAction;
        this.f103274c = aVar;
        this.f103275d = interfaceC47100c;
        this.f103276e = c28770o0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean zEquals = p22.equals(P2.c.f318721a);
        a aVar = this.f103274c;
        BeduinExecuteRequestAction beduinExecuteRequestAction = this.f103273b;
        if (!zEquals) {
            boolean z12 = p22 instanceof P2.b;
            InterfaceC47100c interfaceC47100c = this.f103275d;
            if (z12) {
                if (interfaceC47100c != null) {
                    interfaceC47100c.J(beduinExecuteRequestAction.getContentTypeOrDefault(), J.b.f90385a);
                }
                if (!L.f(beduinExecuteRequestAction.getShowErrorAlertOnFail(), Boolean.FALSE)) {
                    aVar.f99961k.accept(new Ui.f(beduinExecuteRequestAction, p22));
                }
            } else if (p22 instanceof P2.a) {
                if (interfaceC47100c != null) {
                    interfaceC47100c.J(beduinExecuteRequestAction.getContentTypeOrDefault(), new J.a(((P2.a) p22).f318719a));
                }
                if (!L.f(beduinExecuteRequestAction.getShowErrorAlertOnFail(), Boolean.FALSE)) {
                    aVar.f99961k.accept(new Ui.f(beduinExecuteRequestAction, p22));
                }
            }
        } else if (!L.f(beduinExecuteRequestAction.getShowActivityIndicator(), Boolean.FALSE)) {
            aVar.f99961k.accept(new Ui.f(beduinExecuteRequestAction, p22));
        }
        this.f103276e.a(p22);
    }
}
