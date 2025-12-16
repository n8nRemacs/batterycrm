package com.avito.android.das_date_picker.mvi;

import bu.AbstractC25714c;
import bu.C25713b;
import bu.C25715d;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.das_date_picker.items.day.DasCalendarDayState;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import com.avito.android.das_date_picker.mvi.entity.a;
import du.C39803a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DasCalendarViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/w;", "Lcom/avito/android/das_date_picker/mvi/v;", "a", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f132461a;

    /* compiled from: DasCalendarViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/w$a;", "", "<init>", "()V", "", "EMPTY_BOTTOM_ITEMS_COUNT", "I", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DasCalendarViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DasCalendarState.Companion.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DasCalendarState.Companion.LoadingState loadingState = DasCalendarState.Companion.LoadingState.f132392b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public w(@Y61.k J0 j02) {
        this.f132461a = j02;
    }

    @Override // com.avito.android.das_date_picker.mvi.v
    @Y61.k
    public final DasCalendarState a(@Y61.k Y41.a<DasCalendarState> aVar) {
        return b((DasCalendarState) ((s) aVar).invoke());
    }

    @Override // com.avito.android.das_date_picker.mvi.v
    @Y61.k
    public final DasCalendarState b(@Y61.k DasCalendarState dasCalendarState) {
        List list;
        int i12;
        com.avito.conveyor_item.a aVar;
        int i13 = 1;
        int iOrdinal = dasCalendarState.f132390h.ordinal();
        if (iOrdinal == 0) {
            return DasCalendarState.a(dasCalendarState, null, null, null, null, null, null, null, a.c.f132399d, 127);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        C25713b c25713b = dasCalendarState.f132389g;
        if (c25713b == null) {
            list = C42784z0.f406748b;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = c25713b.f57531a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                J0 j02 = this.f132461a;
                if (zHasNext) {
                    C25715d c25715d = (C25715d) it.next();
                    int i14 = C39803a.d(c25715d.f57535a).get(i13);
                    Date date = dasCalendarState.f132384b;
                    int i15 = (date == null || C39803a.d(date).get(i13) != i14) ? 0 : i13;
                    Date date2 = c25715d.f57535a;
                    String string = date2.toString();
                    Integer numValueOf = Integer.valueOf(i14);
                    if (i15 != 0) {
                        numValueOf = null;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date2);
                    switch (calendar.get(2)) {
                        case 0:
                            i12 = R.string.das_calendar_january;
                            break;
                        case 1:
                            i12 = R.string.das_calendar_february;
                            break;
                        case 2:
                            i12 = R.string.das_calendar_march;
                            break;
                        case 3:
                            i12 = R.string.das_calendar_april;
                            break;
                        case 4:
                            i12 = R.string.das_calendar_may;
                            break;
                        case 5:
                            i12 = R.string.das_calendar_june;
                            break;
                        case 6:
                            i12 = R.string.das_calendar_july;
                            break;
                        case 7:
                            i12 = R.string.das_calendar_august;
                            break;
                        case 8:
                            i12 = R.string.das_calendar_september;
                            break;
                        case 9:
                            i12 = R.string.das_calendar_october;
                            break;
                        case 10:
                            i12 = R.string.das_calendar_november;
                            break;
                        case 11:
                            i12 = R.string.das_calendar_december;
                            break;
                        default:
                            i12 = 0;
                            break;
                    }
                    Serializable[] serializableArr = new Serializable[i13];
                    serializableArr[0] = numValueOf == null ? "" : " " + numValueOf;
                    arrayList.add(new com.avito.android.das_date_picker.items.month.a(string, com.avito.android.printable_text.b.c(i12, serializableArr)));
                    ArrayList<AbstractC25714c> arrayList2 = c25715d.f57536b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof AbstractC25714c.a) {
                            arrayList3.add(obj);
                        }
                    }
                    int iF2 = P0.f(C42745f0.q(arrayList3, 10));
                    if (iF2 < 16) {
                        iF2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        Date date3 = dasCalendarState.f132385c;
                        if (zHasNext2) {
                            AbstractC25714c.a aVar2 = (AbstractC25714c.a) it2.next();
                            Date date4 = aVar2.f57532a;
                            linkedHashMap.put(date4, C39803a.c(date3, date4) ? DasCalendarDayState.f132312d : aVar2.f57533b ? DasCalendarDayState.f132310b : DasCalendarDayState.f132311c);
                        } else {
                            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList2, 10));
                            for (AbstractC25714c abstractC25714c : arrayList2) {
                                if (abstractC25714c instanceof AbstractC25714c.b) {
                                    aVar = new com.avito.android.das_date_picker.items.empty.a(String.valueOf(j02.a()), date3 != null ? C39803a.b(date3, ((AbstractC25714c.b) abstractC25714c).f57534a) : false);
                                } else {
                                    if (!(abstractC25714c instanceof AbstractC25714c.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    AbstractC25714c.a aVar3 = (AbstractC25714c.a) abstractC25714c;
                                    DasCalendarDayState dasCalendarDayState = (DasCalendarDayState) linkedHashMap.get(aVar3.f57532a);
                                    if (dasCalendarDayState == null) {
                                        dasCalendarDayState = DasCalendarDayState.f132310b;
                                    }
                                    DasCalendarDayState dasCalendarDayState2 = dasCalendarDayState;
                                    Date date5 = aVar3.f57532a;
                                    boolean zA2 = date != null ? C39803a.a(date, date5) : false;
                                    String string2 = date5.toString();
                                    Calendar calendar2 = Calendar.getInstance();
                                    calendar2.setTime(date5);
                                    aVar = new com.avito.android.das_date_picker.items.day.a(string2, String.valueOf(calendar2.get(5)), dasCalendarDayState2, zA2, C39803a.c(date, date5), aVar3.f57532a);
                                }
                                arrayList4.add(aVar);
                            }
                            arrayList.addAll(arrayList4);
                            i13 = 1;
                        }
                    }
                } else {
                    for (int i16 = 0; i16 < 21; i16++) {
                        arrayList.add(new com.avito.android.das_date_picker.items.empty.a(String.valueOf(j02.a()), false));
                    }
                    list = arrayList;
                }
            }
        }
        return DasCalendarState.a(dasCalendarState, null, null, null, null, null, null, null, new a.b(list), 127);
    }

    @Override // com.avito.android.das_date_picker.mvi.v
    @Y61.k
    public final DasCalendarState c(@Y61.k DasCalendarState dasCalendarState) {
        com.avito.android.das_date_picker.mvi.entity.a bVar = dasCalendarState.f132391i;
        if (bVar instanceof a.b) {
            a.b bVar2 = (a.b) bVar;
            ArrayList arrayList = new ArrayList((Collection) bVar2.f132398d);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                TV0.a aVar = (TV0.a) arrayList.get(i12);
                if (aVar instanceof com.avito.android.das_date_picker.items.day.a) {
                    com.avito.android.das_date_picker.items.day.a aVar2 = (com.avito.android.das_date_picker.items.day.a) aVar;
                    Date date = aVar2.f132320g;
                    Date date2 = dasCalendarState.f132385c;
                    boolean zC2 = C39803a.c(date, date2);
                    DasCalendarDayState dasCalendarDayState = aVar2.f132317d;
                    if (zC2) {
                        arrayList.set(i12, com.avito.android.das_date_picker.items.day.a.a(aVar2, DasCalendarDayState.f132312d));
                    } else if (dasCalendarDayState == DasCalendarDayState.f132312d) {
                        arrayList.set(i12, com.avito.android.das_date_picker.items.day.a.a(aVar2, DasCalendarDayState.f132310b));
                    }
                    if (C39803a.c(aVar2.f132320g, date2)) {
                        arrayList.set(i12, com.avito.android.das_date_picker.items.day.a.a(aVar2, DasCalendarDayState.f132312d));
                    } else if (dasCalendarDayState == DasCalendarDayState.f132312d) {
                        arrayList.set(i12, com.avito.android.das_date_picker.items.day.a.a(aVar2, DasCalendarDayState.f132310b));
                    }
                }
            }
            bVar2.getClass();
            bVar = new a.b(arrayList);
        }
        return DasCalendarState.a(dasCalendarState, null, null, null, null, null, null, null, bVar, 127);
    }
}
