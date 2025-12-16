package com.avito.android.list.text_suggest;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: TextSuggestViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/text_suggest/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/list/text_suggest/h;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f181644h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f181645b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f181646c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f181647d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SimpleDraweeView f181648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f181649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f181650g;

    public i(@k View view) throws Resources.NotFoundException {
        super(view);
        this.f181645b = view;
        View viewFindViewById = view.findViewById(R.id.suggest_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f181646c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.suggest_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f181647d = (TextView) viewFindViewById2;
        this.f181648e = (SimpleDraweeView) view.findViewById(R.id.icon);
        Resources resources = view.getResources();
        this.f181649f = resources.getDimensionPixelSize(R.dimen.text_suggest_icon_default_size);
        this.f181650g = resources.getDimensionPixelSize(R.dimen.suggest_item_default_vertical_padding);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.suggest_redesign_horizontal_padding);
        D6.f(view, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        view.setBackground(new RippleDrawable(C35835l0.e(R.attr.warmGray4, view.getContext()), null, C43852a.a(view.getContext(), R.drawable.rect_mask_radius_3)));
    }

    public final void B80(SimpleDraweeView simpleDraweeView, Integer num, Integer num2, Integer num3) {
        D6.H(simpleDraweeView);
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        int iJ2 = this.f181649f;
        View view = this.f181645b;
        layoutParams.width = num != null ? D6.j(view, num.intValue()) : iJ2;
        ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
        if (num2 != null) {
            iJ2 = D6.j(view, num2.intValue());
        }
        layoutParams2.height = iJ2;
        simpleDraweeView.getHierarchy().s(RoundingParams.b(num3 != null ? y6.b(num3.intValue()) : 0.0f));
        simpleDraweeView.requestLayout();
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void S8(@l Integer num, @l Integer num2) {
        int iJ2 = this.f181650g;
        View view = this.f181645b;
        int iJ3 = num != null ? D6.j(view, num.intValue()) : iJ2;
        if (num2 != null) {
            iJ2 = D6.j(view, num2.intValue());
        }
        D6.f(this.f181645b, 0, iJ3, 0, iJ2, 5);
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void V7() {
        SimpleDraweeView simpleDraweeView = this.f181648e;
        if (simpleDraweeView != null) {
            C35949t5.a(simpleDraweeView).b();
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f181645b.setOnClickListener(new C(10, aVar));
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void e(@k AttributedText attributedText) {
        j.c(this.f181646c, attributedText, null);
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void h(@l String str) {
        I5.a(this.f181647d, str, false);
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void k20(@k p pVar, @l Integer num, @l Integer num2, boolean z12, @l Integer num3) {
        SimpleDraweeView simpleDraweeView = this.f181648e;
        if (simpleDraweeView != null) {
            simpleDraweeView.setColorFilter(z12 ? new PorterDuffColorFilter(C35835l0.d(R.attr.black, simpleDraweeView.getContext()), PorterDuff.Mode.SRC_IN) : null);
            B80(simpleDraweeView, num, num2, num3);
            C35949t5.c(simpleDraweeView, pVar, null, null, null, 14);
        }
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void oi(@l Integer num) {
        View view = this.f181645b;
        view.setMinimumHeight(num != null ? D6.j(view, num.intValue()) : 0);
    }

    @Override // com.avito.android.list.text_suggest.h
    public final void setIcon(@InterfaceC42165v int i12) {
        SimpleDraweeView simpleDraweeView = this.f181648e;
        if (simpleDraweeView != null) {
            C35949t5.a(simpleDraweeView).b();
            B80(simpleDraweeView, null, null, null);
            Drawable drawableA = C43852a.a(this.f181645b.getContext(), i12);
            if (drawableA != null) {
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f169484b = new ImageRequest.d.a(drawableA, null);
                aVarA.c();
            }
        }
    }
}
