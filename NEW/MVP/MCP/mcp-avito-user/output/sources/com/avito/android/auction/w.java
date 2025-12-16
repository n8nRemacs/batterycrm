package com.avito.android.auction;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
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

/* compiled from: AuctionView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/w;", "Lcom/avito/android/auction/t;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f92615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f92616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f92617c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f92618d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f92619e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f92620f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f92621g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f92622h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f92623i;

    /* compiled from: AuctionView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/auction/w$a", "Lcom/avito/android/image_loader/o;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.image_loader.o {
        public a() {
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            w wVar = w.this;
            ViewGroup.LayoutParams layoutParams = wVar.f92618d.getLayoutParams();
            layoutParams.height = i13;
            layoutParams.width = i12;
            wVar.f92618d.setLayoutParams(layoutParams);
        }
    }

    public w(@Y61.k View view) {
        this.f92615a = view;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92616b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92617c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f92618d = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.floating_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f92619e = button;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f92620f = cVar;
        this.f92621g = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f92622h = cVar2;
        this.f92623i = new C41981q0(cVar2);
        toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.auction.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f92612c;

            {
                this.f92612c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f92612c.f92620f.accept(G0.f406611a);
                        break;
                    default:
                        this.f92612c.f92622h.accept(G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.auction.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f92612c;

            {
                this.f92612c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f92612c.f92620f.accept(G0.f406611a);
                        break;
                    default:
                        this.f92612c.f92622h.accept(G0.f406611a);
                        break;
                }
            }
        });
    }

    public final void a(Image image) {
        SimpleDraweeView simpleDraweeView = this.f92618d;
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
