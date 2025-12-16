package com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot;

import Ow.C14742a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingLotItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f137290k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137292c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137293d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C14742a f137294e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f137295f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f137296g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f137297h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f137298i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f137299j;

    public h(@k View view) {
        super(view);
        this.f137291b = view;
        View viewFindViewById = view.findViewById(R.id.price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137292c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.main_info);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137293d = (TextView) viewFindViewById2;
        this.f137294e = new C14742a(view);
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137295f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.developer);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137296g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.development);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137297h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.reward_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137298i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.reward);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137299j = (TextView) viewFindViewById7;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void C(@k String str) {
        I5.a(this.f137295f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void D2(@l Metro metro) {
        this.f137294e.a(metro);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void DO(@k String str) {
        I5.a(this.f137297h, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void T5(@k String str) {
        I5.a(this.f137296g, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void TV(@l CharSequence charSequence) {
        D6.G(this.f137298i, true ^ (charSequence == null || charSequence.length() == 0));
        I5.a(this.f137299j, charSequence, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void i8(@l Y41.a<G0> aVar) {
        this.f137292c.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(15, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137292c.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void n7(boolean z12) {
        TextView textView = this.f137292c;
        if (z12) {
            FV.a.f4720a.f(textView, R.attr.textIconInfo, FV.a.f4721b);
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void p(@k String str) {
        I5.a(this.f137292c, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void s80(@k String str) {
        I5.a(this.f137293d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.g
    public final void setOpacity(float f12) {
        this.f137291b.setAlpha(f12);
    }
}
