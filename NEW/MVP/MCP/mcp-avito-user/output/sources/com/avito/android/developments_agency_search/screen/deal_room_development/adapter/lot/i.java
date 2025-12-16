package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: LotItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f137866j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137867b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f137868c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f137869d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f137870e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f137871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f137872g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f137873h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f137874i;

    public i(@k View view) {
        super(view);
        this.f137867b = view;
        this.f137868c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137869d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137870e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.award);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137871f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.additional_info);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137872g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.book_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f137873h = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.lot_is_not_available);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137874i = (TextView) viewFindViewById6;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void Cx(boolean z12) {
        D6.G(this.f137873h, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void Rl(boolean z12) {
        D6.G(this.f137874i, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void XS(float f12) {
        this.f137867b.setAlpha(f12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void Xj(@k String str) {
        I5.a(this.f137872g, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void ek(@k Y41.a<G0> aVar) {
        this.f137873h.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(22, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void i8(@l Y41.a<G0> aVar) {
        this.f137870e.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(23, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137870e.setOnClickListener(null);
        this.f137873h.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void l(@l Image image) {
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        Context context = this.f137868c;
        Drawable drawableA = C43852a.a(context, R.drawable.default_avito_image_placeholder);
        C35949t5.c(this.f137869d, aVarB, new BitmapDrawable(context.getResources(), drawableA != null ? androidx.core.graphics.drawable.d.b(0, 0, 7, drawableA) : null), null, null, 12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void n7(boolean z12) {
        TextView textView = this.f137870e;
        if (z12) {
            FV.a.f4720a.f(textView, R.attr.textIconInfo, FV.a.f4721b);
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void p(@k String str) {
        I5.a(this.f137870e, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.h
    public final void pB(@l String str) {
        I5.a(this.f137871f, str, false);
    }
}
