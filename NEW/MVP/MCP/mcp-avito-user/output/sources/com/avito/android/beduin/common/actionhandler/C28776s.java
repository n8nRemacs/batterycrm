package com.avito.android.beduin.common.actionhandler;

import Gu.C13917a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinAuthenticateAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinAuthenticateActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/s;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinAuthenticateAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28776s implements InterfaceC15523b<BeduinAuthenticateAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f100375a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100376b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f100377c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f100378d;

    @Inject
    public C28776s(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar, @Y61.k com.avito.android.account.E e12) {
        this.f100375a = aVar;
        this.f100376b = eVar;
        this.f100377c = e12;
    }

    public final void l(BeduinAuthenticateAction beduinAuthenticateAction) {
        List<BeduinAction> onSuccessActions = beduinAuthenticateAction.getOnSuccessActions();
        if (onSuccessActions != null) {
            Iterator<T> it = onSuccessActions.iterator();
            while (it.hasNext()) {
                this.f100376b.get().o((BeduinAction) it.next());
            }
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f100378d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinAuthenticateAction beduinAuthenticateAction = (BeduinAuthenticateAction) beduinAction;
        AuthenticateLink authenticateLinkA = C13917a.a(6, null, beduinAuthenticateAction.getSource());
        io.reactivex.rxjava3.internal.observers.y yVar = this.f100378d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (this.f100377c.b()) {
            l(beduinAuthenticateAction);
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f100375a;
        this.f100378d = (io.reactivex.rxjava3.internal.observers.y) aVar.d9().t0(new r(this, beduinAuthenticateAction));
        b.a.a(aVar, authenticateLinkA, null, null, 6);
    }
}
