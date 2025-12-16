package com.avito.android.beduin.common.component.selectStringParameters;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin.common.utils.x;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectStringParametersComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/b;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel;", "Lcom/avito/android/lib/design/component_container/ComponentContainer;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends h<BeduinSelectStringParametersModel, ComponentContainer> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSelectStringParametersModel f102415e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102416f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f102417g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.selectStringParameters.a f102418h = new com.avito.android.beduin.common.component.selectStringParameters.a(this, 0);

    /* compiled from: BeduinSelectStringParametersComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f102419a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102420b = Collections.singletonList("selectStringParameters");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinSelectStringParametersModel> f102421c = BeduinSelectStringParametersModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSelectStringParametersModel> S() {
            return f102421c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102420b;
        }
    }

    public b(@k BeduinSelectStringParametersModel beduinSelectStringParametersModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k lj.e eVar) {
        this.f102415e = beduinSelectStringParametersModel;
        this.f102416f = interfaceC15523b;
        this.f102417g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102415e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ComponentContainer componentContainer = (ComponentContainer) LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f102415e.f102398e))).inflate(R.layout.beduin_component_select_string_parameters, viewGroup, false);
        componentContainer.setLayoutParams(layoutParams);
        return componentContainer;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws Resources.NotFoundException {
        ComponentContainer componentContainer = (ComponentContainer) view;
        BeduinSelectStringParametersModel beduinSelectStringParametersModel = this.f102415e;
        componentContainer.setTag(beduinSelectStringParametersModel.getId());
        String str = beduinSelectStringParametersModel.f102402i;
        componentContainer.setMessage(str);
        BaseSelect baseSelect = (BaseSelect) componentContainer.findViewById(R.id.select_item);
        Context context = baseSelect.getContext();
        String str2 = beduinSelectStringParametersModel.f102399f;
        baseSelect.setAppearanceAndContent(com.avito.android.lib.util.f.c(context, str2));
        baseSelect.k(L.f(str2, "paymentCard") ? y6.b(50) : y6.b(44), baseSelect.f179335g);
        Input.t(baseSelect, beduinSelectStringParametersModel.f102401h, false, 6);
        baseSelect.setHint(beduinSelectStringParametersModel.f102403j);
        Boolean bool = beduinSelectStringParametersModel.f102406m;
        baseSelect.setClearButton(bool != null ? bool.booleanValue() : false);
        x.a(baseSelect, beduinSelectStringParametersModel.f102408o);
        Context context2 = baseSelect.getContext();
        SelectItem selectItem = beduinSelectStringParametersModel.f102404k;
        Q<Drawable, Integer> qA2 = v.a(context2, selectItem != null ? selectItem.getLocalIcon() : null, selectItem != null ? selectItem.getBase64Icon() : null);
        Drawable drawable = qA2.f406619b;
        Integer num = qA2.f406620c;
        baseSelect.setLeftIcon(drawable);
        Boolean bool2 = beduinSelectStringParametersModel.f102412s;
        if (num != null) {
            baseSelect.setLeftIconColor(num.intValue());
        } else if (!L.f(bool2, Boolean.FALSE)) {
            baseSelect.setLeftIconColor((ColorStateList) null);
        }
        List<BeduinAction> actions = selectItem != null ? selectItem.getActions() : null;
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f102416f;
        baseSelect.setLeftIconListener(actions != null ? new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(26, interfaceC15523b, actions) : null);
        Context context3 = baseSelect.getContext();
        SelectItem selectItem2 = beduinSelectStringParametersModel.f102405l;
        Q<Drawable, Integer> qA3 = v.a(context3, selectItem2 != null ? selectItem2.getLocalIcon() : null, selectItem2 != null ? selectItem2.getBase64Icon() : null);
        Drawable drawable2 = qA3.f406619b;
        Integer num2 = qA3.f406620c;
        baseSelect.setRightIcon(drawable2);
        if (num2 != null) {
            baseSelect.setRightIconColor(num2.intValue());
        } else if (!L.f(bool2, Boolean.FALSE)) {
            baseSelect.setRightIconColor((ColorStateList) null);
        }
        List<BeduinAction> actions2 = selectItem2 != null ? selectItem2.getActions() : null;
        baseSelect.setRightIconListener(actions2 != null ? new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(26, interfaceC15523b, actions2) : null);
        baseSelect.setOnClickListener(new com.avito.android.beduin.common.component.selectStringParameters.a(this, 1));
        baseSelect.setClearButtonClickListener(this.f102418h);
        View viewFindViewById = componentContainer.findViewById(R.id.select_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer2 = (ComponentContainer) viewFindViewById;
        String str3 = beduinSelectStringParametersModel.f102409p;
        if (str3 != null) {
            ComponentContainer.n(componentContainer2, str3, 2);
            Input.f179303W.getClass();
            baseSelect.setState(Input.f179305b0);
        } else {
            componentContainer2.q(str);
            Input.f179303W.getClass();
            baseSelect.setState(Input.f179304a0);
        }
        baseSelect.setEnabled(bool2 != null ? bool2.booleanValue() : true);
    }
}
