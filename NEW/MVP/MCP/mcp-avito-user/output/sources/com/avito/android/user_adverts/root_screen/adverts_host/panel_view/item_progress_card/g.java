package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PanelProgressCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f313752b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f313753c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f313754d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f313755e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313756f;

    /* renamed from: g, reason: collision with root package name */
    public final int f313757g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public a f313758h;

    public g(@k View view, @k f fVar) {
        super(view);
        Context context = view.getContext();
        this.f313752b = context;
        this.f313753c = (TextView) view.findViewById(R.id.panel_card_progress_item_title);
        this.f313754d = (TextView) view.findViewById(R.id.panel_card_progress_item_description);
        this.f313755e = (ProgressBarRe23) view.findViewById(R.id.panel_card_progress_item_progress_bar);
        this.f313756f = C35835l0.d(R.attr.warmGray16, context);
        this.f313757g = C35835l0.d(R.attr.blue600, context);
        view.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(17, this, fVar));
    }
}
