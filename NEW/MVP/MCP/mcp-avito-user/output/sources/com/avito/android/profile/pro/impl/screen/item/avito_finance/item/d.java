package com.avito.android.profile.pro.impl.screen.item.avito_finance.item;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.printable_text.PrintableText;
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
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ProfileProAvitoFinanceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/d;", "LTV0/d;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k;", "Lcom/avito/android/avito_finance_user_profile/view/item/a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class d implements TV0.d<k, com.avito.android.avito_finance_user_profile.view.item.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<D90.a, G0> f223005b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public a f223006c;

    /* compiled from: ProfileProAvitoFinanceItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/d$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k com.avito.android.avito_finance_user_profile.view.item.g gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k Y41.l<? super D90.a, G0> lVar) {
        this.f223005b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        d dVar;
        TextView textView;
        Integer numValueOf;
        boolean z12;
        int iB2;
        final k kVar = (k) eVar;
        final com.avito.android.avito_finance_user_profile.view.item.a aVar2 = (com.avito.android.avito_finance_user_profile.view.item.a) aVar;
        PrintableText printableText = aVar2.f97989b;
        Context context = kVar.f223016b;
        kVar.f223018d.setText(printableText.k0(context));
        final int i13 = 2;
        kVar.f223019e.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.avito_finance.item.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList;
                k kVar2 = kVar;
                com.avito.conveyor_item.a aVar3 = aVar2;
                switch (i13) {
                    case 0:
                        int i14 = k.f223015h;
                        com.avito.android.avito_finance_user_profile.view.item.i iVar = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f97999h;
                        if (iVar != null && (arrayList = iVar.f98012c) != null) {
                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar : arrayList) {
                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar = kVar2.f223021g;
                                if (lVar != null) {
                                    ((l) lVar).invoke(gVar);
                                }
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i15 = k.f223015h;
                        ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList2 = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f98001j;
                        if (arrayList2 != null) {
                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar2 : arrayList2) {
                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar2 = kVar2.f223020f;
                                if (lVar2 != null) {
                                    ((m) lVar2).invoke(gVar2);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        int i16 = k.f223015h;
                        ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList3 = ((com.avito.android.avito_finance_user_profile.view.item.a) aVar3).f97991d;
                        if (arrayList3 != null) {
                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar3 : arrayList3) {
                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar3 = kVar2.f223020f;
                                if (lVar3 != null) {
                                    ((m) lVar3).invoke(gVar3);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ArrayList arrayList = aVar2.f97990c;
        if (arrayList != null) {
            LinearLayout linearLayout = kVar.f223017c;
            linearLayout.removeAllViews();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = y6.b(6);
                linearLayout2.setLayoutParams(layoutParams);
                int i14 = 0;
                for (Object obj : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    final com.avito.android.avito_finance_user_profile.view.item.f fVar = (com.avito.android.avito_finance_user_profile.view.item.f) obj;
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_profile_pro_avito_finance_item, (ViewGroup) null);
                    View viewFindViewById = viewInflate.findViewById(R.id.card_title);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView2 = (TextView) viewFindViewById;
                    textView2.setText(fVar.f97994c);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.card_subtitle);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView3 = (TextView) viewFindViewById2;
                    textView3.setText(fVar.f97995d);
                    View viewFindViewById3 = viewInflate.findViewById(R.id.card_image);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
                    }
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
                    UniversalImage universalImage = fVar.f97996e;
                    if (universalImage != null) {
                        textView = textView2;
                        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
                        if (imageDependsOnThemeOrDefault != null) {
                            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
                            D6.H(simpleDraweeView);
                        } else {
                            D6.w(simpleDraweeView);
                        }
                    } else {
                        textView = textView2;
                    }
                    Iterator it2 = it;
                    ArrayList arrayList2 = arrayList;
                    int i16 = i14;
                    simpleDraweeView.post(new FX0.a(kVar, textView, textView3, simpleDraweeView, 3));
                    com.avito.android.avito_finance_user_profile.view.item.i iVar = fVar.f97999h;
                    if (iVar != null) {
                        View viewFindViewById4 = viewInflate.findViewById(R.id.card_button);
                        if (viewFindViewById4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                        }
                        Button button = (Button) viewFindViewById4;
                        button.setVisibility(0);
                        String str = iVar.f98010a;
                        if (str == null) {
                            str = "";
                        }
                        button.setText(str);
                        final int i17 = 0;
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.avito_finance.item.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList3;
                                k kVar2 = kVar;
                                com.avito.conveyor_item.a aVar3 = fVar;
                                switch (i17) {
                                    case 0:
                                        int i142 = k.f223015h;
                                        com.avito.android.avito_finance_user_profile.view.item.i iVar2 = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f97999h;
                                        if (iVar2 != null && (arrayList3 = iVar2.f98012c) != null) {
                                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar : arrayList3) {
                                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar = kVar2.f223021g;
                                                if (lVar != null) {
                                                    ((l) lVar).invoke(gVar);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        int i152 = k.f223015h;
                                        ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList22 = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f98001j;
                                        if (arrayList22 != null) {
                                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar2 : arrayList22) {
                                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar2 = kVar2.f223020f;
                                                if (lVar2 != null) {
                                                    ((m) lVar2).invoke(gVar2);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int i162 = k.f223015h;
                                        ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList32 = ((com.avito.android.avito_finance_user_profile.view.item.a) aVar3).f97991d;
                                        if (arrayList32 != null) {
                                            for (com.avito.android.avito_finance_user_profile.view.item.g gVar3 : arrayList32) {
                                                Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar3 = kVar2.f223020f;
                                                if (lVar3 != null) {
                                                    ((m) lVar3).invoke(gVar3);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    com.avito.android.avito_finance_user_profile.view.item.h hVar = fVar.f97998g;
                    if (hVar != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_pro_avito_finance_card_item_corner_radius);
                        String str2 = hVar.f98008a;
                        Integer numH = str2 != null ? com.avito.android.lib.util.f.h(str2) : null;
                        Integer numI = str2 != null ? com.avito.android.lib.util.f.i(str2) : null;
                        if (numH != null) {
                            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(kVar.f223016b, numH.intValue(), 0, 4, null);
                            c5275a.f179264a = dimensionPixelSize;
                            viewInflate.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
                            viewInflate.setBackgroundTintList(null);
                        } else if (numI != null) {
                            int iIntValue = numI.intValue();
                            Context context2 = kVar.f223016b;
                            a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context2, iIntValue, 0, 4, null);
                            c5277a.f179264a = dimensionPixelSize;
                            viewInflate.setBackground(new com.avito.android.lib.design.gradient.a(context2, c5277a.a()));
                            viewInflate.setBackgroundTintList(null);
                        } else {
                            UniversalColor universalColor = hVar.f98009b;
                            if (universalColor != null) {
                                C48063a.f437606a.getClass();
                                viewInflate.setBackgroundTintList(C48063a.e(context, universalColor));
                            }
                        }
                    }
                    final int i18 = 1;
                    viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.avito_finance.item.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList3;
                            k kVar2 = kVar;
                            com.avito.conveyor_item.a aVar3 = fVar;
                            switch (i18) {
                                case 0:
                                    int i142 = k.f223015h;
                                    com.avito.android.avito_finance_user_profile.view.item.i iVar2 = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f97999h;
                                    if (iVar2 != null && (arrayList3 = iVar2.f98012c) != null) {
                                        for (com.avito.android.avito_finance_user_profile.view.item.g gVar : arrayList3) {
                                            Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar = kVar2.f223021g;
                                            if (lVar != null) {
                                                ((l) lVar).invoke(gVar);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    int i152 = k.f223015h;
                                    ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList22 = ((com.avito.android.avito_finance_user_profile.view.item.f) aVar3).f98001j;
                                    if (arrayList22 != null) {
                                        for (com.avito.android.avito_finance_user_profile.view.item.g gVar2 : arrayList22) {
                                            Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar2 = kVar2.f223020f;
                                            if (lVar2 != null) {
                                                ((m) lVar2).invoke(gVar2);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    int i162 = k.f223015h;
                                    ArrayList<com.avito.android.avito_finance_user_profile.view.item.g> arrayList32 = ((com.avito.android.avito_finance_user_profile.view.item.a) aVar3).f97991d;
                                    if (arrayList32 != null) {
                                        for (com.avito.android.avito_finance_user_profile.view.item.g gVar3 : arrayList32) {
                                            Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> lVar3 = kVar2.f223020f;
                                            if (lVar3 != null) {
                                                ((m) lVar3).invoke(gVar3);
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    Integer num = fVar.f98000i;
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        if (iIntValue2 < 1) {
                            iIntValue2 = 1;
                        }
                        numValueOf = Integer.valueOf(iIntValue2);
                    } else {
                        numValueOf = null;
                    }
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                    layoutParams2.weight = numValueOf != null ? numValueOf.intValue() : 1.0f;
                    if (i16 != list.size() - 1) {
                        iB2 = y6.b(6);
                        z12 = false;
                    } else {
                        z12 = false;
                        iB2 = y6.b(0);
                    }
                    layoutParams2.setMarginEnd(iB2);
                    viewInflate.setLayoutParams(layoutParams2);
                    linearLayout2.addView(viewInflate);
                    i14 = i15;
                    it = it2;
                    arrayList = arrayList2;
                }
                linearLayout.addView(linearLayout2);
            }
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = aVar2.f97992e;
        if (arrayList4 != null) {
            dVar = this;
            e eVar2 = new e(dVar);
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                eVar2.invoke((com.avito.android.avito_finance_user_profile.view.item.g) it3.next());
            }
        } else {
            dVar = this;
        }
        if (aVar2.f97991d != null) {
            kVar.f223020f = new m(new f(dVar));
        }
        if (arrayList3 != null) {
            Iterator it4 = C42745f0.H(arrayList3).iterator();
            while (it4.hasNext()) {
                com.avito.android.avito_finance_user_profile.view.item.f fVar2 = (com.avito.android.avito_finance_user_profile.view.item.f) it4.next();
                if (fVar2.f98001j != null) {
                    kVar.f223020f = new m(new g(dVar));
                }
                com.avito.android.avito_finance_user_profile.view.item.i iVar2 = fVar2.f97999h;
                if (iVar2 != null && iVar2.f98012c != null) {
                    kVar.f223021g = new l(new h(dVar));
                }
            }
        }
    }
}
