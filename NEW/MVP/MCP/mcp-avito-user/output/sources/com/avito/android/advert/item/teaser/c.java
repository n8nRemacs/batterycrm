package com.avito.android.advert.item.teaser;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.teaser.TeaserError;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.remote.model.teaser.TeaserStatus;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import j.I;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import x4.c;

/* compiled from: AdvertDetailsTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/teaser/c;", "Lcom/avito/android/advert/item/teaser/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class c implements com.avito.android.advert.item.teaser.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f80528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final c.a f80529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f80530d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f80531e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f80532f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ReportTeaserInsightListViewImpl f80533g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f80534h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f80535i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f80536j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f80537k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final DockingBadge f80538l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f80539m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f80540n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f80541o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f80542p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f80543q;

    /* compiled from: AdvertDetailsTeaserView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80544a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m[] mVarArr = m.f80554b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TeaserStatus.values().length];
            try {
                iArr2[TeaserStatus.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TeaserStatus.f253941Ok.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TeaserStatus.Caution.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TeaserStatus.Warning.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TeaserStatus.Locked.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f80544a = iArr2;
        }
    }

    /* compiled from: AdvertDetailsTeaserView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<TeaserInsightGeneral, Drawable> {
        @Override // Y41.l
        public final Drawable invoke(TeaserInsightGeneral teaserInsightGeneral) {
            return ((c) this.receiver).e0(teaserInsightGeneral);
        }
    }

    public c(@Y61.k View view, @Y61.l c.a aVar) {
        this.f80528b = view;
        this.f80529c = aVar;
        View viewFindViewById = view.findViewById(R.id.result_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f80530d = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80531e = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.sub_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80532f = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.insight_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.teaser.ReportTeaserInsightListViewImpl");
        }
        this.f80533g = (ReportTeaserInsightListViewImpl) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f80534h = button;
        this.f80535i = (LinearLayout) viewFindViewById.findViewById(R.id.buttonContainer);
        this.f80536j = (TextView) viewFindViewById.findViewById(R.id.discountTitle);
        this.f80537k = (LinearLayout) viewFindViewById.findViewById(R.id.discountContainer);
        this.f80538l = (DockingBadge) viewFindViewById.findViewById(R.id.discountAmount);
        View viewFindViewById6 = view.findViewById(R.id.error_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f80539m = viewFindViewById6;
        View viewFindViewById7 = viewFindViewById6.findViewById(R.id.title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80540n = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewFindViewById6.findViewById(R.id.description);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80541o = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewFindViewById.findViewById(R.id.more_link);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById9;
        this.f80542p = viewGroup;
        View viewFindViewById10 = viewGroup.findViewById(R.id.text);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80543q = (TextView) viewFindViewById10;
        C37722i.a(button).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new com.avito.android.advert.item.teaser.b(this));
    }

    public final void D0(@I int i12, @Y61.k List list) {
        this.f80533g.b(list, i12, new b(1, this, c.class, "getInsightIconDrawable", "getInsightIconDrawable(Lcom/avito/android/remote/model/teaser/TeaserInsightGeneral;)Landroid/graphics/drawable/Drawable;", 0));
    }

    @Override // com.avito.android.advert.item.teaser.a
    public void R1(@Y61.k String str) {
        this.f80531e.setText(str);
    }

    @Y61.l
    public Drawable e0(@Y61.k TeaserInsightGeneral teaserInsightGeneral) {
        int i12 = a.f80544a[teaserInsightGeneral.getStatus().ordinal()];
        if (i12 == 1) {
            return null;
        }
        View view = this.f80528b;
        if (i12 == 2) {
            return view.getContext().getDrawable(R.drawable.ic_status_ok);
        }
        if (i12 == 3) {
            return view.getContext().getDrawable(R.drawable.ic_status_caution);
        }
        if (i12 == 4) {
            return view.getContext().getDrawable(R.drawable.ic_status_warning);
        }
        if (i12 == 5) {
            return view.getContext().getDrawable(R.drawable.ic_status_lock);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void jL() {
        m[] mVarArr = m.f80554b;
        D6.H(this.f80530d);
        D6.w(this.f80539m);
    }

    public final void w9(@Y61.k TeaserError teaserError) {
        this.f80540n.setText(teaserError.getTitle());
        this.f80541o.setText(teaserError.getDescription());
        m[] mVarArr = m.f80554b;
        D6.w(this.f80530d);
        D6.H(this.f80539m);
    }

    @Override // TV0.e
    public final void j5() {
    }
}
