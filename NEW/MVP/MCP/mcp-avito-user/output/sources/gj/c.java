package Gj;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.chips.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishChipsView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LGj/c;", "LHj/c;", "LGj/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends Hj.c implements InterfaceC13889a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Chips f6719m;

    public c(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_chips_content, aVar);
        this.f6719m = (Chips) this.f7656e.findViewById(R.id.chips);
    }

    @Override // Gj.InterfaceC13889a
    public final void L7(@k ArrayList arrayList, @l List list, @k p pVar) {
        Chips chips = this.f6719m;
        chips.setData(arrayList);
        chips.j();
        if (list != null) {
            chips.r(list);
        }
        chips.setChipsSelectedListener(new b(pVar));
    }

    @Override // Gj.InterfaceC13889a
    public final void Wa(@k ArrayList arrayList) {
        Chips chips = this.f6719m;
        Set setP0 = C42745f0.P0(chips.s());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!setP0.contains(hVar)) {
                chips.q(hVar, false);
            }
        }
    }

    @Override // Gj.InterfaceC13889a
    public final void be(@l Integer num) {
        this.f6719m.setMaxSelected(num != null ? num.intValue() : -1);
    }

    @Override // Gj.InterfaceC13889a
    public final void i2(boolean z12) {
        this.f6719m.setKeepSelected(z12);
    }

    @Override // Gj.InterfaceC13889a
    public final void m2(@k Chips.DisplayType displayType) {
        this.f6719m.setDisplayType(displayType);
    }

    @Override // Gj.InterfaceC13889a
    public final void r3(@k SelectStrategy selectStrategy) {
        this.f6719m.setSelectStrategy(selectStrategy);
    }

    @Override // Gj.InterfaceC13889a
    public final void ub(@k ArrayList arrayList) {
        Chips chips = this.f6719m;
        Set setP0 = C42745f0.P0(chips.s());
        boolean keepSelected = chips.getKeepSelected();
        i2(false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (setP0.contains(hVar)) {
                chips.q(hVar, false);
            }
        }
        i2(keepSelected);
    }
}
