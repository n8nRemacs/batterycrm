package com.avito.android.advert_details_items.neighboring_dates;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsNeighboringDatesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/neighboring_dates/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f84907n = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84908b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f84909c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A f84910d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayoutManager f84911e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public N f84912f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f84913g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f84914h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f84915i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f84916j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RecyclerView f84917k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LinearLayout f84918l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f84919m;

    /* compiled from: AdvertDetailsNeighboringDatesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84920a;

        static {
            int[] iArr = new int[NeighboringDatesItem.NeighboringDatesChipItem.ChipType.values().length];
            try {
                NeighboringDatesItem.NeighboringDatesChipItem.ChipType chipType = NeighboringDatesItem.NeighboringDatesChipItem.ChipType.f84929b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84920a = iArr;
        }
    }

    /* compiled from: AdvertDetailsNeighboringDatesView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f84921l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    public i(@k View view, @k com.avito.konveyor.adapter.d dVar, @k A a12) {
        super(view);
        this.f84908b = view;
        this.f84909c = dVar;
        this.f84910d = a12;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f84911e = linearLayoutManager;
        RecyclerView.l aVar = new com.avito.android.advert_details_items.neighboring_dates.tools.a(y6.b(6), y6.b(16));
        this.f84912f = b.f84921l;
        View viewFindViewById = view.findViewById(R.id.shimmer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84913g = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84914h = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84915i = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.change_dates);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.f84916j = textView;
        View viewFindViewById5 = view.findViewById(R.id.multiplyChips);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        recyclerView.l(aVar, -1);
        a12.b(recyclerView);
        this.f84917k = recyclerView;
        View viewFindViewById6 = view.findViewById(R.id.fewChips);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84918l = (LinearLayout) viewFindViewById6;
        this.f84919m = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void A4(@k PrintableText printableText) {
        I5.a(this.f84915i, printableText.k0(this.f84908b.getContext()), false);
    }

    public final View B80(NeighboringDatesItem neighboringDatesItem) {
        View viewInflate;
        boolean z12 = neighboringDatesItem instanceof NeighboringDatesItem.NeighboringDatesChipItem;
        LinearLayout linearLayout = this.f84918l;
        LayoutInflater layoutInflater = this.f84919m;
        if (z12) {
            TextView textView = (TextView) layoutInflater.inflate(R.layout.advert_details_items_neighboring_dates_chip_date, (ViewGroup) linearLayout, false);
            NeighboringDatesItem.NeighboringDatesChipItem neighboringDatesChipItem = (NeighboringDatesItem.NeighboringDatesChipItem) neighboringDatesItem;
            j.a(textView, neighboringDatesChipItem.f84925e, null);
            textView.setBackgroundResource(a.f84920a[neighboringDatesChipItem.f84928h.ordinal()] == 1 ? R.drawable.advert_details_items_bg_neighboring_dates_chip_date_selected : R.drawable.advert_details_items_bg_neighboring_dates_chip_date_default);
            textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(21, this, neighboringDatesItem));
            viewInflate = textView;
        } else {
            if (!(neighboringDatesItem instanceof NeighboringDatesItem.NeighboringDatesShimmerItem)) {
                throw new NoWhenBranchMatchedException();
            }
            viewInflate = layoutInflater.inflate(R.layout.advert_details_items_neighboring_dates_chip_shimmer, (ViewGroup) linearLayout, false);
        }
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.weight = 1.0f;
            viewInflate.setLayoutParams(layoutParams2);
        }
        return viewInflate;
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void Hz(@Y61.l AdvertDetailsNeighboringDatesItem.State.Content.ChangeDateButton changeDateButton, @k Y41.a<G0> aVar) {
        TextView textView = this.f84916j;
        if (changeDateButton == null) {
            D6.w(textView);
            return;
        }
        I5.a(textView, changeDateButton.f84872b.k0(this.f84908b.getContext()), false);
        textView.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(17, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void Ss(@k l<? super String, G0> lVar) {
        this.f84912f = (N) lVar;
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void UG() {
        ViewGroup.LayoutParams layoutParams = this.f84908b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        D6.w(this.f84913g);
        D6.w(this.f84914h);
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void nW(@k AdvertDetailsNeighboringDatesItem.State.Content content) {
        boolean z12 = content instanceof AdvertDetailsNeighboringDatesItem.State.Content.OneChip;
        RecyclerView recyclerView = this.f84917k;
        LinearLayout linearLayout = this.f84918l;
        if (z12) {
            D6.w(recyclerView);
            D6.H(linearLayout);
            linearLayout.removeAllViews();
            View viewB80 = B80(((AdvertDetailsNeighboringDatesItem.State.Content.OneChip) content).f84880d);
            D6.c(viewB80, Integer.valueOf(y6.b(16)), null, Integer.valueOf(y6.b(16)), null, 10);
            linearLayout.addView(viewB80);
            return;
        }
        if (!(content instanceof AdvertDetailsNeighboringDatesItem.State.Content.TwoChips)) {
            if (content instanceof AdvertDetailsNeighboringDatesItem.State.Content.MultiplyChips) {
                D6.w(linearLayout);
                D6.H(recyclerView);
                h hVar = new h(content, this);
                this.f84909c.l(((AdvertDetailsNeighboringDatesItem.State.Content.MultiplyChips) content).f84876d, hVar);
                return;
            }
            return;
        }
        D6.w(recyclerView);
        D6.H(linearLayout);
        linearLayout.removeAllViews();
        AdvertDetailsNeighboringDatesItem.State.Content.TwoChips twoChips = (AdvertDetailsNeighboringDatesItem.State.Content.TwoChips) content;
        View viewB802 = B80(twoChips.f84883d);
        D6.c(viewB802, Integer.valueOf(y6.b(16)), null, null, null, 14);
        View viewB803 = B80(twoChips.f84884e);
        D6.c(viewB803, Integer.valueOf(y6.b(6)), null, Integer.valueOf(y6.b(16)), null, 10);
        linearLayout.addView(viewB802);
        linearLayout.addView(viewB803);
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void ty(boolean z12) {
        int iB2 = y6.b(28);
        int iB3 = y6.b(2);
        ViewGroup.LayoutParams layoutParams = this.f84908b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, iB2, 0, iB3);
        }
        LinearLayout linearLayout = this.f84914h;
        LinearLayout linearLayout2 = this.f84913g;
        if (z12) {
            D6.H(linearLayout2);
            D6.w(linearLayout);
        } else {
            D6.w(linearLayout2);
            D6.H(linearLayout);
        }
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.g
    public final void zY(@k RecyclerView.r rVar) {
        RecyclerView recyclerView = this.f84917k;
        recyclerView.s();
        recyclerView.o(rVar);
    }
}
