package com.avito.android.developments_agency_search.screen.deal_room.adapter.development;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;

/* compiled from: DevelopmentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/development/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/development/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f137336h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137337b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f137338c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f137339d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f137340e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f137341f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f137342g;

    public h(@k View view) {
        super(view);
        this.f137337b = view;
        this.f137338c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137339d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137340e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137341f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137342g = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void D5(@k UniversalColor universalColor) {
        this.f137340e.setTextColor(C48063a.f437606a.a(this.f137338c, universalColor));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f137337b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(16, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void da(@k UniversalColor universalColor) {
        this.f137341f.setTextColor(C48063a.f437606a.a(this.f137338c, universalColor));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void f(@k String str) {
        I5.a(this.f137342g, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137337b.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void je(@k UniversalColor universalColor) {
        this.f137342g.setTextColor(C48063a.f437606a.a(this.f137338c, universalColor));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void l(@l Image image) {
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        Context context = this.f137338c;
        Drawable drawableA = C43852a.a(context, R.drawable.default_avito_image_placeholder);
        C35949t5.c(this.f137339d, aVarB, new BitmapDrawable(context.getResources(), drawableA != null ? androidx.core.graphics.drawable.d.b(0, 0, 7, drawableA) : null), null, null, 12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void setText(@k String str) {
        I5.a(this.f137341f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.development.g
    public final void setTitle(@k String str) {
        I5.a(this.f137340e, str, false);
    }
}
