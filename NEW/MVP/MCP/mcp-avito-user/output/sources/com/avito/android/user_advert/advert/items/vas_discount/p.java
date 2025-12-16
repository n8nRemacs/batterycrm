package com.avito.android.user_advert.advert.items.vas_discount;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: VasDiscountItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/vas_discount/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/vas_discount/o;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    public final Context f310368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f310369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f310370d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f310371e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f310372f;

    public p(@Y61.k View view) {
        super(view);
        this.f310368b = view.getContext();
        this.f310369c = (TextView) view.findViewById(R.id.discount_title);
        this.f310370d = (TextView) view.findViewById(R.id.discount_description);
        ((ViewStub) view.findViewById(R.id.discount_amount_stub)).inflate();
        this.f310371e = (FrameLayout) view.findViewById(R.id.discount_amount_container);
        this.f310372f = (SimpleDraweeView) view.findViewById(R.id.discount_icon);
    }

    @Override // com.avito.android.user_advert.advert.items.vas_discount.o
    public final void cS(@Y61.l com.avito.android.image_loader.a aVar) {
        Context context = this.f310368b;
        TextView textView = this.f310370d;
        FrameLayout frameLayout = this.f310371e;
        if (aVar == null) {
            D6.w(frameLayout);
            textView.setTextColor(C35835l0.d(R.attr.black, context));
            return;
        }
        D6.H(frameLayout);
        ImageRequest.a aVarA = C35949t5.a(this.f310372f);
        aVarA.d(aVar);
        aVarA.c();
        textView.setTextColor(C35835l0.d(R.attr.gray48, context));
    }

    @Override // com.avito.android.user_advert.advert.items.vas_discount.o
    public final void jz(@Y61.k String str) {
        I5.a(this.f310369c, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.vas_discount.o
    public final void mf(@Y61.k String str) {
        I5.a(this.f310370d, str, false);
    }
}
