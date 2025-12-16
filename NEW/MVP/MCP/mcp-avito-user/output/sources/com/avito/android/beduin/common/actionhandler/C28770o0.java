package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.a;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.util.P2;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.beduin.common.actionhandler.o0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28770o0 implements InterfaceC15522a.InterfaceC1136a, a.InterfaceC3010a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f100293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f100295d;

    public /* synthetic */ C28770o0(int i12, Object obj, Object obj2) {
        this.f100293b = i12;
        this.f100294c = obj;
        this.f100295d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(P2 p22) {
        boolean z12 = p22 instanceof P2.a;
        InterfaceC15523b interfaceC15523b = (InterfaceC15523b) this.f100295d;
        if (z12) {
            List<BeduinAction> onFailActions = ((BeduinExecuteRequestAction) this.f100294c).getOnFailActions();
            if (onFailActions != null) {
                Iterator<T> it = onFailActions.iterator();
                while (it.hasNext()) {
                    interfaceC15523b.o((BeduinAction) it.next());
                }
                return;
            }
            return;
        }
        if (!(p22 instanceof P2.b)) {
            p22.equals(P2.c.f318721a);
            return;
        }
        List<BeduinAction> actions = ((BeduinActionsResponse) ((P2.b) p22).f318720a).getActions();
        if (actions != null) {
            Iterator<T> it2 = actions.iterator();
            while (it2.hasNext()) {
                interfaceC15523b.o((BeduinAction) it2.next());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0275  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.activity.result.h] */
    @Override // Ui.InterfaceC15522a.InterfaceC1136a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.fragment.app.ActivityC22955m r45) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.C28770o0.g(androidx.fragment.app.m):void");
    }
}
