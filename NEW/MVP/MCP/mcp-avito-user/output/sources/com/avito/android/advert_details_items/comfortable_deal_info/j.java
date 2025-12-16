package com.avito.android.advert_details_items.comfortable_deal_info;

import VU.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.ComfortableDealInfo;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/comfortable_deal_info/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/comfortable_deal_info/i;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f84592g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84593b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f84594c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f84595d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f84596e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f84597f;

    /* compiled from: ComfortableDealInfoView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<List<? extends ConstraintLayout>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends ConstraintLayout> invoke() {
            List listU = C42745f0.U(Integer.valueOf(R.id.banner_1), Integer.valueOf(R.id.banner_2), Integer.valueOf(R.id.banner_3), Integer.valueOf(R.id.banner_4), Integer.valueOf(R.id.banner_5));
            View view = j.this.f84593b;
            ArrayList arrayList = new ArrayList(C42745f0.q(listU, 10));
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                arrayList.add((ConstraintLayout) view.findViewById(((Number) it.next()).intValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: ComfortableDealInfoView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f84599l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f84600m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, l lVar) {
            super(0);
            this.f84599l = lVar;
            this.f84600m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f84599l.invoke(Integer.valueOf(this.f84600m));
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealInfoView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f84601l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar) {
            super(0);
            this.f84601l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f84601l.invoke();
            return G0.f406611a;
        }
    }

    public j(@k View view) {
        super(view);
        this.f84593b = view;
        this.f84594c = (TextView) view.findViewById(R.id.comfortable_deal_title);
        this.f84595d = (TextView) view.findViewById(R.id.comfortable_deal_subtitle);
        this.f84596e = C42727D.c(new a());
        this.f84597f = (Button) view.findViewById(R.id.comfortable_deal_button);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert_details_items.comfortable_deal_info.i
    public final void BF(@k l lVar, @k List list) {
        Iterator it = C42745f0.T0(list, (List) this.f84596e.getValue()).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Q q12 = (Q) next;
            ComfortableDealInfo.Banner banner = (ComfortableDealInfo.Banner) q12.f406619b;
            ConstraintLayout constraintLayout = (ConstraintLayout) q12.f406620c;
            b bVar = new b(i12, lVar);
            TextView textView = (TextView) constraintLayout.findViewById(R.id.comfortable_deal_banner_text);
            ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.comfortable_deal_banner_icon);
            SimpleDraweeView simpleDraweeView = i12 == 0 ? (SimpleDraweeView) constraintLayout.findViewById(R.id.comfortable_deal_banner_image_large) : (SimpleDraweeView) constraintLayout.findViewById(R.id.comfortable_deal_banner_image_small);
            I5.a(textView, banner.getText(), false);
            textView.setTextAppearance(com.avito.android.lib.util.f.r(constraintLayout.getContext(), banner.getTextStyle()));
            Context context = constraintLayout.getContext();
            Integer numA = q.a(banner.getIcon());
            Drawable drawableH = C35835l0.h(numA != null ? numA.intValue() : R.attr.ic_arrowForward16, context);
            if (drawableH != null) {
                imageView.setImageDrawable(drawableH);
            }
            UniversalImage image = banner.getImage();
            if (image != null) {
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
            }
            Context context2 = constraintLayout.getContext();
            Integer numA2 = com.avito.android.lib.util.e.a(banner.getBackground());
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(numA2 != null ? numA2.intValue() : R.attr.beige100, context2)));
            constraintLayout.setClipToOutline(true);
            constraintLayout.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(15, bVar));
            i12 = i13;
        }
    }

    @Override // com.avito.android.advert_details_items.comfortable_deal_info.i
    public final void P20(@k ComfortableDealInfo.Button button, @k Y41.a<G0> aVar) {
        UU.a aVar2 = new UU.a(button.getText(), null, false, false, false, new c(aVar), null, null, null, false, 990, null);
        Button button2 = this.f84597f;
        button2.setState(aVar2);
        b.a aVar3 = VU.b.f17147t;
        Context context = this.f84593b.getContext();
        String style = button.getStyle();
        aVar3.getClass();
        button2.setStyle(b.a.b(context, style));
    }

    @Override // com.avito.android.advert_details_items.comfortable_deal_info.i
    public final void b(@k String str) {
        I5.a(this.f84594c, str, false);
    }

    @Override // com.avito.android.advert_details_items.comfortable_deal_info.i
    public final void j(@k String str) {
        I5.a(this.f84595d, str, false);
    }
}
