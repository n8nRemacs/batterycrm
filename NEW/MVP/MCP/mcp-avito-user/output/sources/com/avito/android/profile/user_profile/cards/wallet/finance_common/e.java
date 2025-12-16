package com.avito.android.profile.user_profile.cards.wallet.finance_common;

import Me.m;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.AvitoFinanceAction;
import com.avito.android.remote.model.AvitoFinanceBackground;
import com.avito.android.remote.model.AvitoFinanceButton;
import com.avito.android.remote.model.AvitoFinanceDynamicCard;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AvitoFinanceDynamicCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/e;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/c;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225680g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f225681b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f225682c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItem f225683d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super AvitoFinanceAction, G0> f225684e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super AvitoFinanceAction, G0> f225685f;

    /* compiled from: AvitoFinanceDynamicCardItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/e$a;", "", "<init>", "()V", "", "DEFAULT_WEIGHT", "F", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public e(@k View view) {
        super(view);
        this.f225681b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.widget_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f225682c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f225683d = (ListItem) viewFindViewById2;
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.c
    public final void Oe(@k List<? extends List<AvitoFinanceDynamicCard>> list) throws Resources.NotFoundException {
        Integer numValueOf;
        boolean z12;
        int iB2;
        String title;
        LinearLayout linearLayout = this.f225682c;
        linearLayout.removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Context context = this.f225681b;
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = y6.b(6);
            linearLayout2.setLayoutParams(layoutParams);
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AvitoFinanceDynamicCard avitoFinanceDynamicCard = (AvitoFinanceDynamicCard) obj;
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.user_profile_avito_finance_single_card, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.card_title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                textView.setText(avitoFinanceDynamicCard.getTitle());
                View viewFindViewById2 = viewInflate.findViewById(R.id.card_subtitle);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById2;
                textView2.setText(avitoFinanceDynamicCard.getSubtitle());
                View viewFindViewById3 = viewInflate.findViewById(R.id.card_image);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
                }
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
                UniversalImage image = avitoFinanceDynamicCard.getImage();
                if (image != null) {
                    Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
                    if (imageDependsOnThemeOrDefault != null) {
                        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
                        D6.H(simpleDraweeView);
                    } else {
                        D6.w(simpleDraweeView);
                    }
                }
                simpleDraweeView.post(new m(textView, textView2, simpleDraweeView, 1));
                if (avitoFinanceDynamicCard.getButton() != null) {
                    View viewFindViewById4 = viewInflate.findViewById(R.id.card_button);
                    if (viewFindViewById4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                    }
                    Button button = (Button) viewFindViewById4;
                    button.setVisibility(0);
                    AvitoFinanceButton button2 = avitoFinanceDynamicCard.getButton();
                    if (button2 == null || (title = button2.getTitle()) == null) {
                        title = "";
                    }
                    button.setText(title);
                    button.setOnClickListener(new d(0, avitoFinanceDynamicCard, this));
                }
                AvitoFinanceBackground background = avitoFinanceDynamicCard.getBackground();
                if (background != null) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_avito_finance_card_item);
                    String gradient = background.getGradient();
                    Integer numH = gradient != null ? com.avito.android.lib.util.f.h(gradient) : null;
                    String gradient2 = background.getGradient();
                    Integer numI = gradient2 != null ? com.avito.android.lib.util.f.i(gradient2) : null;
                    UniversalColor color = background.getColor();
                    if (numH != null) {
                        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f225681b, numH.intValue(), 0, 4, null);
                        c5275a.f179264a = dimensionPixelSize;
                        viewInflate.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
                        viewInflate.setBackgroundTintList(null);
                    } else if (numI != null) {
                        Context context2 = this.f225681b;
                        a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context2, numI.intValue(), 0, 4, null);
                        c5277a.f179264a = dimensionPixelSize;
                        viewInflate.setBackground(new com.avito.android.lib.design.gradient.a(context2, c5277a.a()));
                        viewInflate.setBackgroundTintList(null);
                    } else if (color != null) {
                        C48063a.f437606a.getClass();
                        viewInflate.setBackgroundTintList(C48063a.e(context, color));
                    }
                }
                viewInflate.setOnClickListener(new d(1, avitoFinanceDynamicCard, this));
                Integer weight = avitoFinanceDynamicCard.getWeight();
                if (weight != null) {
                    int iIntValue = weight.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    numValueOf = null;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                layoutParams2.weight = numValueOf != null ? numValueOf.intValue() : 1.0f;
                if (i12 != list2.size() - 1) {
                    iB2 = y6.b(6);
                    z12 = false;
                } else {
                    z12 = false;
                    iB2 = y6.b(0);
                }
                layoutParams2.setMarginEnd(iB2);
                viewInflate.setLayoutParams(layoutParams2);
                linearLayout2.addView(viewInflate);
                i12 = i13;
            }
            linearLayout.addView(linearLayout2);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.c
    public final void XP(@k Y41.l lVar) {
        this.f225684e = new g(lVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.c
    public final void bT(@k Y41.l lVar, @k ArrayList arrayList) {
        this.f225683d.setOnClickListener(new d(2, arrayList, lVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.c
    public final void nG(@k Y41.l lVar) {
        this.f225685f = new f(lVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_common.c
    public final void yv(@k Y41.l lVar, @k List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lVar.invoke((AvitoFinanceAction) it.next());
        }
    }
}
