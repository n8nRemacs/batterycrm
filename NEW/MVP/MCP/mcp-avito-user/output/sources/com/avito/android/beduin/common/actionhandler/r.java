package com.avito.android.beduin.common.actionhandler;

import Ju.InterfaceC14249c;
import com.avito.android.beduin.common.action.BeduinAuthenticateAction;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: BeduinAuthenticateActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28776s f100366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinAuthenticateAction f100367c;

    public r(C28776s c28776s, BeduinAuthenticateAction beduinAuthenticateAction) {
        this.f100366b = c28776s;
        this.f100367c = beduinAuthenticateAction;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (!(interfaceC14249c instanceof InterfaceC14249c.b)) {
            boolean z12 = interfaceC14249c instanceof InterfaceC14249c.a;
            return;
        }
        C28776s c28776s = this.f100366b;
        boolean zB2 = c28776s.f100377c.b();
        BeduinAuthenticateAction beduinAuthenticateAction = this.f100367c;
        if (zB2) {
            c28776s.l(beduinAuthenticateAction);
            return;
        }
        List<BeduinAction> onFailureActions = beduinAuthenticateAction.getOnFailureActions();
        if (onFailureActions != null) {
            Iterator<T> it = onFailureActions.iterator();
            while (it.hasNext()) {
                c28776s.f100376b.get().o((BeduinAction) it.next());
            }
        }
        io.reactivex.rxjava3.internal.observers.y yVar = c28776s.f100378d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
