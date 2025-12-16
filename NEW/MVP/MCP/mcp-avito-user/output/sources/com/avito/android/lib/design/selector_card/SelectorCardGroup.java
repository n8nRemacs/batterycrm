package com.avito.android.lib.design.selector_card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.selector_card.SelectorCardItemState;
import com.avito.android.lib.design.selector_card.SelectorCardState;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: SelectorCardGroup.kt */
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u00032\u001e&J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u000bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u00101\u001a\u00020\b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardGroup;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "Lcom/avito/android/lib/design/selector_card/g;", "factory", "setContentBinderFactory", "(Lcom/avito/android/lib/design/selector_card/g;)V", "", "Lcom/avito/android/lib/design/selector_card/r;", "newData", "setData", "(Ljava/util/List;)V", "maxSelected", "setMaxSelected", "Lcom/avito/android/lib/design/selector_card/SelectorCardSelectStrategy;", "selectStrategy", "setSelectStrategy", "(Lcom/avito/android/lib/design/selector_card/SelectorCardSelectStrategy;)V", "childSpacing", "setChildSpacing", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "b", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "getSelectedListener", "()Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "setSelectedListener", "(Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;)V", "selectedListener", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$a;", "c", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$a;", "getReselectedListener", "()Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$a;", "setReselectedListener", "(Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$a;)V", "reselectedListener", "l", "I", "getGridSpanCount", "()I", "gridSpanCount", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectorCardGroup extends FrameLayout implements InterfaceC46971a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f180344n = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public c selectedListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public a reselectedListener;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super Integer, Boolean> f180347d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f180348e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public e f180349f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public v f180350g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public h f180351h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SelectorCardOrientation f180352i;

    /* renamed from: j, reason: collision with root package name */
    public int f180353j;

    /* renamed from: k, reason: collision with root package name */
    public int f180354k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int gridSpanCount;

    /* renamed from: m, reason: collision with root package name */
    public int f180356m;

    /* compiled from: SelectorCardGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k r rVar);
    }

    /* compiled from: SelectorCardGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: SelectorCardGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@Y61.k r rVar);

        void b(@Y61.k r rVar);
    }

    @X41.j
    public SelectorCardGroup(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void c(SelectorCardGroup selectorCardGroup, r rVar) {
        ArrayList arrayList;
        e eVar = selectorCardGroup.f180349f;
        if (eVar == null || (arrayList = eVar.f180411o) == null) {
            return;
        }
        Iterator it = q.a(arrayList).iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (rVar.a((r) it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            selectorCardGroup.f180348e.A0(i12);
        }
    }

    private final int getGridSpanCount() {
        return C35835l0.p(getContext()) ? this.f180356m : this.gridSpanCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(TypedArray typedArray) {
        RecyclerView.m linearLayoutManager;
        Integer numValueOf = typedArray.hasValue(5) ? Integer.valueOf(typedArray.getDimensionPixelSize(5, 0)) : null;
        Integer numValueOf2 = typedArray.hasValue(7) ? Integer.valueOf(typedArray.getDimensionPixelSize(7, 0)) : null;
        Integer numValueOf3 = typedArray.hasValue(3) ? Integer.valueOf(typedArray.getDimensionPixelSize(3, 0)) : null;
        Integer numValueOf4 = typedArray.hasValue(4) ? Integer.valueOf(typedArray.getDimensionPixelSize(4, 0)) : null;
        int i12 = typedArray.hasValue(14) ? typedArray.getInt(14, -1) : -1;
        if (typedArray.hasValue(6)) {
            this.f180353j = typedArray.getDimensionPixelSize(6, 0) / 2;
        }
        if (typedArray.hasValue(2)) {
            this.f180354k = typedArray.getDimensionPixelSize(2, 0) / 2;
        }
        int dimensionPixelSize = typedArray.hasValue(11) ? typedArray.getDimensionPixelSize(11, 0) : 0;
        int dimensionPixelSize2 = typedArray.hasValue(18) ? typedArray.getDimensionPixelSize(18, 0) : 0;
        boolean z12 = typedArray.getBoolean(13, false);
        SelectorCardSelectStrategy selectorCardSelectStrategy = (SelectorCardSelectStrategy) SelectorCardSelectStrategy.f180368e.get(typedArray.getInt(16, 0));
        this.f180352i = (SelectorCardOrientation) SelectorCardOrientation.f180363g.get(typedArray.getInt(15, 0));
        if (typedArray.hasValue(9)) {
            this.gridSpanCount = typedArray.getInt(9, getGridSpanCount());
        }
        if (typedArray.hasValue(10)) {
            this.f180356m = typedArray.getInt(10, this.f180356m);
        }
        int resourceId = typedArray.getResourceId(1, 0);
        SelectorCardState.Indicator indicator = typedArray.hasValue(12) ? (SelectorCardState.Indicator) SelectorCardState.Indicator.f180385f.get(typedArray.getInt(12, 0)) : null;
        ColorStateList colorStateListA = typedArray.hasValue(0) ? x.a(typedArray, getContext(), 0) : null;
        Boolean boolValueOf = typedArray.hasValue(17) ? Boolean.valueOf(typedArray.getBoolean(17, true)) : null;
        int resourceId2 = typedArray.getResourceId(8, 0);
        v vVar = new v(selectorCardSelectStrategy, z12, i12, new j(2, this, SelectorCardGroup.class, "onSelected", "onSelected(IZ)V", 0), new k(2, this, SelectorCardGroup.class, "onUnselected", "onUnselected(IZ)V", 0), new l(0, this, SelectorCardGroup.class, "onMaxSelectedStateChanged", "onMaxSelectedStateChanged()V", 0), new m(1, this, SelectorCardGroup.class, "onCheckSelectCondition", "onCheckSelectCondition(I)Z", 0), new n(1, this, SelectorCardGroup.class, "onReselected", "onReselected(I)V", 0), new o(2, this, SelectorCardGroup.class, "onSelectionApproved", "onSelectionApproved(ZI)V", 0));
        this.f180350g = vVar;
        int i13 = dimensionPixelSize2;
        int i14 = dimensionPixelSize;
        this.f180349f = new e(vVar, resourceId2, resourceId, this.f180352i, numValueOf2, numValueOf, numValueOf3, numValueOf4, indicator, colorStateListA, boolValueOf);
        SelectorCardOrientation selectorCardOrientation = this.f180352i;
        SelectorCardOrientation selectorCardOrientation2 = SelectorCardOrientation.f180361e;
        RecyclerView recyclerView = this.f180348e;
        if (selectorCardOrientation == selectorCardOrientation2) {
            recyclerView.getContext();
            linearLayoutManager = new GridLayoutManager(getGridSpanCount(), this.f180352i.f180364b);
        } else {
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager(this.f180352i.f180364b, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setPadding(i14, i13, i14, i13);
        recyclerView.setAdapter(this.f180349f);
        h hVar = this.f180351h;
        if (hVar != null) {
            recyclerView.r0(hVar);
        }
        h hVar2 = new h(this.f180352i, this.f180353j, getGridSpanCount(), this.f180354k);
        recyclerView.l(hVar2, -1);
        this.f180351h = hVar2;
    }

    public final void b() {
        v vVar = this.f180350g;
        if (vVar != null) {
            LinkedHashSet linkedHashSet = vVar.f180460j;
            List listM0 = C42745f0.M0(linkedHashSet);
            linkedHashSet.clear();
            if (listM0 != null) {
                Iterator it = listM0.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    e eVar = this.f180349f;
                    if (eVar != null) {
                        eVar.notifyItemChanged(iIntValue, Boolean.TRUE);
                    }
                }
            }
        }
    }

    public final void d(@Y61.k r rVar, boolean z12) {
        ArrayList arrayList;
        e eVar = this.f180349f;
        if (eVar == null || (arrayList = eVar.f180411o) == null) {
            return;
        }
        Iterator it = q.a(arrayList).iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (rVar.a((r) it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        v vVar = this.f180350g;
        if (vVar != null) {
            boolean zA2 = vVar.a(i12);
            Y41.p<Integer, Boolean, G0> pVar = vVar.f180454d;
            LinkedHashSet linkedHashSet = vVar.f180460j;
            Y41.a<G0> aVar = vVar.f180455e;
            if (!zA2) {
                if (vVar.f180451a == SelectorCardSelectStrategy.f180365b) {
                    Integer num = (Integer) C42745f0.F(linkedHashSet);
                    if (num != null) {
                        ((k) pVar).invoke(Integer.valueOf(num.intValue()), Boolean.valueOf(z12));
                    }
                    linkedHashSet.clear();
                }
                ((m) vVar.f180456f).invoke(Integer.valueOf(i12));
                ((o) vVar.f180458h).invoke(Boolean.TRUE, Integer.valueOf(i12));
                linkedHashSet.add(Integer.valueOf(i12));
                ((j) vVar.f180453c).invoke(Integer.valueOf(i12), Boolean.valueOf(z12));
                if (linkedHashSet.size() == vVar.f180459i) {
                    ((l) aVar).invoke();
                }
            } else if (linkedHashSet.size() == 1 && vVar.f180452b) {
                ((n) vVar.f180457g).invoke(Integer.valueOf(i12));
            } else {
                if (linkedHashSet.size() == vVar.f180459i) {
                    ((l) aVar).invoke();
                }
                linkedHashSet.remove(Integer.valueOf(i12));
                ((k) pVar).invoke(Integer.valueOf(i12), Boolean.valueOf(z12));
            }
        }
        e eVar2 = this.f180349f;
        if (eVar2 != null) {
            eVar2.notifyItemChanged(i12, Boolean.TRUE);
        }
    }

    public final void e(@Y61.k Collection<? extends r> collection) {
        e eVar = this.f180349f;
        if (eVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(collection, 10));
        for (r rVar : collection) {
            Iterator it = q.a(eVar.f180411o).iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (rVar.a((r) it.next())) {
                    break;
                } else {
                    i12++;
                }
            }
            arrayList.add(Integer.valueOf(i12));
        }
        v vVar = this.f180350g;
        if (vVar != null) {
            if (vVar.f180451a == SelectorCardSelectStrategy.f180365b && arrayList.size() > 1) {
                throw new IllegalStateException("Attempt to select more than one selector card with single strategy.");
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    boolean zA2 = vVar.a(iIntValue);
                    LinkedHashSet linkedHashSet = vVar.f180460j;
                    if (!zA2) {
                        linkedHashSet.add(Integer.valueOf(iIntValue));
                    } else if (linkedHashSet.size() != 1 || !vVar.f180452b) {
                        linkedHashSet.remove(Integer.valueOf(iIntValue));
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            eVar.notifyItemChanged(((Number) it3.next()).intValue(), Boolean.TRUE);
        }
    }

    public final void f(@Y61.k SelectorCardItemState selectorCardItemState) {
        e eVar = this.f180349f;
        if (eVar == null) {
            return;
        }
        ArrayList arrayList = eVar.f180411o;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new s(((s) it.next()).f180422a, selectorCardItemState));
        }
        ArrayList arrayList3 = eVar.f180410n;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        eVar.notifyDataSetChanged();
    }

    @Y61.l
    public final a getReselectedListener() {
        return this.reselectedListener;
    }

    @Y61.l
    public final c getSelectedListener() {
        return this.selectedListener;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179005y0);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setChildSpacing(int childSpacing) {
        this.f180353j = childSpacing / 2;
        h hVar = this.f180351h;
        RecyclerView recyclerView = this.f180348e;
        if (hVar != null) {
            recyclerView.r0(hVar);
        }
        h hVar2 = new h(this.f180352i, this.f180353j, getGridSpanCount(), this.f180354k);
        recyclerView.l(hVar2, -1);
        this.f180351h = hVar2;
    }

    public final void setContentBinderFactory(@Y61.k g factory) {
        e eVar = this.f180349f;
        if (eVar == null) {
            return;
        }
        eVar.f180412p = factory;
    }

    public final void setData(@Y61.k List<? extends r> newData) {
        List<? extends r> list = newData;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((r) it.next(), SelectorCardItemState.Normal.f180358b));
        }
        e eVar = this.f180349f;
        if (eVar != null) {
            ArrayList arrayList2 = eVar.f180410n;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            eVar.notifyDataSetChanged();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        RecyclerView.Adapter adapter = this.f180348e.getAdapter();
        e eVar = adapter instanceof e ? (e) adapter : null;
        if (eVar == null) {
            return;
        }
        eVar.f180413q = enabled;
    }

    public final void setMaxSelected(int maxSelected) {
        v vVar = this.f180350g;
        if (vVar == null) {
            return;
        }
        vVar.f180459i = maxSelected;
        if (maxSelected != -1) {
            LinkedHashSet linkedHashSet = vVar.f180460j;
            int size = linkedHashSet.size();
            int i12 = vVar.f180459i;
            if (size > i12) {
                int size2 = linkedHashSet.size();
                while (i12 < size2) {
                    linkedHashSet.remove(Integer.valueOf(i12));
                    i12++;
                }
            }
        }
        ((l) vVar.f180455e).invoke();
    }

    public final void setReselectedListener(@Y61.l a aVar) {
        this.reselectedListener = aVar;
    }

    public final void setSelectStrategy(@Y61.k SelectorCardSelectStrategy selectStrategy) {
        v vVar = this.f180350g;
        if (vVar == null) {
            return;
        }
        vVar.f180451a = selectStrategy;
    }

    public final void setSelectedListener(@Y61.l c cVar) {
        this.selectedListener = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectorCardGroup(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.selectorCardGroup : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_SelectorCardGroup : i13;
        super(context, attributeSet, i12);
        this.f180347d = p.f180421l;
        this.f180352i = SelectorCardOrientation.f180359c;
        this.gridSpanCount = 2;
        this.f180356m = 4;
        LayoutInflater.from(context).inflate(R.layout.selector_card_group_layout, (ViewGroup) this, true);
        this.f180348e = (RecyclerView) findViewById(R.id.selector_card_group_list);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f179005y0, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
