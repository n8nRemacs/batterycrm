package com.avito.android.serp.adapter.brandspace_widget;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceWidgetItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/u;", "Lcom/avito/android/serp/adapter/brandspace_widget/q;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f269072b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f269073c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f269074d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final i f269075e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f269076f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f269077g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CountDownTimerWidget f269078h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f269079i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f269080j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269081k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f269082l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final z<G0> f269083m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final z<G0> f269084n;

    /* renamed from: o, reason: collision with root package name */
    public int f269085o;

    /* compiled from: BrandspaceWidgetItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            CountDownTimerWidget.d(u.this.f269078h, u.C80());
            return G0.f406611a;
        }
    }

    public u(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k i iVar) {
        super(view);
        this.f269072b = view;
        this.f269073c = jVar;
        this.f269074d = hVar;
        this.f269075e = iVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269076f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269077g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.timer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp_core.timer.CountDownTimerWidget");
        }
        this.f269078h = (CountDownTimerWidget) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f269079i = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f269080j = button;
        View viewFindViewById6 = view.findViewById(R.id.logo);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f269081k = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.info);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        this.f269082l = textView;
        this.f269083m = C37722i.a(button);
        this.f269084n = C37722i.a(textView);
        jVar.setHasStableIds(true);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.l(new com.avito.android.serp.adapter.brandspace_widget.a(), -1);
    }

    public static final void B80(u uVar) {
        RecyclerView.m layoutManager = uVar.f269079i.getLayoutManager();
        uVar.f269075e.T4(layoutManager != null ? layoutManager.Y0() : null, uVar.f269085o);
    }

    public static long C80() {
        return TimeUnit.SECONDS.toMillis(LocalDate.now().plusDays(1L).atStartOfDay().toEpochSecond(ZoneOffset.ofTotalSeconds((int) TimeUnit.MILLISECONDS.toSeconds(Calendar.getInstance().getTimeZone().getRawOffset()))));
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    @Y61.k
    public final z<G0> A1() {
        return this.f269083m;
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f269079i);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void L4() {
        RecyclerView recyclerView = this.f269079i;
        recyclerView.s();
        recyclerView.m(new r(this));
        recyclerView.n(new s(this));
        recyclerView.o(new t(this));
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    @Y61.k
    public final z<G0> LC() {
        return this.f269084n;
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void T20(@Y61.k UV0.c cVar, int i12) {
        this.f269074d.f338510e = cVar;
        this.f269073c.notifyDataSetChanged();
        this.f269085o = i12;
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void V0(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f269080j, str, false);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void W4(@Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f269079i.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void b(@Y61.l String str) {
        I5.a(this.f269076f, str, false);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void gd(@Y61.l String str) {
        TextView textView = this.f269082l;
        if (str == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        textView.setText(str);
        FV.a.f4720a.f(textView, R.attr.textIconInfo, FV.a.f4721b);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void j(@Y61.l String str) {
        I5.a(this.f269077g, str, false);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void ko(@Y61.l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.f269072b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f269081k;
        if (imageQ == null) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
            C35949t5.c(this.f269081k, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
        }
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.q
    public final void rB(@Y61.l Boolean bool) {
        boolean zF2 = L.f(bool, Boolean.TRUE);
        CountDownTimerWidget countDownTimerWidget = this.f269078h;
        if (!zF2) {
            D6.w(countDownTimerWidget);
            return;
        }
        D6.H(countDownTimerWidget);
        CountDownTimerWidget.d(countDownTimerWidget, C80());
        countDownTimerWidget.setOnFinishListener(new a());
    }
}
