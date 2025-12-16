package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot;

import Ow.C14742a;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.a;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;

/* compiled from: LotSearchResultItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/k;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f138430q = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f138431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f138432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f138433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f138434e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f138435f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageButton f138436g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageButton f138437h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Spinner f138438i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f138439j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f138440k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f138441l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f138442m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f138443n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C14742a f138444o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f138445p;

    /* compiled from: LotSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f138446b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: LotSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f138447b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: LotSearchResultItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f138448b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Integer, G0> lVar) {
            this.f138448b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf = null;
            }
            this.f138448b.invoke(numValueOf);
        }
    }

    /* compiled from: LotSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f138449b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("LotSearchResultItem", "Click image error", (Throwable) obj);
        }
    }

    public l(@Y61.k View view) throws BlueprintCollisionException {
        super(view);
        this.f138431b = view;
        this.f138432c = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.carousel);
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f138434e = cVar;
        this.f138435f = (TextView) view.findViewById(R.id.lot_title);
        View viewFindViewById = view.findViewById(R.id.options);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f138436g = (ImageButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.add_to_selection);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f138437h = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.add_to_selection_loader);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f138438i = (Spinner) viewFindViewById3;
        this.f138439j = (TextView) view.findViewById(R.id.main_price);
        this.f138440k = (TextView) view.findViewById(R.id.price_per_meter);
        this.f138441l = (TextView) view.findViewById(R.id.agent_commission);
        this.f138442m = (TextView) view.findViewById(R.id.square_floor_completionQuarter);
        this.f138443n = (TextView) view.findViewById(R.id.development_info);
        this.f138444o = new C14742a(view);
        this.f138445p = new io.reactivex.rxjava3.disposables.c();
        com.avito.android.cyclic_gallery_widget.image_carousel.r rVar = new com.avito.android.cyclic_gallery_widget.image_carousel.r(new u(1.3333334f, cVar), null, null, null, null, null, 62, null);
        com.avito.android.cyclic_gallery_widget.image_carousel.c cVar2 = new com.avito.android.cyclic_gallery_widget.image_carousel.c(new com.avito.android.cyclic_gallery_widget.image_carousel.d(1.3333334f, cVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(rVar);
        c10493a.b(cVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        p pVar = new p(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, false, Integer.valueOf((int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.carousel_item_gap)), null, false, 192, null);
        this.f138433d = pVar;
        int iB2 = (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.carousel_horizontal_padding);
        D6.f(pVar.f132066a, iB2, 0, iB2, 0, 10);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void D2(@Y61.l Metro metro) {
        this.f138444o.a(metro);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void GG(@Y61.k PrintableText printableText) {
        I5.a(this.f138441l, printableText.Y4(this.f138432c), false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void Gc(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f138445p.b(this.f138434e.N(a.f138446b).g(i.e.class).d0(b.f138447b).v0(new c(lVar), d.f138449b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void OA(boolean z12) {
        D6.G(this.f138438i, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void Oj(@Y61.k String str) {
        I5.a(this.f138442m, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void Q70(@Y61.k String str) {
        I5.a(this.f138440k, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void TT(@Y61.k Y41.a<G0> aVar) {
        this.f138437h.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(2, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void WH(@Y61.k ArrayList arrayList) {
        p pVar = this.f138433d;
        int i12 = p.f132065v;
        pVar.g(arrayList, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void Y8(@Y61.k Y41.a<G0> aVar) {
        this.f138436g.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(1, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void Zv(@Y61.k a.b bVar) {
        TextView textView = this.f138439j;
        I5.a(textView, bVar.f138414a, false);
        if (bVar.f138415b) {
            FV.a.f4720a.f(textView, R.attr.textIconInfo, FV.a.f4721b);
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f138431b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(3, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void cf(boolean z12) {
        D6.G(this.f138437h, z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f138445p.e();
        this.f138431b.setOnClickListener(null);
        this.f138436g.setOnClickListener(null);
        ImageButton imageButton = this.f138437h;
        D6.w(imageButton);
        imageButton.setOnClickListener(null);
        D6.w(this.f138438i);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void r70(@Y61.k String str) {
        I5.a(this.f138443n, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.k
    public final void to(@Y61.k PrintableText printableText) {
        I5.a(this.f138435f, printableText.Y4(this.f138432c), false);
    }
}
