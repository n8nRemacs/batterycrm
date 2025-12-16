package com.avito.android.beduin.common.component.real_estate_filter;

import Ph.InterfaceC14784a;
import Ui.InterfaceC15523b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.action.BeduinRealEstateFilterReloadAction;
import com.avito.android.beduin.common.component.real_estate_filter.s;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/d;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/real_estate_filter/BeduinRealEstateFilterModel;", "Lcom/avito/android/beduin/common/component/real_estate_filter/B;", "Lcom/avito/android/beduin/common/component/real_estate_filter/s$a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.component.real_estate_filter.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28803d extends com.avito.android.beduin.common.component.h<BeduinRealEstateFilterModel, B> implements s.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102289e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BeduinRealEstateFilterModel f102290f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f102291g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14784a f102292h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C28800a f102293i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f102294j = true;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public RealEstateFilterState f102295k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public s f102296l;

    /* compiled from: BeduinRealEstateFilterComponent.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/d$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.real_estate_filter.d$a */
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f102297a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final List<String> f102298b = Collections.singletonList("realEstateFilter");

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<BeduinRealEstateFilterModel> f102299c = BeduinRealEstateFilterModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinRealEstateFilterModel> S() {
            return f102299c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return f102298b;
        }
    }

    public C28803d(@Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k BeduinRealEstateFilterModel beduinRealEstateFilterModel, @Y61.k lj.e eVar, @Y61.k InterfaceC14784a interfaceC14784a) {
        this.f102289e = interfaceC15523b;
        this.f102290f = beduinRealEstateFilterModel;
        this.f102291g = eVar;
        this.f102292h = interfaceC14784a;
        this.f102293i = new C28800a(beduinRealEstateFilterModel, interfaceC15523b);
        this.f102295k = beduinRealEstateFilterModel.getFilterState();
    }

    public static RealEstateLocation u(BeduinRealEstateFilterModel beduinRealEstateFilterModel) {
        Object next;
        List<RealEstateLocation> locations = beduinRealEstateFilterModel.getFilters().getLocations();
        if (locations == null) {
            locations = C42784z0.f406748b;
        }
        Iterator<T> it = locations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((RealEstateLocation) next).getId(), beduinRealEstateFilterModel.getFilterState().getLocationId())) {
                break;
            }
        }
        return (RealEstateLocation) next;
    }

    public static void w(Context context, String str, String str2, ArrayList arrayList, boolean z12, Drawable drawable, Y41.a aVar, Y41.l lVar) {
        com.avito.android.beduin.common.component.real_estate_filter.dialog.a aVar2 = new com.avito.android.beduin.common.component.real_estate_filter.dialog.a(context, str, str2, arrayList, z12 ? context.getString(R.string.design_clear_description) : null, lVar);
        com.avito.android.lib.design.bottom_sheet.d dVar = aVar2.f102306g;
        if (aVar != null) {
            dVar.setOnDismissListener(new com.avito.android.advert_item_actions.view.d(1, new h(aVar)));
        }
        boolean z13 = z12 && str2 != null;
        TextView textView = (TextView) dVar.findViewById(R.id.bottom_sheet_action_button);
        if (textView != null) {
            textView.setEnabled(z13);
        }
        aVar2.a(new i(lVar, aVar2));
        if (drawable != null) {
            dVar.z(C35835l0.m(context, R.attr.ic_arrowBack24, R.attr.black));
        }
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102290f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102739h() {
        return this.f102294j;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        B b12 = new B(new androidx.appcompat.view.d(viewGroup.getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 6, null);
        b12.setId(View.generateViewId());
        b12.setLayoutParams(layoutParams);
        b12.setPadding(this.f395324b, b12.getPaddingTop(), this.f395325c - y6.b(8), b12.getPaddingBottom());
        return b12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.real_estate_filter.C28803d.q(android.view.View):void");
    }

    public final void v(@Y61.k BeduinRealEstateFilterModel beduinRealEstateFilterModel) {
        List<BeduinAction> onLoadingActions = beduinRealEstateFilterModel.getRequest().getOnLoadingActions();
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f102289e;
        if (onLoadingActions != null) {
            Iterator<T> it = onLoadingActions.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
        }
        interfaceC15523b.o(new BeduinRealEstateFilterReloadAction(null, null, beduinRealEstateFilterModel.getFilterState(), beduinRealEstateFilterModel.getRequest()));
    }

    public final void x(Context context, String str, String str2, ArrayList arrayList, Y41.l lVar, boolean z12) {
        s sVar = this.f102296l;
        if (sVar != null) {
            sVar.f102339d.dismiss();
        }
        this.f102296l = null;
        w(context, str, str2, arrayList, z12, C35835l0.m(context, R.attr.ic_arrowBack24, R.attr.black), new j(this, context), new k(lVar));
    }

    public final void y(RealEstateFilterState realEstateFilterState) {
        this.f102295k = realEstateFilterState;
        this.f102293i.b(realEstateFilterState);
    }
}
