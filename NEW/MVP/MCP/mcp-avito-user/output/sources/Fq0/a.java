package FQ0;

import ST0.e;
import ST0.f;
import ST0.g;
import Y61.k;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: SimpleAndroidDateTimeFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFQ0/a;", "LRT0/a;", "<init>", "()V", "android-formatter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements RT0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f4712a = new a();

    @Override // RT0.a
    @k
    public final String A(@k e eVar, @k String str, @k String str2, @k String str3) {
        return LocalDate.parse(eVar.f14990a).format(DateTimeFormatter.ofPattern(str, new Locale(str2, str3)));
    }

    @Override // RT0.a
    @k
    public final String d(@k g gVar, @k String str, @k String str2, @k String str3) {
        return LocalTime.parse(gVar.f14992a).format(DateTimeFormatter.ofPattern(str, new Locale(str2, str3)));
    }

    @Override // RT0.a
    @k
    public final String e(@k f fVar, @k String str, @k String str2, @k String str3) {
        return LocalDateTime.parse(fVar.f14991a).format(DateTimeFormatter.ofPattern(str, new Locale(str2, str3)));
    }
}
