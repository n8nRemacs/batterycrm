package com.avito.android.beduin.common.component.item_color_picker;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.item_color_picker.BeduinItemColorPickerModel;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.j;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import com.avito.android.lib.design.item_color_picker.SelectStrategy;
import com.avito.android.remote.model.UniversalColor;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BeduinItemColorPickerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinItemColorPickerModel, ItemColorPicker> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101619e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinItemColorPickerModel f101620f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f101621g;

    /* compiled from: BeduinItemColorPickerComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/a$a;", "Lcom/avito/android/lib/design/item_color_picker/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.item_color_picker.a$a, reason: collision with other inner class name */
    public static final class C3044a implements com.avito.android.lib.design.item_color_picker.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f101622a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinItemColorPickerModel.ItemColorPickerOption f101623b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalColor f101624c;

        public C3044a(@k Context context, @k BeduinItemColorPickerModel.ItemColorPickerOption itemColorPickerOption, @l UniversalColor universalColor) {
            this.f101622a = context;
            this.f101623b = itemColorPickerOption;
            this.f101624c = universalColor;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        @l
        @InterfaceC42156l
        public final Integer a() {
            BeduinItemColorPickerModel.ItemColorPickerOption itemColorPickerOption = this.f101623b;
            UniversalColor strikethroughColor = itemColorPickerOption.getStrikethroughColor();
            if ((strikethroughColor != null ? strikethroughColor.getColor() : null) != null) {
                return Integer.valueOf(C48063a.f437606a.a(this.f101622a, itemColorPickerOption.getStrikethroughColor()));
            }
            return null;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        public final boolean b(@k Object obj) {
            return (obj instanceof C3044a) && L.f(((C3044a) obj).f101623b.getId(), this.f101623b.getId());
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        @l
        @InterfaceC42156l
        public final Integer c() {
            BeduinItemColorPickerModel.ItemColorPickerOption itemColorPickerOption = this.f101623b;
            if (itemColorPickerOption.getOptionColor().getColor() != null) {
                return Integer.valueOf(C48063a.f437606a.a(this.f101622a, itemColorPickerOption.getOptionColor()));
            }
            return null;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        @k
        public final Map<Float, Integer> d() {
            List<BeduinItemColorPickerModel.Color> listC;
            BeduinItemColorPickerModel.GradientColor gradientColor = this.f101623b.getGradientColor();
            if (gradientColor == null || (listC = gradientColor.c()) == null) {
                return P0.c();
            }
            List<BeduinItemColorPickerModel.Color> list = listC;
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (BeduinItemColorPickerModel.Color color : list) {
                linkedHashMap.put(Float.valueOf(color.getPosition()), Integer.valueOf(C48063a.f437606a.a(this.f101622a, color.getColor())));
            }
            return linkedHashMap;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        @l
        @InterfaceC42156l
        public final Integer e() {
            UniversalColor universalColor = this.f101624c;
            if ((universalColor != null ? universalColor.getColor() : null) != null) {
                return Integer.valueOf(C48063a.f437606a.a(this.f101622a, universalColor));
            }
            return null;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        @l
        @InterfaceC42156l
        public final Integer getStrokeColor() {
            BeduinItemColorPickerModel.ItemColorPickerOption itemColorPickerOption = this.f101623b;
            UniversalColor strokeColor = itemColorPickerOption.getStrokeColor();
            if ((strokeColor != null ? strokeColor.getColor() : null) != null) {
                return Integer.valueOf(C48063a.f437606a.a(this.f101622a, itemColorPickerOption.getStrokeColor()));
            }
            return null;
        }

        @Override // com.avito.android.lib.design.item_color_picker.a
        public final boolean isEnabled() {
            Boolean isEnabled = this.f101623b.getIsEnabled();
            if (isEnabled != null) {
                return isEnabled.booleanValue();
            }
            return true;
        }
    }

    /* compiled from: BeduinItemColorPickerComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/a$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f101625a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101626b = Collections.singletonList("itemColorPicker");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinItemColorPickerModel> f101627c = BeduinItemColorPickerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinItemColorPickerModel> S() {
            return f101627c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101626b;
        }
    }

    /* compiled from: BeduinItemColorPickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101628a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101629b;

        static {
            int[] iArr = new int[BeduinItemColorPickerModel.ItemColorSelectionType.values().length];
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.SINGLE_OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101628a = iArr;
            int[] iArr2 = new int[BeduinItemColorPickerModel.ItemColorDisplayType.values().length];
            try {
                iArr2[BeduinItemColorPickerModel.ItemColorDisplayType.SINGLE_LINE_SCROLLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BeduinItemColorPickerModel.ItemColorDisplayType.MULTILINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f101629b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinItemColorPickerModel beduinItemColorPickerModel, @k lj.e eVar) {
        this.f101619e = interfaceC15523b;
        this.f101620f = beduinItemColorPickerModel;
        this.f101621g = eVar;
    }

    public static final void u(a aVar, com.avito.android.lib.design.item_color_picker.a aVar2, ItemColorPicker itemColorPicker, boolean z12) {
        InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f101619e;
        BeduinItemColorPickerModel beduinItemColorPickerModel = aVar.f101620f;
        if (z12) {
            C28806b.a(interfaceC15523b, beduinItemColorPickerModel.d());
        }
        List<BeduinAction> listD = ((C3044a) aVar2).f101623b.d();
        if (listD != null) {
            C28806b.a(interfaceC15523b, listD);
        }
        List<com.avito.android.lib.design.item_color_picker.a> listJ = itemColorPicker.j();
        ArrayList arrayList = new ArrayList(C42745f0.q(listJ, 10));
        Iterator it = ((ArrayList) listJ).iterator();
        while (it.hasNext()) {
            arrayList.add(((C3044a) ((com.avito.android.lib.design.item_color_picker.a) it.next())).f101623b.getId());
        }
        j.a(aVar.f101621g, beduinItemColorPickerModel.getF100853b(), new SelectedIdsTransform(arrayList));
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101620f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k */
    public final boolean getF100735h() {
        return true;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinItemColorPickerModel beduinItemColorPickerModel = (BeduinItemColorPickerModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        ItemColorChange[] itemColorChangeArrValues = ItemColorChange.values();
        if (itemColorChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, ItemColorChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(itemColorChangeArrValues));
        BeduinItemColorPickerModel beduinItemColorPickerModel2 = this.f101620f;
        if (!L.f(fVar.invoke(beduinItemColorPickerModel2), fVar.invoke(beduinItemColorPickerModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ItemColorChange itemColorChange : itemColorChangeArrValues) {
            if (!L.f(itemColorChange.b().invoke(beduinItemColorPickerModel2), itemColorChange.b().invoke(beduinItemColorPickerModel))) {
                arrayList.add(itemColorChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ItemColorPicker itemColorPicker = new ItemColorPicker(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f101620f.getTheme())));
        itemColorPicker.setId(R.id.beduin_item_color);
        itemColorPicker.setLayoutParams(layoutParams);
        return itemColorPicker;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        SelectStrategy selectStrategy;
        ItemColorPicker.DisplayType displayType;
        int i12;
        ItemColorPicker itemColorPicker = (ItemColorPicker) view;
        itemColorPicker.k(this.f395324b, this.f395325c);
        BeduinItemColorPickerModel beduinItemColorPickerModel = this.f101620f;
        itemColorPicker.setEnabled(beduinItemColorPickerModel.isEnabled());
        int i13 = c.f101628a[beduinItemColorPickerModel.g().ordinal()];
        if (i13 == 1) {
            selectStrategy = SelectStrategy.f179468b;
        } else if (i13 == 2) {
            selectStrategy = SelectStrategy.f179469c;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            selectStrategy = SelectStrategy.f179470d;
        }
        itemColorPicker.setSelectStrategy(selectStrategy);
        itemColorPicker.setKeepSelected(beduinItemColorPickerModel.g() == BeduinItemColorPickerModel.ItemColorSelectionType.SINGLE);
        BeduinItemColorPickerModel.ItemColorDisplayType displayType2 = beduinItemColorPickerModel.getDisplayType();
        if (displayType2 == null || (i12 = c.f101629b[displayType2.ordinal()]) == 1) {
            displayType = ItemColorPicker.DisplayType.f179448b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            displayType = ItemColorPicker.DisplayType.f179449c;
        }
        itemColorPicker.setDisplayType(displayType);
        itemColorPicker.setError(beduinItemColorPickerModel.getErrorMessage());
        List<BeduinItemColorPickerModel.ItemColorPickerOption> options = beduinItemColorPickerModel.getOptions();
        if (options == null) {
            options = C42784z0.f406748b;
        }
        List<BeduinItemColorPickerModel.ItemColorPickerOption> list = options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3044a(itemColorPicker.getContext(), (BeduinItemColorPickerModel.ItemColorPickerOption) it.next(), beduinItemColorPickerModel.getSelectionStrokeColor()));
        }
        itemColorPicker.setData(arrayList);
        v(itemColorPicker, beduinItemColorPickerModel.e());
        itemColorPicker.setItemColorSelectedListener(new com.avito.android.beduin.common.component.item_color_picker.b(this, itemColorPicker));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        com.avito.android.beduin.common.component.item_color_picker.c cVar = new com.avito.android.beduin.common.component.item_color_picker.c(this, (ItemColorPicker) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }

    public final void v(ItemColorPicker itemColorPicker, List<String> list) {
        RecyclerView recyclerView;
        List<com.avito.android.lib.design.item_color_picker.a> listJ = itemColorPicker.j();
        ArrayList arrayList = new ArrayList(C42745f0.q(listJ, 10));
        Iterator it = ((ArrayList) listJ).iterator();
        while (it.hasNext()) {
            arrayList.add(((C3044a) ((com.avito.android.lib.design.item_color_picker.a) it.next())).f101623b.getId());
        }
        if (arrayList.equals(list)) {
            return;
        }
        ItemColorPicker.c itemColorSelectedListener = itemColorPicker.getItemColorSelectedListener();
        itemColorPicker.setItemColorSelectedListener(null);
        HashSet hashSetK0 = C42745f0.K0(list);
        BeduinItemColorPickerModel beduinItemColorPickerModel = this.f101620f;
        List<BeduinItemColorPickerModel.ItemColorPickerOption> options = beduinItemColorPickerModel.getOptions();
        if (options == null) {
            options = C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : options) {
            if (hashSetK0.contains(((BeduinItemColorPickerModel.ItemColorPickerOption) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        com.avito.android.lib.design.item_color_picker.k kVar = itemColorPicker.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        LinkedHashSet linkedHashSet = kVar.f179487i;
        List listM0 = C42745f0.M0(linkedHashSet);
        linkedHashSet.clear();
        Iterator it2 = listM0.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            recyclerView = itemColorPicker.f179439r;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it2.next()).intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(iIntValue);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C3044a(itemColorPicker.getContext(), (BeduinItemColorPickerModel.ItemColorPickerOption) it3.next(), beduinItemColorPickerModel.getSelectionStrokeColor()));
        }
        ArrayList arrayList4 = ((com.avito.android.lib.design.item_color_picker.b) recyclerView.getAdapter()).f179476f;
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            com.avito.android.lib.design.item_color_picker.a aVar = (com.avito.android.lib.design.item_color_picker.a) it4.next();
            Iterator it5 = arrayList4.iterator();
            int i12 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i12 = -1;
                    break;
                } else if (aVar.b(it5.next())) {
                    break;
                } else {
                    i12++;
                }
            }
            arrayList5.add(Integer.valueOf(i12));
        }
        com.avito.android.lib.design.item_color_picker.k kVar2 = itemColorPicker.f179440s;
        com.avito.android.lib.design.item_color_picker.k kVar3 = kVar2 != null ? kVar2 : null;
        SelectStrategy selectStrategy = kVar3.f179479a;
        if ((selectStrategy == SelectStrategy.f179468b || selectStrategy == SelectStrategy.f179470d) && arrayList5.size() > 1) {
            throw new IllegalStateException("Attempt to select more than one chip with single strategy.");
        }
        if (!arrayList5.isEmpty()) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                int iIntValue2 = ((Number) it6.next()).intValue();
                boolean zC2 = kVar3.c(iIntValue2);
                LinkedHashSet linkedHashSet2 = kVar3.f179487i;
                if (!zC2) {
                    linkedHashSet2.add(Integer.valueOf(iIntValue2));
                } else if (linkedHashSet2.size() != 1 || !kVar3.f179480b) {
                    linkedHashSet2.remove(Integer.valueOf(iIntValue2));
                }
            }
        }
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            int iIntValue3 = ((Number) it7.next()).intValue();
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(iIntValue3);
            }
        }
        itemColorPicker.setItemColorSelectedListener(itemColorSelectedListener);
    }
}
