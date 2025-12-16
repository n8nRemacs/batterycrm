package com.avito.android.advertising.ui.buzzoola.premium_v2;

import Y61.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42165v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaPremiumV2TitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium_v2/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f88666b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f88667c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RatioFrameLayout f88668d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Float f88669e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88670f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Drawable f88671g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f88672h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f88673i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f88674j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f88675k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImageView f88676l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88677m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88678n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f88679o;

    public b(@Y61.k View view, @l s.c cVar, @l Integer num) {
        super(view);
        this.f88666b = view;
        this.f88667c = num;
        this.f88668d = (RatioFrameLayout) view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f88670f = simpleDraweeView;
        r rVar = new r(D6.u(view, R.drawable.ic_stub_grey), (s.a) s.c.f340135g);
        this.f88673i = new com.avito.android.image_loader.e().a(view.getContext());
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88674j = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88675k = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f88676l = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.logo_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f88677m = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.logo);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f88678n = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.text_gradient);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f88679o = viewFindViewById7;
        simpleDraweeView.getHierarchy().o(rVar, 5);
        if (cVar != null) {
            simpleDraweeView.getHierarchy().n(cVar);
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.e(num != null ? num.intValue() : 0.0f);
            hierarchy.s(roundingParams);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void E20(int i12, @l Integer num, @l String str) {
        TextView textView = this.f88675k;
        I5.a(textView, str, false);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        textView.setMaxLines(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.drawable.Drawable] */
    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void G4(@l com.avito.android.image_loader.a aVar) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2;
        this.f88671g = d.a.a(this.f88673i, this.f88666b.getContext(), aVar, null, this.f88667c, 20);
        ArrayList arrayList = new ArrayList();
        Drawable drawable = this.f88671g;
        if (drawable != null) {
            arrayList.add(drawable);
        }
        if (arrayList.isEmpty()) {
            layerDrawable2 = null;
        } else {
            if (arrayList.size() != 1) {
                layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                C35949t5.c(this.f88670f, aVar, null, null, layerDrawable, 6);
            }
            layerDrawable2 = (Drawable) arrayList.get(0);
        }
        layerDrawable = layerDrawable2;
        C35949t5.c(this.f88670f, aVar, null, null, layerDrawable, 6);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void I4(@l Uri uri) {
        D6.G(this.f88677m, uri != null);
        SimpleDraweeView simpleDraweeView = this.f88678n;
        if (uri == null) {
            simpleDraweeView.setController(null);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(ImageKt.toImage(uri)));
        aVarA.f169500r = false;
        aVarA.c();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void S5(@InterfaceC42165v @l Integer num) {
        boolean z12 = num != null;
        ImageView imageView = this.f88676l;
        D6.G(imageView, z12);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void Sd(int i12, @l Integer num, @Y61.k String str) {
        TextView textView = this.f88674j;
        I5.a(textView, str, false);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        textView.setLines(i12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void bw(boolean z12) {
        this.f88679o.setVisibility(z12 ? 0 : 4);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void d(@l Y41.a<G0> aVar) {
        this.f88672h = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f88672h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void q0(float f12) {
        if (L.d(this.f88669e, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f88668d;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f88669e = Float.valueOf(f12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.a
    public final void x0(@l View.OnClickListener onClickListener) {
        this.f88666b.setOnClickListener(onClickListener);
    }
}
