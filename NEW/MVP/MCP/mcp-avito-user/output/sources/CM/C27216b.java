package cm;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import kotlin.Metadata;

/* compiled from: CalltrackingTabView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcm/b;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/i;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C27216b implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f58122a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f58123b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f58124c;

    public C27216b(@k View view) {
        this.f58122a = view;
        this.f58123b = (TextView) view.findViewById(R.id.tab_title);
        this.f58124c = (TextView) view.findViewById(R.id.tab_counter);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF58122a() {
        return this.f58122a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
