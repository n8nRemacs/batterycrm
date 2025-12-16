package com.avito.android.beduin.common.component.select_address;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.utils.x;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSelectAddressComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/select_address/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/select_address/BeduinSelectAddressModel;", "Lcom/avito/android/lib/design/component_container/ComponentContainer;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinSelectAddressModel, ComponentContainer> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSelectAddressModel f102425e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102426f;

    /* compiled from: BeduinSelectAddressComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_address/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.select_address.a$a, reason: collision with other inner class name */
    public static final class C3067a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3067a f102427a = new C3067a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102428b = Collections.singletonList("selectAddress");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinSelectAddressModel> f102429c = BeduinSelectAddressModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSelectAddressModel> S() {
            return f102429c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102428b;
        }
    }

    public a(@k BeduinSelectAddressModel beduinSelectAddressModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f102425e = beduinSelectAddressModel;
        this.f102426f = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102425e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ComponentContainer componentContainer = (ComponentContainer) C0.b(viewGroup, R.layout.beduin_component_select_string_parameters, viewGroup, false);
        componentContainer.setLayoutParams(layoutParams);
        return componentContainer;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        ComponentContainer componentContainer = (ComponentContainer) view;
        BeduinSelectAddressModel beduinSelectAddressModel = this.f102425e;
        componentContainer.setMessage(beduinSelectAddressModel.getDetails());
        Input input = (Input) componentContainer.findViewById(R.id.select_item);
        input.k(L.f(beduinSelectAddressModel.getStyle(), "paymentCard") ? y6.b(50) : y6.b(44), input.f179335g);
        Input.t(input, beduinSelectAddressModel.getAddress(), false, 6);
        input.setHint(beduinSelectAddressModel.getPlaceholder());
        Boolean showClearButton = beduinSelectAddressModel.getShowClearButton();
        input.setClearButton(showClearButton != null ? showClearButton.booleanValue() : false);
        x.a(input, beduinSelectAddressModel.getMaximumLinesNumber());
        input.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 7));
    }
}
