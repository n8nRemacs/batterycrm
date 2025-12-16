package com.avito.android.cart_similar_items.konveyor.snippet;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.CartActionsViewImpl;
import com.avito.android.cart_snippet_actions.l;
import com.avito.android.util.C35835l0;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/snippet/i;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cart_snippet_actions/l;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e, l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f115897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin_shared.common.component.adapter.b f115898c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f115899d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f115900e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f115901f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageButton f115902g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f115903h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RecyclerView f115904i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f115905j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Context f115906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewGroup viewGroup, com.avito.android.beduin_shared.common.component.adapter.b bVar, l lVar, int i12, C42822w c42822w) {
        super(viewGroup);
        if ((i12 & 4) != 0) {
            View viewFindViewById = viewGroup.findViewById(R.id.snippet_cart_actions);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.cart_snippet_actions.CartActionsViewImpl");
            }
            lVar = (CartActionsViewImpl) viewFindViewById;
        }
        this.f115897b = viewGroup;
        this.f115898c = bVar;
        this.f115899d = lVar;
        View viewFindViewById2 = viewGroup.findViewById(R.id.snippet_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f115900e = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.snippet_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f115901f = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.snippet_favorite_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f115902g = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.snippet_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f115903h = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.snippet_beduin_list);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f115904i = recyclerView;
        View viewFindViewById7 = viewGroup.findViewById(R.id.snippet_cart_message);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f115905j = (TextView) viewFindViewById7;
        this.f115906k = viewGroup.getContext();
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new SnippetItemView$1());
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void Hf(@Y61.l String str, boolean z12) {
        this.f115899d.Hf(str, z12);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void Qr() {
        this.f115899d.Qr();
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setAddToCartButtonVisible(boolean z12) {
        this.f115899d.setAddToCartButtonVisible(z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFavorite(boolean z12) {
        Q q12 = z12 ? new Q(Integer.valueOf(R.attr.ic_favoritesFilled24), Integer.valueOf(R.attr.red700)) : new Q(Integer.valueOf(R.attr.ic_favorites24), Integer.valueOf(R.attr.black));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        Context context = this.f115906k;
        Drawable drawableH = C35835l0.h(iIntValue, context);
        ImageButton imageButton = this.f115902g;
        imageButton.setImageDrawable(drawableH);
        imageButton.setImageTintList(C35835l0.e(iIntValue2, context));
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setOnAddToCartClickListener(@Y61.l View.OnClickListener onClickListener) {
        this.f115899d.setOnAddToCartClickListener(onClickListener);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setStepperMaxValue(int i12) {
        this.f115899d.setStepperMaxValue(i12);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setStepperValue(int i12) {
        this.f115899d.setStepperValue(i12);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setStepperValueChangedListener(@k Y41.l<? super Integer, G0> lVar) {
        this.f115899d.setStepperValueChangedListener(lVar);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setStepperVisible(boolean z12) {
        this.f115899d.setStepperVisible(z12);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void setVisible(boolean z12) {
        this.f115899d.setVisible(z12);
    }
}
