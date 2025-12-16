package Gb;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import j.InterfaceC42161q;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdMyTarget.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGb/b;", "LGb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC13862a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f6588b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdStyle f6589c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public m f6590d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ViewGroup f6591e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ViewGroup f6592f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final MediaAdView f6593g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final IconAdView f6594h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f6595i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f6596j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final TextView f6597k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f6598l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f6599m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final RatingBar f6600n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final TextView f6601o;

    /* renamed from: p, reason: collision with root package name */
    public int f6602p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6603q;

    public b(@k View view, @k AdStyle adStyle) {
        this.f6588b = view;
        this.f6589c = adStyle;
        this.f6591e = (ViewGroup) view.findViewById(R.id.nativeads_ad_view);
        this.f6592f = (ViewGroup) view.findViewById(R.id.media_view_container);
        View viewFindViewById = view.findViewById(R.id.nativeads_media_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.my.target.nativeads.views.MediaAdView");
        }
        this.f6593g = (MediaAdView) viewFindViewById;
        this.f6594h = (IconAdView) view.findViewById(R.id.icon);
        View viewFindViewById2 = view.findViewById(R.id.nativeads_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f6595i = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.nativeads_call_to_action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f6596j = (TextView) viewFindViewById3;
        this.f6597k = (TextView) view.findViewById(R.id.nativeads_description);
        View viewFindViewById4 = view.findViewById(R.id.age_badge);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f6598l = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.advertising_badge);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f6599m = (TextView) viewFindViewById5;
        this.f6600n = (RatingBar) view.findViewById(R.id.rating);
        this.f6601o = (TextView) view.findViewById(R.id.domain_badge);
        this.f6603q = C35835l0.d(R.attr.gray8, view.getContext());
    }

    @Override // Gb.InterfaceC13862a
    public final void Ah(@l String str) {
        I5.a(this.f6596j, str, false);
    }

    @Override // Gb.InterfaceC13862a
    public final void CP() {
        m mVar = this.f6590d;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f6590d = null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        throw null;
    }

    @Override // Gb.InterfaceC13862a
    public final void J30() {
        this.f6602p = androidx.core.content.d.getColor(this.f6588b.getContext(), R.color.ad_skeleton_bg);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        e.a.a(this, R.dimen.ad_image_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Oc(@l String str) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: Qw, reason: from getter */
    public final TextView getF88607i() {
        return this.f6597k;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: T1, reason: from getter */
    public final ViewGroup getF88604f() {
        return this.f6591e;
    }

    @Override // Gb.InterfaceC13862a
    public final void UL(@l m mVar) {
        this.f6590d = mVar;
    }

    @Override // Gb.InterfaceC13862a
    /* renamed from: cu, reason: from getter */
    public final int getF6602p() {
        return this.f6602p;
    }

    @Override // Gb.InterfaceC13862a
    public final void d30(int i12) {
        if (i12 == -1) {
            i12 = this.f6603q;
        }
        MediaAdView mediaAdView = this.f6593g;
        if (mediaAdView != null) {
            mediaAdView.setBackgroundColor(i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        ViewGroup f6592f = getF88605g();
        if (f6592f != null) {
            v.b(f6592f, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@l TextView textView, @l String str) {
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: getCallToActionView, reason: from getter */
    public final TextView getF6596j() {
        return this.f6596j;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF87108c() {
        return this.f6589c;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF88600b() {
        return this.f6588b;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: j70 */
    public final ViewGroup getF7319x() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: od, reason: from getter */
    public final ViewGroup getF88605g() {
        return this.f6592f;
    }

    @Override // Gb.InterfaceC13862a
    @l
    public final WeakReference<View> oe(@k com.my.target.nativeads.d dVar) {
        Bitmap bitmapA;
        ImageView imageView;
        k11.c cVarA = dVar.a();
        if (cVarA == null) {
            return null;
        }
        this.f6593g.setBackgroundColor(this.f6602p);
        IconAdView iconAdView = this.f6594h;
        com.my.target.common.models.b bVar = cVarA.f406014k;
        if (bVar != null && (bitmapA = bVar.a()) != null && iconAdView != null && (imageView = iconAdView.getImageView()) != null) {
            imageView.setImageBitmap(bitmapA);
        }
        View view = this.f6588b;
        if (iconAdView != null) {
            v.a(iconAdView, view.getResources().getDimension(R.dimen.ad_icon_corner_radius));
        }
        RatingBar ratingBar = this.f6600n;
        if (ratingBar != null) {
            ratingBar.setRating(cVarA.f406005b);
            D6.H(ratingBar);
        }
        I5.a(this.f6595i, cVarA.f406007d, false);
        I5.a(this.f6596j, cVarA.f406008e, false);
        I5.a(this.f6598l, cVarA.f406011h, false);
        I5.a(this.f6599m, cVarA.f406013j, false);
        TextView textView = this.f6597k;
        if (textView != null) {
            I5.a(textView, cVarA.f406009f, false);
        }
        return new WeakReference<>(view);
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: qs, reason: from getter */
    public final TextView getF88606h() {
        return this.f6595i;
    }

    @Override // com.avito.android.advertising.ui.e
    public final View uC() {
        return this.f6594h;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: wV, reason: from getter */
    public final TextView getF6601o() {
        return this.f6601o;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
