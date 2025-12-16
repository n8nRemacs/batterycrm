package com.avito.android.screens.bbip.ui.items.budget;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: BudgetItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0005²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip/ui/items/budget/i;", "Lcom/avito/android/screens/bbip/ui/items/budget/p;", VoiceInfo.STATE, "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f260329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<p> f260330c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f260331d;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bbip_budget_title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260329b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bbip_budget_compose_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById2;
        p.f260332c.getClass();
        this.f260330c = p2.a(p.f260333d);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(1327854489, new m(this), true));
    }

    public final void B80(int i12, List<a> list, boolean z12) {
        List<a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                this.f260330c.setValue(new p(arrayList, z12 ? Integer.valueOf(i12) : null));
                return;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = (a) next;
            arrayList.add(new a(aVar.f260300a, aVar.f260301b, aVar.f260302c, i13 == i12));
            i13 = i14;
        }
    }

    @Override // com.avito.android.screens.bbip.ui.items.budget.i
    public final void ev(@Y61.k ArrayList arrayList, @Y61.l String str, @Y61.k Y41.l lVar) {
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(((a) it.next()).f260300a, str)) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        B80(numValueOf != null ? numValueOf.intValue() : 0, arrayList, true);
        this.f260331d = lVar;
    }

    @Override // com.avito.android.screens.bbip.ui.items.budget.i
    public final void setTitle(@Y61.k String str) {
        this.f260329b.setText(str);
    }
}
