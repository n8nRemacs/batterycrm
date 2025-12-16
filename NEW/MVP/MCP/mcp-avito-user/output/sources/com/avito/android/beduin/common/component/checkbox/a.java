package com.avito.android.beduin.common.component.checkbox;

import Ba1.B;
import Ui.InterfaceC15523b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.k;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lj.d;

/* compiled from: BeduinCheckboxComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/checkbox/BeduinCheckboxModel;", "Lcom/avito/android/lib/design/toggle/Checkbox;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinCheckboxModel, Checkbox> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C3029a f100928h = new C3029a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<String> f100929i = Collections.singletonList("checkbox");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Class<BeduinCheckboxModel> f100930j = BeduinCheckboxModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinCheckboxModel f100931e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100932f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f100933g;

    /* compiled from: BeduinCheckboxComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.checkbox.a$a, reason: collision with other inner class name */
    public static final class C3029a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3029a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinCheckboxModel> S() {
            return a.f100930j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f100929i;
        }

        public C3029a() {
        }
    }

    /* compiled from: BeduinCheckboxComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.f181147b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: BeduinCheckboxComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/toggle/Checkbox;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/toggle/Checkbox;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Checkbox, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Checkbox checkbox) {
            Checkbox checkbox2 = checkbox;
            Context context = checkbox2.getContext();
            a aVar = a.this;
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, com.avito.android.beduin.common.component.a.a(aVar.f100931e.getTheme()));
            BeduinCheckboxModel beduinCheckboxModel = aVar.f100931e;
            String style = beduinCheckboxModel.getStyle();
            if (!L.f(style, "standard") && style != null) {
                V2.f318762a.c("Contexts", "Checkbox style is not supported - ".concat(style), null);
            }
            checkbox2.setAppearance(com.avito.android.lib.util.f.s(R.attr.checkbox, dVar));
            Boolean boolIsEnabled = beduinCheckboxModel.isEnabled();
            boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
            checkbox2.setEnabled(zBooleanValue);
            checkbox2.setClickable(zBooleanValue);
            i.a(checkbox2, beduinCheckboxModel.getState());
            return G0.f406611a;
        }
    }

    public a(@k BeduinCheckboxModel beduinCheckboxModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k lj.e eVar) {
        this.f100931e = beduinCheckboxModel;
        this.f100932f = interfaceC15523b;
        this.f100933g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100931e;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinCheckboxModel beduinCheckboxModel = (BeduinCheckboxModel) beduinModel;
        if (!L.f(BeduinCheckboxModel.copy$default(this.f100931e, null, null, null, null, beduinCheckboxModel.isEnabled(), beduinCheckboxModel.getState(), null, null, 207, null), beduinCheckboxModel)) {
            return null;
        }
        g.f100939d.getClass();
        CheckboxState state = beduinCheckboxModel.getState();
        BeduinCheckboxModel beduinCheckboxModel2 = this.f100931e;
        CheckboxState checkboxState = (CheckboxState) C28805a.a(state, beduinCheckboxModel2.getState());
        k.a aVar = com.avito.android.beduin.common.component.k.f101647b;
        Boolean boolIsEnabled = beduinCheckboxModel2.isEnabled();
        Boolean boolIsEnabled2 = beduinCheckboxModel.isEnabled();
        aVar.getClass();
        g gVar = new g(checkboxState, L.f(boolIsEnabled, boolIsEnabled2) ? null : new com.avito.android.beduin.common.component.k(boolIsEnabled2));
        if (gVar.f100942c) {
            return null;
        }
        return gVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Checkbox checkbox = new Checkbox(viewGroup.getContext(), null);
        checkbox.setId(R.id.beduin_checkbox);
        checkbox.setLayoutParams(layoutParams);
        return checkbox;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        Checkbox checkbox = (Checkbox) view;
        if (list.isEmpty()) {
            q(checkbox);
            return;
        }
        com.avito.android.beduin.common.component.checkbox.b bVar = new com.avito.android.beduin.common.component.checkbox.b(list, checkbox);
        checkbox.setOnStateChangedListener(null);
        bVar.invoke(checkbox);
        checkbox.setOnStateChangedListener(new B(25, this.f100931e, this));
    }

    public final void u(CheckboxState checkboxState) {
        BeduinCheckboxModel beduinCheckboxModel = this.f100931e;
        this.f100933g.h(new d.h(beduinCheckboxModel, BeduinCheckboxModel.copy$default(beduinCheckboxModel, null, null, null, null, null, checkboxState, null, null, 223, null)));
    }

    @Override // com.avito.android.beduin.common.component.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void q(@Y61.k Checkbox checkbox) {
        BeduinCheckboxModel beduinCheckboxModel = this.f100931e;
        if (beduinCheckboxModel.isEnabled() == null) {
            Boolean bool = Boolean.TRUE;
            BeduinCheckboxModel beduinCheckboxModel2 = this.f100931e;
            this.f100933g.h(new d.h(beduinCheckboxModel2, BeduinCheckboxModel.copy$default(beduinCheckboxModel2, null, null, null, null, bool, null, null, null, 239, null)));
        }
        c cVar = new c();
        checkbox.setOnStateChangedListener(null);
        cVar.invoke(checkbox);
        checkbox.setOnStateChangedListener(new B(25, beduinCheckboxModel, this));
    }
}
