package com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabsWithWidgetsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/g;", "a", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f154951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Chips f154952d;

    /* compiled from: TabsWithWidgetsItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/h$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WidgetTab f154953b;

        public a(@k WidgetTab widgetTab) {
            this.f154953b = widgetTab;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return L.f(this.f154953b, aVar != null ? aVar.f154953b : null);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f154953b.f154939b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    public h(@k View view) {
        super(view);
        this.f154950b = view;
        View viewFindViewById = view.findViewById(R.id.extended_profile_tabs_with_widgets_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154951c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_tabs_with_widgets_item_chips);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f154952d = (Chips) viewFindViewById2;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.g
    public final void Hr(@k TabsWithWidgetsItem tabsWithWidgetsItem) {
        String str;
        List<WidgetTab> list = tabsWithWidgetsItem.f154936e;
        boolean z12 = tabsWithWidgetsItem.f154938g;
        if (z12) {
            str = tabsWithWidgetsItem.f154935d;
        } else {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((WidgetTab) C42745f0.E(list)).f154939b;
        }
        TextView textView = this.f154951c;
        I5.a(textView, str, false);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, z12 ? textView.getResources().getDimensionPixelSize(R.dimen.extended_profile_widget_title_bottom_margin) : 0);
        textView.setLayoutParams(marginLayoutParams);
        Chips chips = this.f154952d;
        if (z12) {
            List<WidgetTab> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new a((WidgetTab) it.next()));
            }
            chips.setData(arrayList);
            chips.p(tabsWithWidgetsItem.f154937f, false);
        }
        D6.G(chips, z12);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.g
    public final void N1(@k Y41.l<? super Integer, G0> lVar) {
        this.f154952d.setChipsSelectedListener(new b(lVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154952d.setChipsSelectedListener(null);
    }

    /* compiled from: TabsWithWidgetsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/h$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f154955b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Integer, G0> lVar) {
            this.f154955b = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            h hVar2 = h.this;
            Integer num = (Integer) C42745f0.G(hVar2.f154952d.n());
            if (num != null) {
                int iIntValue = num.intValue();
                hVar2.f154952d.o(hVar, false);
                ((d) this.f154955b).invoke(Integer.valueOf(iIntValue));
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
