package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development;

import Ow.C14742a;
import Y41.l;
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
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.a;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;
import sK0.C48063a;

/* compiled from: DevelopmentSearchResultItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/j;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f138322o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f138323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f138324c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f138325d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f138326e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageButton f138327f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f138328g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f138329h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f138330i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C14742a f138331j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f138332k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final p f138333l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f138334m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f138335n;

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f138336b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.a;
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f138337b;

        public b(Y41.a<G0> aVar) {
            this.f138337b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f138337b.invoke();
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f138338b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DevelopmentSearchResultItem", "Click action error", (Throwable) obj);
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f138339b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f138340b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f138341b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(l<? super Integer, G0> lVar) {
            this.f138341b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf = null;
            }
            this.f138341b.invoke(numValueOf);
        }
    }

    /* compiled from: DevelopmentSearchResultItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f138342b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DevelopmentSearchResultItem", "Click image error", (Throwable) obj);
        }
    }

    public k(@Y61.k View view) throws BlueprintCollisionException {
        super(view);
        this.f138323b = view;
        this.f138324c = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.carousel);
        this.f138325d = (TextView) view.findViewById(R.id.development_name);
        this.f138326e = (TextView) view.findViewById(R.id.developer_name);
        View viewFindViewById = view.findViewById(R.id.options);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f138327f = (ImageButton) viewFindViewById;
        this.f138328g = (TextView) view.findViewById(R.id.price_range);
        this.f138329h = (TextView) view.findViewById(R.id.agent_commission);
        this.f138330i = (TextView) view.findViewById(R.id.completion_quarter);
        this.f138331j = new C14742a(view);
        this.f138332k = (TextView) view.findViewById(R.id.address);
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f138334m = cVar;
        this.f138335n = new io.reactivex.rxjava3.disposables.c();
        com.avito.android.cyclic_gallery_widget.image_carousel.r rVar = new com.avito.android.cyclic_gallery_widget.image_carousel.r(new u(1.3333334f, cVar), null, null, null, null, null, 62, null);
        com.avito.android.cyclic_gallery_widget.image_carousel.c cVar2 = new com.avito.android.cyclic_gallery_widget.image_carousel.c(new com.avito.android.cyclic_gallery_widget.image_carousel.d(1.3333334f, cVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(rVar);
        c10493a.b(cVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        p pVar = new p(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, false, Integer.valueOf((int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.carousel_item_gap)), null, false, 192, null);
        this.f138333l = pVar;
        int iB2 = (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.carousel_horizontal_padding);
        D6.f(pVar.f132066a, iB2, 0, iB2, 0, 10);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void B0(@Y61.l String str) {
        I5.a(this.f138332k, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void D2(@Y61.l Metro metro) {
        this.f138331j.a(metro);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void FU(@Y61.k Y41.a<G0> aVar) {
        this.f138335n.b(this.f138334m.N(a.f138336b).g(i.a.class).v0(new b(aVar), c.f138338b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void Gc(@Y61.k l<? super Integer, G0> lVar) {
        this.f138335n.b(this.f138334m.N(d.f138339b).g(i.e.class).d0(e.f138340b).v0(new f(lVar), g.f138342b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void Q00(@Y61.k String str, @Y61.k String str2) {
        TextView textView = this.f138330i;
        I5.a(textView, str, false);
        textView.setTextColor(C48063a.f437606a.b(textView.getContext(), str2, null));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void X00(@Y61.k String str) {
        I5.a(this.f138328g, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void Y8(@Y61.k Y41.a<G0> aVar) {
        this.f138327f.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(27, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void Yk(@Y61.k String str) {
        I5.a(this.f138325d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void Z50(@Y61.k String str) {
        I5.a(this.f138326e, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f138323b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(28, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f138335n.e();
        this.f138323b.setOnClickListener(null);
        this.f138327f.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void sh(@Y61.k a.C4173a c4173a) {
        CharSequence charSequenceY4 = c4173a.f138306a.Y4(this.f138324c);
        TextView textView = this.f138329h;
        I5.a(textView, charSequenceY4, false);
        if (c4173a.f138307b) {
            FV.a.f4720a.f(textView, R.attr.textIconInfo, FV.a.f4721b);
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.j
    public final void xf(@Y61.k ArrayList arrayList, @Y61.k Set set) {
        p pVar = this.f138333l;
        int i12 = p.f132065v;
        pVar.g(arrayList, false);
        if (L.f(pVar.f132072g, set)) {
            return;
        }
        pVar.f132072g = set;
        pVar.h();
    }
}
