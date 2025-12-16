package com.avito.android.edit_carousel.adapter.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_carousel/adapter/header/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f146303h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f146304b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f146305c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f146306d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f146307e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f146308f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f146309g;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146304b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_header_name_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146305c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_header_name_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146306d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.advert_header_name_select);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f146307e = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.adverts_header_title_advert);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146308f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.adverts_header_subtitle_advert);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146309g = (TextView) viewFindViewById6;
    }

    @Override // com.avito.android.edit_carousel.adapter.header.h
    public final void RR(@k a aVar, @k Y41.a<G0> aVar2) {
        I5.a(this.f146304b, aVar.f146290c, false);
        I5.a(this.f146305c, aVar.f146291d, false);
        I5.a(this.f146306d, aVar.f146292e, false);
        String str = aVar.f146295h;
        Input input = this.f146307e;
        Input.t(input, str, false, 6);
        input.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(9, aVar2));
        I5.a(this.f146308f, aVar.f146293f, false);
        I5.a(this.f146309g, aVar.f146294g, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f146307e.setOnClickListener(null);
    }
}
