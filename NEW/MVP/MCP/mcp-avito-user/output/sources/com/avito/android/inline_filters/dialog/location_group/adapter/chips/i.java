package com.avito.android.inline_filters.dialog.location_group.adapter.chips;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterItemChipsView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/i;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/h;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e, h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f171735b;

    public i(@k View view) {
        super(view);
        Chips chips = (Chips) view;
        this.f171735b = chips;
        chips.setSelectStrategy(SelectStrategy.f178716b);
        chips.setKeepSelected(true);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.chips.h
    public final void S00(boolean z12) {
        this.f171735b.setTitleEnabled(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.chips.h
    public final void jc(@k l<? super String, G0> lVar) {
        this.f171735b.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.chips.h
    public final void qx(@Y61.l String str, @k ArrayList arrayList) {
        Object next;
        Chips chips = this.f171735b;
        chips.setData(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((com.avito.android.inline_filters.dialog.location_group.adapter.chips.a) next).f171725b, str)) {
                    break;
                }
            }
        }
        com.avito.android.inline_filters.dialog.location_group.adapter.chips.a aVar = (com.avito.android.inline_filters.dialog.location_group.adapter.chips.a) next;
        if (aVar != null) {
            Chips.c chipsSelectedListener = chips.getChipsSelectedListener();
            chips.setChipsSelectedListener(null);
            chips.q(aVar, true);
            chips.o(aVar, false);
            chips.setChipsSelectedListener(chipsSelectedListener);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.chips.h
    public final void setTitle(@Y61.l String str) {
        this.f171735b.setTitle(str);
    }

    /* compiled from: GroupFilterItemChipsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/inline_filters/dialog/location_group/adapter/chips/i$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f171736a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            this.f171736a = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof com.avito.android.inline_filters.dialog.location_group.adapter.chips.a) {
                this.f171736a.invoke(((com.avito.android.inline_filters.dialog.location_group.adapter.chips.a) hVar).f171725b);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
