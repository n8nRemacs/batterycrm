package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: PanelFlatCardItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/b;", "LTV0/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/f;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/a;", "<init>", "()V", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<f, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f313738a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f313739b;

    /* compiled from: PanelFlatCardItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/b$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Inject
        public a() {
        }
    }

    /* compiled from: PanelFlatCardItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.b$b, reason: collision with other inner class name */
    public static final class C9658b extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9658b f313740l = new C9658b();

        public C9658b() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f313738a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f313739b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a;
    }

    public b() {
        this.f313738a = new d();
        this.f313739b = new g.a<>(R.layout.user_adverts_panel_card_flat_item_re23, C9658b.f313740l);
    }
}
