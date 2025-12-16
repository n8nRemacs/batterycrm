package com.avito.android.auction.details;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionDetailsSheetView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/details/o;", "Lcom/avito/android/auction/details/m;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f92378a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f92379b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f92380c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f92381d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f92382e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f92383f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f92384g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f92385h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f92386i;

    /* compiled from: AuctionDetailsSheetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/auction/details/o$a", "Lcom/avito/android/image_loader/o;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.image_loader.o {
        public a() {
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            o oVar = o.this;
            ViewGroup.LayoutParams layoutParams = oVar.f92381d.getLayoutParams();
            layoutParams.height = i13;
            layoutParams.width = i12;
            oVar.f92381d.setLayoutParams(layoutParams);
        }
    }

    public o(@Y61.k View view) {
        this.f92378a = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92379b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92380c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f92381d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.elements_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f92382e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.footer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92383f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f92384g = button;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f92385h = cVar;
        this.f92386i = new C41981q0(cVar);
        button.setOnClickListener(new B(this, 18));
    }

    public final void a(Image image) {
        SimpleDraweeView simpleDraweeView = this.f92381d;
        Uri uriD = C35829k2.b(image, Math.min(simpleDraweeView.getWidth(), y6.b(420)), 0, 0.0f, 2, 44).d();
        if (uriD == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.f169490h = new a();
        aVarA.c();
    }
}
