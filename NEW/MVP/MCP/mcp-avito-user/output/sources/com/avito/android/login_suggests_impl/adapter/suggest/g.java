package com.avito.android.login_suggests_impl.adapter.suggest;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/suggest/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/login_suggests_impl/adapter/suggest/f;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f182889b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f182890c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f182891d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f182892e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f182893f;

    public g(@k View view) {
        super(view);
        this.f182889b = view;
        View viewFindViewById = view.findViewById(R.id.suggest_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f182890c = textView;
        View viewFindViewById2 = view.findViewById(R.id.suggest_item_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f182891d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.suggest_item_avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f182892e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.suggest_item_arrow);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        Drawable drawableH = C35835l0.h(R.attr.ic_arrowRight20, imageView.getContext());
        if (drawableH != null) {
            drawableH.setTintList(imageView.getContext().getColorStateList(R.color.common_black));
        } else {
            drawableH = null;
        }
        imageView.setImageDrawable(drawableH);
        textView.setMaxLines(1);
    }

    @Override // com.avito.android.login_suggests_impl.adapter.suggest.f
    @k
    public final z<G0> A() {
        return C37722i.a(this.f182889b);
    }

    @Override // com.avito.android.login_suggests_impl.adapter.suggest.f
    public final void J(@k String str) {
        this.f182890c.setText(str);
    }

    @Override // com.avito.android.login_suggests_impl.adapter.suggest.f
    public final void d(@l Y41.a<G0> aVar) {
        this.f182893f = aVar;
    }

    @Override // com.avito.android.login_suggests_impl.adapter.suggest.f
    public final void h1(@l Image image) {
        com.avito.android.advert.item.delivery_suggests.l.w(image, C35949t5.a(this.f182892e));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f182893f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.login_suggests_impl.adapter.suggest.f
    public final void setHint(@k String str) {
        I5.a(this.f182891d, str, false);
    }
}
