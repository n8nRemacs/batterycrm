package com.avito.android.return_checkout.mvi;

import Wm0.c;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryReturnCheckoutReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWm0/c$a$a;", "contentState", "invoke", "(LWm0/c$a$a;)LWm0/c$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.l<c.a.C1282a, c.a.C1282a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeliveryReturnCheckoutInternalAction.ContentChanged f255355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DeliveryReturnCheckoutInternalAction.ContentChanged contentChanged) {
        super(1);
        this.f255355l = contentChanged;
    }

    @Override // Y41.l
    public final c.a.C1282a invoke(c.a.C1282a c1282a) {
        c.a.C1282a c1282a2 = c1282a;
        DeliveryReturnCheckoutInternalAction.ContentChanged contentChanged = this.f255355l;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = contentChanged.f255327b;
        return new c.a.C1282a(c1282a2.f18036a, c1282a2.f18037b, c1282a2.f18038c, c1282a2.f18039d, list, contentChanged.f255328c, contentChanged.f255329d);
    }
}
