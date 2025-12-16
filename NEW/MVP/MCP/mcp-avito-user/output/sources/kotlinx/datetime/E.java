package kotlinx.datetime;

import Dp.C13429b;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UtcOffsetJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412308a = C42727D.c(c.f412313l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412309b = C42727D.c(b.f412312l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412310c = C42727D.c(a.f412311l);

    /* compiled from: UtcOffsetJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DateTimeFormatter> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412311l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }

    /* compiled from: UtcOffsetJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<DateTimeFormatter> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f412312l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }

    /* compiled from: UtcOffsetJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<DateTimeFormatter> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f412313l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }

    public static final D a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new D((ZoneOffset) dateTimeFormatter.parse(str, new C13429b(1)));
        } catch (DateTimeException e12) {
            throw new DateTimeFormatException(e12);
        }
    }
}
