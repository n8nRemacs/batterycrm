package com.avito.android.tariff_cpt.info.ui.items.header;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.info.ui.items.header.a;
import com.avito.android.util.C35835l0;
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

/* compiled from: CptInfoHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/header/i;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f298364h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f298365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298366c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f298367d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f298368e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f298369f;

    /* renamed from: g, reason: collision with root package name */
    public final TabGroup f298370g;

    /* compiled from: CptInfoHeaderItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "i", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f298372m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f298373n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<a.b> f298374o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, l<? super DeepLink, G0> lVar, List<a.b> list) {
            super(1);
            this.f298372m = i12;
            this.f298373n = lVar;
            this.f298374o = list;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            TabGroup tabGroup = j.this.f298370g;
            int i12 = this.f298372m;
            tabGroup.n(i12);
            if (iIntValue != i12) {
                this.f298373n.invoke(this.f298374o.get(iIntValue).f298352d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoHeaderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ((l) this.receiver).invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f298365b = view;
        this.f298366c = aVar;
        this.f298367d = (TextView) view.findViewById(R.id.cpt_info_header_item_title);
        this.f298368e = (TextView) view.findViewById(R.id.cpt_info_header_item_description);
        this.f298369f = (Button) view.findViewById(R.id.cpt_info_header_item_button);
        this.f298370g = (TabGroup) view.findViewById(R.id.tabs_navigation);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.header.i
    public final void K2(@k l lVar, @k List list) {
        TabGroup tabGroup = this.f298370g;
        int i12 = 0;
        tabGroup.setVisibility(0);
        List<a.b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (a.b bVar : list2) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(bVar.f298351c), L.f(bVar.f298349a, Boolean.TRUE) ? b.a.e.f180735a : null, false, 4, null));
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((a.b) it.next()).f298350b) {
                break;
            } else {
                i12++;
            }
        }
        tabGroup.setState(new com.avito.android.lib.design.tab_group.d(arrayList, i12, new b(1, new a(i12, lVar, list), l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.header.i
    public final void g(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f298368e, attributedText, this.f298366c);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.header.i
    public final void setTitle(@k String str) {
        I5.a(this.f298367d, str, false);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.header.i
    public final void t30(@Y61.l a.C9112a c9112a, @k Y41.a<G0> aVar) throws Resources.NotFoundException {
        Integer num;
        View view = this.f298365b;
        Drawable drawableH = (c9112a == null || (num = c9112a.f298346a) == null) ? null : C35835l0.h(num.intValue(), view.getContext());
        Button button = this.f298369f;
        if (drawableH != null) {
            button.setImageDrawable(drawableH);
        }
        Context context = view.getContext();
        String str = c9112a != null ? c9112a.f298347b : null;
        Integer numValueOf = str != null ? Integer.valueOf(C35835l0.j(com.avito.android.lib.util.f.d(str), context)) : null;
        if (numValueOf != null) {
            button.setAppearance(numValueOf.intValue());
        }
        button.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(19, aVar));
    }
}
