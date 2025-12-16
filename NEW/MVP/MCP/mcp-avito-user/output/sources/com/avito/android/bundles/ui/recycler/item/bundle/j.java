package com.avito.android.bundles.ui.recycler.item.bundle;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C22832m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bundles.ui.view.DiscountView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: VasBundleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/bundle/j;", "Lcom/avito/android/bundles/ui/recycler/item/bundle/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f108417n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f108418b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f108419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f108420d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f108421e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f108422f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DiscountView f108423g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f108424h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f108425i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f108426j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f108427k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f108428l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f108429m;

    @Inject
    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k com.avito.konveyor.a aVar3) {
        super(view);
        this.f108418b = view;
        this.f108419c = aVar;
        this.f108420d = aVar2;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f108421e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108422f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.discount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.bundles.ui.view.DiscountView");
        }
        this.f108423g = (DiscountView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.benefits);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f108424h = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108425i = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.old_price);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108426j = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.price_hint);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108427k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.choose_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f108428l = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.clicks_interceptor);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f108429m = viewFindViewById9;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar3));
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void L(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f108425i, attributedText, null);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void LI(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f108427k, attributedText, this.f108419c);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void U1(@Y61.k String str) {
        I5.a(this.f108422f, str, false);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void Ux(@Y61.k ArrayList arrayList) {
        this.f108420d.c(new UV0.c(arrayList));
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void Z0(@l AttributedText attributedText) {
        G0 g02 = null;
        TextView textView = this.f108426j;
        if (attributedText != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
            D6.H(textView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(textView);
        }
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void aB(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f108428l;
        com.avito.android.lib.design.button.b.a(button, str, false);
        D6.a(aVar, button);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void bG(@l UniversalImage universalImage) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f108421e;
        if (universalImage != null) {
            C35949t5.c(this.f108421e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f108418b.getContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void qL(@l Dk.e eVar) {
        G0 g02;
        DiscountView discountView = this.f108423g;
        if (eVar != null) {
            D6.H(discountView);
            discountView.setDiscountBackgroundColor(C48063a.f437606a.a(this.f108418b.getContext(), eVar.getColor()));
            discountView.setDiscountTitle(eVar.getTitle());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(discountView);
        }
    }

    @Override // com.avito.android.bundles.ui.recycler.item.bundle.h
    public final void rz(@l Y41.a<G0> aVar) {
        View view = this.f108429m;
        if (aVar != null) {
            D6.H(view);
            view.setClickable(true);
            view.setFocusable(true);
            view.setOnTouchListener(new ViewOnTouchListenerC13234a(new C22832m(this.itemView.getContext(), new i(this, aVar), null), 3));
            return;
        }
        view.setClickable(false);
        view.setFocusable(false);
        view.setOnTouchListener(null);
        D6.w(view);
    }
}
