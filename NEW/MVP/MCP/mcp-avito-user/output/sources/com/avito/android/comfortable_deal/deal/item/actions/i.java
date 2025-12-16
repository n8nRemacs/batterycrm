package com.avito.android.comfortable_deal.deal.item.actions;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.util.y;
import com.avito.android.R;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/actions/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/actions/h;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f121151b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OffsetLayout f121152c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final y.b f121153d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super ActionTransition, G0> f121154e;

    public i(@k View view) {
        super(view);
        this.f121151b = view.getContext();
        this.f121152c = (OffsetLayout) view.findViewById(R.id.actions);
        this.f121153d = new y.b(4);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.actions.h
    public final void O2(@k Y41.l<? super ActionTransition, G0> lVar) {
        this.f121154e = lVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.actions.h
    public final void h2(@k List<a> list) {
        y.b bVar;
        OffsetLayout offsetLayout = this.f121152c;
        offsetLayout.removeAllViews();
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = this.f121153d;
            if (!zHasNext) {
                break;
            }
            a aVar = (a) it.next();
            Button button = (Button) bVar.b();
            if (button == null) {
                button = new Button(this.f121151b, null, 0, 0, 14, null);
            }
            button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
            button.setText(aVar.f121141b);
            button.setOnClickListener(new com.avito.android.body_condition.h(17, this, aVar));
            offsetLayout.addView(button);
            arrayList.add(button);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bVar.a((Button) it2.next());
        }
        D6.G(offsetLayout, !list.isEmpty());
    }
}
