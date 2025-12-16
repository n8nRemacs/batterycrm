package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m.C43852a;
import sK0.C48063a;
import xV.C49888a;
import xV.C49890c;

/* compiled from: ClientItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/client/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/client/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f136796m = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f136797b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f136798c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f136799d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f136800e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f136801f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f136802g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f136803h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f136804i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f136805j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f136806k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f136807l;

    public i(@k View view) {
        super(view);
        this.f136797b = view;
        this.f136798c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f136799d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar_placeholder_TextView);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136800e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.name);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136801f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.phone);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136802g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f136803h = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.state_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136804i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.progressBar);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f136805j = (ProgressBarRe23) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.state_text);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136806k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.preferences);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136807l = (TextView) viewFindViewById9;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void F1(@k String str) {
        I5.a(this.f136801f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void JI(@l String str) {
        I5.a(this.f136804i, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void Xs(@l String str) {
        this.f136804i.setTextColor(C48063a.f437606a.b(this.f136798c, str, Integer.valueOf(D6.q(this.f136797b, R.color.client_item_default_state_title))));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void Za(@l String str) {
        I5.a(this.f136807l, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f136797b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(9, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void b5(@l String str) {
        I5.a(this.f136802g, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void i6(@l Image image, @k String str) {
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        C35949t5.c(this.f136799d, aVarB, C43852a.a(this.f136798c, R.drawable.client_item_avatar_background), null, null, 12);
        String upperCase = String.valueOf(C43066x.D(str)).toUpperCase(Locale.ROOT);
        TextView textView = this.f136800e;
        textView.setText(upperCase);
        D6.G(textView, aVarB == null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void pH(@l String str) {
        this.f136806k.setTextColor(C48063a.f437606a.b(this.f136798c, str, Integer.valueOf(D6.q(this.f136797b, R.color.client_item_default_state_text))));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void sG(@l String str) {
        I5.a(this.f136806k, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void vf(float f12, @l String str) {
        Context context = this.f136798c;
        this.f136805j.setState(new C49888a(new xV.d(C42745f0.U(new C49890c(f12, C48063a.f437606a.b(context, str, Integer.valueOf(context.getColor(R.color.client_item_default_progress_bar_progress_color)))), new C49890c(1.0f - f12, C35835l0.d(R.attr.gray12, context))))));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client.h
    public final void z1(@k Image image) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        Drawable drawableA = C43852a.a(this.f136798c, R.drawable.default_avito_image_placeholder);
        C35949t5.c(this.f136803h, aVarB, new BitmapDrawable(this.f136797b.getResources(), drawableA != null ? androidx.core.graphics.drawable.d.b(0, 0, 7, drawableA) : null), null, null, 12);
    }
}
