package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.chips;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterChipsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/e;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/d;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f273457b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Object f273458c;

    /* renamed from: d, reason: collision with root package name */
    public int f273459d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f273460e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p<h, Boolean, G0> f273461f;

    /* compiled from: VerticalSearchFilterChipsItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "selected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<h, Boolean, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(h hVar, Boolean bool) {
            Y41.l<? super Integer, G0> lVar;
            h hVar2 = hVar;
            boolean zBooleanValue = bool.booleanValue();
            e eVar = e.this;
            int i12 = 0;
            for (Object obj : (Iterable) eVar.f273458c) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                if (L.f((String) obj, hVar2.getF262141c()) && zBooleanValue && (lVar = eVar.f273460e) != null) {
                    ((b) lVar).invoke(Integer.valueOf(i12));
                }
                i12 = i13;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalSearchFilterChipsItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f273463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Integer, G0> lVar) {
            super(1);
            this.f273463l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f273463l.invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public e(@k View view) {
        super(view);
        this.f273457b = (Chips) view;
        this.f273458c = C42784z0.f406748b;
        this.f273461f = new a();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void A8(@l Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            Chips chips = this.f273457b;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(chips.getContext(), R.style.Theme_DesignSystem_Re23);
            int iJ2 = C35835l0.j(iIntValue, contextThemeWrapper);
            g.f178794f.getClass();
            chips.setStyle(g.b.c(iJ2, contextThemeWrapper));
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void I(boolean z12) {
        this.f273457b.setEnabled(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void l0(@k Y41.l<? super Integer, G0> lVar) {
        this.f273460e = new b(lVar);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void yw(int i12, @k ArrayList arrayList) {
        if (L.f(this.f273458c, arrayList) && this.f273459d == i12) {
            return;
        }
        ChipsState.DisplayType displayType = ChipsState.DisplayType.f178757c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) obj;
            arrayList2.add(new ItemChipable(str.hashCode(), null, null, null, i13 == i12, null, str, false, false, 430, null));
            i13 = i14;
        }
        this.f273457b.setState(new ChipsState(0, displayType, null, arrayList2, this.f273461f, 5, null));
        this.f273458c = arrayList;
        this.f273459d = i12;
    }
}
