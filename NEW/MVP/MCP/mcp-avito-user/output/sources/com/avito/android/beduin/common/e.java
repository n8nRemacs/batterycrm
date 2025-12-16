package com.avito.android.beduin.common;

import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.actionhandler.C28770o0;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pj.InterfaceC47100c;

/* compiled from: BeduinExecuteRequestHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47100c f103305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinExecuteRequestAction f103306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f103307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C28770o0 f103308e;

    public e(a aVar, BeduinExecuteRequestAction beduinExecuteRequestAction, C28770o0 c28770o0, InterfaceC47100c interfaceC47100c) {
        this.f103305b = interfaceC47100c;
        this.f103306c = beduinExecuteRequestAction;
        this.f103307d = aVar;
        this.f103308e = c28770o0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        BeduinExecuteRequestAction beduinExecuteRequestAction = this.f103306c;
        InterfaceC47100c interfaceC47100c = this.f103305b;
        if (interfaceC47100c != null) {
            interfaceC47100c.J(beduinExecuteRequestAction.getContentTypeOrDefault(), new J.a(th2));
        }
        a aVar = this.f103307d;
        P2.a aVar2 = new P2.a(aVar.f99955e.a(th2));
        if (!L.f(beduinExecuteRequestAction.getShowErrorAlertOnFail(), Boolean.FALSE)) {
            aVar.f99961k.accept(new Ui.f(beduinExecuteRequestAction, aVar2));
        }
        this.f103308e.a(aVar2);
    }
}
