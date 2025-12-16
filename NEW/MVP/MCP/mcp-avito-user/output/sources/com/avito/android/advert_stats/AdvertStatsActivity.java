package com.avito.android.advert_stats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment;
import com.avito.android.advert_stats.di.InterfaceC28317b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Action;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.S;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertStatsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_stats/AdvertStatsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/advert_stats/H;", "Lcom/avito/android/advert_stats/a;", "Lcom/avito/android/advert_stats/G;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertStatsActivity extends com.avito.android.ui.activity.a implements H, InterfaceC28296a, G, InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f85977u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f85978m;

    /* renamed from: n, reason: collision with root package name */
    public View f85979n;

    /* renamed from: o, reason: collision with root package name */
    public Toolbar f85980o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f85981p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f85982q;

    /* renamed from: r, reason: collision with root package name */
    public Button f85983r;

    /* renamed from: s, reason: collision with root package name */
    public Button f85984s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public AtomicReference f85985t = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            LinearLayout linearLayout = AdvertStatsActivity.this.f85982q;
            if (linearLayout == null) {
                linearLayout = null;
            }
            return Integer.valueOf(D6.v(linearLayout));
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f85987b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Number) obj).intValue() > 0;
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Intent intent = new Intent();
            intent.putExtra("size", iIntValue);
            intent.setAction("com.avito.android.advert_stats.button_update");
            AdvertStatsActivity advertStatsActivity = AdvertStatsActivity.this;
            intent.setPackage(advertStatsActivity.getPackageName());
            advertStatsActivity.sendBroadcast(intent);
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f85989b = new d<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {
        public e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            LinearLayout linearLayout = AdvertStatsActivity.this.f85982q;
            if (linearLayout == null) {
                linearLayout = null;
            }
            return Integer.valueOf(D6.v(linearLayout));
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f85991b = new f<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Number) obj).intValue() > 0;
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Intent intent = new Intent();
            intent.putExtra("size", iIntValue);
            intent.setAction("com.avito.android.advert_stats.button_update");
            AdvertStatsActivity advertStatsActivity = AdvertStatsActivity.this;
            intent.setPackage(advertStatsActivity.getPackageName());
            advertStatsActivity.sendBroadcast(intent);
        }
    }

    /* compiled from: AdvertStatsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f85993b = new h<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.avito.android.advert_stats.H
    public final void E0(boolean z12) {
        TextView textView = this.f85981p;
        if (textView == null) {
            textView = null;
        }
        D6.G(textView, z12);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.advert_stats_activity;
    }

    @Override // com.avito.android.advert_stats.InterfaceC28296a
    public final void N(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f85984s;
        if (button == null) {
            button = null;
        }
        button.setText(action.getTitle());
        Button button2 = this.f85984s;
        if (button2 == null) {
            button2 = null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC28297b(aVar, 1));
        Button button3 = this.f85984s;
        if (button3 == null) {
            button3 = null;
        }
        D6.H(button3);
        Button button4 = this.f85984s;
        this.f85985t = (AtomicReference) new S(C37722i.f(button4 != null ? button4 : null).d0(new e()).N(f.f85991b)).n(new g(), h.f85993b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.advert_stats.InterfaceC28296a
    public final void b0(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f85983r;
        if (button == null) {
            button = null;
        }
        button.setText(action.getTitle());
        Button button2 = this.f85983r;
        if (button2 == null) {
            button2 = null;
        }
        button2.setOnClickListener(new ViewOnClickListenerC28297b(aVar));
        Button button3 = this.f85983r;
        if (button3 == null) {
            button3 = null;
        }
        D6.H(button3);
        Button button4 = this.f85983r;
        this.f85985t = (AtomicReference) new S(C37722i.f(button4 != null ? button4 : null).d0(new a()).N(b.f85987b)).n(new c(), d.f85989b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.advert_stats.H
    public final void h1(@Y61.k String str) {
        Toolbar toolbar = this.f85980o;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setTitle(str);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC28317b.a aVarA = com.avito.android.advert_stats.di.z.a();
        aVarA.d((com.avito.android.advert_stats.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert_stats.di.c.class));
        aVarA.build().a(this);
        View viewFindViewById = findViewById(R.id.advert_stats_screen_root);
        this.f85979n = viewFindViewById;
        this.f85980o = (Toolbar) viewFindViewById.findViewById(R.id.toolbar);
        View view = this.f85979n;
        if (view == null) {
            view = null;
        }
        this.f85981p = (TextView) view.findViewById(R.id.toolbar_title);
        Toolbar toolbar = this.f85980o;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        Toolbar toolbar2 = this.f85980o;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new ViewOnClickListenerC28297b(this, 2));
        View view2 = this.f85979n;
        if (view2 == null) {
            view2 = null;
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.button_container);
        this.f85982q = linearLayout;
        this.f85983r = (Button) linearLayout.findViewById(R.id.button);
        LinearLayout linearLayout2 = this.f85982q;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        this.f85984s = (Button) linearLayout2.findViewById(R.id.extra_button);
        if (getIntent().getBooleanExtra("open_extended_statistics", false)) {
            ((ViewStub) findViewById(R.id.statistic_stub)).inflate();
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("item_id");
                String stringExtra2 = getIntent().getStringExtra("item_slug");
                AdvertDetailStatsMVIFragment.f86027D0.getClass();
                AdvertDetailStatsMVIFragment advertDetailStatsMVIFragmentA = AdvertDetailStatsMVIFragment.a.a(stringExtra, stringExtra2);
                androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
                hE2.n(R.id.fragment_container, advertDetailStatsMVIFragmentA, null);
                hE2.c(null);
                hE2.e();
                return;
            }
            return;
        }
        ((ViewStub) findViewById(R.id.statistic_stub)).inflate();
        if (bundle == null) {
            String stringExtra3 = getIntent().getStringExtra("item_id");
            AdvertStatsFragment.f85994z0.getClass();
            AdvertStatsFragment advertStatsFragment = new AdvertStatsFragment();
            C35966w1.a(advertStatsFragment, -1, new C28319f(stringExtra3));
            androidx.fragment.app.H hE3 = getSupportFragmentManager().e();
            hE3.n(R.id.fragment_container, advertStatsFragment, null);
            hE3.c(null);
            hE3.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f85985t.dispose();
    }
}
