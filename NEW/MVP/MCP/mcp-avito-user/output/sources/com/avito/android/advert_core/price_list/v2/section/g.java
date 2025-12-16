package com.avito.android.advert_core.price_list.v2.section;

import Jd0.C14188a;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.price_list.v2.AdvertPriceListV2Item;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPriceListSectionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/section/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/price_list/v2/section/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class g extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f84170i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f84171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.e f84172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.d f84173d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f84174e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f84175f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f84176g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f84177h;

    public g(@Y61.k View view, @Y61.k com.avito.android.recycler.data_aware.e eVar, @Y61.k com.avito.konveyor.a aVar) {
        super(view);
        this.f84171b = view;
        this.f84172c = eVar;
        View viewFindViewById = view.findViewById(R.id.advert_price_list_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84175f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_price_list_section_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f84176g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_price_list_section_items);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f84174e = jVar;
        this.f84173d = new com.avito.android.recycler.data_aware.d(new C14188a(this, 1), hVar, eVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        this.f84177h = recyclerView;
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void B(@Y61.k List<AdvertPriceListV2Item> list) {
        this.f84173d.c(new UV0.c(list));
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void U20() {
        D6.w(this.f84176g);
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void bd() {
        D6.H(this.f84176g);
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void ga(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f84175f;
        if (aVar != null) {
            textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(16, this, aVar));
        } else {
            textView.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void i9(boolean z12) {
        this.f84176g.setRotation(z12 ? 0.0f : 180.0f);
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f84175f, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void yF() {
        RecyclerView recyclerView = this.f84177h;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(recyclerView.getMeasuredHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(new QU.a(recyclerView, 3));
        valueAnimatorOfInt.addListener(new e(valueAnimatorOfInt));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
        this.f84173d.c(new UV0.c(C42784z0.f406748b));
    }

    @Override // com.avito.android.advert_core.price_list.v2.section.c
    public final void yL(@Y61.k List<AdvertPriceListV2Item> list) {
        final RecyclerView recyclerView = this.f84177h;
        recyclerView.setVisibility(8);
        this.f84173d.c(new UV0.c(list));
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = recyclerView.getMeasuredHeight();
        recyclerView.getLayoutParams().height = 0;
        final double d12 = measuredHeight * 0.05d;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, measuredHeight);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.advert_core.price_list.v2.section.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i12 = g.f84170i;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                double d13 = iIntValue;
                double d14 = d12;
                View view = recyclerView;
                if (d13 > d14 && view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.addListener(new f(recyclerView, valueAnimatorOfInt));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }
}
