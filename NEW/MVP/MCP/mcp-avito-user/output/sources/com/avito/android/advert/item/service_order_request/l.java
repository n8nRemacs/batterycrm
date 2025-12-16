package com.avito.android.advert.item.service_order_request;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderRequestItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/l;", "Lcom/avito/android/advert/item/service_order_request/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f79908i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f79909b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f79910c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f79911d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f79912e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f79913f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f79914g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.tooltip.f f79915h;

    /* compiled from: ServiceOrderRequestItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.lib.design.tooltip.k, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f79916l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f79917m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(1);
            this.f79916l = str;
            this.f79917m = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.k kVar) {
            com.avito.android.lib.design.tooltip.k kVar2 = kVar;
            int i12 = 1;
            r.d dVar = new r.d(null, i12, 0 == true ? 1 : 0);
            dVar.f181263d = new r.a(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
            kVar2.f181224j = dVar;
            com.avito.android.lib.design.tooltip.p.a(kVar2, new k(this.f79916l, this.f79917m, kVar2));
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            l lVar = l.this;
            return Integer.valueOf(lVar.f79910c.getTop() + lVar.f79914g.getTop());
        }
    }

    /* compiled from: ServiceOrderRequestItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            l lVar = l.this;
            return Integer.valueOf(lVar.f79914g.getBottom() - (lVar.f79914g.getHeight() - lVar.f79910c.getBottom()));
        }
    }

    public l(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f79909b = aVar;
        View viewFindViewById = view.findViewById(R.id.service_order_button_primary);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f79910c = button;
        View viewFindViewById2 = view.findViewById(R.id.service_order_button_secondary);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79911d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.service_order_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79912e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.service_order_description_link);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79913f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.service_order_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f79914g = viewFindViewById5;
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        this.f79915h = recyclerView != null ? new com.avito.android.lib.design.tooltip.f(recyclerView, button, 2, 1, new b(), new c()) : null;
    }

    @Override // com.avito.android.advert.item.service_order_request.j
    public final void G20(@Y61.k String str, @Y61.k String str2) {
        com.avito.android.lib.design.tooltip.f fVar = this.f79915h;
        if (fVar != null) {
            fVar.c(new a(str, str2), true);
        }
    }

    @Override // com.avito.android.advert.item.service_order_request.j
    public final int Vd() {
        int[] iArr = new int[2];
        Button button = this.f79910c;
        button.getLocationOnScreen(iArr);
        return button.getHeight() + iArr[1];
    }

    @Override // com.avito.android.advert.item.service_order_request.j
    public final void er(@Y61.k ServiceOrderRequestItem serviceOrderRequestItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        String str = serviceOrderRequestItem.f79871d.f79881c;
        Button button = this.f79910c;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setLoading(serviceOrderRequestItem.f79871d.f79882d);
        ServiceOrderRequestItem.Action action = serviceOrderRequestItem.f79872e;
        boolean z12 = action != null;
        Button button2 = this.f79911d;
        D6.G(button2, z12);
        com.avito.android.lib.design.button.b.a(button2, action != null ? action.f79881c : null, false);
        button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(9, serviceOrderRequestItem, aVar));
        button2.setOnClickListener(new com.avito.android.advert.item.parking.h(16, aVar2));
        I5.a(this.f79912e, serviceOrderRequestItem.f79869b, false);
        AttributedText attributedText = serviceOrderRequestItem.f79870c;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new SE0.a(4, lVar));
        }
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f79913f;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, this.f79909b);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f79910c.setOnClickListener(null);
        this.f79911d.setOnClickListener(null);
        com.avito.android.lib.design.tooltip.f fVar = this.f79915h;
        if (fVar != null) {
            fVar.b();
        }
    }
}
