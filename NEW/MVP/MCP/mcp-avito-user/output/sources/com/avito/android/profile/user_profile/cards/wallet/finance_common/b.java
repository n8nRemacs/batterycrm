package com.avito.android.profile.user_profile.cards.wallet.finance_common;

import Me.m;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.AvitoFinanceBackground;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;

/* compiled from: AvitoFinanceCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/b;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/a;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f225660r = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f225661b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225662c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225663d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f225664e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225665f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f225666g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f225667h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f225668i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f225669j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225670k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ImageView f225671l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f225672m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final TextView f225673n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225674o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ListItem f225675p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Group f225676q;

    public b(@k View view) {
        super(view);
        this.f225661b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.balance_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225662c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.balance_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225663d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.card_balance);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225664e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.wallet_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f225665f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.topup_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f225666g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.card_left);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225667h = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.card_left_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225668i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.card_left_subtitle);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225669j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.card_left_image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f225670k = (SimpleDraweeView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.card_right);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225671l = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.card_right_title);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225672m = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.card_right_subtitle);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225673n = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.card_right_image);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f225674o = (SimpleDraweeView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.header);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f225675p = (ListItem) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.bottom_cards);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f225676q = (Group) viewFindViewById15;
    }

    public static void B80(SimpleDraweeView simpleDraweeView, UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void Ag(boolean z12, @l String str, @l String str2, @l UniversalImage universalImage, @l AvitoFinanceBackground avitoFinanceBackground) throws Resources.NotFoundException {
        G0 g02;
        Context context = this.f225661b;
        if (str == null) {
            str = z12 ? context.getString(R.string.avito_finance_installments_promo_title_has_installments) : context.getString(R.string.avito_finance_installments_promo_title_no_installments);
        }
        TextView textView = this.f225672m;
        textView.setText(str);
        if (str2 == null) {
            str2 = context.getString(R.string.avito_finance_installments_promo_subtitle);
        }
        TextView textView2 = this.f225673n;
        textView2.setText(str2);
        SimpleDraweeView simpleDraweeView = this.f225674o;
        if (universalImage != null) {
            B80(simpleDraweeView, universalImage);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.setImageDrawable(C43852a.a(context, R.drawable.ic_user_profile_installments_promo));
        }
        if (avitoFinanceBackground != null) {
            C80(avitoFinanceBackground, this.f225671l);
        }
        simpleDraweeView.post(new m(textView, textView2, simpleDraweeView, 1));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void As(boolean z12) {
        this.f225676q.setVisibility(z12 ? 0 : 8);
    }

    public final void C80(AvitoFinanceBackground avitoFinanceBackground, ImageView imageView) throws Resources.NotFoundException {
        Context context = this.f225661b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_avito_finance_card_item);
        String gradient = avitoFinanceBackground.getGradient();
        Integer numH = gradient != null ? com.avito.android.lib.util.f.h(gradient) : null;
        String gradient2 = avitoFinanceBackground.getGradient();
        Integer numI = gradient2 != null ? com.avito.android.lib.util.f.i(gradient2) : null;
        UniversalColor color = avitoFinanceBackground.getColor();
        if (numH != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f225661b, numH.intValue(), 0, 4, null);
            c5275a.f179264a = dimensionPixelSize;
            imageView.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            imageView.setImageTintList(null);
            imageView.setImageDrawable(null);
            return;
        }
        if (numI == null) {
            if (color != null) {
                C48063a.f437606a.getClass();
                imageView.setImageTintList(C48063a.e(context, color));
                return;
            }
            return;
        }
        Context context2 = this.f225661b;
        a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context2, numI.intValue(), 0, 4, null);
        c5277a.f179264a = dimensionPixelSize;
        imageView.setBackground(new com.avito.android.lib.design.gradient.a(context2, c5277a.a()));
        imageView.setImageTintList(null);
        imageView.setImageDrawable(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void Dk(@k Y41.a<G0> aVar) {
        this.f225667h.setOnClickListener(new C(28, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void Kg(@k Y41.a<G0> aVar) {
        this.f225675p.setOnClickListener(new C(27, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void SA(@k Y41.a<G0> aVar) {
        this.f225664e.setOnClickListener(new C(26, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void Sr(boolean z12) {
        this.f225665f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void bH(@k Y41.a<G0> aVar) {
        this.f225666g.setOnClickListener(new C(25, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void dz(@l UniversalImage universalImage, @l String str, @l String str2, @l AvitoFinanceBackground avitoFinanceBackground) throws Resources.NotFoundException {
        G0 g02;
        Context context = this.f225661b;
        if (str == null) {
            str = context.getString(R.string.avito_finance_installments_repayment_title);
        }
        TextView textView = this.f225668i;
        textView.setText(str);
        if (str2 == null) {
            str2 = context.getString(R.string.avito_finance_installments_repayment_subtitle);
        }
        TextView textView2 = this.f225669j;
        textView2.setText(str2);
        SimpleDraweeView simpleDraweeView = this.f225670k;
        if (universalImage != null) {
            B80(simpleDraweeView, universalImage);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.setImageDrawable(C43852a.a(context, R.drawable.ic_user_profile_installments_repayment));
        }
        if (avitoFinanceBackground != null) {
            C80(avitoFinanceBackground, this.f225667h);
        }
        simpleDraweeView.post(new m(textView, textView2, simpleDraweeView, 1));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void r40(@k String str, @l String str2, @l String str3, @l String str4, @l UniversalImage universalImage, @l AvitoFinanceBackground avitoFinanceBackground) throws Resources.NotFoundException {
        G0 g02;
        Context context = this.f225661b;
        if (str3 == null) {
            if (str2 != null) {
                str = context.getString(R.string.avito_finance_combined_balance, str, str2);
            }
            str3 = str;
        }
        this.f225662c.setText(str3);
        if (str4 == null) {
            str4 = context.getString(R.string.avito_finance_wallet);
        }
        this.f225663d.setText(str4);
        SimpleDraweeView simpleDraweeView = this.f225665f;
        if (universalImage != null) {
            B80(simpleDraweeView, universalImage);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.setImageDrawable(C43852a.a(context, R.drawable.ic_user_profile_wallet));
        }
        if (avitoFinanceBackground != null) {
            C80(avitoFinanceBackground, this.f225664e);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void tK(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l AvitoFinanceBackground avitoFinanceBackground) throws Resources.NotFoundException {
        G0 g02;
        if (str2 != null) {
            str = str2;
        }
        TextView textView = this.f225668i;
        textView.setText(str);
        Context context = this.f225661b;
        if (str3 == null) {
            str3 = context.getString(R.string.avito_finance_bonuses);
        }
        TextView textView2 = this.f225669j;
        textView2.setText(str3);
        SimpleDraweeView simpleDraweeView = this.f225670k;
        if (universalImage != null) {
            B80(simpleDraweeView, universalImage);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.setImageDrawable(C43852a.a(context, R.drawable.ic_user_profile_bonus));
        }
        if (avitoFinanceBackground != null) {
            C80(avitoFinanceBackground, this.f225667h);
        }
        simpleDraweeView.post(new m(textView, textView2, simpleDraweeView, 1));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void uy(boolean z12) {
        this.f225666g.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.a
    public final void vP(@k Y41.a<G0> aVar) {
        this.f225671l.setOnClickListener(new C(29, aVar));
    }
}
