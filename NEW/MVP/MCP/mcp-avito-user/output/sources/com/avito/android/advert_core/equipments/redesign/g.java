package com.avito.android.advert_core.equipments.redesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RedesignedEquipmentsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/equipments/redesign/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f83547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f83548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f83549d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f83550e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f83551f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83552g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public y f83553h;

    /* compiled from: RedesignedEquipmentsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f83554b;

        public a(Y41.a<G0> aVar) {
            this.f83554b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f83554b.invoke();
        }
    }

    public g(@Y61.k View view, @Y61.k i iVar) {
        super(view);
        this.f83547b = iVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83548c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sub_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83549d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.options_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f83550e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.link);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83551f = (TextView) viewFindViewById4;
        this.f83552g = C35835l0.d(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void Rb(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f83551f;
        I5.a(textView, str, false);
        y yVar = this.f83553h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (str == null || C43066x.K(str)) {
            I5.c(textView, null);
        } else {
            this.f83553h = (y) C37722i.a(textView).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new a(aVar));
        }
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void as() {
        D6.w(this.f83551f);
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void b(@Y61.l String str) {
        I5.a(this.f83548c, str, false);
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f83553h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void m9(@Y61.l String str) {
        I5.a(this.f83549d, str, false);
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void mZ(@Y61.l List<? extends CharSequence> list) {
        LinearLayout linearLayout = this.f83550e;
        linearLayout.removeAllViews();
        List<? extends CharSequence> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(linearLayout);
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        D6.H(linearLayout);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(this.f83547b.a((CharSequence) it.next(), layoutInflaterFrom, linearLayout));
        }
    }

    @Override // com.avito.android.advert_core.equipments.redesign.f
    public final void y1() {
        this.f83548c.setTextColor(this.f83552g);
    }
}
