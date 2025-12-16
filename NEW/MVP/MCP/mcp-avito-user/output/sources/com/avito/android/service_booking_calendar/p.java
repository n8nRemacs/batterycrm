package com.avito.android.service_booking_calendar;

import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: LocalDateExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f276163a = C42727D.c(c.f276168l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f276164b = C42727D.c(b.f276167l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f276165c = C42727D.c(a.f276166l);

    /* compiled from: LocalDateExtensions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<Long, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f276166l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Long, ? extends String> invoke() {
            return P0.g(new Q(1L, "Январь"), new Q(2L, "Февраль"), new Q(3L, "Март"), new Q(4L, "Апрель"), new Q(5L, "Май"), new Q(6L, "Июнь"), new Q(7L, "Июль"), new Q(8L, "Август"), new Q(9L, "Сентябрь"), new Q(10L, "Октябрь"), new Q(11L, "Ноябрь"), new Q(12L, "Декабрь"));
        }
    }

    /* compiled from: LocalDateExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<org.threeten.bp.format.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f276167l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final org.threeten.bp.format.c invoke() {
            org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
            dVar.h(ChronoField.f422120B, (Map) p.f276165c.getValue());
            dVar.g(" yyyy");
            return dVar.p();
        }
    }

    /* compiled from: LocalDateExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<org.threeten.bp.format.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f276168l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final org.threeten.bp.format.c invoke() {
            org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
            dVar.h(ChronoField.f422120B, (Map) p.f276165c.getValue());
            return dVar.p();
        }
    }

    public static final int a(@Y61.k org.threeten.bp.f fVar) {
        int iD2;
        org.threeten.bp.f fVarE = fVar.e(org.threeten.bp.temporal.f.a());
        org.threeten.bp.f fVarE2 = fVar.e(org.threeten.bp.temporal.f.b());
        if (fVarE == null || fVarE2 == null) {
            iD2 = 0;
        } else {
            org.threeten.bp.e eVar = fVarE2.f421948b;
            iD2 = (fVarE.f421948b.E().d() - 1) + eVar.f421943d + (7 - eVar.E().d());
        }
        return (int) Math.ceil(iD2 / 7.0d);
    }
}
