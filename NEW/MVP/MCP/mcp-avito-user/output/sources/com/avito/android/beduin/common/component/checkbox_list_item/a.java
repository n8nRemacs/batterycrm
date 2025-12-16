package com.avito.android.beduin.common.component.checkbox_list_item;

import Ba1.B;
import Ui.InterfaceC15523b;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.checkbox_list_item.BeduinCheckboxListItemModel;
import com.avito.android.beduin.common.form.transforms.CheckboxStateTransform;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.toggle.State;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxListItemComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "Lcom/avito/android/beduin/common/component/checkbox_list_item/n;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinCheckboxListItemModel, n> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C3030a f100972k = new C3030a(null);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final List<String> f100973l = Collections.singletonList("checkboxListItem");

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinCheckboxListItemModel> f100974m = BeduinCheckboxListItemModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinCheckboxListItemModel f100975e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f100976f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f100977g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Wh.c f100978h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Yh.c f100979i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f100980j = true;

    /* compiled from: BeduinCheckboxListItemComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.checkbox_list_item.a$a, reason: collision with other inner class name */
    public static final class C3030a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3030a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinCheckboxListItemModel> S() {
            return a.f100974m;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return a.f100973l;
        }

        public C3030a() {
        }
    }

    /* compiled from: BeduinCheckboxListItemComponent.kt */
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

    public a(@Y61.k BeduinCheckboxListItemModel beduinCheckboxListItemModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k lj.e eVar, @Y61.k Wh.c cVar, @Y61.k Yh.c cVar2) {
        this.f100975e = beduinCheckboxListItemModel;
        this.f100976f = interfaceC15523b;
        this.f100977g = eVar;
        this.f100978h = cVar;
        this.f100979i = cVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100975e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        i iVar = new i(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f100975e.getTheme())));
        iVar.setId(R.id.beduin_checkbox_list_item);
        iVar.setLayoutParams(layoutParams);
        return new n(iVar, this.f100978h);
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF101478h() {
        return this.f100980j;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = (BeduinCheckboxListItemModel) beduinModel;
        CheckboxState state = beduinCheckboxListItemModel.getState();
        BeduinCheckboxListItemModel beduinCheckboxListItemModel2 = this.f100975e;
        if (!L.f(BeduinCheckboxListItemModel.copy$default(this.f100975e, null, null, null, null, null, state, null, BeduinCheckboxListItemModel.Content.copy$default(beduinCheckboxListItemModel2.getContent(), beduinCheckboxListItemModel.getContent().getChildren(), null, 2, null), null, null, null, null, 3935, null), beduinCheckboxListItemModel)) {
            return null;
        }
        return new m((CheckboxState) C28805a.a(beduinCheckboxListItemModel.getState(), beduinCheckboxListItemModel2.getState()), this.f100979i.a(beduinCheckboxListItemModel2.getContent().getChildren(), beduinCheckboxListItemModel.getContent().getChildren()));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        n nVar = (n) interfaceC40116e;
        q(nVar.f101004b, new d(this, nVar));
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        n nVar = (n) interfaceC40116e;
        if (list.isEmpty()) {
            q(nVar.f101004b, new d(this, nVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof m) {
                arrayList.add(obj);
            }
        }
        q(nVar.f101004b, new f(arrayList, nVar, this));
    }

    public final void p(CheckboxState checkboxState) {
        com.avito.android.beduin_shared.model.utils.j.a(this.f100977g, this.f100975e.getId(), new CheckboxStateTransform(checkboxState));
    }

    public final void q(i iVar, Y41.l<? super i, G0> lVar) {
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = this.f100975e;
        CheckboxTapArea checkboxTapArea = beduinCheckboxListItemModel.getCheckboxTapArea();
        if (checkboxTapArea == null) {
            checkboxTapArea = CheckboxTapArea.COMPONENT;
        }
        iVar.a(checkboxTapArea, null, beduinCheckboxListItemModel.getSelectedBackgroundColor());
        iVar.setCheckboxStateChangedListener(null);
        lVar.invoke(iVar);
        CheckboxTapArea checkboxTapArea2 = beduinCheckboxListItemModel.getCheckboxTapArea();
        if (checkboxTapArea2 == null) {
            checkboxTapArea2 = CheckboxTapArea.COMPONENT;
        }
        iVar.a(checkboxTapArea2, new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(20, this, beduinCheckboxListItemModel), beduinCheckboxListItemModel.getSelectedBackgroundColor());
        iVar.setCheckboxStateChangedListener(new B(26, this, beduinCheckboxListItemModel));
    }
}
