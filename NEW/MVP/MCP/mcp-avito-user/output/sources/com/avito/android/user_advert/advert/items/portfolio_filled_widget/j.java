package com.avito.android.user_advert.advert.items.portfolio_filled_widget;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioFilledWidgetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/j;", "Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f309818f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f309821d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Switcher f309822e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.portfolio_filled_widget_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309819b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.portfolio_filled_widget_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309820c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.portfolio_all_project_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f309821d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.filled_portfolio_switcher);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f309822e = (Switcher) viewFindViewById4;
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.i
    public final void Vg(@k a aVar) {
        I5.a(this.f309819b, aVar.f309805c.getTitle(), false);
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.i
    public final void gq(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f309821d;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(20, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.i
    public final void n(@k String str) {
        I5.a(this.f309820c, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.i
    public final void nl(@k l lVar, boolean z12) throws Resources.NotFoundException {
        Switcher switcher = this.f309822e;
        switcher.setChecked(z12);
        switcher.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(7, lVar));
    }
}
