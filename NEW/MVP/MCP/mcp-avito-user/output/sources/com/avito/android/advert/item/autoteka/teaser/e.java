package com.avito.android.advert.item.autoteka.teaser;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.teaser.ReportTeaserInsightListViewImpl;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.autotekateaser.AutotekaCpoTeaser;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import x4.c;

/* compiled from: AdvertDetailsAutotekaCpoTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/e;", "Lcom/avito/android/advert/item/autoteka/teaser/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f73014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final c.a f73015c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f73016d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f73017e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f73018f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f73019g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f73020h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ReportTeaserInsightListViewImpl f73021i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f73022j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f73023k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f73024l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f73025m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f73026n;

    /* compiled from: AdvertDetailsAutotekaCpoTeaserView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AutotekaCpoTeaser f73028c;

        public a(AutotekaCpoTeaser autotekaCpoTeaser) {
            this.f73028c = autotekaCpoTeaser;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.a aVar = e.this.f73015c;
            if (aVar != null) {
                aVar.k(this.f73028c.getDescription());
            }
        }
    }

    public e(@Y61.k View view, @Y61.l c.a aVar) {
        this.f73014b = view;
        this.f73015c = aVar;
        View viewFindViewById = view.findViewById(R.id.result_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f73016d = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73017e = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.sub_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73018f = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73019g = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f73020h = (Button) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById.findViewById(R.id.insight_list);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.teaser.ReportTeaserInsightListViewImpl");
        }
        this.f73021i = (ReportTeaserInsightListViewImpl) viewFindViewById6;
        View viewFindViewById7 = viewFindViewById.findViewById(R.id.cpo_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById7;
        this.f73022j = linearLayout;
        View viewFindViewById8 = linearLayout.findViewById(R.id.cpo_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73023k = (TextView) viewFindViewById8;
        View viewFindViewById9 = linearLayout.findViewById(R.id.terms_description);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73024l = (TextView) viewFindViewById9;
        View viewFindViewById10 = linearLayout.findViewById(R.id.terms_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f73025m = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = linearLayout.findViewById(R.id.program_description_link);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f73026n = (TextView) viewFindViewById11;
    }

    @SuppressLint({"CheckResult"})
    public final void a(@Y61.k AutotekaCpoTeaser autotekaCpoTeaser) {
        D6.H(this.f73022j);
        this.f73023k.setText(autotekaCpoTeaser.getTitle());
        this.f73024l.setText(autotekaCpoTeaser.getSubtitle());
        LinearLayout linearLayout = this.f73025m;
        linearLayout.removeAllViews();
        Iterator<String> it = autotekaCpoTeaser.getTerms().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            View view = this.f73014b;
            if (!zHasNext) {
                String programLinkText = autotekaCpoTeaser.getProgramLinkText();
                TextView textView = this.f73026n;
                textView.setText(programLinkText);
                C37722i.a(textView).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new a(autotekaCpoTeaser));
                this.f73017e.setText(autotekaCpoTeaser.getReportTitle());
                I5.a(this.f73018f, autotekaCpoTeaser.getReportInfo(), false);
                TextView textView2 = this.f73019g;
                D6.H(textView2);
                textView2.setText(autotekaCpoTeaser.getReportIntro());
                this.f73021i.a();
                this.f73020h.setText(view.getContext().getText(R.string.advert_details_autoteka_cpo_report_button));
                return;
            }
            String next = it.next();
            View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.advert_details_autoteka_cpo_teaser_term, (ViewGroup) linearLayout, false);
            ((TextView) viewInflate.findViewById(R.id.term)).setText(next);
            linearLayout.addView(viewInflate);
        }
    }
}
