package com.avito.android.profile.user_profile.cards.wallet.finance_dynamic;

import Yk0.C18273a;
import Yk0.g;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.AvitoFinanceAction;
import com.avito.android.remote.model.AvitoFinanceBackground;
import com.avito.android.remote.model.AvitoFinanceButton;
import com.avito.android.remote.model.AvitoFinanceDynamicCard;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.profile.generated.api.api_2_profile_finance_get.FinanceWidgetFeature;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoFinanceDynamicItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/e;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/d;", "<init>", "()V", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* compiled from: AvitoFinanceDynamicItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/e$a;", "", "<init>", "()V", "", "UNKNOWN_ID", "Ljava/lang/String;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public e() {
    }

    public static AvitoFinanceAction b(Yk0.g gVar) {
        if (gVar instanceof g.a) {
            return new AvitoFinanceAction.OpenDeeplink(((g.a) gVar).getUrl());
        }
        if (!(gVar instanceof g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        g.b bVar = (g.b) gVar;
        return new AvitoFinanceAction.SendEvent(bVar.getId(), bVar.c(), bVar.getVersion(), bVar.getHasSensitiveData());
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.finance_dynamic.d
    @Y61.k
    public final CardItem.AvitoFinanceDynamicCardItem a(@Y61.k String str, @Y61.k C18273a c18273a) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        AvitoFinanceBackground avitoFinanceBackground;
        Iterator it;
        Iterator it2;
        AvitoFinanceButton avitoFinanceButton;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        UniversalColor universalColor;
        Integer numA;
        Integer numA2;
        List<List<FinanceWidgetFeature>> listA = c18273a.getWidget().a();
        int i12 = 10;
        ArrayList arrayList7 = new ArrayList(C42745f0.q(listA, 10));
        Iterator it3 = listA.iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list, i12));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                FinanceWidgetFeature financeWidgetFeature = (FinanceWidgetFeature) it4.next();
                FinanceWidgetFeature.Id id2 = financeWidgetFeature.getId();
                if (id2 == null || (str2 = id2.f254319b) == null) {
                    str2 = "unknown_card_id";
                }
                String str3 = str2;
                String title = financeWidgetFeature.getTitle();
                String subtitle = financeWidgetFeature.getSubtitle();
                Yk0.e image = financeWidgetFeature.getImage();
                UniversalImage universalImage = image != null ? new UniversalImage(image.getValue(), image.getValueDark()) : null;
                FinanceWidgetFeature.ImagePosition imagePosition = financeWidgetFeature.getImagePosition();
                String str4 = imagePosition != null ? imagePosition.f254322b : null;
                Yk0.b background = financeWidgetFeature.getBackground();
                if (background != null) {
                    String gradient = background.getGradient();
                    Yk0.d color = background.getColor();
                    if (color != null) {
                        String valueName = color.getValueName();
                        String value = color.getValue();
                        Color color2 = (value == null || (numA2 = C35787f0.a(value)) == null) ? null : new Color(numA2.intValue());
                        String valueDark = color.getValueDark();
                        universalColor = new UniversalColor(valueName, (valueDark == null || (numA = C35787f0.a(valueDark)) == null) ? null : new Color(numA.intValue()), color2);
                    } else {
                        universalColor = null;
                    }
                    avitoFinanceBackground = new AvitoFinanceBackground(gradient, universalColor);
                } else {
                    avitoFinanceBackground = null;
                }
                Yk0.c button = financeWidgetFeature.getButton();
                if (button != null) {
                    String title2 = button.getTitle();
                    String style = button.getStyle();
                    List<Yk0.g> listB = button.b();
                    if (listB != null) {
                        List<Yk0.g> list2 = listB;
                        it = it3;
                        it2 = it4;
                        arrayList5 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator<T> it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(b((Yk0.g) it5.next()));
                        }
                    } else {
                        it = it3;
                        it2 = it4;
                        arrayList5 = null;
                    }
                    List<Yk0.g> listA2 = button.a();
                    if (listA2 != null) {
                        List<Yk0.g> list3 = listA2;
                        arrayList6 = new ArrayList(C42745f0.q(list3, 10));
                        Iterator<T> it6 = list3.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add(b((Yk0.g) it6.next()));
                        }
                    } else {
                        arrayList6 = null;
                    }
                    avitoFinanceButton = new AvitoFinanceButton(title2, style, arrayList5, arrayList6);
                } else {
                    it = it3;
                    it2 = it4;
                    avitoFinanceButton = null;
                }
                Long weight = financeWidgetFeature.getWeight();
                Integer numValueOf = weight != null ? Integer.valueOf((int) weight.longValue()) : null;
                List<Yk0.g> listG = financeWidgetFeature.g();
                if (listG != null) {
                    List<Yk0.g> list4 = listG;
                    ArrayList arrayList9 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator<T> it7 = list4.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(b((Yk0.g) it7.next()));
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                List<Yk0.g> listF = financeWidgetFeature.f();
                if (listF != null) {
                    List<Yk0.g> list5 = listF;
                    ArrayList arrayList10 = new ArrayList(C42745f0.q(list5, 10));
                    Iterator<T> it8 = list5.iterator();
                    while (it8.hasNext()) {
                        arrayList10.add(b((Yk0.g) it8.next()));
                    }
                    arrayList4 = arrayList10;
                } else {
                    arrayList4 = null;
                }
                arrayList8.add(new AvitoFinanceDynamicCard(str3, title, subtitle, universalImage, str4, avitoFinanceBackground, avitoFinanceButton, numValueOf, arrayList3, arrayList4));
                it3 = it;
                it4 = it2;
            }
            arrayList7.add(arrayList8);
            i12 = 10;
        }
        List<Yk0.g> listC = c18273a.getWidget().c();
        if (listC != null) {
            List<Yk0.g> list6 = listC;
            arrayList = new ArrayList(C42745f0.q(list6, 10));
            Iterator<T> it9 = list6.iterator();
            while (it9.hasNext()) {
                arrayList.add(b((Yk0.g) it9.next()));
            }
        } else {
            arrayList = null;
        }
        List<Yk0.g> listB2 = c18273a.getWidget().b();
        if (listB2 != null) {
            List<Yk0.g> list7 = listB2;
            arrayList2 = new ArrayList(C42745f0.q(list7, 10));
            Iterator<T> it10 = list7.iterator();
            while (it10.hasNext()) {
                arrayList2.add(b((Yk0.g) it10.next()));
            }
        } else {
            arrayList2 = null;
        }
        return new CardItem.AvitoFinanceDynamicCardItem(str, arrayList7, arrayList, arrayList2);
    }
}
