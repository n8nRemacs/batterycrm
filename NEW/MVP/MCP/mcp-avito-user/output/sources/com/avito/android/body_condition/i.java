package com.avito.android.body_condition;

import Mj.InterfaceC14496a;
import Y41.p;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.InterfaceC29679e;
import com.avito.android.deep_linking.links.PointWithPosition;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.n;
import com.avito.android.image_loader.o;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CarBodyConditionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/body_condition/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/body_condition/g;", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14496a f106815b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f106816c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f106817d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f106818e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f106819f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f106820g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f106821h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public p<? super View, ? super PointWithPosition, G0> f106822i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC29679e, G0> f106823j;

    /* compiled from: CarBodyConditionItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/body_condition/i$a", "Lcom/avito/android/image_loader/o;", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29679e f106825c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Collection<PointWithPosition> f106826d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f106827e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC29679e interfaceC29679e, Collection<? extends PointWithPosition> collection, boolean z12) {
            this.f106825c = interfaceC29679e;
            this.f106826d = collection;
            this.f106827e = z12;
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            i iVar = i.this;
            InterfaceC14496a interfaceC14496a = iVar.f106815b;
            SimpleDraweeView simpleDraweeView = iVar.f106818e;
            interfaceC14496a.a(simpleDraweeView.getWidth(), simpleDraweeView.getHeight(), i12, i13);
            List<PointWithPosition> points = this.f106825c.getPoints();
            FrameLayout frameLayout = iVar.f106820g;
            frameLayout.removeAllViews();
            for (PointWithPosition pointWithPosition : points) {
                boolean zContains = this.f106826d.contains(pointWithPosition);
                int i14 = D6.i(10, iVar.itemView.getContext());
                int i15 = i14 * 2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i15);
                Q<Integer, Integer> qB2 = iVar.f106815b.b(pointWithPosition.getPosition());
                layoutParams.setMargins(qB2.f406619b.intValue() - i14, qB2.f406620c.intValue() - i14, 0, 0);
                Button button = new Button(iVar.itemView.getContext(), null, R.attr.buttonLinkIncreasedLarge, 0, 8, null);
                button.setLayoutParams(layoutParams);
                boolean z12 = this.f106827e;
                if (zContains) {
                    D6.D(button, R.drawable.background_ic_add_20);
                    if (z12) {
                        button.setImageDrawable(C35835l0.h(R.attr.ic_clear24, button.getContext()));
                        button.setIconColor(C35835l0.e(R.attr.red600, button.getContext()));
                    } else {
                        button.setIconColor(null);
                        button.setImageDrawable(button.getContext().getDrawable(R.drawable.ic_radio_active_20));
                    }
                } else {
                    ColorStateList colorStateListE = z12 ? C35835l0.e(R.attr.black, button.getContext()) : C35835l0.e(R.attr.blue, button.getContext());
                    D6.D(button, R.drawable.background_ic_add_20);
                    button.setImageDrawable(C35835l0.h(R.attr.ic_addRound24, button.getContext()));
                    button.setIconColor(colorStateListE);
                }
                button.setOnClickListener(new h(0, iVar, pointWithPosition));
                button.setTag(pointWithPosition.getPosition());
                frameLayout.addView(button);
            }
        }
    }

    public i(@Y61.k View view, @Y61.k InterfaceC14496a interfaceC14496a) {
        super(view);
        this.f106815b = interfaceC14496a;
        this.f106816c = (LinearLayout) view.findViewById(R.id.car_body_condition_container);
        this.f106817d = (TextView) view.findViewById(R.id.title);
        this.f106818e = (SimpleDraweeView) view.findViewById(R.id.side_layout);
        this.f106819f = (FrameLayout) view.findViewById(R.id.side_container);
        this.f106820g = (FrameLayout) view.findViewById(R.id.side_points_container);
        this.f106821h = (LinearLayout) view.findViewById(R.id.sides_pages_container);
    }

    @Override // com.avito.android.body_condition.g
    public final void GS(@Y61.k p<? super View, ? super PointWithPosition, G0> pVar) {
        this.f106822i = pVar;
    }

    @Override // com.avito.android.body_condition.g
    public final void UU(@Y61.k List list, @Y61.k ArrayList arrayList, int i12, boolean z12) {
        LinearLayout linearLayout = this.f106821h;
        linearLayout.removeAllViews();
        linearLayout.setWeightSum(list.size() <= 4 ? 4.0f : list.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            InterfaceC29679e interfaceC29679e = (InterfaceC29679e) obj;
            k kVar = new k(this.itemView.getContext());
            kVar.setLayoutParams(layoutParams);
            kVar.setTag(Integer.valueOf(i13));
            kVar.setTitle(interfaceC29679e.getTitle());
            if (z12) {
                kVar.setTitleAppearance(C35835l0.j(R.attr.textM20, kVar.getContext()));
            }
            kVar.setImage(interfaceC29679e.getIcon());
            kVar.setSelectedBackground(z12);
            boolean z13 = true;
            kVar.a(i13 == i12, z12);
            kVar.setOnClickListener(new h(1, this, interfaceC29679e));
            List<PointWithPosition> points = interfaceC29679e.getPoints();
            if ((points instanceof Collection) && points.isEmpty()) {
                z13 = false;
            } else {
                Iterator<T> it = points.iterator();
                while (it.hasNext()) {
                    if (arrayList.contains((PointWithPosition) it.next())) {
                        break;
                    }
                }
                z13 = false;
            }
            kVar.setRedDot(z13);
            linearLayout.addView(kVar);
            i13 = i14;
        }
    }

    @Override // com.avito.android.body_condition.g
    public final void a70(@Y61.k Y41.l<? super InterfaceC29679e, G0> lVar) {
        this.f106823j = lVar;
    }

    @Override // com.avito.android.body_condition.g
    public final void fh(@Y61.k InterfaceC29679e interfaceC29679e, @Y61.k Collection<? extends PointWithPosition> collection, boolean z12) {
        D6.c(this.f106819f, null, null, null, Integer.valueOf(z12 ? D6.t(this.itemView, R.dimen.publish_container_car_body_margin_bottom_redesign) : D6.t(this.itemView, R.dimen.publish_container_car_body_margin_bottom)), 7);
        C35949t5.b(this.f106818e, n.a(interfaceC29679e.getLayout()), new a(interfaceC29679e, collection, z12));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f106821h.removeAllViews();
        this.f106820g.removeAllViews();
    }

    @Override // com.avito.android.body_condition.g
    public final void mq(int i12, boolean z12) {
        LinearLayout linearLayout;
        int childCount;
        if (i12 >= 0 && (childCount = (linearLayout = this.f106821h).getChildCount()) > 0 && i12 < childCount) {
            p6 p6Var = new p6(linearLayout);
            while (p6Var.hasNext()) {
                View view = (View) p6Var.next();
                if (!(view instanceof k)) {
                    return;
                }
                k kVar = (k) view;
                kVar.a(L.f(kVar.getTag(), Integer.valueOf(i12)), z12);
            }
        }
    }

    @Override // com.avito.android.body_condition.g
    public final void rM(boolean z12) {
        int iT2 = z12 ? D6.t(this.itemView, R.dimen.publish_container_horizontal_padding_redesign) : D6.t(this.itemView, R.dimen.publish_container_horizontal_padding);
        D6.f(this.f106816c, iT2, 0, iT2, 0, 10);
    }

    @Override // com.avito.android.body_condition.g
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f106817d, str, false);
    }
}
