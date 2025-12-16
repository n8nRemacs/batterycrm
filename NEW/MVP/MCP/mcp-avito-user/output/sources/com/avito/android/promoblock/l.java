package com.avito.android.promoblock;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TnsPromoBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promoblock/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/promoblock/k;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f231797b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f231798c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f231799d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f231800e;

    /* renamed from: f, reason: collision with root package name */
    public Button f231801f;

    /* renamed from: g, reason: collision with root package name */
    public View f231802g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<TnsPromoBlockItem.b> f231803h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f231804i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f231805j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f231806k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f231807l;

    /* compiled from: TnsPromoBlockItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TnsPromoBlockItem.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TnsPromoBlockItem.Style style = TnsPromoBlockItem.Style.f231760b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TnsPromoBlockItem.Style style2 = TnsPromoBlockItem.Style.f231760b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TnsPromoBlockItem.Style style3 = TnsPromoBlockItem.Style.f231760b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TnsPromoBlockItem.Style style4 = TnsPromoBlockItem.Style.f231760b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TnsPromoBlockItem.Style style5 = TnsPromoBlockItem.Style.f231760b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TnsPromoBlockItem.Style style6 = TnsPromoBlockItem.Style.f231760b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TnsPromoBlockItem.Style style7 = TnsPromoBlockItem.Style.f231760b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public l(@Y61.k View view, @Y61.k m mVar) {
        super(view);
        this.f231797b = view;
        View viewFindViewById = view.findViewById(R.id.tns_promo_block_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f231798c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tns_promo_block);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f231799d = (Banner) viewFindViewById2;
        com.jakewharton.rxrelay3.c<TnsPromoBlockItem.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f231803h = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f231804i = cVar2;
        this.f231806k = new C41981q0(cVar);
        this.f231807l = new C41981q0(cVar2);
        Integer num = mVar.f231810c;
        if (num != null) {
            viewFindViewById.setBackground(D6.u(view, num.intValue()));
        }
        viewFindViewById.setPadding(0, mVar.f231808a, 0, mVar.f231809b);
    }

    @Override // com.avito.android.promoblock.k
    @Y61.k
    public final z<TnsPromoBlockItem.b> A1() {
        return this.f231806k;
    }

    public final void B80(View view, TnsPromoBlockItem.b bVar) {
        if (bVar == null) {
            D6.w(view);
            if (view instanceof Button) {
                ((Button) view).setText("");
            } else if (view instanceof TextView) {
                ((TextView) view).setText("");
            }
            view.setOnClickListener(null);
            this.f231799d.setCloseButtonListener(null);
            return;
        }
        D6.H(view);
        boolean f231759d = bVar.getF231769a().getF229145g();
        if (view instanceof Button) {
            ((Button) view).setLoading(f231759d);
        }
        view.setEnabled(!bVar.getF231769a().getF229145g());
        String f231757b = bVar.getF231769a().getF229143e();
        if (view instanceof Button) {
            ((Button) view).setText(f231757b);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(f231757b);
        }
        view.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(15, this, bVar));
    }

    @Override // com.avito.android.promoblock.k
    @Y61.k
    /* renamed from: LH, reason: from getter */
    public final C41981q0 getF231807l() {
        return this.f231807l;
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f231799d.Tz(z12, z13);
    }

    @Override // com.avito.android.promoblock.k
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f231805j = aVar;
    }

    @Override // com.avito.android.promoblock.k
    public final void hq(@Y61.k TnsPromoBlockItem tnsPromoBlockItem) {
        int i12;
        G0 g02;
        int i13 = C43066x.h0(tnsPromoBlockItem.getF76517c(), "passport", true) ? R.layout.passport_promoblock_content : R.layout.tns_promoblock_content;
        TnsPromoBlockItem.Style f224504h = tnsPromoBlockItem.getF224504h();
        View view = this.f231797b;
        Context context = view.getContext();
        switch (f224504h.ordinal()) {
            case 0:
                i12 = R.attr.bannerWhite;
                break;
            case 1:
                i12 = R.attr.bannerBlue;
                break;
            case 2:
                i12 = R.attr.bannerGreen;
                break;
            case 3:
                i12 = R.attr.bannerRed;
                break;
            case 4:
                i12 = R.attr.bannerOrange;
                break;
            case 5:
                i12 = R.attr.bannerBeige;
                break;
            case 6:
                i12 = R.attr.bannerViolet;
                break;
            case 7:
                i12 = R.attr.bannerWarmgray;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int iJ2 = C35835l0.j(i12, context);
        Banner banner = this.f231799d;
        banner.j(i13, iJ2);
        View viewFindViewById = view.findViewById(R.id.promo_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231800e = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.promo_first_action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f231801f = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.promo_second_action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f231802g = viewFindViewById3;
        banner.setTitle(tnsPromoBlockItem.getF224501e());
        banner.setTitleTextAppearance(R.style.Re23_Text_H30);
        AttributedText f224503g = tnsPromoBlockItem.getF224503g();
        if (f224503g != null) {
            TextView textView = this.f231800e;
            if (textView == null) {
                textView = null;
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView2 = this.f231800e;
            if (textView2 == null) {
                textView2 = null;
            }
            com.avito.android.util.text.j.a(textView2, f224503g, null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            TextView textView3 = this.f231800e;
            if (textView3 == null) {
                textView3 = null;
            }
            I5.a(textView3, tnsPromoBlockItem.getF224502f(), false);
        }
        Button button = this.f231801f;
        if (button == null) {
            button = null;
        }
        TnsPromoBlockItem.Button f224508l = tnsPromoBlockItem.getF224508l();
        B80(button, f224508l != null ? new TnsPromoBlockItem.b.a(f224508l) : null);
        View view2 = this.f231802g;
        if (view2 == null) {
            view2 = null;
        }
        TnsPromoBlockItem.Button f224509m = tnsPromoBlockItem.getF224509m();
        B80(view2, f224509m != null ? new TnsPromoBlockItem.b.C7059b(f224509m) : null);
        banner.setCloseButtonVisible(tnsPromoBlockItem.getF224505i());
        if (tnsPromoBlockItem.getF224505i()) {
            banner.setCloseButtonListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 8));
        } else {
            banner.setCloseButtonListener(null);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f231805j;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
