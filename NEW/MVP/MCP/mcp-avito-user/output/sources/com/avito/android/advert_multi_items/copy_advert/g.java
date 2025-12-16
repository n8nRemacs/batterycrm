package com.avito.android.advert_multi_items.copy_advert;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: MultiItemCopyView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_multi_items/copy_advert/g;", "Lcom/avito/android/advert_multi_items/copy_advert/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85888b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC14875c f85889c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f85890d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f85891e;

    public g(@k InterfaceC14873a interfaceC14873a, @l InterfaceC14875c interfaceC14875c, @k View view) {
        super(view);
        this.f85888b = interfaceC14873a;
        this.f85889c = interfaceC14875c;
        this.f85890d = view;
        this.f85891e = (Button) view.findViewById(R.id.copyButton);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        Ta.b bVar = (Ta.b) aVar;
        Context context = this.f85890d.getContext();
        Integer numA = q.a(bVar.f15733e);
        this.f85891e.setState(new UU.a(bVar.f15731c, null, false, false, false, new f(this, bVar), C35835l0.h(numA != null ? numA.intValue() : R.attr.ic_addThin16, context), null, null, false, 926, null));
        InterfaceC14875c interfaceC14875c = this.f85889c;
        if (interfaceC14875c != null) {
            interfaceC14875c.p();
        }
    }
}
