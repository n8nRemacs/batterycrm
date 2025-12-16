package N90;

import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.AvitoFinanceDynamicCard;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AvitoFinanceBlocksInfo.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN90/c;", "LN90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Locale f11243a;

    @Inject
    public c(@Y61.k Locale locale) {
        this.f11243a = locale;
    }

    @Override // N90.b
    @Y61.k
    public final String a(@Y61.k CardItem cardItem) {
        List arrayList;
        if (cardItem instanceof CardItem.AvitoFinanceSimpleCardItem) {
            CardItem.AvitoFinanceSimpleCardItem avitoFinanceSimpleCardItem = (CardItem.AvitoFinanceSimpleCardItem) cardItem;
            return C43066x.E0("\n                [\n                     {\n                        \"type\": \"wallet\",\n                        \"balanceWallet\": " + b(avitoFinanceSimpleCardItem.f224333d) + ",\n                        \"balanceBonus\": " + b(avitoFinanceSimpleCardItem.f224334e) + ",\n                        \"text\": \"Авито Кошелёк\",\n                        \"size\": 2,\n                        \"position\": {\n                            \"row\": 1,\n                            \"column\": 1\n                        }\n                     }\n                ]\n                ");
        }
        if (cardItem instanceof CardItem.AvitoFinanceSplitBonusesCardItem) {
            CardItem.AvitoFinanceSplitBonusesCardItem avitoFinanceSplitBonusesCardItem = (CardItem.AvitoFinanceSplitBonusesCardItem) cardItem;
            return C43066x.E0("\n                [\n                     {\n                        \"type\": \"wallet\",\n                        \"balanceWallet\": " + b(avitoFinanceSplitBonusesCardItem.f224341d) + ",\n                        \"text\": \"Авито Кошелёк\",\n                        \"size\": 2,\n                        \"position\": {\n                            \"row\": 1,\n                            \"column\": 1\n                        }\n                     },\n                     {\n                        \"type\": \"bonus\",\n                        \"balanceBonus\": " + b(avitoFinanceSplitBonusesCardItem.f224342e) + ",\n                        \"text\": \"1 бонус = 1 ₽\",\n                        \"size\": 1,\n                        \"position\": {\n                            \"row\": 2,\n                            \"column\": 1\n                        }\n                     },\n                     {\n                        \"type\": \"take loan\",\n                        \"text\": \"Онлайн за 5 мин.\",\n                        \"size\": 1,\n                        \"position\": {\n                            \"row\": 2,\n                            \"column\": 2\n                        }\n                     }\n                ]\n                ");
        }
        if (cardItem instanceof CardItem.AvitoFinanceSplitInstallmentsCardItem) {
            CardItem.AvitoFinanceSplitInstallmentsCardItem avitoFinanceSplitInstallmentsCardItem = (CardItem.AvitoFinanceSplitInstallmentsCardItem) cardItem;
            return C43066x.E0("\n                [\n                     {\n                        \"type\": \"wallet\",\n                        \"balanceWallet\": " + b(avitoFinanceSplitInstallmentsCardItem.f224351d) + ",\n                        \"balanceBonus\": " + b(avitoFinanceSplitInstallmentsCardItem.f224352e) + ",\n                        \"text\": \"Авито Кошелёк\",\n                        \"size\": 2,\n                        \"position\": {\n                            \"row\": 1,\n                            \"column\": 1\n                        }\n                     },\n                     {\n                        \"type\": \"my loans\",\n                        \"text\": \"Детали и платежи\",\n                        \"size\": 1,\n                        \"position\": {\n                            \"row\": 2,\n                            \"column\": 1\n                        }\n                     },\n                     {\n                        \"type\": \"take loan\",\n                        \"text\": \"Онлайн за 5 мин.\",\n                        \"size\": 1,\n                        \"position\": {\n                            \"row\": 2,\n                            \"column\": 2\n                        }\n                     }\n                ]\n                ");
        }
        if (!(cardItem instanceof CardItem.AvitoFinanceDynamicCardItem)) {
            return "";
        }
        ArrayList arrayList2 = ((CardItem.AvitoFinanceDynamicCardItem) cardItem).f224329d;
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : arrayList2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                int i14 = 0;
                for (Object obj2 : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    AvitoFinanceDynamicCard avitoFinanceDynamicCard = (AvitoFinanceDynamicCard) obj2;
                    int i16 = list.size() == 1 ? 2 : 1;
                    StringBuilder sb2 = new StringBuilder("\n                            {\n                                \"type\": \"");
                    sb2.append(avitoFinanceDynamicCard.getId());
                    sb2.append("\",\n                                \"text\": \"");
                    String title = avitoFinanceDynamicCard.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    sb2.append(title);
                    sb2.append("\",\n                                \"subtitle\": \"");
                    String subtitle = avitoFinanceDynamicCard.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    sb2.append(subtitle);
                    sb2.append("\",\n                                \"size\": ");
                    sb2.append(i16);
                    sb2.append(",\n                                \"position\": {\n                                    \"row\": ");
                    sb2.append(i13);
                    sb2.append(",\n                                    \"column\": ");
                    sb2.append(i15);
                    sb2.append("\n                                }\n                            }\n                        ");
                    arrayList3.add(C43066x.E0(sb2.toString()));
                    i14 = i15;
                }
                C42745f0.h(arrayList3, arrayList);
                i12 = i13;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return AK.c.s(new StringBuilder("[\n"), C42745f0.O(arrayList, ",\n", null, null, null, 62), "\n]");
    }

    public final Number b(String str) {
        Object bVar;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(this.f11243a);
        try {
            int i12 = Z.f406624c;
            bVar = decimalFormat.parse(C43066x.y(2, str));
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (Number) bVar;
    }
}
