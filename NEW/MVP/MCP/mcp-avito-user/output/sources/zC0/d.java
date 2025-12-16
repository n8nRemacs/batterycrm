package ZC0;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.point.Point;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PeriodTabView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZC0/d;", "LZC0/c;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f19977a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f19978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Point f19979c;

    public d(@k View view) {
        this.f19977a = view;
        View viewFindViewById = view.findViewById(R.id.tab_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f19978b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.red_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        this.f19979c = (Point) viewFindViewById2;
    }

    @Override // ZC0.c
    public final void e(boolean z12, @l CharSequence charSequence) {
        I5.a(this.f19978b, charSequence, false);
        D6.G(this.f19979c, z12);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF19977a() {
        return this.f19977a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
