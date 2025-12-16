package com.avito.android.rating_form.select_item.adapter.advert;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/advert/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/select_item/adapter/advert/k;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f248927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f248928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ComposeUncutTextView f248929d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f248930e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f248931f;

    public l(@Y61.k View view) {
        super(view);
        this.f248927b = view;
        View viewFindViewById = view.findViewById(R.id.rating_form_advert_item_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f248928c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_form_advert_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.rating_form.select_item.adapter.advert.ComposeUncutTextView");
        }
        this.f248929d = (ComposeUncutTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rating_form_advert_item_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248930e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.rating_form.select_item.adapter.advert.k
    @Y61.k
    public final z<G0> A() {
        return C37722i.a(this.f248927b);
    }

    @Override // com.avito.android.rating_form.select_item.adapter.advert.k
    public final void O0(@Y61.k String str, @Y61.k String str2) {
        ComposeUncutTextView composeUncutTextView = this.f248929d;
        composeUncutTextView.setTruncateString(str);
        composeUncutTextView.setUncutString(str2);
    }

    @Override // com.avito.android.rating_form.select_item.adapter.advert.k
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f248931f = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f248931f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.rating_form.select_item.adapter.advert.k
    public final void p(@Y61.l String str) {
        I5.a(this.f248930e, str, false);
    }

    @Override // com.avito.android.rating_form.select_item.adapter.advert.k
    public final void x(@Y61.k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f248928c);
        aVarA.d(kVar);
        aVarA.c();
    }
}
