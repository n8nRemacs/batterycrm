package com.avito.android.favorites.adapter.avito_for_business_exit;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoForBusinessExitBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/avito_for_business_exit/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/avito_for_business_exit/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f156520b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f156521c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f156522d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f156523e;

    public e(@k View view, @k InterfaceC28373a interfaceC28373a, @k c cVar) {
        super(view);
        this.f156520b = interfaceC28373a;
        this.f156521c = cVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156522d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156523e = (Button) viewFindViewById2;
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        AvitoForBusinessExitBlockItem avitoForBusinessExitBlockItem = (AvitoForBusinessExitBlockItem) aVar;
        this.f156520b.c(new MC.b());
        j.c(this.f156522d, avitoForBusinessExitBlockItem.f156511c, null);
        String str = avitoForBusinessExitBlockItem.f156512d.f156513b;
        Button button = this.f156523e;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 9));
    }
}
