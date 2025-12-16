package bG0;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TrxPromoStrProgressOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbG0/f;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f57027a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View.OnClickListener f57028b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final View f57029c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public e f57030d;

    public f(ViewGroup viewGroup, View.OnClickListener onClickListener, View view, int i12, C42822w c42822w) {
        view = (i12 & 4) != 0 ? null : view;
        this.f57027a = viewGroup;
        this.f57028b = onClickListener;
        this.f57029c = view;
    }

    public final void a() {
        if (this.f57030d == null) {
            ViewGroup viewGroup = this.f57027a;
            this.f57030d = new e(viewGroup.getContext(), this.f57029c, this.f57028b);
            viewGroup.addView(this.f57030d, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
