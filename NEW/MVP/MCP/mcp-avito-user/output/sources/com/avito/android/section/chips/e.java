package com.avito.android.section.chips;

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
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionChipsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/chips/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/chips/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f264633b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f264634c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Object f264635d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Chips f264636e;

    public e(@k View view) {
        super(view);
        this.f264633b = view;
        this.f264634c = true;
        this.f264635d = C42784z0.f406748b;
        this.f264636e = (Chips) view;
    }

    @Override // com.avito.android.section.chips.c
    public final void Qp(@k l lVar, @k ArrayList arrayList) {
        this.f264635d = arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
                Chips chips = this.f264636e;
                chips.setState(new ChipsState(0, displayType, null, arrayList2, new d(this, lVar, chips, arrayList2), 1, null));
                if (this.f264634c) {
                    g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
                    Context context = chips.getContext();
                    int iJ2 = C35835l0.j(R.attr.chipsOutlinedSmall, chips.getContext());
                    bVar.getClass();
                    chips.setStyle(g.b.c(iJ2, context));
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((ItemChipable) next).f178766f) {
                            obj = next;
                            break;
                        }
                    }
                    ItemChipable itemChipable = (ItemChipable) obj;
                    if (itemChipable != null) {
                        chips.N0(itemChipable);
                    }
                    this.f264634c = false;
                    return;
                }
                return;
            }
            Object next2 = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SectionChip sectionChip = (SectionChip) next2;
            arrayList2.add(new ItemChipable(i12, null, null, null, sectionChip.f264619d, null, sectionChip.f264620e, false, false, 430, null));
            i12 = i13;
        }
    }
}
