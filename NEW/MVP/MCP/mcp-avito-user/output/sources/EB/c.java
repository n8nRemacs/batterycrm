package Eb;

import TV0.e;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NotLoadAdStubItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LEb/c;", "LTV0/e;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/ui/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends com.avito.android.serp.c implements e, com.avito.android.advertising.ui.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f4089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdStyle f4090c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Rect f4091d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final RatioForegroundFrameLayout f4092e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final RatioForegroundFrameLayout f4093f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final View f4094g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final View f4095h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final View f4096i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final View f4097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, AdStyle adStyle, Rect rect, int i12, C42822w c42822w) {
        super(view);
        rect = (i12 & 4) != 0 ? new Rect() : rect;
        this.f4089b = view;
        this.f4090c = adStyle;
        this.f4091d = rect;
        this.f4092e = (RatioForegroundFrameLayout) view.findViewById(R.id.top_skeleton_view);
        this.f4093f = (RatioForegroundFrameLayout) view.findViewById(R.id.grid_top_skeleton_view);
        this.f4094g = view.findViewById(R.id.bottom_skeleton_view);
        this.f4095h = view.findViewById(R.id.text_skeleton_1);
        this.f4096i = view.findViewById(R.id.text_skeleton_2);
        this.f4097j = view.findViewById(R.id.text_skeleton_3);
    }

    public final void B80(float f12) throws Resources.NotFoundException {
        View view = this.f4089b;
        view.setBackground(null);
        view.setPadding(0, 0, 0, 0);
        RatioForegroundFrameLayout ratioForegroundFrameLayout = this.f4093f;
        if (ratioForegroundFrameLayout != null) {
            v.b(ratioForegroundFrameLayout, R.dimen.ad_borderless_grid_image_radius);
            ratioForegroundFrameLayout.setRatio(f12);
            ratioForegroundFrameLayout.getLayoutParams().height = 0;
        }
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_horizontal_margin);
        View view2 = this.f4095h;
        if (view2 != null) {
            view2.getLayoutParams().width = -1;
            D6.c(view2, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
        }
        View view3 = this.f4096i;
        if (view3 != null) {
            view3.getLayoutParams().width = -1;
            D6.c(view3, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
        }
        View view4 = this.f4097j;
        if (view4 != null) {
            D6.c(view4, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
        }
    }

    public final void C80() {
        RatioForegroundFrameLayout ratioForegroundFrameLayout = this.f4092e;
        if (ratioForegroundFrameLayout != null) {
            ratioForegroundFrameLayout.setRatio(-1.0f);
            ViewGroup.LayoutParams layoutParams = ratioForegroundFrameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ratioForegroundFrameLayout.getResources().getDimensionPixelOffset(R.dimen.ad_skeleton_rich_height);
            }
        }
        View view = this.f4094g;
        if (view != null) {
            D6.c(view, null, null, null, Integer.valueOf(view.getResources().getDimensionPixelOffset(R.dimen.ad_rich_bottom_padding)), 7);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return getF88601c().b();
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns, reason: from getter */
    public final Rect getF87360i() {
        return this.f4091d;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF88601c() {
        return this.f4090c;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
