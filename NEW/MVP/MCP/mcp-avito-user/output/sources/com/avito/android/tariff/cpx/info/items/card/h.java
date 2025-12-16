package com.avito.android.tariff.cpx.info.items.card;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.q0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import sK0.C48063a;
import uB0.AbstractC48879g;
import uB0.C48873a;
import uB0.C48874b;
import uB0.C48875c;
import uB0.C48876d;
import uB0.C48877e;
import uB0.C48878f;
import uB0.C48880h;
import wZ.C49578b;
import wZ.C49581e;

/* compiled from: TariffCpxInfoCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/card/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/info/items/card/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f296444e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f296445b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f296446c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f296447d;

    public h(@k View view) {
        super(view);
        this.f296445b = view.getContext();
        this.f296446c = (Banner) view;
        this.f296447d = (LinearLayout) view.findViewById(R.id.tariff_cpx_info_card_item_container);
    }

    @Override // com.avito.android.tariff.cpx.info.items.card.g
    public final void LN(@l wZ.k kVar) {
        ColorStateList colorStateListF = null;
        if (kVar != null) {
            C48063a c48063a = C48063a.f437606a;
            C49581e c49581e = kVar.f441573b;
            Integer numValueOf = c49581e != null ? Integer.valueOf(c49581e.f441554a) : null;
            C49581e c49581e2 = kVar.f441574c;
            if (c49581e2 != null) {
                c49581e = c49581e2;
            }
            Integer numValueOf2 = c49581e != null ? Integer.valueOf(c49581e.f441554a) : null;
            c48063a.getClass();
            colorStateListF = C48063a.f(this.f296445b, kVar.f441572a, numValueOf, numValueOf2);
        }
        Banner.h(this.f296446c, colorStateListF);
    }

    @Override // com.avito.android.tariff.cpx.info.items.card.g
    public final void P9(int i12) {
        D6.c(this.f296446c, null, null, null, Integer.valueOf(y6.b(i12)), 7);
    }

    @Override // com.avito.android.tariff.cpx.info.items.card.g
    public final void TQ(@k Y41.l lVar, @k com.avito.android.util.text.a aVar, @k ArrayList arrayList) throws Resources.NotFoundException {
        Context context;
        Iterator it;
        Context context2;
        Integer numA;
        Integer numA2;
        FontParameter.TextStyleParameter textStyleParameter;
        Integer numA3;
        String attribute;
        Integer numQ;
        List<FontParameter> parameters;
        D6.H(this.f296446c);
        Context context3 = this.f296445b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context3);
        ViewGroup viewGroup = this.f296447d;
        viewGroup.removeAllViews();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i iVar = (i) it2.next();
            C48874b c48874b = iVar.f296448a.f296450a;
            if (c48874b != null) {
                Button button = (Button) layoutInflaterFrom.inflate(R.layout.tariff_cpx_info_card_button_item, viewGroup, false);
                C49578b c49578b = c48874b.f439842a;
                com.avito.android.lib.design.button.b.a(button, c49578b.f441546a, false);
                String str = c49578b.f441548c;
                if (str != null) {
                    button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(str), button.getContext()));
                }
                button.setEnabled(!L.f(c49578b.f441549d, Boolean.FALSE));
                DeepLink deepLink = c49578b.f441547b;
                if (deepLink != null) {
                    button.setOnClickListener(new XA0.c(lVar, deepLink, 10));
                } else {
                    button.setOnClickListener(null);
                }
                viewGroup.addView(button);
            }
            j jVar = iVar.f296448a;
            C48877e c48877e = jVar.f296451b;
            if (c48877e != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.tariff_cpx_info_card_text_item, viewGroup, false);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.tariff_cpx_info_card_item_title);
                ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.tariff_cpx_info_card_item_icon);
                DeepLink deepLink2 = c48877e.f439849b;
                if (deepLink2 != null) {
                    textView.setOnClickListener(new XA0.c(lVar, deepLink2, 11));
                    imageView.setOnClickListener(new XA0.c(lVar, deepLink2, 12));
                } else {
                    textView.setOnClickListener(null);
                    imageView.setOnClickListener(null);
                }
                AttributedText attributedText = c48877e.f439848a;
                List<Attribute> attributes = attributedText.getAttributes();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : attributes) {
                    Iterator it3 = it2;
                    if (obj instanceof FontAttribute) {
                        arrayList2.add(obj);
                    }
                    it2 = it3;
                }
                it = it2;
                FontAttribute fontAttribute = (FontAttribute) C42745f0.G(arrayList2);
                if (fontAttribute == null || (parameters = fontAttribute.getParameters()) == null) {
                    textStyleParameter = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : parameters) {
                        if (obj2 instanceof FontParameter.TextStyleParameter) {
                            arrayList3.add(obj2);
                        }
                    }
                    textStyleParameter = (FontParameter.TextStyleParameter) C42745f0.G(arrayList3);
                }
                if (textStyleParameter != null && (attribute = textStyleParameter.getAttribute()) != null && (numQ = com.avito.android.lib.util.f.q(attribute)) != null) {
                    textView.setTextAppearance(C35835l0.j(numQ.intValue(), textView.getContext()));
                }
                XA0.d.a(textView, aVar, attributedText, lVar);
                C48878f c48878f = c48877e.f439850c;
                if (c48878f != null) {
                    Integer numA4 = q.a(c48878f.f439851a);
                    if (numA4 != null) {
                        D6.H(imageView);
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        C48880h c48880h = c48878f.f439853c;
                        if (c48880h != null) {
                            context = context3;
                            D6.b(imageView, Integer.valueOf(y6.b(c48880h.f439859a)), Integer.valueOf(y6.b(c48880h.f439861c)), Integer.valueOf(y6.b(c48880h.f439860b)), Integer.valueOf(y6.b(c48880h.f439862d)));
                        } else {
                            context = context3;
                        }
                        dVar.g(constraintLayout);
                        AbstractC48879g abstractC48879g = c48878f.f439852b;
                        if (abstractC48879g instanceof AbstractC48879g.a) {
                            dVar.f(textView.getId(), 7);
                            dVar.i(textView.getId(), 3, 0, 3);
                            dVar.i(textView.getId(), 6, 0, 6);
                            dVar.i(textView.getId(), 4, 0, 4);
                            dVar.i(imageView.getId(), 3, 0, 3);
                            dVar.i(imageView.getId(), 7, 0, 7);
                            dVar.i(imageView.getId(), 6, textView.getId(), 7);
                            dVar.y(0.0f, imageView.getId());
                        } else if (abstractC48879g instanceof AbstractC48879g.c) {
                            dVar.i(textView.getId(), 3, 0, 3);
                            dVar.i(textView.getId(), 7, imageView.getId(), 6);
                            dVar.i(textView.getId(), 6, 0, 6);
                            dVar.i(textView.getId(), 4, 0, 4);
                            dVar.i(imageView.getId(), 3, 0, 3);
                            dVar.i(imageView.getId(), 7, 0, 7);
                            dVar.i(imageView.getId(), 6, textView.getId(), 7);
                            dVar.y(1.0f, imageView.getId());
                        } else if (abstractC48879g instanceof AbstractC48879g.b) {
                            dVar.i(textView.getId(), 3, 0, 3);
                            dVar.i(textView.getId(), 7, 0, 7);
                            dVar.i(textView.getId(), 6, imageView.getId(), 7);
                            dVar.i(textView.getId(), 4, 0, 4);
                            dVar.i(imageView.getId(), 3, 0, 3);
                            dVar.i(imageView.getId(), 6, 0, 6);
                        }
                        DeepLink deepLink3 = c48878f.f439855e;
                        if (deepLink3 != null) {
                            imageView.setOnClickListener(new XA0.c(lVar, deepLink3, 13));
                        } else {
                            imageView.setOnClickListener(null);
                        }
                        dVar.c(constraintLayout);
                        Drawable drawableH = C35835l0.h(numA4.intValue(), constraintLayout.getContext());
                        if (drawableH != null) {
                            wZ.k kVar = c48878f.f439854d;
                            if (kVar != null && (numA3 = kVar.a(constraintLayout.getContext())) != null) {
                                V0.a(drawableH, numA3.intValue());
                            }
                            imageView.setImageDrawable(drawableH);
                        }
                    } else {
                        context = context3;
                        D6.w(imageView);
                    }
                } else {
                    context = context3;
                }
                viewGroup.addView(constraintLayout);
            } else {
                context = context3;
                it = it2;
            }
            C48876d c48876d = jVar.f296452c;
            if (c48876d != null) {
                ProgressBar progressBar = (ProgressBar) layoutInflaterFrom.inflate(R.layout.tariff_cpx_info_card_progress_item, viewGroup, false);
                progressBar.setProgress(c48876d.f439845a);
                wZ.k kVar2 = c48876d.f439846b;
                progressBar.setFillColor((kVar2 == null || (numA2 = kVar2.a(progressBar.getContext())) == null) ? C35835l0.d(R.attr.green, progressBar.getContext()) : numA2.intValue());
                wZ.k kVar3 = c48876d.f439847c;
                progressBar.setEmptyColor((kVar3 == null || (numA = kVar3.a(progressBar.getContext())) == null) ? C35835l0.d(R.attr.warmGray12, progressBar.getContext()) : numA.intValue());
                viewGroup.addView(progressBar);
            }
            C48875c c48875c = jVar.f296453d;
            if (c48875c != null) {
                DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) layoutInflaterFrom.inflate(R.layout.tariff_cpx_info_card_dotted_text_item, viewGroup, false);
                XA0.d.a(descriptionParameterItem.getLeftTextView(), aVar, c48875c.f439843a, lVar);
                XA0.d.a(descriptionParameterItem.getRightTextView(), aVar, c48875c.f439844b, lVar);
                viewGroup.addView(descriptionParameterItem);
            }
            C48873a c48873a = jVar.f296454e;
            if (c48873a != null) {
                DockingBadgeContainer dockingBadgeContainer = (DockingBadgeContainer) layoutInflaterFrom.inflate(R.layout.tariff_cpx_info_card_badges_item, viewGroup, false);
                ArrayList arrayList4 = c48873a.f439841a;
                if (O2.a(arrayList4)) {
                    dockingBadgeContainer.setBadgeItems(arrayList4);
                    D6.H(dockingBadgeContainer);
                } else {
                    D6.w(dockingBadgeContainer);
                }
                viewGroup.addView(dockingBadgeContainer);
            }
            Integer num = iVar.f296449b;
            if (num != null) {
                int iIntValue = num.intValue();
                context2 = context;
                View view = new View(context2);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, y6.b(iIntValue)));
                viewGroup.addView(view);
            } else {
                context2 = context;
            }
            context3 = context2;
            it2 = it;
        }
    }

    @Override // com.avito.android.tariff.cpx.info.items.card.g
    public final void Ta() {
        D6.w(this.f296446c);
        this.f296447d.removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // com.avito.android.tariff.cpx.info.items.card.g
    public final void W8(@k Y41.l lVar, @k DeepLink deepLink) {
        Iterator itV = C43033p.v(q0.a(this.f296447d).f410561a);
        while (itV.hasNext()) {
            ((View) itV.next()).setOnClickListener(new XA0.c(lVar, deepLink, 14));
        }
    }
}
