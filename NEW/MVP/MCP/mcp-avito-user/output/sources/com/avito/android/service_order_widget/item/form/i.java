package com.avito.android.service_order_widget.item.form;

import Y41.p;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.service_order_widget.item.delegate.c;
import com.avito.android.service_order_widget.item.form.c;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderFormWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/form/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_order_widget/item/form/h;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f278906k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f278907b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f278908c;

    /* renamed from: d, reason: collision with root package name */
    public final Chips f278909d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f278910e;

    /* renamed from: f, reason: collision with root package name */
    public final ProgressBarRe23 f278911f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final b f278912g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ArrayList f278913h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public List<com.avito.android.lib.design.chips.h> f278914i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public p<? super DeepLink, ? super String, G0> f278915j;

    /* compiled from: ServiceOrderFormWidgetView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/form/i$a;", "", "<init>", "()V", "", "CHIPS_APPEAR_DELAY", "J", "CHIPS_APPEAR_DURATION", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@Y61.k View view) {
        super(view);
        this.f278907b = (TextView) view.findViewById(R.id.service_order_form_widget_title);
        this.f278908c = (TextView) view.findViewById(R.id.service_order_form_widget_description);
        this.f278909d = (Chips) view.findViewById(R.id.service_order_form_widget_chips);
        this.f278910e = (Button) view.findViewById(R.id.service_order_widget_primary_button);
        this.f278911f = (ProgressBarRe23) view.findViewById(R.id.service_order_form_widget_progress);
        this.f278912g = new b();
        this.f278914i = new ArrayList();
    }

    @Override // com.avito.android.service_order_widget.item.delegate.b
    public final void Pn(com.avito.android.service_order_widget.item.delegate.a aVar, com.avito.android.service_order_widget.item.delegate.d dVar) {
        c cVar = (c) aVar;
        String str = cVar.f278888c;
        TextView textView = this.f278907b;
        I5.a(textView, str, false);
        D6.l(true, textView, new j(this, cVar));
        com.avito.android.util.text.j.a(this.f278908c, cVar.f278889d, null);
        ArrayList arrayList = cVar.f278890e;
        boolean z12 = arrayList == null || arrayList.isEmpty();
        Chips chips = this.f278909d;
        D6.G(chips, !z12);
        chips.setChipsSelectedListener(this.f278912g);
        if (!new com.avito.android.lib.util.c(arrayList, this.f278913h).f181333c && arrayList != null) {
            this.f278913h = arrayList;
            chips.setAlpha(0.0f);
            this.f278914i = new ArrayList(arrayList);
            String string = chips.getContext().getString(R.string.service_order_widget_more_chip_label);
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) C42745f0.S(this.f278914i);
            if (L.f(hVar != null ? hVar.getF199741b() : null, string)) {
                C42745f0.o0(this.f278914i);
            }
            chips.setEllipsizeCallback(new l(this, string, cVar));
            if (chips.getAlpha() < 1.0f) {
                chips.animate().alpha(1.0f).setDuration(300L).setStartDelay(50L).start();
            }
            chips.setData(this.f278914i);
        }
        Float f12 = cVar.f278891f;
        boolean z13 = f12 != null;
        ProgressBarRe23 progressBarRe23 = this.f278911f;
        D6.G(progressBarRe23, z13);
        progressBarRe23.setProgress(f12 != null ? f12.floatValue() : 0.0f);
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = cVar.f278892g;
        String title = serviceOrderWidgetAction != null ? serviceOrderWidgetAction.getTitle() : null;
        Button button = this.f278910e;
        com.avito.android.lib.design.button.b.a(button, title, false);
        button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(7, cVar, dVar));
        this.f278915j = new k(2, dVar, c.a.class, "onDeepLinkClick", "onDeepLinkClick(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", 0);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f278915j = null;
        this.f278909d.setChipsSelectedListener(null);
    }

    /* compiled from: ServiceOrderFormWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_order_widget/item/form/i$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {
        public b() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof c.a) {
                i iVar = i.this;
                iVar.f278909d.j();
                p<? super DeepLink, ? super String, G0> pVar = iVar.f278915j;
                if (pVar != null) {
                    c.a aVar = (c.a) hVar;
                    ((k) pVar).invoke(aVar.f278902c, ((c.a) hVar).f278901b.toString());
                }
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
