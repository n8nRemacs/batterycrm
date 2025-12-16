package com.avito.android.beduin.common.component.selector_card_group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C22829k0;
import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: BeduinSelectorCardGroupView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0013J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R?\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/n;", "Landroid/widget/LinearLayout;", "", "", "selectedIds", "Lkotlin/G0;", "setSelectedIds", "(Ljava/util/Set;)V", "Lkotlin/Function1;", "Lkotlin/S;", "name", "changedId", "b", "LY41/l;", "getOnSelectChangeListener", "()LY41/l;", "setOnSelectChangeListener", "(LY41/l;)V", "onSelectChangeListener", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102556e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super String, G0> onSelectChangeListener;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.presentation.reportGeneration.a f102558c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public ArrayList f102559d;

    /* compiled from: BeduinSelectorCardGroupView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/n$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f102560a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f102561b;

        public a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2) {
            this.f102560a = linkedHashMap;
            this.f102561b = arrayList2;
        }
    }

    /* compiled from: BeduinSelectorCardGroupView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102562a;

        static {
            int[] iArr = new int[BeduinSelectorCardGroupModel.LayoutSettings.LastRowAlignment.values().length];
            try {
                iArr[BeduinSelectorCardGroupModel.LayoutSettings.LastRowAlignment.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.LayoutSettings.LastRowAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.LayoutSettings.LastRowAlignment.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.LayoutSettings.LastRowAlignment.Stretch.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102562a = iArr;
        }
    }

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f102563l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof k);
        }
    }

    /* compiled from: BeduinSelectorCardGroupView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/sequences/m;", "invoke", "(Landroid/view/View;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, InterfaceC43030m<? extends View>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f102564l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends View> invoke(View view) {
            View view2 = view;
            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
            C22829k0 c22829k0 = viewGroup != null ? new C22829k0(viewGroup) : null;
            return c22829k0 == null ? C43033p.h() : c22829k0;
        }
    }

    /* compiled from: BeduinSelectorCardGroupView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/k;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/selector_card_group/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<k, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<String> f102565l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Set<String> set, n nVar) {
            super(1);
            this.f102565l = set;
        }

        @Override // Y41.l
        public final G0 invoke(k kVar) {
            k kVar2 = kVar;
            int i12 = n.f102556e;
            kVar2.setSelected(this.f102565l.contains(kVar2.getTag().toString()));
            return G0.f406611a;
        }
    }

    public n(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f102558c = new com.avito.android.autoteka.presentation.reportGeneration.a(this, 9);
        this.f102559d = new ArrayList();
    }

    public static void a(n nVar, LinearLayout linearLayout, Double d12, Double d13, float f12, int i12) {
        int i13 = (i12 & 1) != 0 ? -1 : 0;
        if ((i12 & 2) != 0) {
            d12 = null;
        }
        if ((i12 & 4) != 0) {
            d13 = null;
        }
        if ((i12 & 8) != 0) {
            f12 = 0.0f;
        }
        nVar.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(d12 != null ? y6.b((int) d12.doubleValue()) : -1, d13 != null ? y6.b((int) d13.doubleValue()) : -1, f12);
        View view = (View) C42745f0.o0(nVar.f102559d);
        if (view == null) {
            view = new View(linearLayout.getContext());
        }
        linearLayout.addView(view, i13, layoutParams);
    }

    public final void b(Y41.l<? super k, G0> lVar) {
        C43025h.a aVar = new C43025h.a(C43033p.i(C43033p.o(new C22829k0(this), d.f102564l), c.f102563l));
        while (aVar.hasNext()) {
            lVar.invoke(aVar.next());
        }
    }

    @Y61.l
    public final Y41.l<String, G0> getOnSelectChangeListener() {
        return this.onSelectChangeListener;
    }

    public final void setOnSelectChangeListener(@Y61.l Y41.l<? super String, G0> lVar) {
        this.onSelectChangeListener = lVar;
    }

    public final void setSelectedIds(@Y61.k Set<String> selectedIds) {
        b(new e(selectedIds, this));
    }
}
