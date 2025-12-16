package com.avito.android.short_term_rent.bookingform.items.toggle;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToggleOptionsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle/l;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Chips f281720b;

    public m(@Y61.k View view) {
        super(view);
        this.f281720b = (Chips) view.findViewById(R.id.chips);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle.l
    public final void i5(@Y61.k Y41.l<? super ToggleOptionItem, G0> lVar) {
        this.f281720b.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle.l
    public final void jO(int i12) {
        this.f281720b.p(i12, false);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle.l
    public final void m2(@Y61.k Chips.DisplayType displayType) {
        this.f281720b.setDisplayType(displayType);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle.l
    public final void pd(@Y61.k List<ToggleOptionItem> list) {
        this.f281720b.setData(list);
    }

    /* compiled from: ToggleOptionsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/bookingform/items/toggle/m$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f281721a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super ToggleOptionItem, G0> lVar) {
            this.f281721a = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            this.f281721a.invoke((ToggleOptionItem) hVar);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
