package Ap0;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TabSelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAp0/f;", "LAp0/e;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f635a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f636b;

    public f(@k View view) {
        this.f635a = view;
        View viewFindViewById = view.findViewById(R.id.tab_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f636b = (TextView) viewFindViewById;
    }

    @Override // Ap0.e
    public final void d(@k Cp0.e eVar) {
        this.f636b.setText(eVar.f2698c);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF635a() {
        return this.f635a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
