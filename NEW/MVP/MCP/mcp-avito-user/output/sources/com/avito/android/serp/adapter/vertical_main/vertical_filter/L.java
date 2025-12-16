package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import Oi0.C14700d;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.RunnableC22211b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.remote.model.vertical_main.StyleBlockGradient;
import com.avito.android.serp.adapter.C34690c0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.e1;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.C34869e;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: VerticalFilterView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/L;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/f;", "Lcom/avito/android/ui/adapter/f;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class L extends com.avito.android.serp.c implements com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f, com.avito.android.ui.adapter.f {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f273402s = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f273403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f273404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C14700d f273405d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final M f273406e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.konveyor.a f273407f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f273408g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f273409h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f273410i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.c f273411j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Banner f273412k;

    /* renamed from: l, reason: collision with root package name */
    public Button f273413l;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f273414m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.tooltip.k f273415n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager f273416o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ArrayList f273417p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Z0 f273418q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final String f273419r;

    /* compiled from: VerticalFilterView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f273420l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f273420l = str;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            oVar.b(this.f273420l);
            return G0.f406611a;
        }
    }

    public L(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k C14700d c14700d, @Y61.k M m12, @Y61.l com.avito.konveyor.a aVar2, @Y61.l @j.D Integer num, @Y61.l @j.D Integer num2, @Y61.l @j.D Integer num3, @Y61.k com.avito.android.serp.adapter.vertical_main.c cVar) throws Resources.NotFoundException {
        super(view);
        this.f273403b = view;
        this.f273404c = aVar;
        this.f273405d = c14700d;
        this.f273406e = m12;
        this.f273407f = aVar2;
        this.f273408g = num;
        this.f273409h = num2;
        this.f273410i = num3;
        this.f273411j = cVar;
        this.f273412k = (Banner) view;
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
        this.f273415n = kVar;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.vertical_search_filter_tooltip_offset);
        r.a aVar3 = new r.a(new i.c(new b.a()));
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(m12.b(), 1);
        this.f273416o = gridLayoutManager;
        this.f273417p = new ArrayList();
        Z0 z02 = new Z0(m12.b(), new C34690c0(m12.b()));
        this.f273418q = z02;
        String string = view.getContext().getString(R.string.show_items);
        this.f273419r = string;
        gridLayoutManager.f53667M = new e1(z02);
        B80();
        Button button = this.f273413l;
        (button == null ? null : button).setText(string);
        view.setClipToOutline(true);
        aVar3.m(dimensionPixelSize);
        aVar3.j(y6.b(8));
        int i12 = kVar.f181229o;
        kVar.f181228n = -2;
        kVar.f181229o = i12;
        kVar.f181224j = aVar3;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void AQ(@Y61.l StyleBlock styleBlock) {
        StyleBlockGradient gradient;
        StyleBlockGradient gradient2;
        PromoStyle preset;
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        Banner banner = this.f273412k;
        Context context = banner.getContext();
        int iJ2 = C35835l0.j((styleBlock == null || (preset = styleBlock.getPreset()) == null) ? R.attr.bannerBlue : this.f273411j.a(preset), banner.getContext());
        c5258a.getClass();
        com.avito.android.lib.design.banner.a aVarB = a.C5258a.b(iJ2, context);
        UniversalColor endColor = null;
        UniversalColor startColor = (styleBlock == null || (gradient2 = styleBlock.getGradient()) == null) ? null : gradient2.getStartColor();
        if (styleBlock != null && (gradient = styleBlock.getGradient()) != null) {
            endColor = gradient.getEndColor();
        }
        if (startColor != null && endColor != null) {
            Context context2 = banner.getContext();
            C48063a c48063a = C48063a.f437606a;
            aVarB = com.avito.android.lib.design.banner.a.a(aVarB, null, null, new C34869e(new C34869e.a(c48063a.a(context2, startColor), c48063a.a(banner.getContext(), endColor))), 0, 0, 0, 0, false, 0.0f, false, false, 8388603);
        }
        banner.setStyle(aVarB);
    }

    public final void B80() {
        Integer num = this.f273409h;
        int iIntValue = num != null ? num.intValue() : R.id.vertical_search_filter_action;
        Banner banner = this.f273412k;
        View viewFindViewById = banner.findViewById(iIntValue);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f273413l = (Button) viewFindViewById;
        Integer num2 = this.f273408g;
        View viewFindViewById2 = banner.findViewById(num2 != null ? num2.intValue() : R.id.vertical_search_filter_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f273414m = recyclerView;
        recyclerView.setLayoutManager(this.f273416o);
        RecyclerView recyclerView2 = this.f273414m;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setNestedScrollingEnabled(false);
    }

    public final void C80() {
        RecyclerView recyclerView = this.f273414m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (recyclerView.d0()) {
            RecyclerView recyclerView2 = this.f273414m;
            (recyclerView2 != null ? recyclerView2 : null).post(new com.avito.android.publish.screen.objects.view.actions.h(this, 15));
            return;
        }
        RecyclerView recyclerView3 = this.f273414m;
        RecyclerView.Adapter adapter = (recyclerView3 != null ? recyclerView3 : null).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void HW(@Y61.k Y41.a aVar) {
        this.f273403b.postDelayed(new RunnableC22211b(12, aVar), 250L);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void OD(@Y61.l Integer num) {
        Button button = this.f273413l;
        if (button == null) {
            button = null;
        }
        button.setAppearanceFromAttr(num != null ? num.intValue() : R.attr.buttonPrimaryLarge);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Of(@Y61.l String str, boolean z12) {
        int iS2;
        Button button = this.f273413l;
        Button button2 = button == null ? null : button;
        if (z12) {
            if (button == null) {
                button = null;
            }
            iS2 = D6.s(button);
        } else {
            iS2 = 0;
        }
        button2.setMinimumWidth(iS2);
        Button button3 = this.f273413l;
        if (button3 == null) {
            button3 = null;
        }
        button3.setLoading(z12);
        Button button4 = this.f273413l;
        if (button4 == null) {
            button4 = null;
        }
        boolean z13 = !z12;
        button4.setEnabled(z13);
        this.f273415n.dismiss();
        Button button5 = this.f273413l;
        Button button6 = button5 != null ? button5 : null;
        if (str == null) {
            str = this.f273419r;
        }
        button6.setText(str);
        Iterator it = this.f273417p.iterator();
        while (it.hasNext()) {
            ((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) it.next()).f273468e = z13;
        }
        C80();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Sj() {
        this.f273415n.dismiss();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void YI(@Y61.l Integer num) {
        int iJ2 = C35835l0.j(num != null ? num.intValue() : R.attr.buttonPrimaryLarge, new ContextThemeWrapper(this.f273412k.getContext(), R.style.Theme_DesignSystem_Re23));
        Button button = this.f273413l;
        if (button == null) {
            button = null;
        }
        button.setAppearance(iJ2);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void bg(@Y61.k View.OnClickListener onClickListener) {
        Button button = this.f273413l;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void c20(@Y61.l final BottomContent bottomContent, @Y61.k final Y41.l<? super DeepLink, G0> lVar) {
        Integer num = this.f273410i;
        if (num != null) {
            D6.f(this.f273412k, 0, 0, 0, y6.b(16), 7);
            int iIntValue = num.intValue();
            Banner banner = this.f273412k;
            FrameLayout frameLayout = (FrameLayout) banner.findViewById(iIntValue);
            if (frameLayout == null) {
                return;
            }
            frameLayout.removeAllViews();
            if (bottomContent == null) {
                return;
            }
            DeepLink onShowDeepLink = bottomContent.getOnShowDeepLink();
            if (onShowDeepLink != null && (onShowDeepLink instanceof ClickStreamLink)) {
                ((v.m) lVar).invoke(onShowDeepLink);
            }
            D6.f(this.f273412k, 0, 0, 0, y6.b(0), 7);
            View viewInflate = LayoutInflater.from(banner.getContext()).inflate(R.layout.bottom_content_block_layout, (ViewGroup) frameLayout, false);
            frameLayout.addView(viewInflate);
            D6.c(frameLayout, null, Integer.valueOf(y6.b(20)), null, null, 13);
            View viewFindViewById = viewInflate.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            com.avito.android.util.text.j.a((TextView) viewFindViewById, bottomContent.getTitle(), null);
            View viewFindViewById2 = viewInflate.findViewById(R.id.subtitle);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            com.avito.android.util.text.j.a((TextView) viewFindViewById2, bottomContent.getSubtitle(), null);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.serp.adapter.vertical_main.vertical_filter.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = L.f273402s;
                    DeepLink onTapDeepLink = bottomContent.getOnTapDeepLink();
                    if (onTapDeepLink != null) {
                        lVar.invoke(onTapDeepLink);
                    }
                }
            });
            View viewFindViewById3 = viewInflate.findViewById(R.id.image);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
            UniversalImage image = bottomContent.getImage();
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(image != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(banner.getContext())) : null), null, null, null, 14);
        }
    }

    @Override // com.avito.android.ui.adapter.f
    /* renamed from: gk */
    public final boolean getF207731j() {
        return false;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void s1(@Y61.k List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e> list) {
        ArrayList arrayList = this.f273417p;
        arrayList.clear();
        arrayList.addAll(list);
        UV0.c cVar = new UV0.c(arrayList);
        Z0 z02 = this.f273418q;
        z02.f268508b = cVar;
        this.f273404c.c(cVar);
        RecyclerView recyclerView = this.f273414m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (recyclerView.getAdapter() == null) {
            z02.f268509c = this;
            RecyclerView recyclerView2 = this.f273414m;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setAdapter(this.f273405d);
        } else {
            C80();
        }
        RecyclerView recyclerView3 = this.f273414m;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        C35976x4.a(recyclerView3);
        RecyclerView recyclerView4 = this.f273414m;
        (recyclerView4 != null ? recyclerView4 : null).l(new com.avito.android.serp.adapter.vertical_main.vertical_filter.item.h(this.f273403b.getResources(), this.f273407f, this.f273406e), -1);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void setTitle(@Y61.l String str) {
        this.f273412k.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void xO(int i12, @Y61.k Y41.a aVar, @Y61.k String str) {
        int[] iArr = new int[2];
        Button button = this.f273413l;
        if (button == null) {
            button = null;
        }
        button.getLocationOnScreen(iArr);
        int i13 = iArr[1] - i12;
        Button button2 = this.f273413l;
        if (button2 == null) {
            button2 = null;
        }
        if (i13 > button2.getHeight()) {
            com.avito.android.lib.design.tooltip.k kVar = this.f273415n;
            com.avito.android.lib.design.tooltip.p.a(kVar, new a(str));
            kVar.d(new com.avito.android.serp.adapter.serp_advert_card.i(19, aVar));
            Button button3 = this.f273413l;
            kVar.e(button3 != null ? button3 : null);
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void yM(int i12, int i13) {
        RecyclerView recyclerView = this.f273414m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(null);
        this.f273412k.i(i13, i12);
        B80();
    }

    @Override // com.avito.android.ui.adapter.f
    public final void rp() {
    }

    public /* synthetic */ L(View view, com.avito.konveyor.adapter.a aVar, C14700d c14700d, M m12, com.avito.konveyor.a aVar2, Integer num, Integer num2, Integer num3, com.avito.android.serp.adapter.vertical_main.c cVar, int i12, C42822w c42822w) {
        this(view, aVar, c14700d, m12, (i12 & 16) != 0 ? null : aVar2, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : num3, cVar);
    }
}
