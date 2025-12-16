package com.avito.android.edit_carousel.adapter.button;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/button/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_carousel/adapter/button/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f146287c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f146288b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f146288b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.edit_carousel.adapter.button.h
    public final void Ws(@k a aVar, @k Y41.a<G0> aVar2) {
        String str = aVar.f146279c;
        Button button = this.f146288b;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(8, aVar2));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f146288b.setOnClickListener(null);
    }
}
