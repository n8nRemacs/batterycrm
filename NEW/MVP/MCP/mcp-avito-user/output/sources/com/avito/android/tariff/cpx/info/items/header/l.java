package com.avito.android.tariff.cpx.info.items.header;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/header/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/info/items/header/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f296517f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f296518b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f296519c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f296520d;

    /* renamed from: e, reason: collision with root package name */
    public final TabGroup f296521e;

    /* compiled from: TariffCpxInfoHeaderItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "i", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f296523m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f296524n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<com.avito.android.tariff.cpx.info.items.header.a> f296525o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, Y41.l<? super DeepLink, G0> lVar, List<com.avito.android.tariff.cpx.info.items.header.a> list) {
            super(1);
            this.f296523m = i12;
            this.f296524n = lVar;
            this.f296525o = list;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            TabGroup tabGroup = l.this.f296521e;
            int i12 = this.f296523m;
            tabGroup.n(i12);
            if (iIntValue != i12) {
                this.f296524n.invoke(this.f296525o.get(iIntValue).f296500d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoHeaderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ((Y41.l) this.receiver).invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f296518b = (TextView) view.findViewById(R.id.tariff_cpx_info_header_title);
        TextView textView = (TextView) view.findViewById(R.id.tariff_cpx_info_header_description);
        this.f296519c = textView;
        this.f296520d = (Button) view.findViewById(R.id.tariff_cpx_info_header_button);
        this.f296521e = (TabGroup) view.findViewById(R.id.tabs_navigation);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpx.info.items.header.k
    public final void K2(@Y61.k Y41.l lVar, @Y61.k List list) {
        TabGroup tabGroup = this.f296521e;
        int i12 = 0;
        tabGroup.setVisibility(0);
        List<com.avito.android.tariff.cpx.info.items.header.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.android.tariff.cpx.info.items.header.a aVar : list2) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(aVar.f296499c), L.f(aVar.f296497a, Boolean.TRUE) ? b.a.e.f180735a : null, false, 4, null));
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((com.avito.android.tariff.cpx.info.items.header.a) it.next()).f296498b) {
                break;
            } else {
                i12++;
            }
        }
        tabGroup.setState(new com.avito.android.lib.design.tab_group.d(arrayList, i12, new b(1, new a(i12, lVar, list), Y41.l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
    }

    @Override // com.avito.android.tariff.cpx.info.items.header.k
    public final void Zx(@Y61.l com.avito.android.tariff.cpx.info.items.header.b bVar, @Y61.k Y41.a<G0> aVar) {
        boolean z12 = bVar != null;
        Button button = this.f296520d;
        D6.G(button, z12);
        if ((bVar != null ? bVar.f296501a : null) == null) {
            return;
        }
        button.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(11, aVar));
        button.setImageDrawable(C35835l0.h(bVar.f296501a.intValue(), this.itemView.getContext()));
    }

    @Override // com.avito.android.tariff.cpx.info.items.header.k
    public final void g(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f296519c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.info.items.header.k
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f296518b, str, false);
    }
}
