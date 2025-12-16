package com.avito.android.serp.adapter.recomendations;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.p;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableSectionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/n;", "Lcom/avito/android/serp/adapter/recomendations/m;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.android.serp.c implements m {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f270562g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f270563b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f270564c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f270565d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f270566e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f270567f;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f270568b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f270569c;

        public a(View view, n nVar) {
            this.f270568b = view;
            this.f270569c = nVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            Y41.a<G0> aVar = this.f270569c.f270567f;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f270568b.removeOnLayoutChangeListener(this);
        }
    }

    public n(@Y61.k View view) {
        super(view);
        this.f270563b = view;
        this.f270564c = (TextView) view.findViewById(R.id.title_text_view);
        this.f270565d = (ImageView) view.findViewById(R.id.arrow_image_view);
        this.f270566e = (SimpleDraweeView) view.findViewById(R.id.icon_image_view);
        View view2 = this.itemView;
        view2.addOnLayoutChangeListener(new a(view2, this));
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void Z(@Y61.k String str) {
        SimpleDraweeView simpleDraweeView = this.f270566e;
        if (simpleDraweeView == null) {
            return;
        }
        if (str.length() <= 0) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        p pVar = new p(Uri.parse(str));
        simpleDraweeView.setColorFilter(new PorterDuffColorFilter(C35835l0.d(R.attr.black, simpleDraweeView.getContext()), PorterDuff.Mode.SRC_IN));
        C35949t5.c(this.f270566e, pVar, null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f270563b.setOnClickListener(new com.avito.android.seller_promotions.o(22, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f270567f = null;
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void j8(@Y61.k Y41.a<G0> aVar) {
        this.f270567f = aVar;
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void setTitle(@Y61.k String str) {
        this.f270564c.setText(str);
    }

    @Override // com.avito.android.serp.adapter.recomendations.m
    public final void y5(boolean z12) {
        ImageView imageView = this.f270565d;
        if (z12) {
            imageView.animate().rotation(0.0f).start();
        } else {
            imageView.animate().rotation(180.0f).start();
        }
    }
}
