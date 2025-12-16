package com.avito.android.list.toggle;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestToggleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/toggle/i;", "Lcom/avito/android/list/toggle/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f181667e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f181668b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Switcher f181669c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f181670d;

    public i(@k View view) {
        super(view);
        this.f181668b = (ViewGroup) view;
        this.f181669c = (Switcher) view.findViewById(R.id.toggle_switcher);
        this.f181670d = (TextView) view.findViewById(R.id.toggle_title);
    }

    @Override // com.avito.android.list.toggle.h
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f181670d, attributedText, null);
    }

    @Override // com.avito.android.list.toggle.h
    public final void en(boolean z12) throws Resources.NotFoundException {
        this.f181669c.setChecked(z12);
    }

    @Override // com.avito.android.list.toggle.h
    public final void l0(@k l<? super Boolean, G0> lVar) {
        this.f181669c.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(lVar));
    }

    @Override // com.avito.android.list.toggle.h
    public final void u3(int i12) {
        this.f181670d.setMaxLines(i12);
        if (i12 > 1) {
            D6.f(this.f181668b, 0, y6.b(9), 0, y6.b(8), 5);
        } else {
            D6.f(this.f181668b, 0, y6.b(9), 0, y6.b(6), 5);
        }
    }
}
