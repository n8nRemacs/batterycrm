package com.avito.android.service_booking_calendar.flexible.header.recycler;

import Y41.l;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.util.M3;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: WeekItemPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/recycler/d;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.recycler.data_aware.a {

    /* compiled from: WeekItemPayloadCreator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<Boolean, Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ WeekItem f276047m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f276048n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ WeekItem f276049o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeekItem weekItem, int i12, WeekItem weekItem2) {
            super(1);
            this.f276047m = weekItem;
            this.f276048n = i12;
            this.f276049o = weekItem2;
        }

        @Override // Y41.l
        public final Boolean invoke(Boolean bool) {
            d.this.getClass();
            WeekItem weekItem = this.f276047m;
            return Boolean.valueOf((L.f(bool, Boolean.valueOf(d.b(weekItem, this.f276048n))) && L.f(this.f276049o, weekItem)) ? false : true);
        }
    }

    @Inject
    public d() {
    }

    public static boolean b(WeekItem weekItem, int i12) {
        Integer num = weekItem.f275676d;
        return num != null && num.intValue() == weekItem.f275675c.get(i12).getF275353c().f421948b.E().d() - 1;
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207369c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207369c()) : null) || !(aVar instanceof WeekItem) || !(aVar2 instanceof WeekItem)) {
            return null;
        }
        WeekItem weekItem = (WeekItem) aVar2;
        int size = weekItem.f275675c.size();
        ArrayList arrayList = new ArrayList(size);
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            if (b(weekItem, i12) != b((WeekItem) aVar, i12) || !L.f(aVar2, aVar)) {
                z12 = true;
            }
            arrayList.add(M3.a(new a((WeekItem) aVar, i12, (WeekItem) aVar2), Boolean.valueOf(b(weekItem, i12))));
        }
        c cVar = new c(arrayList);
        if (z12) {
            return cVar;
        }
        return null;
    }
}
