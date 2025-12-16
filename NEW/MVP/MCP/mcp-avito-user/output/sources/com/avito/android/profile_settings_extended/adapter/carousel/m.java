package com.avito.android.profile_settings_extended.adapter.carousel;

import Au.C13079a;
import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.profile_settings_extended.adapter.carousel.adapter.AdvertCarouselItem;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.X1;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import ru.avito.component.serp.FixedWidthLinearLayoutManager;

/* compiled from: ExtendedSettingsCarouselItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/l;", "LRb0/b;", "b", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.konveyor.adapter.b implements l, InterfaceC15026b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f229334p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f229335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15027c f229336c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f229337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f229338e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f229339f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f229340g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f229341h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f229342i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f229343j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f229344k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f229345l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public c f229346m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f229347n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f229348o;

    /* compiled from: ExtendedSettingsCarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/m$b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/m$b$a;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.Adapter<a> {

        /* renamed from: c, reason: collision with root package name */
        public final float f229350c;

        /* compiled from: ExtendedSettingsCarouselItemView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/m$b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends RecyclerView.C {
        }

        public b(float f12) {
            this.f229350c = f12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return (int) Math.ceil(this.f229350c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c12, int i12) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            return new a(C0.b(viewGroup, R.layout.ext_profile_settings_carousel_advert_item, viewGroup, false));
        }
    }

    /* compiled from: ExtendedSettingsCarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_settings_extended/adapter/carousel/m$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Parcelable, G0> f229352c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Parcelable, G0> lVar) {
            this.f229352c = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            int i13 = m.f229334p;
            if (m.this.f229342i.getScrollState() != 0) {
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            Parcelable parcelableY0 = layoutManager != null ? layoutManager.Y0() : null;
            if (parcelableY0 != null) {
                ((g) this.f229352c).invoke(parcelableY0);
            }
        }
    }

    public m(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.h hVar) throws Resources.NotFoundException {
        super(view);
        this.f229335b = hVar;
        this.f229336c = new C15027c(view);
        Context context = view.getContext();
        this.f229337d = context;
        Resources resources = context.getResources();
        View viewFindViewById = view.findViewById(R.id.extended_settings_carousel_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229338e = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_settings_carousel_item_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f229339f = textView;
        View viewFindViewById3 = view.findViewById(R.id.extended_settings_carousel_item_more_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229340g = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_settings_carousel_item_create_carousel_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229341h = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_settings_carousel_item_recycler_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f229342i = recyclerView;
        View viewFindViewById6 = view.findViewById(R.id.extended_settings_carousel_item_enable_switcher);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f229343j = (ListItemSwitcher) viewFindViewById6;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.extended_profile_settings_carousel_between_padding);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f229344k = jVar;
        new n();
        boolean z12 = resources.getBoolean(R.bool.is_tablet);
        boolean z13 = resources.getConfiguration().orientation == 2;
        float f12 = 3.07f;
        if (z12) {
            if (z13) {
                f12 = 4.07f;
            }
        } else if (!z13) {
            f12 = 2.07f;
        }
        recyclerView.setAdapter(jVar);
        recyclerView.l(new X1(0, 0, dimensionPixelSize, 3, null), -1);
        b bVar = new b(f12);
        int measuredWidth = recyclerView.getMeasuredWidth();
        Integer numValueOf = measuredWidth <= 0 ? null : Integer.valueOf(measuredWidth);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : C35835l0.g(recyclerView.getContext()).x, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        p pVar = new p(recyclerView.getContext(), f12, recyclerView.getLayoutManager());
        RecyclerView recyclerView2 = new RecyclerView(recyclerView.getContext(), null);
        recyclerView2.setLayoutManager(pVar);
        recyclerView2.setAdapter(bVar);
        recyclerView2.setRecycledViewPool(new RecyclerView.t());
        recyclerView2.setLayoutParams(recyclerView.getLayoutParams());
        recyclerView2.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        kotlin.ranges.l lVarR = s.r(0, recyclerView.getItemDecorationCount());
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            arrayList.add(recyclerView.a0(it.a()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            recyclerView2.l((RecyclerView.l) it2.next(), -1);
        }
        recyclerView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f229342i.setLayoutManager(new FixedWidthLinearLayoutManager(pVar.f229356J, this.f229337d));
        view.addOnAttachStateChangeListener(new a());
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void D50(@Y61.k Y41.l<? super Parcelable, G0> lVar) {
        c cVar = new c(lVar);
        c cVar2 = this.f229346m;
        RecyclerView recyclerView = this.f229342i;
        if (cVar2 != null) {
            recyclerView.v0(cVar2);
        }
        recyclerView.o(cVar);
        this.f229346m = cVar;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void KA(@Y61.k Y41.a<G0> aVar) {
        this.f229347n = aVar;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void L50(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem, @Y61.k Y41.a<G0> aVar) {
        ExtendedSettingsCarouselItem.Carousel carousel = extendedSettingsCarouselItem.f229286g;
        if (carousel != null) {
            D6.w(this.f229341h);
            I5.a(this.f229338e, carousel.f229290c, false);
            Button button = this.f229340g;
            D6.H(button);
            button.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(6, aVar));
            Integer numValueOf = Integer.valueOf(y6.b(8));
            TextView textView = this.f229339f;
            D6.c(textView, null, numValueOf, null, null, 13);
            com.avito.android.util.text.j.a(textView, carousel.f229291d, null);
            ListItemSwitcher listItemSwitcher = this.f229343j;
            D6.H(listItemSwitcher);
            Boolean bool = Boolean.TRUE;
            boolean zF2 = L.f(carousel.f229295h, bool);
            listItemSwitcher.i();
            listItemSwitcher.setChecked(zF2);
            listItemSwitcher.e(new C13079a(this, 7));
            listItemSwitcher.setEnabled(L.f(carousel.f229294g, bool));
            D6.H(this.f229342i);
            List<ExtendedProfileSettingsAdvert> list = carousel.f229292e;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AdvertCarouselItem(null, (ExtendedProfileSettingsAdvert) it.next(), 1, null));
            }
            this.f229335b.f338510e = new UV0.c(arrayList);
            this.f229344k.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void Nm(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem, @Y61.k Y41.a<G0> aVar) {
        D6.w(this.f229342i);
        D6.w(this.f229340g);
        D6.w(this.f229343j);
        ExtendedSettingsCarouselItem.EmptyState emptyState = extendedSettingsCarouselItem.f229284e;
        I5.a(this.f229338e, emptyState.f229296b, false);
        Integer numValueOf = Integer.valueOf(y6.b(12));
        TextView textView = this.f229339f;
        D6.c(textView, null, numValueOf, null, null, 13);
        I5.a(textView, emptyState.f229297c, false);
        Button button = this.f229341h;
        com.avito.android.lib.design.button.b.a(button, emptyState.f229298d, false);
        button.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(7, aVar));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void T7(@Y61.k Parcelable parcelable) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.f229342i;
        if (recyclerView.getScrollState() == 0 && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void W7(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f229345l = lVar;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f229348o = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        c cVar = this.f229346m;
        if (cVar != null) {
            this.f229342i.v0(cVar);
        }
        this.f229343j.i();
        this.f229340g.setOnClickListener(null);
        this.f229341h.setOnClickListener(null);
        Y41.a<G0> aVar = this.f229348o;
        if (aVar != null) {
            ((i) aVar).invoke();
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.l
    public final void kT() {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.f229342i;
        if (recyclerView.getScrollState() == 0 && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.l1(0);
        }
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229336c.xT(z12);
    }

    /* compiled from: ExtendedSettingsCarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_settings_extended/adapter/carousel/m$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.a<G0> aVar = m.this.f229347n;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}
