package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tn.InterfaceC48693b;
import wn.C49654a;

/* compiled from: CartSnippetActionsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/cart_snippet_actions/models/ui/Stepper;", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class u extends N implements Y41.l<Map.Entry<? extends String, ? extends Stepper>, Stepper> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48693b f116246l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f116247m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC48693b interfaceC48693b, w wVar) {
        super(1);
        this.f116246l = interfaceC48693b;
        this.f116247m = wVar;
    }

    @Override // Y41.l
    public final Stepper invoke(Map.Entry<? extends String, ? extends Stepper> entry) {
        Map.Entry<? extends String, ? extends Stepper> entry2 = entry;
        String key = entry2.getKey();
        Stepper value = entry2.getValue();
        Integer num = (Integer) ((TrueCartSnippetActionsInternalAction.d) this.f116246l).f116196b.get(key);
        if (num == null) {
            return value;
        }
        if (value == null) {
            return null;
        }
        int iIntValue = num.intValue();
        this.f116247m.getClass();
        return Stepper.a(value, iIntValue, C49654a.a(iIntValue, value.f116272c), 22);
    }
}
