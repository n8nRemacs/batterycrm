package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.util.InterfaceC35863o4;
import iu0.InterfaceC42113b;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wt0.InterfaceC49682a;
import xt0.C49997a;

/* compiled from: DaySettingsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements u<DaySettingsInternalAction, DaySettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.data.preferences.a f277061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.data.preferences.a f277062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49682a f277063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42113b f277064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f277065f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.d f277066g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.a f277067h;

    @Inject
    public n(@Y61.k com.avito.android.service_booking_day_settings.daysettings.data.preferences.a aVar, @Y61.k com.avito.android.service_booking.data.preferences.a aVar2, @Y61.k InterfaceC49682a interfaceC49682a, @Y61.k InterfaceC42113b interfaceC42113b, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.d dVar, @Y61.k com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.a aVar3) {
        this.f277061b = aVar;
        this.f277062c = aVar2;
        this.f277063d = interfaceC49682a;
        this.f277064e = interfaceC42113b;
        this.f277065f = interfaceC35863o4;
        this.f277066g = dVar;
        this.f277067h = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(int r16, int r17, com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreaksInfo r3 = r2.f276971h
            r4 = 0
            if (r3 == 0) goto Lb8
            java.util.List<com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem> r3 = r3.f276986d
            if (r3 == 0) goto Lb8
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C42745f0.q(r3, r6)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb7
            java.lang.Object r6 = r3.next()
            com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem r6 = (com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem) r6
            com.avito.android.service_booking_day_settings.daysettings.adapter.BreakDescription r7 = r6.f276728g
            if (r7 == 0) goto L33
            com.avito.android.printable_text.PrintableText r7 = r7.f276720b
            goto L34
        L33:
            r7 = r4
        L34:
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreaksInfo r8 = r2.f276971h
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreakErrorInfo r9 = r8.f276988f
            java.lang.String r9 = r9.f276978b
            com.avito.android.printable_text.PrintableText r9 = com.avito.android.printable_text.b.f(r9)
            boolean r7 = kotlin.jvm.internal.L.f(r7, r9)
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreakErrorInfo r8 = r8.f276988f
            java.lang.String r8 = r8.f276983g
            r10 = 0
            if (r8 == 0) goto L5d
            com.avito.android.service_booking_day_settings.daysettings.adapter.BreakDescription r11 = r6.f276728g
            if (r11 == 0) goto L50
            com.avito.android.printable_text.PrintableText r11 = r11.f276720b
            goto L51
        L50:
            r11 = r4
        L51:
            com.avito.android.printable_text.PrintableText r8 = com.avito.android.printable_text.b.f(r8)
            boolean r8 = kotlin.jvm.internal.L.f(r11, r8)
            if (r8 == 0) goto L5d
            r8 = 1
            goto L5e
        L5d:
            r8 = r10
        L5e:
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r11 = r6.f276724c
            org.threeten.bp.g r12 = r11.f276729b
            if (r12 == 0) goto L6c
            int r12 = r12.J()
            if (r0 < r12) goto L6c
            r12 = 1
            goto L6d
        L6c:
            r12 = r10
        L6d:
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r13 = r6.f276725d
            org.threeten.bp.g r14 = r13.f276729b
            if (r14 == 0) goto L7b
            int r14 = r14.J()
            if (r1 > r14) goto L7b
            r14 = 1
            goto L7c
        L7b:
            r14 = r10
        L7c:
            org.threeten.bp.g r11 = r11.f276729b
            if (r11 == 0) goto L88
            int r15 = r11.J()
            if (r0 != r15) goto L88
            r15 = 1
            goto L89
        L88:
            r15 = r10
        L89:
            org.threeten.bp.g r13 = r13.f276729b
            if (r13 == 0) goto L95
            int r9 = r13.J()
            if (r1 != r9) goto L95
            r9 = 1
            goto L96
        L95:
            r9 = r10
        L96:
            if (r7 == 0) goto L9c
            if (r12 != 0) goto L9c
            if (r14 == 0) goto La2
        L9c:
            if (r8 == 0) goto Lb2
            if (r15 == 0) goto La2
            if (r9 != 0) goto Lb2
        La2:
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r7 = new com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect
            r7.<init>(r11, r10)
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r8 = new com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect
            r8.<init>(r13, r10)
            r9 = 25
            com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem r6 = com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem.a(r6, r7, r8, r4, r9)
        Lb2:
            r5.add(r6)
            goto L20
        Lb7:
            r4 = r5
        Lb8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.mvi.n.c(int, int, com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState):java.util.ArrayList");
    }

    public static PrintableText d(n nVar, DaySettingsState.DayScheduleInfo dayScheduleInfo, boolean z12, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, int i12) {
        if ((i12 & 1) != 0) {
            z12 = dayScheduleInfo.f276999d.f276994b;
        }
        if ((i12 & 2) != 0) {
            gVar = dayScheduleInfo.f277001f.f277031c.f277026b;
        }
        if ((i12 & 4) != 0) {
            gVar2 = dayScheduleInfo.f277001f.f277031c.f277027c;
        }
        nVar.getClass();
        if (!z12) {
            return null;
        }
        ArrayList arrayList = dayScheduleInfo.f276998c.f277009d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            DaySettingsState.TimePeriod timePeriod = (DaySettingsState.TimePeriod) obj;
            if (gVar.compareTo(timePeriod.f277026b) > 0 || gVar2.compareTo(timePeriod.f277027c) < 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            DaySettingsState.TimePeriod timePeriod2 = (DaySettingsState.TimePeriod) it.next();
            arrayList3.add(C49997a.a(timePeriod2.f277026b) + '-' + C49997a.a(timePeriod2.f277027c));
        }
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        if (arrayList4 != null) {
            return com.avito.android.printable_text.b.c(R.string.occupied_string_holder, dayScheduleInfo.f276998c.f277008c, C42745f0.O(arrayList4, ", ", null, null, null, 62));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c4 A[EDGE_INSN: B:376:0x02c4->B:149:0x02c4 BREAK  A[LOOP:3: B:142:0x02ac->B:378:?]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c9 A[EDGE_INSN: B:379:0x03c9->B:198:0x03c9 BREAK  A[LOOP:4: B:190:0x03ad->B:381:?]] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0666 A[EDGE_INSN: B:386:0x0666->B:329:0x0666 BREAK  A[LOOP:6: B:321:0x064c->B:387:?]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56 */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState a(com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction r26, com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState r27) {
        /*
            Method dump skipped, instructions count: 1862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.mvi.n.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final SettingsBreakItem b(boolean z12) {
        return new SettingsBreakItem(this.f277065f.a(), new TimeSelect(null, false), new TimeSelect(null, false), z12, false, null, 48, null);
    }
}
