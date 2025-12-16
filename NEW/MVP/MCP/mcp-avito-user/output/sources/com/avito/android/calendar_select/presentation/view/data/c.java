package com.avito.android.calendar_select.presentation.view.data;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarDataConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/c;", "Lcom/avito/android/calendar_select/presentation/view/data/b;", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f113452a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f113453b;

    /* renamed from: c, reason: collision with root package name */
    public final DateTimeFormatter f113454c;

    /* renamed from: d, reason: collision with root package name */
    public final DateTimeFormatter f113455d;

    /* compiled from: CalendarDataConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/c$a;", "", "<init>", "()V", "", "DAY_PATTERN", "Ljava/lang/String;", "MONTH_YEAR_PATTERN", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public c(@Y61.k j jVar) {
        this.f113452a = jVar;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        ?? r12 = Xl.b.f19053a;
        this.f113453b = dateTimeFormatterBuilder.appendText(chronoField, (Map<Long, String>) r12).toFormatter();
        this.f113454c = new DateTimeFormatterBuilder().appendText(chronoField, (Map<Long, String>) r12).appendPattern(" yyyy").toFormatter();
        this.f113455d = DateTimeFormatter.ofPattern("d", Locale.getDefault());
    }
}
