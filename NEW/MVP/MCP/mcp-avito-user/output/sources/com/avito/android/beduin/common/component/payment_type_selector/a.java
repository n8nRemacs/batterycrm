package com.avito.android.beduin.common.component.payment_type_selector;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.form.transforms.SelectorPaymentMethodTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinPaymentMethodSelectorComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/payment_type_selector/BeduinPaymentMethodSelectorModel;", "Lcom/avito/android/beduin/common/component/payment_type_selector/f;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinPaymentMethodSelectorModel, f> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C3054a f101803i = new C3054a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final List<String> f101804j = Collections.singletonList("paymentMethodsGroup");

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final Class<BeduinPaymentMethodSelectorModel> f101805k = BeduinPaymentMethodSelectorModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinPaymentMethodSelectorModel f101806e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f101807f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101808g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101809h = true;

    /* compiled from: BeduinPaymentMethodSelectorComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_type_selector.a$a, reason: collision with other inner class name */
    public static final class C3054a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3054a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinPaymentMethodSelectorModel> S() {
            return a.f101805k;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f101804j;
        }

        public C3054a() {
        }
    }

    /* compiled from: BeduinPaymentMethodSelectorComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BeduinPaymentMethodSelectorModel f101811m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel) {
            super(1);
            this.f101811m = beduinPaymentMethodSelectorModel;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = a.this;
            InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f101808g;
            BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel = this.f101811m;
            com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, beduinPaymentMethodSelectorModel.getOptions().get(iIntValue).getOnTapActions());
            aVar.f101807f.h(new d.h(beduinPaymentMethodSelectorModel, beduinPaymentMethodSelectorModel.apply(new SelectorPaymentMethodTransform(iIntValue))));
            return G0.f406611a;
        }
    }

    public a(@k BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel, @k lj.e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f101806e = beduinPaymentMethodSelectorModel;
        this.f101807f = eVar;
        this.f101808g = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101806e;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102125j() {
        return this.f101809h;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        return (BeduinPaymentMethodSelectorModel) beduinModel;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f101806e.getTheme())), null, 0, 6, null);
        fVar.setId(R.id.beduin_payment_method_selector);
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        u((f) view, this.f101806e);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        f fVar = (f) view;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof BeduinPaymentMethodSelectorModel) {
                obj = obj2;
            }
        }
        BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel = (BeduinPaymentMethodSelectorModel) (obj instanceof BeduinPaymentMethodSelectorModel ? obj : null);
        if (beduinPaymentMethodSelectorModel == null) {
            u(fVar, this.f101806e);
        } else {
            u(fVar, beduinPaymentMethodSelectorModel);
        }
    }

    public final void u(f fVar, BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel) {
        fVar.setItems(beduinPaymentMethodSelectorModel.getOptions());
        if (L.f(beduinPaymentMethodSelectorModel.isEnabled(), Boolean.FALSE)) {
            fVar.setOnPaymentClickListener(null);
        } else {
            fVar.setOnPaymentClickListener(new b(beduinPaymentMethodSelectorModel));
        }
        fVar.setPaddings(beduinPaymentMethodSelectorModel.getCustomPaddings());
    }
}
