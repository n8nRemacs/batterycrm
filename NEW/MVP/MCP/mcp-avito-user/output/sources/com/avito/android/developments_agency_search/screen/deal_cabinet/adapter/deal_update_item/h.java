package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item;

import Y61.k;
import Y61.l;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: DealUpdateItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f136817h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f136818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f136819c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f136820d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f136821e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f136822f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f136823g;

    public h(@k View view) {
        super(view);
        this.f136818b = view;
        View viewFindViewById = view.findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f136819c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136820d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136821e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.info_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136822f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.client_name);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136823g = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f136818b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(10, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void b(@k String str) {
        I5.a(this.f136820d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void gd(@l String str) {
        I5.a(this.f136822f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void j(@k String str) {
        I5.a(this.f136821e, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void l(@k Image image) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        SimpleDraweeView simpleDraweeView = this.f136819c;
        Drawable drawableA = C43852a.a(simpleDraweeView.getContext(), R.drawable.default_avito_image_placeholder);
        C35949t5.c(this.f136819c, aVarB, new BitmapDrawable(simpleDraweeView.getResources(), drawableA != null ? androidx.core.graphics.drawable.d.b(y6.b(206), y6.b(206), 4, drawableA) : null), null, null, 12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void setIcon(@InterfaceC42165v int i12) {
        this.f136820d.setCompoundDrawablesWithIntrinsicBounds(0, 0, i12, 0);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.g
    public final void xN(@k String str) {
        I5.a(this.f136823g, str, false);
    }
}
