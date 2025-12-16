package Q81;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BadgesView.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"LQ81/d;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getBadge", "()Landroid/widget/TextView;", "badge", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getHasRealtyLayoutBadge", "()Landroid/widget/ImageView;", "hasRealtyLayoutBadge", "Landroid/view/View;", "d", "Landroid/view/View;", "getHasDelivery", "()Landroid/view/View;", "hasDelivery", "e", "getHasVideoBadge", "hasVideoBadge", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public final TextView badge;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView hasRealtyLayoutBadge;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final View hasDelivery;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView hasVideoBadge;

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(getContext()).inflate(R.layout.advert_status_info_badges, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        D6.c(this, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.rich_snippet_info_badge_horizontal_offset)), null, null, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.rich_snippet_info_badge_vertical_offset)), 6);
        this.badge = (TextView) findViewById(R.id.badge);
        View viewFindViewById = findViewById(R.id.has_realty_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.hasRealtyLayoutBadge = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.delivery_status);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.hasDelivery = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.has_video);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.hasVideoBadge = (ImageView) viewFindViewById3;
    }

    @l
    public final TextView getBadge() {
        return this.badge;
    }

    @k
    public final View getHasDelivery() {
        return this.hasDelivery;
    }

    @k
    public final ImageView getHasRealtyLayoutBadge() {
        return this.hasRealtyLayoutBadge;
    }

    @k
    public final ImageView getHasVideoBadge() {
        return this.hasVideoBadge;
    }
}
