package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.ExpenseItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.ExpensesType;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.TotalBottomItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.O2;
import com.avito.user_stats.model.extended_user_stats.StatsBonus;
import com.avito.user_stats.model.extended_user_stats.StatsCommonExpenses;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsServices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExpensesListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/a;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317803a;

    public a(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f317803a = interfaceC35863o4;
    }

    public static String a(Long l12, String str) {
        if (l12 != null && l12.longValue() == 0) {
            return null;
        }
        return b.a(l12) + ' ' + str;
    }

    public static String c(Long l12) {
        if (l12 == null || l12.longValue() == 0) {
            return "";
        }
        return " (" + C5.e(l12.toString(), ' ') + ')';
    }

    public static List e(ExpensesTabState expensesTabState) {
        StatsDates statsDates;
        StatsCommonExpenses statsCommonExpenses = expensesTabState.f317828d;
        List<StatsDates> listD = statsCommonExpenses != null ? statsCommonExpenses.d() : null;
        StatsCommonExpenses statsCommonExpenses2 = expensesTabState.f317828d;
        Integer num = expensesTabState.f317835k;
        if (num == null || listD == null || listD.size() <= num.intValue()) {
            if (statsCommonExpenses2 != null) {
                return statsCommonExpenses2.f();
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<StatsDates> listD2 = statsCommonExpenses2.d();
        List<StatsServices> listF = (listD2 == null || (statsDates = listD2.get(num.intValue())) == null) ? null : statsDates.f();
        if (listF != null) {
            for (StatsServices statsServices : listF) {
                String slug = statsServices.getSlug();
                List<StatsServices> listF2 = statsCommonExpenses2.f();
                if (listF2 != null) {
                    for (StatsServices statsServices2 : listF2) {
                        List<StatsServices> listG = statsServices2.g();
                        if (listG != null) {
                            for (StatsServices statsServices3 : listG) {
                                if (L.f(statsServices3.getSlug(), slug)) {
                                    Iterator it = arrayList.iterator();
                                    int i12 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i12 = -1;
                                            break;
                                        }
                                        if (L.f(((StatsServices) it.next()).getSlug(), statsServices2.getSlug())) {
                                            break;
                                        }
                                        i12++;
                                    }
                                    int i13 = i12;
                                    StatsServices statsServices4 = (StatsServices) C42745f0.K(i13, arrayList);
                                    if (statsServices4 != null) {
                                        List<StatsServices> listG2 = statsServices4.g();
                                        ArrayList arrayList2 = listG2 != null ? new ArrayList(listG2) : null;
                                        StatsServices statsServicesA = StatsServices.a(statsServices, statsServices3.getTitle(), 0L, null, null, 4093);
                                        if (arrayList2 != null) {
                                            arrayList2.add(statsServicesA);
                                        }
                                        StatsServices statsServicesA2 = StatsServices.a(statsServices4, null, statsServicesA.getRealAmount() + statsServices4.getRealAmount(), statsServicesA.getBonusAmount(), arrayList2, 1943);
                                        if (i13 >= 0) {
                                            arrayList.set(i13, statsServicesA2);
                                        }
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        StatsServices statsServicesA3 = StatsServices.a(statsServices, statsServices3.getTitle(), 0L, null, null, 4093);
                                        arrayList3.add(statsServicesA3);
                                        arrayList.add(StatsServices.a(statsServices2, null, statsServicesA3.getRealAmount(), statsServicesA3.getBonusAmount(), arrayList3, 1943));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ExpenseItemData b(StatsServices statsServices, String str, String str2, String str3, UniversalColor universalColor, String str4) {
        String strA = this.f317803a.a();
        StringBuilder sb2 = new StringBuilder();
        String title = statsServices.getTitle();
        if (title == null) {
            title = "";
        }
        sb2.append(title);
        sb2.append(c(statsServices.getCount()));
        return new ExpenseItemData(strA, com.avito.android.printable_text.b.f(sb2.toString()), b.a(Long.valueOf(statsServices.getRealAmount())) + ' ' + str, str3, universalColor, a(statsServices.getBonusAmount(), str2), null, false, false, ExpensesType.f317749c, statsServices.getHint(), statsServices.getSlug(), str4, 448, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final ArrayList d(@Y61.k ExpensesTabState expensesTabState) {
        ExpensesTabState expensesTabState2;
        int i12;
        String symbol;
        a aVar;
        char c12;
        InterfaceC35863o4 interfaceC35863o4;
        long j12;
        long j13;
        String str;
        long jLongValue;
        String string;
        int i13;
        String strA;
        int i14;
        DeepLink deepLink;
        String str2;
        List<StatsServices> listG;
        StatsServices statsServices;
        StatsBonus bonus;
        StatsBonus bonus2;
        List<StatsServices> listE = e(expensesTabState);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        if (listE == null || listE.size() != 1) {
            expensesTabState2 = expensesTabState;
            i12 = 0;
        } else {
            expensesTabState2 = expensesTabState;
            i12 = 1;
        }
        StatsCommonExpenses statsCommonExpenses = expensesTabState2.f317828d;
        String title = (statsCommonExpenses == null || (bonus2 = statsCommonExpenses.getBonus()) == null) ? null : bonus2.getTitle();
        if (statsCommonExpenses == null || (bonus = statsCommonExpenses.getBonus()) == null) {
            symbol = null;
            aVar = this;
        } else {
            aVar = this;
            symbol = bonus.getSymbol();
        }
        InterfaceC35863o4 interfaceC35863o42 = aVar.f317803a;
        char c13 = ' ';
        String string2 = "";
        if (listE != null) {
            j12 = 0;
            j13 = 0;
            for (StatsServices statsServices2 : listE) {
                long jK2 = statsServices2.getRealAmount() + j12;
                List<StatsServices> listG2 = statsServices2.g();
                if (listG2 != null) {
                    Iterator<T> it = listG2.iterator();
                    jLongValue = 0;
                    while (it.hasNext()) {
                        Long lC2 = ((StatsServices) it.next()).getBonusAmount();
                        jLongValue += lC2 != null ? lC2.longValue() : 0L;
                    }
                } else {
                    jLongValue = 0;
                }
                if (jLongValue == 0) {
                    Long lC3 = statsServices2.getBonusAmount();
                    jLongValue = lC3 != null ? lC3.longValue() : 0L;
                }
                long j14 = j13 + jLongValue;
                List<StatsServices> listG3 = statsServices2.g();
                int i16 = (listG3 == null || listG3.size() != 1) ? i15 : 1;
                if (i16 != 0) {
                    List<StatsServices> listG4 = statsServices2.g();
                    if (listG4 == null || (statsServices = listG4.get(i15)) == null) {
                        i14 = i15;
                        i13 = i14;
                        string = "";
                        str2 = string;
                        strA = null;
                        deepLink = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        String title2 = statsServices.getTitle();
                        if (title2 == null) {
                            title2 = "";
                        }
                        sb2.append(title2);
                        sb2.append(c(statsServices.getCount()));
                        string = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b.a(Long.valueOf(statsServices.getRealAmount())));
                        sb3.append(c13);
                        sb3.append(statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null);
                        String string3 = sb3.toString();
                        DeepLink deepLinkI = statsServices.getHint();
                        i14 = i15;
                        i13 = i14;
                        strA = a(statsServices.getBonusAmount(), symbol);
                        deepLink = deepLinkI;
                        str2 = string3;
                    }
                } else {
                    String title3 = statsServices2.getTitle();
                    if (title3 == null) {
                        title3 = "";
                    }
                    StringBuilder sbR = H.r(title3);
                    sbR.append(c(statsServices2.getCount()));
                    string = sbR.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(b.a(Long.valueOf(statsServices2.getRealAmount())));
                    sb4.append(c13);
                    sb4.append(statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null);
                    String string4 = sb4.toString();
                    i13 = i12;
                    strA = a(Long.valueOf(jLongValue), symbol);
                    i14 = O2.a(statsServices2.g()) ? 1 : 0;
                    deepLink = null;
                    str2 = string4;
                }
                char c14 = c13;
                InterfaceC35863o4 interfaceC35863o43 = interfaceC35863o42;
                String str3 = symbol;
                arrayList.add(new ExpenseItemData(interfaceC35863o42.a(), com.avito.android.printable_text.b.f(string), str2, title, statsServices2.getBonusBadgeColor(), strA, statsServices2.getBulletColor(), i14, i13, ExpensesType.f317748b, deepLink, statsServices2.getSlug(), null, 4096, null));
                if (i12 != 0 && i16 == 0 && (listG = statsServices2.g()) != null) {
                    Iterator<T> it2 = listG.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(b((StatsServices) it2.next(), statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null, str3, title, statsServices2.getBonusBadgeColor(), statsServices2.getSlug()));
                    }
                }
                c13 = c14;
                j12 = jK2;
                j13 = j14;
                interfaceC35863o42 = interfaceC35863o43;
                symbol = str3;
                i15 = 0;
            }
            c12 = c13;
            interfaceC35863o4 = interfaceC35863o42;
        } else {
            c12 = ' ';
            interfaceC35863o4 = interfaceC35863o42;
            j12 = 0;
            j13 = 0;
        }
        if (arrayList.size() > 1 && i12 == 0) {
            if (j13 != 0) {
                long j15 = j13 + j12;
                if (j15 != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(b.a(Long.valueOf(j15)));
                    sb5.append(c12);
                    sb5.append(statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null);
                    string2 = sb5.toString();
                }
                str = string2;
            } else {
                str = null;
            }
            String strA2 = interfaceC35863o4.a();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(b.a(Long.valueOf(j12)));
            sb6.append(c12);
            sb6.append(statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null);
            arrayList.add(new TotalBottomItemData(strA2, sb6.toString(), str));
        }
        return arrayList;
    }
}
