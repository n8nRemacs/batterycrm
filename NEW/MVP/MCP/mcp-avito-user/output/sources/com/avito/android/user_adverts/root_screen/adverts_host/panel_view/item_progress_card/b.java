package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PanelProgressCardItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/b;", "LTV0/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/g;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<g, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f313748a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f313749b;

    /* compiled from: PanelProgressCardItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/b$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Inject
        public a() {
        }
    }

    public b(f fVar, C42822w c42822w) {
        this.f313749b = new g.a<>(R.layout.user_adverts_panel_card_progress_item_re23, new c(fVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f313748a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f313749b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a;
    }
}
