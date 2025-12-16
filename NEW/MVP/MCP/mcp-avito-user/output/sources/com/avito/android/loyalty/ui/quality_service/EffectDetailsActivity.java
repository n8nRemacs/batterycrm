package com.avito.android.loyalty.ui.quality_service;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EffectDetailsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/EffectDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EffectDetailsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final a f183766s = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f183767m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f183768n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183769o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f183770p = C42727D.c(new b());

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f183771q = C42727D.c(new e());

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f183772r = C42727D.c(new d());

    /* compiled from: EffectDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/EffectDetailsActivity$a;", "", "<init>", "()V", "", "CONTENT_KEY", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EffectDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/nav_bar/NavBar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<NavBar> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final NavBar invoke() {
            return (NavBar) EffectDetailsActivity.this.findViewById(R.id.effect_details_navbar);
        }
    }

    /* compiled from: EffectDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            EffectDetailsActivity.this.onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: EffectDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            return (RecyclerView) EffectDetailsActivity.this.findViewById(R.id.effect_details_recycler);
        }
    }

    /* compiled from: EffectDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) EffectDetailsActivity.this.findViewById(R.id.effect_details_title);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_effect_details;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.loyalty.di.quality_service.a.a().a(new com.avito.android.cpt.pre_activation.ui.c(this, 19), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Content content = (Content) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("content_key", Content.class) : intent.getParcelableExtra("content_key"));
        ((NavBar) this.f183770p.getValue()).c(R.attr.ic_arrowBack24, new c());
        TextView textView = (TextView) this.f183771q.getValue();
        String str = content != null ? content.f183807b : null;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        RecyclerView recyclerView = (RecyclerView) this.f183772r.getValue();
        com.avito.konveyor.adapter.j jVar = this.f183767m;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        com.avito.konveyor.adapter.a aVar = this.f183768n;
        if (aVar == null) {
            aVar = null;
        }
        List list = content != null ? content.f183808c : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        com.avito.konveyor.util.a.a(aVar, list);
    }
}
