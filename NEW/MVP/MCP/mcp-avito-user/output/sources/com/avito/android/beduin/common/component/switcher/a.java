package com.avito.android.beduin.common.component.switcher;

import Au.C13079a;
import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.switcher.BeduinSwitcherModel;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSwitcherComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel;", "Lcom/avito/android/lib/design/list_item/ListItemSwitcher;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinSwitcherModel, ListItemSwitcher> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102736e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f102737f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinSwitcherModel f102738g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f102739h = true;

    /* compiled from: BeduinSwitcherComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.switcher.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3079a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Boolean f102740a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f102741b;

        public C3079a(@l Boolean bool, @l Boolean bool2) {
            this.f102740a = bool;
            this.f102741b = bool2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3079a)) {
                return false;
            }
            C3079a c3079a = (C3079a) obj;
            return L.f(this.f102740a, c3079a.f102740a) && L.f(this.f102741b, c3079a.f102741b);
        }

        public final int hashCode() {
            Boolean bool = this.f102740a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f102741b;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Payload(isEnabled=");
            sb2.append(this.f102740a);
            sb2.append(", isSwitchOn=");
            return C0.g(sb2, this.f102741b, ')');
        }
    }

    /* compiled from: BeduinSwitcherComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102742a;

        static {
            int[] iArr = new int[BeduinSwitcherModel.Style.values().length];
            try {
                iArr[BeduinSwitcherModel.Style.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102742a = iArr;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k lj.e eVar, @k BeduinSwitcherModel beduinSwitcherModel) {
        this.f102736e = interfaceC15523b;
        this.f102737f = eVar;
        this.f102738g = beduinSwitcherModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102738g;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102604m() {
        return this.f102739h;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinSwitcherModel beduinSwitcherModel = (BeduinSwitcherModel) beduinModel;
        Boolean boolIsEnabled = beduinSwitcherModel.isEnabled();
        boolean zIsSwitchOn = beduinSwitcherModel.isSwitchOn();
        BeduinSwitcherModel beduinSwitcherModel2 = this.f102738g;
        Boolean bool = boolIsEnabled != null ? (Boolean) C28805a.a(boolIsEnabled, beduinSwitcherModel2.isEnabled()) : null;
        Boolean bool2 = (Boolean) C28805a.a(Boolean.valueOf(zIsSwitchOn), Boolean.valueOf(beduinSwitcherModel2.isSwitchOn()));
        C3079a c3079a = new C3079a(bool, bool2);
        Boolean bool3 = bool;
        if (L.f(BeduinSwitcherModel.copy$default(this.f102738g, null, null, null, null, null, null, boolIsEnabled, zIsSwitchOn, null, null, null, null, null, null, 16191, null), beduinSwitcherModel)) {
            return (bool3 == null && bool2 == null) ? null : c3079a;
        }
        return null;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ListItemSwitcher listItemSwitcher = new ListItemSwitcher(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f102738g.getTheme())), null);
        listItemSwitcher.setId(View.generateViewId());
        listItemSwitcher.setLayoutParams(layoutParams);
        return listItemSwitcher;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view;
        com.avito.android.beduin.common.component.switcher.b bVar = new com.avito.android.beduin.common.component.switcher.b(this);
        listItemSwitcher.i();
        bVar.invoke(listItemSwitcher);
        listItemSwitcher.e(new C13079a(this, 1));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C3079a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = new c((C3079a) it.next());
            listItemSwitcher.i();
            cVar.invoke(listItemSwitcher);
            listItemSwitcher.e(new C13079a(this, 1));
        }
    }
}
