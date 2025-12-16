package Fb;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.v;
import com.facebook.drawee.generic.RoundingParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoNetworkImage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFb/b;", "LFb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13552b implements InterfaceC13551a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f4792b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdStyle f4793c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f4794d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FrameLayout f4795e;

    public C13552b(@k View view, @k AdStyle adStyle) {
        this.f4792b = view;
        this.f4793c = adStyle;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f4794d = simpleDraweeView;
        View viewFindViewById2 = view.findViewById(R.id.avito_ad_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f4795e = (FrameLayout) viewFindViewById2;
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        simpleDraweeView.setAspectRatio(1.0f);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // Fb.InterfaceC13551a
    public final void N7() {
        this.f4794d.setOnClickListener(null);
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // Fb.InterfaceC13551a
    public final void a(@k Y41.a<G0> aVar) {
        this.f4794d.setOnClickListener(new Ae0.b(9, aVar));
    }

    public final void b() throws Resources.NotFoundException {
        c(R.dimen.default_card_corner_radius);
        FrameLayout frameLayout = this.f4795e;
        Drawable drawable = androidx.core.content.d.getDrawable(frameLayout.getContext(), R.drawable.serp_card_background);
        SimpleDraweeView simpleDraweeView = this.f4794d;
        simpleDraweeView.setBackground(drawable);
        simpleDraweeView.setForeground(androidx.core.content.d.getDrawable(frameLayout.getContext(), R.drawable.serp_card_foreground));
    }

    public final void c(int i12) throws Resources.NotFoundException {
        float dimension = this.f4792b.getResources().getDimension(i12);
        v.a(this.f4795e, dimension);
        GW0.a hierarchy = this.f4794d.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.e(dimension);
        hierarchy.s(roundingParams);
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF88633c() {
        return this.f4793c;
    }

    @Override // Fb.InterfaceC13551a
    @k
    public final View getView() {
        throw null;
    }

    @Override // Fb.InterfaceC13551a
    public final void j1(@l Uri uri) {
        this.f4794d.setImageURI(uri);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
