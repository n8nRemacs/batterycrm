package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import Y61.l;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsAutotekaTeaserItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/f;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f170090h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L0 f170091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f170092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f170093d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f170094e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f170095f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f170096g;

    public g(@Y61.k View view, @Y61.k L0 l02, @Y61.k j jVar) {
        super(view);
        this.f170091b = l02;
        this.f170092c = jVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170093d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.logo);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f170094e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.insights_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f170095f = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f170096g = (Button) viewFindViewById4;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.f
    public final void F70(@l AutotekaReportLink autotekaReportLink, @l Y41.a aVar) {
        String title = autotekaReportLink != null ? autotekaReportLink.getTitle() : null;
        Button button = this.f170096g;
        com.avito.android.lib.design.button.b.a(button, title, false);
        button.setClickable(autotekaReportLink != null);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(4, aVar));
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.f
    public final void R1(@Y61.k String str) {
        this.f170093d.setText(str);
        D6.G(this.f170094e, this.f170091b.f() >= 350);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.f
    public final void eb(@l List<TeaserInsightIcon> list) {
        Iterable iterable;
        Integer numValueOf;
        ViewGroup viewGroup = this.f170095f;
        viewGroup.removeAllViews();
        D6.G(viewGroup, O2.a(list));
        this.f170092c.getClass();
        if (list == null) {
            iterable = C42784z0.f406748b;
        } else {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            List<TeaserInsightIcon> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                Integer numValueOf2 = null;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                TeaserInsightIcon teaserInsightIcon = (TeaserInsightIcon) obj;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.imv_cars_details_teaser_insight_view, viewGroup, false);
                if (i12 == list.size() - 1) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
                    marginLayoutParams.bottomMargin = 0;
                    viewInflate.setLayoutParams(marginLayoutParams);
                }
                i iVar = new i(viewInflate);
                TeaserIcon icon = teaserInsightIcon.getIcon();
                switch (icon == null ? -1 : i.a.f170099a[icon.ordinal()]) {
                    case 1:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_wrench_20);
                        break;
                    case 2:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_person_20);
                        break;
                    case 3:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_accident_20);
                        break;
                    case 4:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_diagram_20);
                        break;
                    case 5:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_sell_20);
                        break;
                    case 6:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_shield_20);
                        break;
                    case 7:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_court_20);
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_mileage_20);
                        break;
                    case 9:
                        numValueOf = Integer.valueOf(R.drawable.common_ic_taxi_20);
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
                if (numValueOf == null) {
                    int i14 = i.a.f170100b[teaserInsightIcon.getStatus().ordinal()];
                    if (i14 == 1) {
                        numValueOf2 = Integer.valueOf(R.drawable.common_ic_check_thin_20);
                    } else if (i14 == 2) {
                        numValueOf2 = Integer.valueOf(R.drawable.common_ic_lock_20);
                    }
                    numValueOf = numValueOf2;
                }
                ImageView imageView = iVar.f170097a;
                if (numValueOf != null) {
                    D6.H(imageView);
                    imageView.setImageResource(numValueOf.intValue());
                    imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, imageView.getContext())));
                } else {
                    D6.w(imageView);
                }
                iVar.f170098b.setText(teaserInsightIcon.getText());
                arrayList.add(viewInflate);
                i12 = i13;
            }
            iterable = arrayList;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
        }
    }
}
