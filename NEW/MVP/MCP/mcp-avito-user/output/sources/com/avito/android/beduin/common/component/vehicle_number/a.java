package com.avito.android.beduin.common.component.vehicle_number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.InputField;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import com.avito.android.ui.view.RestrictedSelectionEditText;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ue.C49042c;

/* compiled from: BeduinVehicleNumberComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/vehicle_number/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/vehicle_number/BeduinVehicleNumberModel;", "Landroid/view/View;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinVehicleNumberModel, View> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinVehicleNumberModel f102847e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public String f102848f = "";

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public String f102849g = "";

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public MaskInfo f102850h;

    /* compiled from: BeduinVehicleNumberComponent.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/vehicle_number/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.vehicle_number.a$a, reason: collision with other inner class name */
    public static final class C3084a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3084a f102851a = new C3084a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final List<String> f102852b = Collections.singletonList("vehicleNumber");

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<BeduinVehicleNumberModel> f102853c = BeduinVehicleNumberModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinVehicleNumberModel> S() {
            return f102853c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return f102852b;
        }
    }

    /* compiled from: BeduinVehicleNumberComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f102855m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar) {
            super(1);
            this.f102855m = nVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            BeduinVehicleNumberModel beduinVehicleNumberModel = a.this.f102847e;
            beduinVehicleNumberModel.setValue(str2);
            beduinVehicleNumberModel.setErrorMessage(com.avito.android.beduin.common.component.input.j.a(com.avito.android.beduin.common.component.input.j.b(str2, null, beduinVehicleNumberModel.getConstraints())));
            String errorMessage = beduinVehicleNumberModel.getErrorMessage();
            ComponentContainer componentContainer = this.f102855m.f102867b;
            if (errorMessage == null || errorMessage.length() == 0) {
                componentContainer.q(null);
            } else {
                ComponentContainer.n(componentContainer, errorMessage, 2);
            }
            return G0.f406611a;
        }
    }

    public a(@Y61.k BeduinVehicleNumberModel beduinVehicleNumberModel) {
        this.f102847e = beduinVehicleNumberModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102847e;
    }

    @Override // com.avito.android.beduin.common.component.h
    @Y61.k
    public final View p(@Y61.k ViewGroup viewGroup, @Y61.k ViewGroup.LayoutParams layoutParams) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.beduin_vehicle_number_view, viewGroup, false);
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(@Y61.k View view) {
        n nVar = new n(view);
        BeduinVehicleNumberModel beduinVehicleNumberModel = this.f102847e;
        String errorMessage = beduinVehicleNumberModel.getErrorMessage();
        ComponentContainer componentContainer = nVar.f102867b;
        if (errorMessage == null || errorMessage.length() == 0) {
            componentContainer.q(null);
        } else {
            ComponentContainer.n(componentContainer, errorMessage, 2);
        }
        ue.d dVar = nVar.f102871f;
        RestrictedSelectionEditText restrictedSelectionEditText = nVar.f102868c;
        if (dVar != null) {
            restrictedSelectionEditText.removeTextChangedListener(dVar);
        }
        ue.e eVar = nVar.f102873h;
        InputField inputField = nVar.f102869d;
        if (eVar != null) {
            inputField.removeTextChangedListener(eVar);
        }
        List<MaskInfo> masks = beduinVehicleNumberModel.getMasks();
        if (masks == null) {
            masks = C42784z0.f406748b;
        }
        ue.d dVar2 = new ue.d(new C49042c(masks, true, new com.avito.android.beduin.common.component.vehicle_number.b(this)));
        nVar.f102871f = dVar2;
        restrictedSelectionEditText.addTextChangedListener(dVar2);
        ue.e eVar2 = new ue.e();
        nVar.f102873h = eVar2;
        inputField.addTextChangedListener(eVar2);
        b bVar = new b(nVar);
        nVar.f102872g = com.avito.android.lib.design.input.n.b(restrictedSelectionEditText, new l(new c(this, bVar)));
        nVar.f102874i = com.avito.android.lib.design.input.n.b(inputField, new m(new d(this, bVar)));
        String text = beduinVehicleNumberModel.getText();
        String separatorPattern = beduinVehicleNumberModel.getSeparatorPattern();
        if (text == null || text.length() == 0) {
            return;
        }
        Matcher matcher = Pattern.compile(separatorPattern).matcher(text);
        if (!matcher.find()) {
            restrictedSelectionEditText.setText(text);
            inputField.setText("");
        } else {
            String strGroup = matcher.group();
            restrictedSelectionEditText.setText(strGroup);
            inputField.setText(C43066x.a0(text, strGroup, "", false));
        }
    }
}
