package com.avito.android.beduin.common.component.product_comparison;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.product_comparison.items.i;
import com.avito.android.beduin.common.utils.m;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.Size;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinProductComparisonComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonModel;", "Lcom/avito/android/beduin/common/component/product_comparison/f;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinProductComparisonModel, f> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102120e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinProductComparisonModel f102121f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Th.a f102122g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final m f102123h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AbstractC35201t f102124i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f102125j = true;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f102126k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f102127l;

    /* compiled from: BeduinProductComparisonComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.product_comparison.a$a, reason: collision with other inner class name */
    public static final class C3058a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3058a f102128a = new C3058a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102129b = Collections.singletonList("productComparison");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinProductComparisonModel> f102130c = BeduinProductComparisonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinProductComparisonModel> S() {
            return f102130c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102129b;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinProductComparisonModel beduinProductComparisonModel, @k Th.a aVar, @k m mVar, @k AbstractC35201t abstractC35201t) throws BlueprintCollisionException {
        this.f102120e = interfaceC15523b;
        this.f102121f = beduinProductComparisonModel;
        this.f102122g = aVar;
        this.f102123h = mVar;
        this.f102124i = abstractC35201t;
        com.avito.android.beduin.common.component.product_comparison.items.d dVar = new com.avito.android.beduin.common.component.product_comparison.items.d(new com.avito.android.beduin.common.component.product_comparison.items.e());
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f102126k = aVarA;
        this.f102127l = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102121f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102225m() {
        return this.f102125j;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext(), viewGroup.getMeasuredWidth(), new com.avito.konveyor.adapter.d(this.f102127l, this.f102126k, null, 4, null), this.f102124i);
        fVar.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        int iB2;
        int i12;
        int iB3;
        f fVar = (f) view;
        BeduinProductComparisonModel beduinProductComparisonModel = this.f102121f;
        fVar.setTag(beduinProductComparisonModel.getF100853b());
        int iB4 = y6.b(com.avito.android.beduin.common.component.model.a.b(beduinProductComparisonModel.getPadding()));
        int iB5 = y6.b(com.avito.android.beduin.common.component.model.a.c(beduinProductComparisonModel.getPadding()));
        RecyclerView recycler = fVar.getRecycler();
        int iB6 = y6.b(com.avito.android.beduin.common.component.model.a.d(beduinProductComparisonModel.getPadding()));
        int iB7 = y6.b(com.avito.android.beduin.common.component.model.a.a(beduinProductComparisonModel.getPadding()));
        Integer interItemSpacing = beduinProductComparisonModel.getInterItemSpacing();
        recycler.setPadding(iB4, iB6, Math.max(0, iB5 - (interItemSpacing != null ? y6.b(interItemSpacing.intValue()) : 0)), iB7);
        fVar.setListener(new b(this, beduinProductComparisonModel));
        int parentWidth = (fVar.getParentWidth() - iB4) - iB5;
        Integer itemWidth = beduinProductComparisonModel.getItemWidth();
        if (itemWidth != null) {
            int iIntValue = itemWidth.intValue();
            if (iIntValue <= parentWidth) {
                parentWidth = iIntValue;
            }
            iB2 = y6.b(parentWidth);
        } else {
            Integer interItemSpacing2 = beduinProductComparisonModel.getInterItemSpacing();
            iB2 = (parentWidth - (interItemSpacing2 != null ? y6.b(interItemSpacing2.intValue()) : 0)) / 2;
        }
        int i13 = iB2;
        com.avito.android.lib.design.text_view.a textView = fVar.getTextView();
        Context context = fVar.getContext();
        BeduinProductComparisonTextItemParams titleParams = beduinProductComparisonModel.getTitleParams();
        textView.setTextAppearance(com.avito.android.lib.util.f.r(context, titleParams != null ? titleParams.getStyle() : null));
        List<BeduinProductComparisonProductItem> items = beduinProductComparisonModel.getItems();
        int i14 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((BeduinProductComparisonProductItem) it.next()).getHeader().getTitle());
        }
        com.avito.android.lib.design.text_view.a textView2 = fVar.getTextView();
        BeduinProductComparisonTextItemParams titleParams2 = beduinProductComparisonModel.getTitleParams();
        BeduinContainerIndent margin = titleParams2 != null ? titleParams2.getMargin() : null;
        ArrayList arrayListA = this.f102123h.a(beduinProductComparisonModel, "BeduinProductComparisonComponent_titles", arrayList, textView2, i13 - y6.b(com.avito.android.beduin.common.component.model.a.c(margin) + com.avito.android.beduin.common.component.model.a.b(margin)));
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Size) it2.next()).getHeight()));
        }
        com.avito.android.lib.design.text_view.a textView3 = fVar.getTextView();
        Context context2 = fVar.getContext();
        BeduinProductComparisonTextItemParams descriptionParams = beduinProductComparisonModel.getDescriptionParams();
        textView3.setTextAppearance(com.avito.android.lib.util.f.r(context2, descriptionParams != null ? descriptionParams.getStyle() : null));
        List<BeduinProductComparisonProductItem> items2 = beduinProductComparisonModel.getItems();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(items2, 10));
        Iterator<T> it3 = items2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((BeduinProductComparisonProductItem) it3.next()).getHeader().getDescription());
        }
        com.avito.android.lib.design.text_view.a textView4 = fVar.getTextView();
        BeduinProductComparisonTextItemParams descriptionParams2 = beduinProductComparisonModel.getDescriptionParams();
        BeduinContainerIndent margin2 = descriptionParams2 != null ? descriptionParams2.getMargin() : null;
        ArrayList arrayListA2 = this.f102123h.a(beduinProductComparisonModel, "BeduinProductComparisonComponent_descriptions", arrayList3, textView4, i13 - y6.b(com.avito.android.beduin.common.component.model.a.c(margin2) + com.avito.android.beduin.common.component.model.a.b(margin2)));
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayListA2, 10));
        Iterator it4 = arrayListA2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Integer.valueOf(((Size) it4.next()).getHeight()));
        }
        ArrayList arrayListT0 = C42745f0.T0(arrayList2, arrayList4);
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayListT0, 10));
        Iterator it5 = arrayListT0.iterator();
        while (it5.hasNext()) {
            Q q12 = (Q) it5.next();
            arrayList5.add(Integer.valueOf(((Number) q12.f406620c).intValue() + ((Number) q12.f406619b).intValue()));
        }
        Integer num = (Integer) C42745f0.W(arrayList5);
        int iIntValue2 = num != null ? num.intValue() : 0;
        BeduinProductComparisonTextItemParams titleParams3 = beduinProductComparisonModel.getTitleParams();
        BeduinContainerIndent margin3 = titleParams3 != null ? titleParams3.getMargin() : null;
        int iB8 = y6.b(com.avito.android.beduin.common.component.model.a.a(margin3) + com.avito.android.beduin.common.component.model.a.d(margin3)) + iIntValue2;
        BeduinProductComparisonTextItemParams descriptionParams3 = beduinProductComparisonModel.getDescriptionParams();
        BeduinContainerIndent margin4 = descriptionParams3 != null ? descriptionParams3.getMargin() : null;
        int iB9 = y6.b(com.avito.android.beduin.common.component.model.a.a(margin4) + com.avito.android.beduin.common.component.model.a.d(margin4)) + iB8;
        com.avito.android.lib.design.text_view.a textView5 = fVar.getTextView();
        Context context3 = fVar.getContext();
        BeduinProductComparisonTextItemParams propertyTitleParams = beduinProductComparisonModel.getPropertyTitleParams();
        textView5.setTextAppearance(com.avito.android.lib.util.f.r(context3, propertyTitleParams != null ? propertyTitleParams.getStyle() : null));
        List<String> propertyTitles = beduinProductComparisonModel.getPropertyTitles();
        com.avito.android.lib.design.text_view.a textView6 = fVar.getTextView();
        int parentWidth2 = fVar.getParentWidth() - (iB4 + iB5);
        BeduinProductComparisonTextItemParams propertyTitleParams2 = beduinProductComparisonModel.getPropertyTitleParams();
        BeduinContainerIndent margin5 = propertyTitleParams2 != null ? propertyTitleParams2.getMargin() : null;
        ArrayList arrayListA3 = this.f102123h.a(beduinProductComparisonModel, "BeduinProductComparisonComponent_property_titles", propertyTitles, textView6, parentWidth2 - y6.b(com.avito.android.beduin.common.component.model.a.c(margin5) + com.avito.android.beduin.common.component.model.a.b(margin5)));
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayListA3, 10));
        Iterator it6 = arrayListA3.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf(((Size) it6.next()).getHeight()));
        }
        com.avito.android.lib.design.text_view.a textView7 = fVar.getTextView();
        Context context4 = fVar.getContext();
        BeduinProductComparisonTextItemParams propertyValueParams = beduinProductComparisonModel.getPropertyValueParams();
        textView7.setTextAppearance(com.avito.android.lib.util.f.r(context4, propertyValueParams != null ? propertyValueParams.getStyle() : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = beduinProductComparisonModel.getPropertyTitles().size();
        for (int i15 = 0; i15 < size; i15++) {
            Integer numValueOf = Integer.valueOf(i15);
            List<BeduinProductComparisonProductItem> items3 = beduinProductComparisonModel.getItems();
            ArrayList arrayList7 = new ArrayList(C42745f0.q(items3, 10));
            Iterator<T> it7 = items3.iterator();
            while (it7.hasNext()) {
                String str = (String) C42745f0.K(i15, ((BeduinProductComparisonProductItem) it7.next()).getPropertyValues());
                if (str == null) {
                    str = "";
                }
                arrayList7.add(str);
            }
            linkedHashMap.put(numValueOf, arrayList7);
        }
        ArrayList arrayList8 = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            List list = (List) ((Map.Entry) it8.next()).getValue();
            com.avito.android.lib.design.text_view.a textView8 = fVar.getTextView();
            BeduinProductComparisonTextItemParams propertyValueParams2 = beduinProductComparisonModel.getPropertyValueParams();
            BeduinContainerIndent margin6 = propertyValueParams2 != null ? propertyValueParams2.getMargin() : null;
            ArrayList arrayListA4 = this.f102123h.a(this.f102121f, "BeduinProductComparisonComponent_property_values", list, textView8, i13 - y6.b(com.avito.android.beduin.common.component.model.a.c(margin6) + com.avito.android.beduin.common.component.model.a.b(margin6)));
            ArrayList arrayList9 = new ArrayList(C42745f0.q(arrayListA4, 10));
            Iterator it9 = arrayListA4.iterator();
            while (it9.hasNext()) {
                arrayList9.add(Integer.valueOf(((Size) it9.next()).getHeight()));
            }
            Integer num2 = (Integer) C42745f0.W(arrayList9);
            arrayList8.add(Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        List<BeduinProductComparisonProductItem> items4 = beduinProductComparisonModel.getItems();
        ArrayList arrayList10 = new ArrayList(C42745f0.q(items4, 10));
        Iterator it10 = items4.iterator();
        int i16 = 0;
        while (it10.hasNext()) {
            Object next = it10.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            BeduinProductComparisonProductItem beduinProductComparisonProductItem = (BeduinProductComparisonProductItem) next;
            f fVar2 = fVar;
            long j12 = i16;
            com.avito.android.beduin.common.component.product_comparison.items.a aVar = new com.avito.android.beduin.common.component.product_comparison.items.a(beduinProductComparisonProductItem.getHeader().getImage(), beduinProductComparisonModel.getImageRatio(), beduinProductComparisonModel.getImageStyle(), beduinProductComparisonProductItem.getHeader().getTitle(), beduinProductComparisonModel.getTitleParams(), beduinProductComparisonProductItem.getHeader().getDescription(), beduinProductComparisonModel.getDescriptionParams(), iB9);
            List<String> propertyValues = beduinProductComparisonProductItem.getPropertyValues();
            Iterator it11 = it10;
            ArrayList arrayList11 = new ArrayList(C42745f0.q(propertyValues, i14));
            int i18 = 0;
            for (Iterator it12 = propertyValues.iterator(); it12.hasNext(); it12 = it12) {
                Object next2 = it12.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList11.add(new i(beduinProductComparisonModel.getPropertyTitles().get(i18), beduinProductComparisonModel.getPropertyTitleParams(), ((Number) arrayList6.get(i18)).intValue(), (String) next2, beduinProductComparisonModel.getPropertyValueParams(), ((Number) arrayList8.get(i18)).intValue()));
                i18 = i19;
            }
            arrayList10.add(new com.avito.android.beduin.common.component.product_comparison.items.b(j12, i13, aVar, arrayList11));
            i16 = i17;
            it10 = it11;
            i14 = 10;
            fVar = fVar2;
        }
        f fVar3 = fVar;
        ArrayList arrayList12 = ((com.avito.android.beduin.common.component.product_comparison.items.b) C42745f0.E(arrayList10)).f102156e;
        int iB10 = y6.b(com.avito.android.beduin.common.component.model.a.d(beduinProductComparisonModel.getPadding())) + ((int) (i13 / beduinProductComparisonModel.getImageRatio())) + iB9;
        h hVar = fVar3.f102141t;
        D6.c(hVar.f102144a, Integer.valueOf(iB4), Integer.valueOf(iB10), Integer.valueOf(iB5), null, 8);
        hVar.c(hVar.f102144a, arrayList12);
        Integer interItemSpacing3 = beduinProductComparisonModel.getInterItemSpacing();
        if (interItemSpacing3 != null) {
            iB3 = y6.b(interItemSpacing3.intValue());
            i12 = 0;
        } else {
            i12 = 0;
            iB3 = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i12);
        HashMap<y, Parcelable> map = this.f102122g.f15825a;
        y.f103550a.getClass();
        fVar3.b(arrayList10, iB3, true, false, iB4, true, i13, false, numValueOf2, map.get(y.c.a(beduinProductComparisonModel)));
        j.a(fVar3, beduinProductComparisonModel.getActions(), this.f102120e);
    }
}
