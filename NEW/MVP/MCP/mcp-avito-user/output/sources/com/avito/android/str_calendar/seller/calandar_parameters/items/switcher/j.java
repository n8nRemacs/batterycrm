package com.avito.android.str_calendar.seller.calandar_parameters.items.switcher;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SwitcherItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f287282c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f287283b;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f287283b = (ListItemSwitcher) viewFindViewById;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void Jg() {
        this.f287283b.i();
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void O0(@k String str, @l String str2) {
        this.f287283b.setTitle(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void V4(@k Y41.l<? super Boolean, G0> lVar) {
        ListItemSwitcher listItemSwitcher = this.f287283b;
        listItemSwitcher.i();
        listItemSwitcher.e(new com.avito.android.blueprint.switcher.h(5, lVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void setChecked(boolean z12) {
        this.f287283b.setChecked(z12);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void a50(@l AttributedText attributedText) {
    }
}
