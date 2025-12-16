package com.avito.android.serp.adapter.vertical_main.featured.navigation.chips;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeaturedChipsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/i;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/chips/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f272913b;

    /* compiled from: FeaturedChipsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f272914l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f272915m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, l lVar) {
            super(1);
            this.f272914l = lVar;
            this.f272915m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.booleanValue();
            this.f272914l.invoke(Integer.valueOf(this.f272915m));
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        Chips chips = (Chips) view.findViewById(R.id.chips);
        this.f272913b = chips;
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = view.getContext();
        bVar.getClass();
        chips.setStyle(g.b.c(R.style.Re23_Chips_Small, context));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.h
    public final void Ge(@k List<? extends FeaturedNavigation> list, int i12, @k l<? super Integer, G0> lVar) {
        ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
        List<? extends FeaturedNavigation> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new ItemChipable(i13, null, null, new a(i13, lVar), i12 == i13, null, ((FeaturedNavigation) obj).getF272877b(), false, false, 422, null));
            i13 = i14;
        }
        this.f272913b.setState(new ChipsState(0, displayType, null, arrayList, null, 21, null));
    }
}
