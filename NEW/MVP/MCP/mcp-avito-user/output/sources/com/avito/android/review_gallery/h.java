package com.avito.android.review_gallery;

import Y41.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.q;
import com.avito.android.review_gallery.fading_text.FadingTextView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ReviewGalleryContentView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/h;", "Lcom/avito/android/review_gallery/f;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f255499a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<GalleryItem.GalleryButton, G0> f255500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f255501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f255502d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f255503e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f255504f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f255505g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RatingBar f255506h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FadingTextView f255507i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f255508j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f255509k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f255510l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f255511m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f255512n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f255513o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f255514p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f255515q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public String f255516r;

    public h(@Y61.k ViewGroup viewGroup, @Y61.k Y41.a aVar, @Y61.k l lVar) {
        this.f255499a = aVar;
        this.f255500b = lVar;
        this.f255501c = viewGroup.findViewById(R.id.gallery_description_container);
        this.f255502d = (TextView) viewGroup.findViewById(R.id.gallery_user_name);
        this.f255503e = (TextView) viewGroup.findViewById(R.id.gallery_user_name_2);
        this.f255504f = (TextView) viewGroup.findViewById(R.id.gallery_date);
        this.f255505g = (TextView) viewGroup.findViewById(R.id.gallery_date_2);
        this.f255506h = (RatingBar) viewGroup.findViewById(R.id.gallery_rating);
        this.f255507i = (FadingTextView) viewGroup.findViewById(R.id.gallery_description);
        this.f255508j = (SimpleDraweeView) viewGroup.findViewById(R.id.contact_bar_avatar);
        this.f255509k = (TextView) viewGroup.findViewById(R.id.contact_bar_name);
        this.f255510l = (TextView) viewGroup.findViewById(R.id.contact_bar_title);
        this.f255511m = (TextView) viewGroup.findViewById(R.id.contact_bar_price);
        this.f255512n = (TextView) viewGroup.findViewById(R.id.contact_bar_price_divider);
        this.f255513o = (Button) viewGroup.findViewById(R.id.contact_bar_button_1);
        this.f255514p = (Button) viewGroup.findViewById(R.id.contact_bar_button_2);
    }

    public static void a(TextView textView, TextView textView2, String str, String str2) {
        if (L.f(str2, str)) {
            return;
        }
        if (D6.y(textView)) {
            textView2.setText(str);
            D6.o(textView, 250L);
            D6.n(textView2, 250L);
        } else {
            textView.setText(str);
            D6.n(textView, 250L);
            D6.o(textView2, 250L);
        }
    }

    public final void b(Button button, GalleryItem.GalleryButton galleryButton) {
        if (galleryButton == null) {
            D6.w(button);
            return;
        }
        D6.H(button);
        String str = galleryButton.f68417d;
        Drawable drawableH = null;
        if (com.avito.android.lib.util.e.a(str) != null) {
            int iB2 = y6.b(12);
            Context context = button.getContext();
            Integer numValueOf = Integer.valueOf(R.color.common_green);
            C48063a.f437606a.getClass();
            ColorStateList colorStateListF = C48063a.f(context, str, numValueOf, numValueOf);
            if (colorStateListF == null) {
                colorStateListF = ColorStateList.valueOf(16200612);
            }
            button.e(iB2, colorStateListF, null);
        }
        Integer numA = q.a(galleryButton.f68416c);
        if (numA != null) {
            drawableH = C35835l0.h(numA.intValue(), button.getContext());
        }
        if (drawableH != null) {
            button.setImageDrawable(drawableH);
        }
        button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(20, this, galleryButton));
    }
}
