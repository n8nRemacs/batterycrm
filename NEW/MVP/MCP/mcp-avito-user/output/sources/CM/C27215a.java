package cm;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.tabs.CalltrackingTab;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: CalltrackingTabAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcm/a;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/calltracking/tabs/CalltrackingTab;", "Lcm/b;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C27215a extends g<CalltrackingTab, C27216b> {
    public C27215a() {
        throw null;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(i iVar, CalltrackingTab calltrackingTab) {
        C27216b c27216b = (C27216b) iVar;
        CalltrackingTab calltrackingTab2 = calltrackingTab;
        I5.a(c27216b.f58123b, calltrackingTab2.f113778b, false);
        TextView textView = c27216b.f58124c;
        I5.a(textView, calltrackingTab2.f113779c, false);
        textView.setTextColor(D6.q(c27216b.f58122a, calltrackingTab2.f113780d ? R.color.red : R.color.gray44));
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final i b(View view) {
        return new C27216b(view);
    }
}
