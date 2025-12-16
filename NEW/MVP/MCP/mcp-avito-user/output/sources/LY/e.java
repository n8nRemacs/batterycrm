package LY;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.server_time.f;
import com.avito.android.server_time.i;
import com.avito.android.util.InterfaceC35945t1;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: UserOnlineStatusFormatter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"LLY/e;", "Lcom/avito/android/util/t1;", "Lru/avito/messenger/api/entity/UserLastActivity;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements InterfaceC35945t1<UserLastActivity> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f9983a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f9984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDateFormat f9985c;

    public e(@k Resources resources, @k f fVar, @k Locale locale) {
        this.f9983a = resources;
        this.f9984b = fVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(resources.getString(R.string.messenger_online_status_last_activity_date_format), locale);
        this.f9985c = simpleDateFormat;
        simpleDateFormat.setTimeZone(fVar.getF274002b());
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(UserLastActivity userLastActivity) {
        UserLastActivity userLastActivity2 = userLastActivity;
        if (userLastActivity2 == null) {
            return "";
        }
        Long lastActionTime = userLastActivity2.getLastActionTime();
        long jA2 = lastActionTime != null ? i.a(this.f9984b) - lastActionTime.longValue() : Long.MAX_VALUE;
        if (jA2 < 0) {
            Long lastActionTime2 = userLastActivity2.getLastActionTime();
            return b(lastActionTime2 != null ? lastActionTime2.longValue() : 0L);
        }
        Resources resources = this.f9983a;
        if (jA2 <= 150) {
            return resources.getString(R.string.messenger_online_status_online);
        }
        if (jA2 < TimeUnit.MINUTES.toSeconds(60L)) {
            return resources.getString(R.string.messenger_online_status_minutes_ago, Long.valueOf(TimeUnit.SECONDS.toMinutes(jA2)));
        }
        if (jA2 < TimeUnit.HOURS.toSeconds(24L)) {
            return resources.getString(R.string.messenger_online_status_hours_ago, Long.valueOf(TimeUnit.SECONDS.toHours(jA2)));
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (jA2 < timeUnit.toSeconds(2L)) {
            return resources.getString(R.string.messenger_online_status_one_day_ago);
        }
        if (jA2 < timeUnit.toSeconds(5L)) {
            return resources.getString(R.string.messenger_online_status_few_days_ago, Long.valueOf(TimeUnit.SECONDS.toDays(jA2)));
        }
        if (jA2 < timeUnit.toSeconds(8L)) {
            return resources.getString(R.string.messenger_online_status_many_days_ago, Long.valueOf(TimeUnit.SECONDS.toDays(jA2)));
        }
        if (jA2 >= timeUnit.toSeconds(31L)) {
            return resources.getString(R.string.messenger_online_status_more_than_month_ago);
        }
        Long lastActionTime3 = userLastActivity2.getLastActionTime();
        return b(lastActionTime3 != null ? lastActionTime3.longValue() : 0L);
    }

    public final String b(long j12) {
        if (j12 <= 0) {
            return "";
        }
        return this.f9983a.getString(R.string.messenger_online_status_last_activity_date, this.f9985c.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j12))));
    }
}
