package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
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

/* compiled from: MortgageItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/mortgage/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/mortgage/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f136851k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f136852b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f136853c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f136854d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f136855e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f136856f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f136857g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f136858h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f136859i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f136860j;

    public i(@k View view) {
        super(view);
        this.f136852b = view;
        this.f136853c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f136854d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar_placeholder_TextView);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136855e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.name);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136856f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.phone);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136857g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.progressBar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f136858h = (ProgressBarRe23) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.status_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136859i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.preferences);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136860j = (TextView) viewFindViewById7;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void F1(@k String str) {
        I5.a(this.f136856f, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void J70(float f12, @k UniversalColor universalColor) {
        C48063a c48063a = C48063a.f437606a;
        Context context = this.f136853c;
        this.f136858h.setState(new C49888a(new xV.d(C42745f0.U(new C49890c(f12, c48063a.a(context, universalColor)), new C49890c(1.0f - f12, C35835l0.d(R.attr.gray12, context))))));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void KN(@k String str) {
        I5.a(this.f136859i, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void Ww(int i12) {
        this.f136856f.setTextColor(D6.q(this.f136852b, i12));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void Za(@k String str) {
        I5.a(this.f136860j, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f136852b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(12, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void b5(@k String str) {
        I5.a(this.f136857g, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.h
    public final void i6(@l Image image, @k String str) {
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        C35949t5.c(this.f136854d, aVarB, C43852a.a(this.f136853c, R.drawable.client_item_avatar_background), null, null, 12);
        Character chE = C43066x.E(str);
        String upperCase = chE != null ? String.valueOf(chE.charValue()).toUpperCase(Locale.ROOT) : null;
        if (upperCase == null) {
            upperCase = "";
        }
        TextView textView = this.f136855e;
        textView.setText(upperCase);
        D6.G(textView, aVarB == null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f136852b.setOnClickListener(null);
    }
}
