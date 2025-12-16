package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PositionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f221073b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f221074c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f221075d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f221076e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f221077f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f221078g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f221079h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f221080i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e f221081j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.cpt.pre_activation.ui.c f221082k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public a f221083l;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f221073b = aVar;
        this.f221074c = view.getContext();
        this.f221075d = (TextView) view.findViewById(R.id.position_title);
        this.f221076e = (TextView) view.findViewById(R.id.position_description);
        this.f221077f = (TextView) view.findViewById(R.id.position_place_text);
        this.f221078g = (TextView) view.findViewById(R.id.position_delta_text);
        this.f221079h = view.findViewById(R.id.position_info_loading);
        View viewFindViewById = view.findViewById(R.id.position_info_content);
        this.f221080i = viewFindViewById;
        this.f221081j = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e(viewFindViewById, null, 2, 0 == true ? 1 : 0);
        this.f221082k = new com.avito.android.cpt.pre_activation.ui.c(this, 29);
    }

    public final void B80(a.InterfaceC6681a interfaceC6681a) {
        boolean z12 = interfaceC6681a instanceof a.InterfaceC6681a.C6682a;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e eVar = this.f221081j;
        TextView textView = this.f221078g;
        TextView textView2 = this.f221077f;
        View view = this.f221080i;
        View view2 = this.f221079h;
        if (!z12) {
            if (interfaceC6681a instanceof a.InterfaceC6681a.b) {
                textView2.setText("");
                textView.setText("");
                view2.setVisibility(0);
                view.setVisibility(4);
                eVar.b(null);
                return;
            }
            return;
        }
        view2.setVisibility(8);
        view.setVisibility(0);
        a.InterfaceC6681a.C6682a c6682a = (a.InterfaceC6681a.C6682a) interfaceC6681a;
        AttributedText attributedText = c6682a.f221062b;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f221082k);
        }
        AttributedText attributedText2 = c6682a.f221062b;
        com.avito.android.util.text.a aVar = this.f221073b;
        j.a(textView2, attributedText2, aVar);
        j.a(textView, c6682a.f221061a, aVar);
        PrintableText printableText = c6682a.f221063c;
        eVar.b(printableText != null ? printableText.k0(this.f221074c) : null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        a aVar = this.f221083l;
        a.InterfaceC6681a interfaceC6681a = aVar != null ? aVar.f221059e : null;
        a.InterfaceC6681a.C6682a c6682a = interfaceC6681a instanceof a.InterfaceC6681a.C6682a ? (a.InterfaceC6681a.C6682a) interfaceC6681a : null;
        AttributedText attributedText = c6682a != null ? c6682a.f221062b : null;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        a aVar2 = this.f221083l;
        AttributedText attributedText2 = aVar2 != null ? aVar2.f221058d : null;
        if (attributedText2 == null) {
            return;
        }
        attributedText2.setOnDeepLinkClickListener(null);
    }
}
