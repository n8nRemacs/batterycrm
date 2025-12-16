package com.avito.android.guests_selector.items.swither;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.blueprints.publish.select.inline.j;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SwitcherItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/items/swither/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/guests_selector/items/swither/f;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f161516d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Switcher f161517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f161518c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.switcher_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f161517b = (Switcher) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161518c = (TextView) viewFindViewById3;
        frameLayout.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 16));
    }

    @Override // com.avito.android.guests_selector.items.swither.f
    public final void V4(@k l<? super Boolean, G0> lVar) {
        this.f161517b.setOnCheckedChangeListener(new j(2, lVar));
    }

    @Override // com.avito.android.guests_selector.items.swither.f
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f161518c, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f161517b.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.guests_selector.items.swither.f
    public final void setChecked(boolean z12) throws Resources.NotFoundException {
        this.f161517b.setChecked(z12);
    }
}
