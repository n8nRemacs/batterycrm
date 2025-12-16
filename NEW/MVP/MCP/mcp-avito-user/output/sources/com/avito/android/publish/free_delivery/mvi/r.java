package com.avito.android.publish.free_delivery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.free_delivery.z;
import com.avito.android.publish.C0;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import ge0.C40669a;
import he0.C40926c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: FreeDeliveryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lhe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements u<FreeDeliveryInternalAction, C40926c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f235865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f235866c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f235867d;

    @Inject
    public r(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C0 c02, @Y61.k C50213a c50213a) {
        this.f235865b = interfaceC28373a;
        this.f235866c = c02;
        this.f235867d = c50213a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40926c a(FreeDeliveryInternalAction freeDeliveryInternalAction, C40926c c40926c) {
        PriceParameter priceParameter;
        FreeDeliveryInternalAction freeDeliveryInternalAction2 = freeDeliveryInternalAction;
        C40926c c40926c2 = c40926c;
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Content) {
            CategoryParameters categoryParameters = this.f235866c.f231873k0;
            if (categoryParameters != null && (priceParameter = (PriceParameter) ((CategoryParameter) categoryParameters.getFirstParameterOfType(PriceParameter.class))) != null) {
                value = priceParameter.getValue();
            }
            if (value == null) {
                value = "";
            }
            FreeDeliveryInternalAction.Content content = (FreeDeliveryInternalAction.Content) freeDeliveryInternalAction2;
            C40669a c40669a = content.f235818b;
            this.f235865b.c(new z(value, c40669a.f396659h, c40669a.f396656e, c40669a.f396657f, "item_add", null, this.f235867d.b(), 32, null));
            C40669a c40669a2 = content.f235818b;
            return C40926c.a(c40926c2, c40669a2.f396659h, c40669a2.f396656e, c40669a2.f396657f, null, false, null, c40669a2, false, 3128);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Error) {
            return C40926c.a(c40926c2, 0, 0, 0, null, false, ((FreeDeliveryInternalAction.Error) freeDeliveryInternalAction2).f235819b, null, false, 3903);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Loading) {
            return C40926c.a(c40926c2, 0, 0, 0, null, true, null, null, false, 3903);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Finalize) {
            FreeDeliveryInternalAction.Finalize finalize = (FreeDeliveryInternalAction.Finalize) freeDeliveryInternalAction2;
            return C40926c.a(c40926c2, Math.min(finalize.f235823d, Math.max(finalize.f235821b, finalize.f235822c)), 0, 0, null, false, null, null, false, 3070);
        }
        boolean z12 = freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Input;
        C40669a c40669a3 = c40926c2.f397338j;
        if (z12) {
            FreeDeliveryInternalAction.Input input = (FreeDeliveryInternalAction.Input) freeDeliveryInternalAction2;
            C40926c c40926cA = C40926c.a(c40926c2, 0, 0, 0, null, false, null, null, true, 3039);
            int i12 = input.f235825b;
            if (i12 > input.f235827d) {
                return C40926c.a(c40926cA, i12, 0, 0, String.valueOf(c40669a3 != null ? c40669a3.f396661j : null), false, null, null, false, 4086);
            }
            if (i12 < input.f235826c) {
                return C40926c.a(c40926cA, i12, 0, 0, String.valueOf(c40669a3 != null ? c40669a3.f396660i : null), false, null, null, false, 4086);
            }
            return C40926c.a(c40926cA, i12, 0, 0, null, false, null, null, false, 4094);
        }
        if (!(freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Slider)) {
            return freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.ShowToast ? C40926c.a(c40926c2, 0, 0, 0, null, false, null, null, false, 2047) : c40926c2;
        }
        C40926c c40926cA2 = C40926c.a(c40926c2, 0, 0, 0, null, false, null, null, false, 4079);
        FreeDeliveryInternalAction.Slider slider = (FreeDeliveryInternalAction.Slider) freeDeliveryInternalAction2;
        int iB2 = kotlin.math.b.b(slider.f235831b);
        if (iB2 == slider.f235833d) {
            return C40926c.a(c40926cA2, iB2, 0, 0, String.valueOf(c40669a3 != null ? c40669a3.f396661j : null), false, null, null, false, 4086);
        }
        if (iB2 == slider.f235832c) {
            return C40926c.a(c40926cA2, iB2, 0, 0, String.valueOf(c40669a3 != null ? c40669a3.f396660i : null), false, null, null, false, 4086);
        }
        return C40926c.a(c40926cA2, iB2, 0, 0, null, false, null, null, false, 4094);
    }
}
