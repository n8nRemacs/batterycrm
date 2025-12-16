package com.avito.android.tariff_lf_constructor.configure.locations.items.badges;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocationBadgesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/g;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f299939b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f299940c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f299941d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f299942e;

    /* renamed from: f, reason: collision with root package name */
    public final int f299943f;

    /* renamed from: g, reason: collision with root package name */
    public final int f299944g;

    /* renamed from: h, reason: collision with root package name */
    public final int f299945h;

    /* renamed from: i, reason: collision with root package name */
    public final int f299946i;

    /* renamed from: j, reason: collision with root package name */
    public final int f299947j;

    /* compiled from: LocationBadgesItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_lf_constructor/configure/locations/items/badges/i$a", "Lcom/avito/android/lib/design/chips/Chips$e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.chips.h, G0> f299948a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super com.avito.android.lib.design.chips.h, G0> lVar) {
            this.f299948a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.e
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            this.f299948a.invoke(hVar);
        }
    }

    /* compiled from: LocationBadgesItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "lineSpaceAvailable", "", "position", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Boolean, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f299950m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<? extends com.avito.android.lib.design.chips.h> list) {
            super(2);
            this.f299950m = list;
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
        @Override // Y41.p
        public final G0 invoke(Boolean bool, Integer num) throws Resources.NotFoundException {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            i iVar = i.this;
            Integer maxLines = iVar.f299940c.getMaxLines();
            TextView textView = iVar.f299942e;
            int i12 = iVar.f299946i;
            if ((maxLines != null && maxLines.intValue() == i12) || iIntValue > iVar.f299947j) {
                Chips chips = iVar.f299940c;
                Integer maxLines2 = chips.getMaxLines();
                if (maxLines2 != null && maxLines2.intValue() == i12) {
                    Integer maxLines3 = chips.getMaxLines();
                    TextView textView2 = iVar.f299941d;
                    if (maxLines3 != null && maxLines3.intValue() == i12 && zBooleanValue) {
                        D6.w(textView2);
                        D6.w(textView);
                    } else {
                        Integer maxLines4 = chips.getMaxLines();
                        if (maxLines4 != null && maxLines4.intValue() == i12 && !zBooleanValue) {
                            D6.H(textView2);
                            Resources resources = iVar.itemView.getContext().getResources();
                            ?? r12 = this.f299950m;
                            textView2.setText(FV.a.f4720a.e(resources.getQuantityString(R.plurals.select_locations_show_selected, r12.size() - iIntValue, Integer.valueOf(r12.size() - iIntValue)), iVar.f299939b.getContext(), iVar.f299944g, iVar.f299945h));
                        }
                    }
                } else {
                    D6.H(textView);
                }
            } else {
                D6.w(textView);
            }
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f299939b = view;
        View viewFindViewById = view.findViewById(R.id.badges);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f299940c = (Chips) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.show);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299941d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.hide);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299942e = (TextView) viewFindViewById3;
        this.f299943f = R.attr.textIconExpandLess;
        this.f299944g = R.attr.textIconExpandMore;
        this.f299945h = y6.b(6);
        this.f299946i = 2;
        this.f299947j = 1;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.items.badges.g
    public final void RY(@k l lVar, @k String str, @k final List list) {
        a aVar = new a(lVar);
        Chips chips = this.f299940c;
        chips.setChipsOnRightDrawableClickedListener(aVar);
        CharSequence charSequenceE = FV.a.f4720a.e(str, this.f299939b.getContext(), this.f299943f, this.f299945h);
        TextView textView = this.f299942e;
        textView.setText(charSequenceE);
        final int i12 = 0;
        this.f299941d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.locations.items.badges.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f299937c;

            {
                this.f299937c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i iVar = this.f299937c;
                        Chips chips2 = iVar.f299940c;
                        chips2.setMaxLines(null);
                        D6.H(iVar.f299942e);
                        D6.w(view);
                        chips2.setData(list);
                        break;
                    default:
                        i iVar2 = this.f299937c;
                        Integer numValueOf = Integer.valueOf(iVar2.f299946i);
                        Chips chips3 = iVar2.f299940c;
                        chips3.setMaxLines(numValueOf);
                        D6.H(iVar2.f299941d);
                        D6.w(view);
                        chips3.setData(list);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.locations.items.badges.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f299937c;

            {
                this.f299937c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        i iVar = this.f299937c;
                        Chips chips2 = iVar.f299940c;
                        chips2.setMaxLines(null);
                        D6.H(iVar.f299942e);
                        D6.w(view);
                        chips2.setData(list);
                        break;
                    default:
                        i iVar2 = this.f299937c;
                        Integer numValueOf = Integer.valueOf(iVar2.f299946i);
                        Chips chips3 = iVar2.f299940c;
                        chips3.setMaxLines(numValueOf);
                        D6.H(iVar2.f299941d);
                        D6.w(view);
                        chips3.setData(list);
                        break;
                }
            }
        });
        chips.setEllipsizeCallback(new b(list));
        D6.G(chips, O2.a(list));
        chips.setData(list);
    }
}
