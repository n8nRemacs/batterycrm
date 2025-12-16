package IH;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.res.Resources;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GigSnippetDateFormatterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LIH/a;", "Lcom/avito/android/gig_snippet/a;", "a", "_avito_gig_snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.gig_snippet.a {

    /* renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f8061a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f8062b;

    /* renamed from: c, reason: collision with root package name */
    public final DateTimeFormatter f8063c;

    /* renamed from: d, reason: collision with root package name */
    public final DateTimeFormatter f8064d;

    /* renamed from: e, reason: collision with root package name */
    public final DateTimeFormatter f8065e;

    /* renamed from: f, reason: collision with root package name */
    public final DateTimeFormatter f8066f;

    /* renamed from: g, reason: collision with root package name */
    public final Resources f8067g;

    /* compiled from: GigSnippetDateFormatterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LIH/a$a;", "", "<init>", "()V", "", "STRING_DATE_FORMAT", "Ljava/lang/String;", "STRING_TIMER_DATE_FORMAT", "_avito_gig_snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: IH.a$a, reason: collision with other inner class name */
    public static final class C0453a {
        public /* synthetic */ C0453a(C42822w c42822w) {
            this();
        }

        public C0453a() {
        }
    }

    static {
        new C0453a(null);
    }

    @Inject
    public a(@k Application application, @k com.avito.android.server_time.f fVar, @k Locale locale) {
        this.f8061a = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZZZZ", locale);
        this.f8062b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZZZZ", locale).withZone(fVar.getF274002b().toZoneId());
        this.f8063c = DateTimeFormatter.ofPattern("d MMMM 'в' HH:mm", locale);
        this.f8064d = DateTimeFormatter.ofPattern("HH:mm", locale);
        this.f8065e = DateTimeFormatter.ofPattern("d MMMM", locale);
        this.f8066f = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        this.f8067g = application.getResources();
    }

    @Override // com.avito.android.gig_snippet.a
    @k
    public final String a(@k String str) {
        Object bVar;
        TemporalAccessor temporalAccessor;
        try {
            int i12 = Z.f406624c;
            temporalAccessor = this.f8061a.parse(str);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (temporalAccessor == null) {
            return "";
        }
        bVar = this.f8064d.format(temporalAccessor);
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        String str2 = (String) bVar;
        return str2 == null ? "" : str2;
    }

    @Override // com.avito.android.gig_snippet.a
    @k
    public final String b(@k String str, @k String str2, @l String str3) throws Resources.NotFoundException {
        Object bVar;
        Object bVar2;
        String string;
        DateTimeFormatter dateTimeFormatter = this.f8061a;
        try {
            int i12 = Z.f406624c;
            bVar = ZonedDateTime.parse(str, dateTimeFormatter);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) bVar;
        try {
            bVar2 = ZonedDateTime.parse(str2, dateTimeFormatter);
        } catch (Throwable th3) {
            int i14 = Z.f406624c;
            bVar2 = new Z.b(th3);
        }
        ZonedDateTime zonedDateTime2 = (ZonedDateTime) (bVar2 instanceof Z.b ? null : bVar2);
        Resources resources = this.f8067g;
        if (zonedDateTime == null || zonedDateTime2 == null) {
            string = "";
        } else {
            DateTimeFormatter dateTimeFormatter2 = this.f8064d;
            string = resources.getString(R.string.job_gig_snippet_shift_advert_details_start_and_end_time_format, dateTimeFormatter2.format(zonedDateTime), dateTimeFormatter2.format(zonedDateTime2));
        }
        return str3 != null ? resources.getString(R.string.job_gig_snippet_shift_price_postfix, string, str3) : string;
    }

    @Override // com.avito.android.gig_snippet.a
    @l
    public final Long c(@l String str) {
        Object bVar;
        Instant instant;
        if (str == null) {
            return null;
        }
        try {
            int i12 = Z.f406624c;
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(str, this.f8061a);
            bVar = (zonedDateTime == null || (instant = zonedDateTime.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (Long) (bVar instanceof Z.b ? null : bVar);
    }

    @Override // com.avito.android.gig_snippet.a
    @l
    public final Date d(@k String str) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = new Date(ZonedDateTime.parse(str, this.f8061a).toInstant().toEpochMilli());
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (Date) bVar;
    }

    @Override // com.avito.android.gig_snippet.a
    @k
    public final String e(@k String str, @k String str2, @l String str3, boolean z12) {
        Object bVar;
        Object bVar2;
        String string;
        DateTimeFormatter dateTimeFormatter = this.f8061a;
        try {
            int i12 = Z.f406624c;
            bVar = ZonedDateTime.parse(str, dateTimeFormatter);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) bVar;
        try {
            bVar2 = ZonedDateTime.parse(str2, dateTimeFormatter);
        } catch (Throwable th3) {
            int i14 = Z.f406624c;
            bVar2 = new Z.b(th3);
        }
        ZonedDateTime zonedDateTime2 = (ZonedDateTime) (bVar2 instanceof Z.b ? null : bVar2);
        Resources resources = this.f8067g;
        if (zonedDateTime == null || zonedDateTime2 == null) {
            string = "";
        } else {
            boolean zF2 = L.f(Integer.valueOf(zonedDateTime.getDayOfYear()), Integer.valueOf(zonedDateTime2.getDayOfYear()));
            DateTimeFormatter dateTimeFormatter2 = this.f8064d;
            string = zF2 ? resources.getString(R.string.job_gig_snippet_shift_today_format, h(zonedDateTime), dateTimeFormatter2.format(zonedDateTime), dateTimeFormatter2.format(zonedDateTime2)) : resources.getString(R.string.job_gig_snippet_shift_start_and_end_time_format, resources.getString(R.string.job_gig_snippet_shift_time_and_date_format, h(zonedDateTime), dateTimeFormatter2.format(zonedDateTime)), resources.getString(R.string.job_gig_snippet_shift_time_and_date_format, h(zonedDateTime2), dateTimeFormatter2.format(zonedDateTime2)));
        }
        return str3 != null ? resources.getString(R.string.job_gig_snippet_shift_price_postfix, string, str3) : z12 ? resources.getString(R.string.job_gig_snippet_shift_price_postfix, string, "") : string;
    }

    @Override // com.avito.android.gig_snippet.a
    @l
    public final String f(@l String str) {
        Object bVar;
        if (str == null) {
            return null;
        }
        try {
            int i12 = Z.f406624c;
            bVar = ZonedDateTime.parse(str, this.f8061a);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return this.f8063c.format((ZonedDateTime) (bVar instanceof Z.b ? null : bVar));
    }

    @Override // com.avito.android.gig_snippet.a
    @k
    public final String g(@l String str) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = this.f8066f.format(ZonedDateTime.parse(str, this.f8062b));
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        String str2 = (String) bVar;
        return str2 == null ? "" : str2;
    }

    public final String h(ZonedDateTime zonedDateTime) {
        int dayOfYear = zonedDateTime.getDayOfYear();
        int dayOfYear2 = ZonedDateTime.now().getDayOfYear();
        Resources resources = this.f8067g;
        return dayOfYear == dayOfYear2 ? resources.getString(R.string.job_gig_snippet_shift_today) : zonedDateTime.getDayOfYear() == ZonedDateTime.now().plusDays(1L).getDayOfYear() ? resources.getString(R.string.job_gig_snippet_shift_tomorrow) : this.f8065e.format(zonedDateTime);
    }
}
