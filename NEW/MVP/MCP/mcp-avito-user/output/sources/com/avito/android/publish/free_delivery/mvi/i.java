package com.avito.android.publish.free_delivery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.free_delivery.u;
import com.avito.android.publish.C0;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import he0.C40926c;
import he0.InterfaceC40924a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yc.C50213a;

/* compiled from: FreeDeliveryActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "Lhe0/a;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lhe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements com.avito.android.arch.mvi.a<InterfaceC40924a, FreeDeliveryInternalAction, C40926c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.free_delivery.domain.a f235843a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f235844b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f235845c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f235846d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f235847e;

    @Inject
    public i(@Y61.k com.avito.android.publish.free_delivery.domain.a aVar, @Y61.k C0 c02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        PriceParameter priceParameter;
        this.f235843a = aVar;
        this.f235844b = c02;
        this.f235845c = interfaceC28373a;
        this.f235846d = c50213a;
        CategoryParameters categoryParameters = c02.f231873k0;
        this.f235847e = (categoryParameters == null || (priceParameter = (PriceParameter) ((CategoryParameter) categoryParameters.getFirstParameterOfType(PriceParameter.class))) == null) ? null : priceParameter.getValue();
    }

    public static final void c(i iVar, C40926c c40926c) {
        iVar.getClass();
        if (c40926c.f397339k) {
            iVar.d(c40926c.f397330b);
            String str = iVar.f235847e;
            if (str == null) {
                str = "";
            }
            iVar.f235845c.c(new u(c40926c.f397334f, c40926c.f397335g, str, "item_add", null, iVar.f235846d.b(), 16, null));
        }
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FreeDeliveryInternalAction> b(InterfaceC40924a interfaceC40924a, C40926c c40926c) {
        InterfaceC40924a interfaceC40924a2 = interfaceC40924a;
        C40926c c40926c2 = c40926c;
        if (interfaceC40924a2 instanceof InterfaceC40924a.C11265a) {
            return C43175k.G(new a(this, interfaceC40924a2, c40926c2, null));
        }
        if (interfaceC40924a2 instanceof InterfaceC40924a.c) {
            return C43175k.G(new b(interfaceC40924a2, c40926c2, null));
        }
        if (interfaceC40924a2 instanceof InterfaceC40924a.d) {
            return C43175k.G(new c(interfaceC40924a2, c40926c2, null));
        }
        if (interfaceC40924a2 instanceof InterfaceC40924a.i) {
            return C43175k.G(new d(interfaceC40924a2, c40926c2, null));
        }
        if (interfaceC40924a2.equals(InterfaceC40924a.g.f397320a)) {
            return C43175k.G(new e(this, c40926c2, null));
        }
        if (interfaceC40924a2.equals(InterfaceC40924a.f.f397319a)) {
            return C43175k.G(new f(this, c40926c2, null));
        }
        if (interfaceC40924a2.equals(InterfaceC40924a.e.f397318a)) {
            return this.f235843a.invoke();
        }
        if (interfaceC40924a2.equals(InterfaceC40924a.b.f397315a)) {
            return C43175k.G(new g(2, null));
        }
        if (interfaceC40924a2.equals(InterfaceC40924a.h.f397321a)) {
            return C43175k.G(new h(c40926c2, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void d(int i12) {
        CategoryParameters categoryParameters = this.f235844b.f231873k0;
        ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(DeliverySubsidiesSlotKt.AMOUNT) : null;
        CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
        if (charParameter == null) {
            return;
        }
        charParameter.set_value(String.valueOf(i12));
    }
}
