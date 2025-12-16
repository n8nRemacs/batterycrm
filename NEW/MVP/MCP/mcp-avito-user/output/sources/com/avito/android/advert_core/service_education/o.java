package com.avito.android.advert_core.service_education;

import Jd0.C14188a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertServiceEducationView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/service_education/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/service_education/n;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f84326i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f84327b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.e f84328c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.d f84329d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f84330e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f84331f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f84332g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f84333h;

    /* compiled from: AdvertServiceEducationView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/service_education/o$a", "Landroid/animation/AnimatorListenerAdapter;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f84334a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f84335b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f84336c;

        public a(int i12, View view, ValueAnimator valueAnimator) {
            this.f84334a = i12;
            this.f84335b = view;
            this.f84336c = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f84334a == 0) {
                this.f84335b.setVisibility(8);
            }
            ValueAnimator valueAnimator = this.f84336c;
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeListener(this);
        }
    }

    public o(@Y61.k View view, @Y61.k com.avito.android.recycler.data_aware.e eVar, @Y61.k com.avito.konveyor.a aVar) {
        super(view);
        this.f84327b = view;
        this.f84328c = eVar;
        View viewFindViewById = view.findViewById(R.id.advert_service_education_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84331f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_service_education_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f84332g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_service_education_items);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f84330e = jVar;
        this.f84329d = new com.avito.android.recycler.data_aware.d(new C14188a(this, 2), hVar, eVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        this.f84333h = recyclerView;
    }

    public static void B80(View view, int i12, int i13) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i12, i13);
        valueAnimatorOfInt.addUpdateListener(new QU.a(view, 4));
        valueAnimatorOfInt.addListener(new a(i13, view, valueAnimatorOfInt));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }

    @Override // com.avito.android.advert_core.service_education.n
    @SuppressLint({"NotifyDataSetChanged"})
    public final void B(@Y61.k List<ServiceEducationValue> list) {
        C80(list);
        this.f84330e.notifyDataSetChanged();
    }

    public final void C80(List<ServiceEducationValue> list) {
        this.f84329d.c(new UV0.c(list));
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void D(@Y61.l PrintableText printableText) {
        I5.a(this.f84331f, printableText != null ? printableText.k0(this.f84327b.getContext()) : null, false);
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void K30(@Y61.k List<ServiceEducationValue> list) {
        boolean zIsEmpty = list.isEmpty();
        RecyclerView recyclerView = this.f84333h;
        if (zIsEmpty) {
            B80(recyclerView, recyclerView.getMeasuredHeight(), 0);
            C80(C42784z0.f406748b);
            return;
        }
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = recyclerView.getMeasuredHeight();
        C80(list);
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        B80(recyclerView, measuredHeight, recyclerView.getMeasuredHeight());
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void TH(@Y61.k List list) {
        RecyclerView recyclerView = this.f84333h;
        int height = recyclerView.getHeight();
        C80(list);
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, recyclerView.getMeasuredHeight());
        valueAnimatorOfInt.addUpdateListener(new QU.a(recyclerView, 5));
        valueAnimatorOfInt.addListener(new p(recyclerView, valueAnimatorOfInt));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void bd() {
        D6.H(this.f84332g);
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void ga(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f84331f;
        if (aVar != null) {
            textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(17, this, aVar));
        } else {
            textView.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void i30() {
        D6.w(this.f84332g);
    }

    @Override // com.avito.android.advert_core.service_education.n
    public final void i9(boolean z12) {
        this.f84332g.setRotation(z12 ? 0.0f : 180.0f);
    }
}
