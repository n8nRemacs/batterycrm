package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.util.C35835l0;
import com.avito.android.util.M5;
import com.avito.android.util.N5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import lV.C43685a;
import lV.C43687c;
import lV.InterfaceC43686b;

/* compiled from: VerticalFilterCheckboxView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/checkbox/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/checkbox/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f273451b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f273452c;

    /* compiled from: VerticalFilterCheckboxView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/checkbox/g$a", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListItemCompoundButton.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f273453a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Boolean, G0> lVar) {
            this.f273453a = lVar;
        }

        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            this.f273453a.invoke(Boolean.valueOf(z12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view) {
        super(view);
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) view;
        this.f273451b = listItemCheckbox;
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(view.getContext(), R.color.bg_toggle_vertical_main);
        C43687c.a aVar = C43687c.f413775i;
        Context context = view.getContext();
        int iJ2 = C35835l0.j(R.attr.listItemCheckboxDefaultMedium, view.getContext());
        aVar.getClass();
        C43687c c43687cB = C43687c.a.b(iJ2, context);
        M5 m5A = colorStateList != null ? N5.a(colorStateList) : null;
        M5 m5A2 = N5.a(ColorStateList.valueOf(androidx.core.content.d.getColor(view.getContext(), R.color.common_white)));
        int iB2 = y6.b(21);
        M5 m52 = null;
        com.avito.android.lib.design.toggle.a aVar2 = new com.avito.android.lib.design.toggle.a(Integer.valueOf(R.drawable.ic_checkbox_18), m5A2, m5A, colorStateList, m52, y6.b(0), y6.b(4), y6.b(21), iB2, y6.b(0), false, false, 3072, null);
        int iB3 = y6.b(9);
        int iB4 = y6.b(0);
        int iB5 = y6.b(2);
        C43685a.b bVar = new C43685a.b(Integer.valueOf(y6.b(6)), Integer.valueOf(y6.b(9)));
        C43685a c43685a = c43687cB.f413776a;
        n nVar = c43685a != null ? c43685a.f413759c : null;
        int iB6 = y6.b(80);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        listItemCheckbox.setStyle((InterfaceC43686b) new C43687c(new C43685a(null, null, nVar, null, null, null, iB4, iB3, y6.b(1), bVar, null, null, iB5, 0, y6.b(0), iB6, 11320, null), aVar2, null, objArr, objArr2, null, objArr3, objArr4, 252, null));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.f
    public final void Z1(boolean z12) {
        this.f273451b.setChecked(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.f
    public final void d7(@k Y41.l<? super Boolean, G0> lVar) {
        a aVar = this.f273452c;
        ListItemCheckbox listItemCheckbox = this.f273451b;
        if (aVar != null) {
            listItemCheckbox.j(aVar);
        }
        a aVar2 = new a(lVar);
        listItemCheckbox.e(aVar2);
        this.f273452c = aVar2;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        a aVar = this.f273452c;
        if (aVar != null) {
            this.f273451b.j(aVar);
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.f
    public final void setTitle(@k String str) {
        this.f273451b.setTitle(str);
    }
}
