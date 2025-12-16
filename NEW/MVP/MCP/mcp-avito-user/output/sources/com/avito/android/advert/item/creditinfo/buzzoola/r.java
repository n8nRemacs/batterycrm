package com.avito.android.advert.item.creditinfo.buzzoola;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35769c6;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.TypefaceType;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaCreditBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/r;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f74973b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f74974c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f74975d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f74976e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f74977f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f74978g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f74979h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74980i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final View f74981j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f74982k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f74983l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public d f74984m;

    public r(@Y61.k View view) {
        this.f74973b = view;
        View viewFindViewById = view.findViewById(R.id.stub_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74974c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ad_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74975d = viewFindViewById2;
        TextView textView = (TextView) view.findViewById(R.id.advertising_badge);
        this.f74976e = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.domain_badge);
        this.f74977f = textView2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById3;
        this.f74978g = textView3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById4;
        this.f74979h = textView4;
        View viewFindViewById5 = view.findViewById(R.id.icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById5;
        this.f74980i = simpleDraweeView;
        View viewFindViewById6 = view.findViewById(R.id.info_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f74981j = view.findViewById(R.id.divider_top);
        View viewFindViewById7 = view.findViewById(R.id.click_area);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74982k = viewFindViewById7;
        viewFindViewById7.setOnClickListener(new q(this, 1));
        if (textView != null) {
            textView.setOnClickListener(new q(this, 2));
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new q(this, 3));
        }
        textView3.setOnClickListener(new q(this, 4));
        textView4.setOnClickListener(new q(this, 5));
        simpleDraweeView.setOnClickListener(new q(this, 6));
        imageView.setOnClickListener(new q(this, 7));
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void Ek() {
        D6.w(this.f74974c);
        D6.w(this.f74975d);
        D6.w(this.f74981j);
        D6.w(this.f74973b);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void Oc(@Y61.l String str) {
        TextView textView = this.f74977f;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void Pd(@Y61.k d dVar) {
        throw null;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void U7(@Y61.k String str, boolean z12) {
        TextView textView = this.f74979h;
        textView.setSingleLine(z12);
        textView.setText(str);
        D6.H(textView);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void WO(@Y61.k String str, @Y61.k String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H.i(' ', str, str2));
        Context context = this.f74973b.getContext();
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i12 = C35777d6.f318863a;
        spannableStringBuilder.setSpan(new C35769c6(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontHeavy, context), context)), 0, str.length(), 33);
        TextView textView = this.f74978g;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.f74979h;
        textView2.setText((CharSequence) null);
        D6.w(textView2);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void Y3() {
        androidx.appcompat.app.l lVar = this.f74983l;
        if (lVar != null) {
            lVar.dismiss();
        }
        this.f74983l = null;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void iH(@Y61.k String str, @Y61.l String str2) {
        Window window;
        LayoutInflater layoutInflater;
        View viewInflate;
        androidx.appcompat.app.l lVar = this.f74983l;
        if (lVar != null) {
            lVar.dismiss();
        }
        androidx.appcompat.app.l lVarCreate = new l.a(this.f74973b.getContext()).setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 4)).create();
        this.f74983l = lVarCreate;
        View view = null;
        if (lVarCreate != null && (layoutInflater = lVarCreate.getLayoutInflater()) != null && (viewInflate = layoutInflater.inflate(R.layout.buzzoola_premium_legal_dialog, (ViewGroup) null)) != null) {
            ((TextView) viewInflate.findViewById(R.id.legal_text)).setText(str);
            I5.a((TextView) viewInflate.findViewById(R.id.juristic_text), str2, false);
            ((Button) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new q(this, 0));
            view = viewInflate;
        }
        androidx.appcompat.app.l lVar2 = this.f74983l;
        if (lVar2 != null && (window = lVar2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        androidx.appcompat.app.l lVar3 = this.f74983l;
        if (lVar3 != null) {
            lVar3.t(view);
        }
        androidx.appcompat.app.l lVar4 = this.f74983l;
        if (lVar4 != null) {
            com.avito.android.lib.util.g.a(lVar4);
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void kC(boolean z12) {
        TextView textView = this.f74976e;
        if (textView != null) {
            D6.G(textView, z12);
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void pz(boolean z12) {
        D6.w(this.f74974c);
        D6.G(this.f74981j, z12);
        D6.H(this.f74975d);
        D6.H(this.f74973b);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void setTitle(@Y61.k String str) {
        TextView textView = this.f74978g;
        textView.setSingleLine(true);
        textView.setText(str);
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void y9(@Y61.k Uri uri) {
        ImageRequest.a aVarA = C35949t5.a(this.f74980i);
        aVarA.f(uri);
        aVarA.c();
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.n
    public final void z20() {
        D6.w(this.f74975d);
        D6.w(this.f74981j);
        D6.H(this.f74974c);
        D6.H(this.f74973b);
    }
}
