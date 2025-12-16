package P81;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.job.i;

/* compiled from: JobCompanyCarouselCard.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP81/b;", "LP81/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f12862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f12863c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f12864d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CheckableImageButton f12865e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f12866f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final i f12867g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12868h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12869i;

    public b(@k View view) {
        this.f12862b = view;
        View viewFindViewById = view.findViewById(R.id.title_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f12863c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f12864d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f12865e = (CheckableImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.actions_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f12866f = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.multi_line_location_root);
        this.f12867g = viewFindViewById5 != null ? new i(viewFindViewById5) : null;
        this.f12868h = D6.t(view, R.dimen.job_carousel_item_actions_between_margin);
        this.f12869i = D6.t(view, R.dimen.job_carousel_item_background_corner_radius);
    }

    public final boolean a() {
        return com.avito.android.lib.util.darkTheme.c.a(this.f12862b.getContext());
    }
}
