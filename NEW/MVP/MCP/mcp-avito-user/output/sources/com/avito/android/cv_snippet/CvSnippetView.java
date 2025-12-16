package com.avito.android.cv_snippet;

import X41.j;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.cv_snippet.CvSnippet;
import com.avito.android.cv_snippet.CvSnippetView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.b;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.cv.CvStats;
import com.avito.android.remote.model.cv.CvStatsPeriod;
import com.avito.android.remote.model.cv.CvStatus;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CvSnippetView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_snippet/CvSnippetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_job_cv-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvSnippetView extends ConstraintLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f131603n = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f131604b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f131605c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f131606d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CompactFlexibleLayout f131607e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f131608f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f131609g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Flow f131610h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f131611i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f131612j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f131613k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f131614l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ImageView f131615m;

    public /* synthetic */ CvSnippetView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public static String g(Integer num) {
        return C5.e(num != null ? num.toString() : null, (char) 8201);
    }

    public static void h(TextView textView, CvStatus cvStatus) {
        UniversalColor color;
        G0 g02 = null;
        I5.a(textView, cvStatus != null ? cvStatus.getTitle() : null, false);
        if (cvStatus != null && (color = cvStatus.getColor()) != null) {
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), color));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
        }
    }

    public final void i(@k final CvSnippet cvSnippet, @k final l<? super DeepLink, G0> lVar, @Y61.l final l<? super DeepLink, G0> lVar2) {
        G0 g02;
        G0 g03;
        G0 g04;
        G0 g05;
        C35949t5.c(this.f131604b, b.b(cvSnippet.f131593c), null, null, null, 14);
        I5.a(this.f131605c, cvSnippet.f131594d, false);
        I5.a(this.f131606d, cvSnippet.f131595e, false);
        G0 g06 = null;
        SerpBadgeBar serpBadgeBar = cvSnippet.f131596f;
        Q81.b.a(this.f131607e, serpBadgeBar != null ? serpBadgeBar.getBadges() : null, 0);
        I5.a(this.f131608f, cvSnippet.f131597g, false);
        h(this.f131609g, cvSnippet.f131600j);
        CvStats cvStats = cvSnippet.f131598h;
        if (cvStats != null) {
            CvStatsPeriod views = cvStats.getViews();
            TextView textView = this.f131611i;
            if (views != null) {
                Integer total = views.getTotal();
                if (total != null && total.intValue() == 0) {
                    I5.a(textView, "0", false);
                } else {
                    String strG = g(views.getTotal());
                    Integer today = views.getToday();
                    if (today != null && today.intValue() == 0) {
                        today = null;
                    }
                    String strG2 = g(today);
                    I5.a(textView, strG2 != null ? getResources().getString(R.string.cv_total_and_today_stats, strG, strG2) : getResources().getString(R.string.cv_total_stats, strG), false);
                }
                g03 = G0.f406611a;
            } else {
                g03 = null;
            }
            if (g03 == null) {
                D6.w(textView);
            }
            CvStatsPeriod contacts = cvStats.getContacts();
            TextView textView2 = this.f131612j;
            if (contacts != null) {
                Integer total2 = contacts.getTotal();
                if (total2 != null && total2.intValue() == 0) {
                    I5.a(textView2, "0", false);
                } else {
                    Integer today2 = contacts.getToday();
                    if (today2 != null && today2.intValue() == 0) {
                        today2 = null;
                    }
                    String strG3 = g(today2);
                    String strG4 = g(contacts.getTotal());
                    I5.a(textView2, strG3 != null ? getResources().getString(R.string.cv_total_and_today_stats, strG4, strG3) : getResources().getString(R.string.cv_total_stats, strG4), false);
                }
                g04 = G0.f406611a;
            } else {
                g04 = null;
            }
            if (g04 == null) {
                D6.w(textView2);
            }
            CvStatsPeriod favorites = cvStats.getFavorites();
            TextView textView3 = this.f131613k;
            if (favorites != null) {
                I5.a(textView3, g(favorites.getTotal()), false);
                g05 = G0.f406611a;
            } else {
                g05 = null;
            }
            if (g05 == null) {
                D6.w(textView3);
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(this.f131610h);
        }
        h(this.f131614l, cvSnippet.f131599i);
        DeepLink deepLink = cvSnippet.f131602l;
        ImageView imageView = this.f131615m;
        if (deepLink != null) {
            D6.H(imageView);
            final int i12 = 0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: Dt.a
                /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ?? r32 = lVar2;
                    CvSnippet cvSnippet2 = cvSnippet;
                    switch (i12) {
                        case 0:
                            int i13 = CvSnippetView.f131603n;
                            r32.invoke(cvSnippet2.f131602l);
                            break;
                        default:
                            int i14 = CvSnippetView.f131603n;
                            r32.invoke(cvSnippet2.f131601k);
                            break;
                    }
                }
            });
            g06 = G0.f406611a;
        }
        if (g06 == null) {
            D6.w(imageView);
        }
        final int i13 = 1;
        setOnClickListener(new View.OnClickListener() { // from class: Dt.a
            /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ?? r32 = lVar;
                CvSnippet cvSnippet2 = cvSnippet;
                switch (i13) {
                    case 0:
                        int i132 = CvSnippetView.f131603n;
                        r32.invoke(cvSnippet2.f131602l);
                        break;
                    default:
                        int i14 = CvSnippetView.f131603n;
                        r32.invoke(cvSnippet2.f131601k);
                        break;
                }
            }
        });
    }

    @j
    public CvSnippetView(@k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.cv_snippet_view, (ViewGroup) this, true);
        this.f131604b = (SimpleDraweeView) findViewById(R.id.image);
        this.f131605c = (TextView) findViewById(R.id.title);
        this.f131606d = (TextView) findViewById(R.id.salary);
        this.f131607e = (CompactFlexibleLayout) findViewById(R.id.badge_bar);
        this.f131608f = (TextView) findViewById(R.id.updated_time);
        this.f131609g = (TextView) findViewById(R.id.sub_status);
        this.f131610h = (Flow) findViewById(R.id.stats_container);
        this.f131611i = (TextView) findViewById(R.id.views_stats);
        this.f131612j = (TextView) findViewById(R.id.contact_stats);
        this.f131613k = (TextView) findViewById(R.id.favorites_stats);
        this.f131614l = (TextView) findViewById(R.id.status);
        this.f131615m = (ImageView) findViewById(R.id.edit);
    }
}
