package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import tn.InterfaceC48693b;
import tn.d;
import wn.C49654a;

/* compiled from: CartSnippetActionsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/w;", "Lcom/avito/android/arch/mvi/u;", "Ltn/b;", "Ltn/d;", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements com.avito.android.arch.mvi.u<InterfaceC48693b, tn.d> {
    @Inject
    public w() {
    }

    public static tn.d b(tn.d dVar, boolean z12, Y41.l lVar) {
        Map<String, Stepper> map = dVar.f439436e.f439440a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), lVar.invoke(obj));
        }
        return tn.d.a(dVar, false, false, null, new d.b(linkedHashMap, z12), null, false, null, 239);
    }

    @Override // com.avito.android.arch.mvi.u
    public final tn.d a(InterfaceC48693b interfaceC48693b, tn.d dVar) {
        Stepper stepper;
        InterfaceC48693b interfaceC48693b2 = interfaceC48693b;
        tn.d dVar2 = dVar;
        Stepper stepperA = null;
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.b) {
            LinkedHashMap linkedHashMap = ((TrueCartSnippetActionsInternalAction.b) interfaceC48693b2).f116195b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                CartSnippetActionsStepper cartSnippetActionsStepper = (CartSnippetActionsStepper) entry.getValue();
                if (cartSnippetActionsStepper != null) {
                    int value = cartSnippetActionsStepper.getValue();
                    Integer maxValue = cartSnippetActionsStepper.getMaxValue();
                    stepper = new Stepper(value, maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE, null, null, false, 28, null);
                } else {
                    stepper = null;
                }
                linkedHashMap2.put(key, stepper);
            }
            return tn.d.a(dVar2, false, false, null, new d.b(linkedHashMap2, false), null, false, null, 239);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.d) {
            return b(dVar2, false, new u(interfaceC48693b2, this));
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.j) {
            return b(dVar2, true, new v(interfaceC48693b2));
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.a) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(dVar2.f439436e.f439440a);
            TrueCartSnippetActionsInternalAction.a aVar = (TrueCartSnippetActionsInternalAction.a) interfaceC48693b2;
            String str = aVar.f116193b;
            Stepper stepper2 = (Stepper) linkedHashMap3.get(str);
            if (stepper2 != null) {
                int i12 = stepper2.f116272c;
                int i13 = aVar.f116194c;
                stepperA = Stepper.a(stepper2, i13, C49654a.a(i13, i12), 22);
            }
            linkedHashMap3.put(str, stepperA);
            G0 g02 = G0.f406611a;
            return tn.d.a(dVar2, false, false, null, new d.b(P0.q(linkedHashMap3), false), null, false, null, 239);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.UpdateItemsLoadingStarted) {
            return tn.d.a(dVar2, true, false, null, null, null, false, null, 254);
        }
        if (interfaceC48693b2.equals(TrueCartSnippetActionsInternalAction.l.f116203b)) {
            return tn.d.a(dVar2, false, true, null, null, null, false, null, 253);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.UpdateItemsError ? true : interfaceC48693b2.equals(TrueCartSnippetActionsInternalAction.UpdateItemsSuccess.f116191b)) {
            return tn.d.a(dVar2, false, false, null, null, null, false, null, 252);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.f) {
            return tn.d.a(dVar2, false, false, ((TrueCartSnippetActionsInternalAction.f) interfaceC48693b2).f116198b, null, null, false, null, 247);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.g) {
            return tn.d.a(dVar2, false, false, null, null, null, false, null, 251);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.e) {
            return tn.d.a(dVar2, false, false, null, null, ((TrueCartSnippetActionsInternalAction.e) interfaceC48693b2).f116197b, false, null, 223);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.i) {
            return tn.d.a(dVar2, false, false, null, null, null, ((TrueCartSnippetActionsInternalAction.i) interfaceC48693b2).f116200b, null, 191);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.h) {
            return tn.d.a(dVar2, false, false, null, null, null, false, ((TrueCartSnippetActionsInternalAction.h) interfaceC48693b2).f116199b, 127);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.k ? true : interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.c) {
            return dVar2;
        }
        throw new IllegalArgumentException("Only " + TrueCartSnippetActionsInternalAction.class.getSimpleName() + " is supported");
    }
}
