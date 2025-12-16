package com.avito.android.payment_list.ui.list.shift_item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.payment_list.ui.list.shift_item.PaymentItem;
import com.avito.android.payment_list.ui.list.shift_item.c;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment_list/ui/list/shift_item/d;", "LTV0/d;", "Lcom/avito/android/payment_list/ui/list/shift_item/c;", "Lcom/avito/android/payment_list/ui/list/shift_item/PaymentItem;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.d<c, PaymentItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f215072b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f215072b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Drawable drawableH;
        c cVar = (c) eVar;
        PaymentItem paymentItem = (PaymentItem) aVar;
        UU.a aVar2 = new UU.a(null, null, false, false, false, null, null, null, null, false, 1023, null);
        Button button = cVar.f215066d;
        button.setState(aVar2);
        ImageView imageView = cVar.f215065c;
        imageView.setImageDrawable(null);
        String str = paymentItem.f215047f;
        if (str != null) {
            imageView.setVisibility(0);
            ImageRequest.a aVar3 = new ImageRequest.a(new DM.a(imageView));
            aVar3.f(Uri.parse(str));
            aVar3.c();
        } else {
            PaymentItem.IconType iconType = paymentItem.f215046e;
            if (iconType != null) {
                button.setVisibility(0);
                Context context = button.getContext();
                int iOrdinal = iconType.ordinal();
                if (iOrdinal == 0) {
                    drawableH = C35835l0.h(R.attr.ic_sbp24, context);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    drawableH = C35835l0.h(R.attr.ic_card24, context);
                }
                button.setState(new UU.a(null, null, false, false, false, null, drawableH, null, null, false, 447, null));
            } else {
                button.setVisibility(8);
            }
        }
        PaymentItem.Status status = paymentItem.f215049h;
        int i13 = status == null ? -1 : c.a.f215071a[status.ordinal()];
        TextView textView = cVar.f215068f;
        if (i13 == 1 || i13 != 2) {
            textView.setTextColor(cVar.itemView.getContext().getColor(R.color.common_gray_54));
        } else {
            textView.setTextColor(cVar.itemView.getContext().getColor(R.color.common_red_600));
        }
        cVar.f215067e.setText(paymentItem.f215043b);
        textView.setText(paymentItem.f215044c);
        TextView textView2 = cVar.f215069g;
        String str2 = paymentItem.f215048g;
        I5.a(textView2, str2, false);
        DeepLink deepLink = paymentItem.f215045d;
        cVar.f215070h.setVisibility((str2 != null || deepLink == null) ? 8 : 0);
        ViewGroup viewGroup = cVar.f215064b;
        if (deepLink != null) {
            viewGroup.setOnClickListener(new j(3, this.f215072b, paymentItem));
        } else {
            viewGroup.setOnClickListener(null);
        }
    }
}
