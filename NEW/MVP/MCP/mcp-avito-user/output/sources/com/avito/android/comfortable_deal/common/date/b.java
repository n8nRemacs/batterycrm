package com.avito.android.comfortable_deal.common.date;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.F3;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.ranges.o;

/* compiled from: DateFormatter.kt */
@F3
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/common/date/b;", "Lcom/avito/android/comfortable_deal/common/date/e;", "Lcom/avito/android/comfortable_deal/common/date/a;", "Lcom/avito/android/comfortable_deal/common/date/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements e, com.avito.android.comfortable_deal.common.date.a, d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f120589a = C42727D.c(c.f120594l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f120590b;

    /* renamed from: c, reason: collision with root package name */
    public final LocalDate f120591c;

    /* compiled from: DateFormatter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/o;", "date", "", "invoke", "(Lkotlin/ranges/o;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<o, Boolean> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(o oVar) {
            b bVar = b.this;
            LocalDate localDate = (LocalDate) bVar.f120590b.getValue();
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            long epochMilli = localDate.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
            long epochMilli2 = bVar.f120591c.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
            long j12 = oVar.f406915b;
            return Boolean.valueOf(j12 > epochMilli || j12 < epochMilli2);
        }
    }

    /* compiled from: DateFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.common.date.b$b, reason: collision with other inner class name */
    public static final class C3553b extends N implements Y41.a<LocalDate> {
        public C3553b() {
            super(0);
        }

        @Override // Y41.a
        public final LocalDate invoke() {
            return LocalDate.now((ZoneId) b.this.f120589a.getValue());
        }
    }

    /* compiled from: DateFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/ZoneId;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ZoneId> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f120594l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ZoneId invoke() {
            return ZoneId.of("UTC");
        }
    }

    @Inject
    public b() {
        InterfaceC42726C interfaceC42726CC = C42727D.c(new C3553b());
        this.f120590b = interfaceC42726CC;
        this.f120591c = ((LocalDate) interfaceC42726CC.getValue()).minusMonths(3L);
    }

    @Override // com.avito.android.comfortable_deal.common.date.a
    public final long a() {
        return this.f120591c.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    @Override // com.avito.android.comfortable_deal.common.date.a
    public final int b() {
        return ((int) ChronoUnit.MONTHS.between(this.f120591c, (LocalDate) this.f120590b.getValue())) + 1;
    }

    @Override // com.avito.android.comfortable_deal.common.date.d
    @k
    public final l<o, Boolean> c() {
        return new a();
    }
}
