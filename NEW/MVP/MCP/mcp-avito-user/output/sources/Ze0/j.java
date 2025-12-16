package Ze0;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.toggle.Checkmark;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RedesignedCardSelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZe0/j;", "LZe0/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f20347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f20348b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f20349c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Checkmark f20350d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f20351e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f20352f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f20353g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f20354h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f20355i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f20356j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f20357k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f20358l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f20359m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final TextView f20360n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Context f20361o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20362p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20363q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20364r;

    public j(@k View view) {
        this.f20347a = view;
        View viewFindViewById = view.findViewById(R.id.header_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f20348b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20349c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkmark);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        this.f20350d = (Checkmark) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20351e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title_badge);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20352f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.paragraphs_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f20353g = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.info_badge);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f20354h = (ViewGroup) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.info_badge_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20355i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.info_badge_text);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20356j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.info_badge_image);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f20357k = (SimpleDraweeView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.buyout_text);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20358l = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.buyout_price);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20359m = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.auction_link);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById13;
        this.f20360n = textView;
        Context context = view.getContext();
        this.f20361o = context;
        this.f20362p = context.getResources().getDimensionPixelOffset(R.dimen.card_select_redesigned_paragraph_top_margin);
        this.f20363q = context.getResources().getDimensionPixelOffset(R.dimen.card_select_redesigned_info_badge_corner_radius);
        this.f20364r = context.getResources().getDimensionPixelOffset(R.dimen.card_select_redesigned_title_badge_corner_radius);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
