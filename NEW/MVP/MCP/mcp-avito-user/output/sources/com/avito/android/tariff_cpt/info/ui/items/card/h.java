package com.avito.android.tariff_cpt.info.ui.items.card;

import AC0.f;
import Y41.l;
import Y61.k;
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
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.q;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import iC0.C41267a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: CptInfoCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/card/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/card/g;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f298282f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298283b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f298284c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Banner f298285d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f298286e;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f298283b = aVar;
        this.f298284c = view.getContext();
        this.f298285d = (Banner) view;
        this.f298286e = (LinearLayout) view.findViewById(R.id.cpt_info_card_item_container);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.card.g
    public final void P9(int i12) {
        D6.c(this.f298285d, null, null, null, Integer.valueOf(y6.b(i12)), 7);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.card.g
    public final void Ta() {
        D6.w(this.f298285d);
        this.f298286e.removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // com.avito.android.tariff_cpt.info.ui.items.card.g
    public final void W8(@k l lVar, @k DeepLink deepLink) {
        Iterator itV = C43033p.v(q0.a(this.f298286e).f410561a);
        while (itV.hasNext()) {
            ((View) itV.next()).setOnClickListener(new XA0.c(lVar, deepLink, 15));
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.card.g
    public final void r60(@k l lVar, @k ArrayList arrayList) throws Resources.NotFoundException {
        Context context;
        Iterator it;
        Integer num;
        Context context2;
        Integer numA;
        h hVar = this;
        D6.H(hVar.f298285d);
        Context context3 = hVar.f298284c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context3);
        ViewGroup viewGroup = hVar.f298286e;
        viewGroup.removeAllViews();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i iVar = (i) it2.next();
            AC0.a aVar = iVar.f298287a.f298289a;
            if (aVar != null) {
                Button button = (Button) layoutInflaterFrom.inflate(R.layout.cpt_info_card_button_item, viewGroup, false);
                C41267a c41267a = aVar.f195a;
                com.avito.android.lib.design.button.b.a(button, c41267a.f398436a, false);
                String str = c41267a.f398438c;
                if (str != null) {
                    button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(str), button.getContext()));
                }
                button.setEnabled(!L.f(c41267a.f398439d, Boolean.FALSE));
                DeepLink deepLink = c41267a.f398437b;
                if (deepLink != null) {
                    button.setOnClickListener(new XA0.c(lVar, deepLink, 19));
                } else {
                    button.setOnClickListener(null);
                }
                viewGroup.addView(button);
            }
            j jVar = iVar.f298287a;
            AC0.d dVar = jVar.f298290b;
            com.avito.android.util.text.a aVar2 = hVar.f298283b;
            if (dVar != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.cpt_info_card_text_item, viewGroup, false);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.cpt_info_card_item_title);
                ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.cpt_info_card_item_icon);
                DeepLink deepLink2 = dVar.f202b;
                if (deepLink2 != null) {
                    textView.setOnClickListener(new XA0.c(lVar, deepLink2, 16));
                    imageView.setOnClickListener(new XA0.c(lVar, deepLink2, 17));
                } else {
                    textView.setOnClickListener(null);
                    imageView.setOnClickListener(null);
                }
                AttributedText attributedText = dVar.f201a;
                com.avito.android.util.text.j.c(textView, attributedText, aVar2);
                attributedText.setOnDeepLinkClickListener(new B(20, lVar));
                AC0.e eVar = dVar.f203c;
                if (eVar != null) {
                    Integer numA2 = q.a(eVar.f204a);
                    if (numA2 != null) {
                        D6.H(imageView);
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        AC0.g gVar = eVar.f206c;
                        if (gVar != null) {
                            it = it2;
                            context = context3;
                            D6.b(imageView, Integer.valueOf(y6.b(gVar.f212a)), Integer.valueOf(y6.b(gVar.f214c)), Integer.valueOf(y6.b(gVar.f213b)), Integer.valueOf(y6.b(gVar.f215d)));
                        } else {
                            context = context3;
                            it = it2;
                        }
                        dVar2.g(constraintLayout);
                        AC0.f fVar = eVar.f205b;
                        if (fVar instanceof f.a) {
                            dVar2.f(textView.getId(), 7);
                            dVar2.i(textView.getId(), 3, 0, 3);
                            dVar2.i(textView.getId(), 6, 0, 6);
                            dVar2.i(textView.getId(), 4, 0, 4);
                            dVar2.i(imageView.getId(), 3, 0, 3);
                            dVar2.i(imageView.getId(), 7, 0, 7);
                            dVar2.i(imageView.getId(), 6, textView.getId(), 7);
                            dVar2.y(0.0f, imageView.getId());
                        } else if (fVar instanceof f.c) {
                            dVar2.i(textView.getId(), 3, 0, 3);
                            dVar2.i(textView.getId(), 7, imageView.getId(), 6);
                            dVar2.i(textView.getId(), 6, 0, 6);
                            dVar2.i(textView.getId(), 4, 0, 4);
                            dVar2.i(imageView.getId(), 3, 0, 3);
                            dVar2.i(imageView.getId(), 7, 0, 7);
                            dVar2.i(imageView.getId(), 6, textView.getId(), 7);
                            dVar2.y(1.0f, imageView.getId());
                        } else if (fVar instanceof f.b) {
                            dVar2.i(textView.getId(), 3, 0, 3);
                            dVar2.i(textView.getId(), 7, 0, 7);
                            dVar2.i(textView.getId(), 6, imageView.getId(), 7);
                            dVar2.i(textView.getId(), 4, 0, 4);
                            dVar2.i(imageView.getId(), 3, 0, 3);
                            dVar2.i(imageView.getId(), 6, 0, 6);
                        }
                        DeepLink deepLink3 = eVar.f208e;
                        if (deepLink3 != null) {
                            imageView.setOnClickListener(new XA0.c(lVar, deepLink3, 18));
                            num = null;
                        } else {
                            num = null;
                            imageView.setOnClickListener(null);
                        }
                        dVar2.c(constraintLayout);
                        Drawable drawableH = C35835l0.h(numA2.intValue(), constraintLayout.getContext());
                        if (drawableH != null) {
                            iC0.e eVar2 = eVar.f207d;
                            Integer numA3 = eVar2 != null ? eVar2.a(constraintLayout.getContext()) : num;
                            if (numA3 != null) {
                                V0.a(drawableH, numA3.intValue());
                            }
                            imageView.setImageDrawable(drawableH);
                        }
                    } else {
                        context = context3;
                        it = it2;
                        num = null;
                        D6.w(imageView);
                    }
                } else {
                    context = context3;
                    it = it2;
                    num = null;
                }
                viewGroup.addView(constraintLayout);
            } else {
                context = context3;
                it = it2;
                num = null;
            }
            AC0.c cVar = jVar.f298291c;
            if (cVar != null) {
                ProgressBar progressBar = (ProgressBar) layoutInflaterFrom.inflate(R.layout.cpt_info_card_progress_item, viewGroup, false);
                progressBar.setProgress(cVar.f198a);
                iC0.e eVar3 = cVar.f199b;
                Integer numA4 = eVar3 != null ? eVar3.a(progressBar.getContext()) : num;
                if (numA4 != null) {
                    progressBar.setFillColor(numA4.intValue());
                }
                iC0.e eVar4 = cVar.f200c;
                progressBar.setEmptyColor((eVar4 == null || (numA = eVar4.a(progressBar.getContext())) == null) ? C35835l0.d(R.attr.warmGray12, progressBar.getContext()) : numA.intValue());
                viewGroup.addView(progressBar);
            }
            AC0.b bVar = jVar.f298292d;
            if (bVar != null) {
                DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) layoutInflaterFrom.inflate(R.layout.cpt_info_card_dotted_text_item, viewGroup, false);
                com.avito.android.lib.design.text_view.a leftTextView = descriptionParameterItem.getLeftTextView();
                AttributedText attributedText2 = bVar.f196a;
                com.avito.android.util.text.j.c(leftTextView, attributedText2, aVar2);
                attributedText2.setOnDeepLinkClickListener(new B(21, lVar));
                com.avito.android.lib.design.text_view.a rightTextView = descriptionParameterItem.getRightTextView();
                AttributedText attributedText3 = bVar.f197b;
                com.avito.android.util.text.j.c(rightTextView, attributedText3, aVar2);
                attributedText3.setOnDeepLinkClickListener(new B(22, lVar));
                viewGroup.addView(descriptionParameterItem);
            }
            Integer num2 = iVar.f298288b;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                context2 = context;
                View view = new View(context2);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, y6.b(iIntValue)));
                viewGroup.addView(view);
            } else {
                context2 = context;
            }
            hVar = this;
            context3 = context2;
            it2 = it;
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.card.g
    public final void t70(@Y61.l iC0.e eVar) {
        ColorStateList colorStateListValueOf;
        Context context = this.f298284c;
        if (eVar == null || (colorStateListValueOf = eVar.b(context)) == null) {
            colorStateListValueOf = ColorStateList.valueOf(C35835l0.d(R.attr.warmGray4, context));
        }
        Banner.h(this.f298285d, colorStateListValueOf);
    }
}
