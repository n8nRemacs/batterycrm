package com.avito.android.advert.item.autoteka.teaser;

import Cf.C13298a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.autoteka.teaser.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.autotekateaser.AutotekaCpoTeaser;
import com.avito.android.remote.model.autotekateaser.AutotekaDiscount;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.BannerGradient;
import com.avito.android.remote.model.autotekateaser.PromoBanner;
import com.avito.android.remote.model.autotekateaser.ShowProductsAction;
import com.avito.android.remote.model.autotekateaser.ShowReportAction;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.teaser.TeaserError;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import x4.AbstractC49760b;

/* compiled from: AdvertDetailsAutotekaTeaserPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/j;", "Lx4/b;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "Lcom/avito/android/advert/item/autoteka/teaser/m;", "Lcom/avito/android/advert/item/autoteka/teaser/AdvertDetailsAutotekaTeaserItem;", "Lcom/avito/android/advert/item/autoteka/teaser/i$b;", "Lcom/avito/android/advert/item/autoteka/teaser/i;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends AbstractC49760b<AutotekaTeaserItemResponse, m, AdvertDetailsAutotekaTeaserItem, i.b> implements i {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f73035h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f73036i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f73037j;

    /* compiled from: AdvertDetailsAutotekaTeaserPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/j$a;", "", "<init>", "()V", "", "AUTOTEKA_UNIQUE_DATA", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public j(@Y61.k @InterfaceC30174s String str, @Y61.k com.avito.android.autoteka.data.a aVar, @Y61.k @y4.e com.avito.konveyor.adapter.a aVar2) {
        super(aVar, str);
        this.f73035h = str;
        this.f73036i = aVar;
        this.f73037j = aVar2;
    }

    @Override // x4.c.b
    public final void O() {
        this.f73036i.i(this.f73035h);
    }

    @Override // x4.AbstractC49760b
    public final void n0(AutotekaTeaserItem autotekaTeaserItem) {
        m mVar;
        m mVar2;
        String text;
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = (AutotekaTeaserItemResponse) autotekaTeaserItem;
        AutotekaTeaserResult autotekaData = autotekaTeaserItemResponse.getAutotekaData();
        if (autotekaData != null && (mVar2 = (m) this.f442183d) != null) {
            AutotekaCpoTeaser cpo = autotekaData.getCpo();
            if (cpo == null) {
                m mVar3 = (m) this.f442183d;
                if (mVar3 != null) {
                    ShowReportAction showReportAction = autotekaData.getShowReportAction();
                    if (showReportAction == null || (text = showReportAction.getText()) == null) {
                        ShowProductsAction showProductsAction = autotekaData.getShowProductsAction();
                        text = showProductsAction != null ? showProductsAction.getText() : autotekaData.getReportLink().getTitle();
                    }
                    ShowProductsAction showProductsAction2 = autotekaData.getShowProductsAction();
                    String subTitle = showProductsAction2 != null ? showProductsAction2.getSubTitle() : null;
                    mVar3.R1(autotekaData.getTitle());
                    mVar3.DW(autotekaData.getSubTitle());
                    AutotekaDiscount discount = autotekaData.getDiscount();
                    com.avito.android.advert.item.teaser.c cVar = mVar3.f442189d;
                    if (discount != null) {
                        LinearLayout linearLayout = cVar.f80537k;
                        if (linearLayout != null) {
                            D6.H(linearLayout);
                        }
                        LinearLayout linearLayout2 = cVar.f80535i;
                        if (linearLayout2 != null) {
                            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(cVar.f80528b.getContext(), R.attr.gradientLinearMixedHorizontalBlueGreen, 0, 4, null);
                            c5275a.f179264a = y6.b(16);
                            linearLayout2.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
                        }
                        TextView textView = cVar.f80536j;
                        if (textView != null) {
                            textView.setText(discount.getTitle());
                        }
                        DockingBadge dockingBadge = cVar.f80538l;
                        if (dockingBadge != null) {
                            dockingBadge.setText(discount.getAmount());
                        }
                    } else {
                        cVar.getClass();
                    }
                    mVar3.B80(R.layout.advert_details_autoteka_teaser_insight, autotekaData.getInsights());
                    mVar3.R70(text, subTitle);
                    PromoBanner promoBanner = autotekaData.getPromoBanner();
                    View view = mVar3.f73042f;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.contest_banner_container);
                    if (promoBanner == null) {
                        D6.w(linearLayout3);
                    } else {
                        TextView textView2 = (TextView) view.findViewById(R.id.contest_banner_text);
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.contest_banner_image);
                        UniversalColor textColor = promoBanner.getTextColor();
                        Context context = view.getContext();
                        C48063a c48063a = C48063a.f437606a;
                        textView2.setTextColor(c48063a.a(context, textColor));
                        textView2.setText(promoBanner.getTitle());
                        BannerGradient gradient = promoBanner.getGradient();
                        Context context2 = linearLayout3.getContext();
                        UniversalColor startColor = gradient.getStartColor();
                        UniversalColor centerColor = gradient.getCenterColor();
                        UniversalColor endColor = gradient.getEndColor();
                        int iA2 = c48063a.a(context2, startColor);
                        Integer numValueOf = centerColor != null ? Integer.valueOf(c48063a.a(context2, centerColor)) : null;
                        int iA3 = c48063a.a(context2, endColor);
                        ArrayList arrayListE0 = C42745f0.e0(Integer.valueOf(iA2));
                        if (numValueOf != null) {
                            arrayListE0.add(Integer.valueOf(numValueOf.intValue()));
                        }
                        arrayListE0.add(Integer.valueOf(iA3));
                        linearLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, C42745f0.L0(arrayListE0)));
                        v.a(linearLayout3, y6.b(16));
                        DeepLink deepLink = promoBanner.getDeepLink();
                        if (deepLink != null) {
                            linearLayout3.setOnClickListener(new com.avito.android.advert.closed.b(4, mVar3, deepLink));
                        }
                        UniversalImage image = promoBanner.getImage();
                        int i12 = view.getContext().getResources().getConfiguration().screenWidthDp;
                        if (image == null || i12 < 360) {
                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginEnd(y6.b(16));
                            textView2.requestLayout();
                            D6.w(simpleDraweeView);
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginEnd(y6.b(0));
                            textView2.requestLayout();
                            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(view.getContext()))), null, null, null, 14);
                            D6.H(simpleDraweeView);
                        }
                        D6.H(linearLayout3);
                    }
                    AutotekaReportLink exampleReportLink = autotekaData.getExampleReportLink();
                    if (exampleReportLink != null) {
                        TextView textView3 = (TextView) view.findViewById(R.id.teaser_example);
                        I5.a(textView3, exampleReportLink.getTitle(), false);
                        textView3.setOnClickListener(new com.avito.android.advert.closed.b(3, mVar3, exampleReportLink));
                        D6.H(textView3);
                    }
                    List<String> abs = autotekaData.getAbs();
                    RecyclerView recyclerView = mVar3.f73046j;
                    if (abs == null || !abs.contains("carouselAndroidTeaser")) {
                        D6.w(recyclerView);
                    } else {
                        PV.a aVar = new PV.a(0, 0, 0, y6.b(8));
                        C35976x4.a(recyclerView);
                        recyclerView.l(aVar, -1);
                        recyclerView.setAdapter(mVar3.f73043g);
                        recyclerView.s();
                        recyclerView.o(new l(mVar3));
                        D6.H(recyclerView);
                        this.f73037j.c(new UV0.c(C42745f0.U(new com.avito.android.advert.item.autoteka.teaser.uniqueData.c(0L, null, R.string.advert_details_autoteka_unique_data_title_item_2, R.string.advert_details_autoteka_unique_data_description_item_2, R.attr.gradientLinearMonoHorizontalBlue, R.drawable.img_autoteka_file, 3, null), new com.avito.android.advert.item.autoteka.teaser.uniqueData.c(0L, null, R.string.advert_details_autoteka_unique_data_title_item_3, R.string.advert_details_autoteka_unique_data_description_item_3, R.attr.gradientLinearMonoHorizontalViolet, R.drawable.img_autoteka_graph, 3, null), new com.avito.android.advert.item.autoteka.teaser.uniqueData.c(0L, null, R.string.advert_details_autoteka_unique_data_title_item_1, R.string.advert_details_autoteka_unique_data_description_item_1, R.attr.gradientLinearMonoHorizontalGreen, R.drawable.img_autoteka_car, 3, null))));
                    }
                    StandaloneAutotekaLink standaloneAutotekaLink = autotekaData.getStandaloneAutotekaLink();
                    if (standaloneAutotekaLink != null) {
                        TextView textView4 = (TextView) view.findViewById(R.id.standalone_link);
                        com.avito.android.util.text.j.c(textView4, C13298a.a(standaloneAutotekaLink), null);
                        textView4.setOnClickListener(new com.avito.android.advert.closed.b(2, mVar3, standaloneAutotekaLink));
                        D6.H(textView4);
                    }
                }
            } else {
                mVar2.f442190e.a(cpo);
            }
            mVar2.jL();
        }
        TeaserError error = autotekaTeaserItemResponse.getError();
        if (error == null || (mVar = (m) this.f442183d) == null) {
            return;
        }
        mVar.w9(error);
    }
}
