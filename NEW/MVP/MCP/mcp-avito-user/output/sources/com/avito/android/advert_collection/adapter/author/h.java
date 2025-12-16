package com.avito.android.advert_collection.adapter.author;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthorItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/adapter/author/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection/adapter/author/g;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f81266k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f81267b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f81268c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f81269d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f81270e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f81271f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f81272g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f81273h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RatingBar f81274i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f81275j;

    public h(@k View view) {
        super(view);
        this.f81267b = view;
        View viewFindViewById = view.findViewById(R.id.seller_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81268c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.online_status);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81269d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81270e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.avatar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f81271f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f81272g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.rating_number);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81273h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.rating);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f81274i = (RatingBar) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.rating_text);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81275j = (TextView) viewFindViewById8;
    }

    @Override // com.avito.android.advert_collection.adapter.author.g
    public final void Gf(@k AuthorItem authorItem) {
        String string;
        float fFloatValue;
        I5.a(this.f81270e, authorItem.f81252d, false);
        String strQ = authorItem.f81251c;
        boolean z12 = authorItem.f81256h;
        if (z12) {
            strQ = r.q(strQ, ", ");
        }
        I5.a(this.f81268c, strQ, false);
        D6.G(this.f81269d, z12);
        l.w(authorItem.f81250b, C35949t5.a(this.f81271f));
        Integer num = authorItem.f81253e;
        D6.G(this.f81272g, num != null);
        Float f12 = authorItem.f81254f;
        if (f12 == null || (string = f12.toString()) == null) {
            string = num != null ? num.toString() : null;
        }
        I5.a(this.f81273h, string, false);
        if (f12 != null) {
            fFloatValue = f12.floatValue();
        } else {
            Float fValueOf = num != null ? Float.valueOf(num.intValue()) : null;
            fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        }
        this.f81274i.setRating(fFloatValue);
        I5.a(this.f81275j, authorItem.f81255g, false);
    }

    @Override // com.avito.android.advert_collection.adapter.author.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f81267b.setOnClickListener(new com.avito.android.advert.item.parking.h(29, aVar));
    }
}
