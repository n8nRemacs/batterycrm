package com.avito.android.beduin.common.component.input.single_line;

import Ui.InterfaceC15523b;
import Y41.l;
import android.view.View;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.campaigns_sale.konveyor.editBlock.p;
import com.avito.android.lib.design.input.Input;
import com.avito.android.sbc.create.mvi.M0;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import kotlin.text.C43066x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f101585d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(M0 m02, Y41.a aVar) {
        this.f101583b = 2;
        this.f101585d = m02;
        this.f101584c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        Object obj = this.f101584c;
        Object obj2 = this.f101585d;
        switch (this.f101583b) {
            case 0:
                h hVar = (h) obj2;
                InterfaceC15523b<BeduinAction> interfaceC15523b = hVar.f101592f;
                SingleLineInputModel singleLineInputModel = hVar.f101593g;
                if (!z12) {
                    Input input = (Input) obj;
                    String strValueOf = String.valueOf(input.m53getText());
                    com.avito.android.beduin.common.component.input.i.b(singleLineInputModel, strValueOf, com.avito.android.beduin.common.component.input.j.b(strValueOf, input.getDeformattedText(), singleLineInputModel.getConstraints()), hVar.f101591e, true);
                    List<BeduinAction> onEndEditingActions = singleLineInputModel.getOnEndEditingActions();
                    if (onEndEditingActions != null) {
                        Iterator<T> it = onEndEditingActions.iterator();
                        while (it.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it.next());
                        }
                        break;
                    }
                } else {
                    List<BeduinAction> onFocusedActions = singleLineInputModel.getOnFocusedActions();
                    if (onFocusedActions != null) {
                        Iterator<T> it2 = onFocusedActions.iterator();
                        while (it2.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it2.next());
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (!z12) {
                    l<? super Integer, G0> lVar = ((p) obj2).f114018s;
                    if (lVar != null) {
                        lVar.invoke(C43066x.y0(((Input) obj).getDeformattedText()));
                        break;
                    }
                } else {
                    int i12 = p.f114000u;
                    break;
                }
                break;
            default:
                if (!z12) {
                    ((M0) obj2).f259411s0.accept(((N) obj).invoke());
                    break;
                } else {
                    n<Object>[] nVarArr = M0.f259331R0;
                    break;
                }
        }
    }

    public /* synthetic */ e(Object obj, Input input, int i12) {
        this.f101583b = i12;
        this.f101585d = obj;
        this.f101584c = input;
    }
}
