package LY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.server_time.f;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.K;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.text.C43044a;

/* compiled from: MessageDateFormatter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LLY/b;", "Lcom/avito/android/util/t1;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J41.c
/* loaded from: classes15.dex */
public final class b implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f9976a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Locale f9977b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9978c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f9979d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDateFormat f9980e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDateFormat f9981f;

    public b(@k f fVar, @k Locale locale, @k String str, @k String str2, @k String str3, @k String str4) {
        this.f9976a = fVar;
        this.f9977b = locale;
        this.f9978c = str;
        this.f9979d = str4;
        this.f9980e = new SimpleDateFormat(str2, locale);
        this.f9981f = new SimpleDateFormat(str3, locale);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@l Long l12) {
        String str;
        if (l12 == null) {
            return "";
        }
        long jLongValue = l12.longValue();
        f fVar = this.f9976a;
        TimeZone f274002b = fVar.getF274002b();
        Locale locale = this.f9977b;
        Calendar calendar = Calendar.getInstance(f274002b, locale);
        calendar.setTimeInMillis(fVar.now());
        K.a(calendar);
        SimpleDateFormat simpleDateFormat = this.f9980e;
        simpleDateFormat.setTimeZone(f274002b);
        SimpleDateFormat simpleDateFormat2 = this.f9981f;
        simpleDateFormat2.setTimeZone(f274002b);
        long timeInMillis = calendar.getTimeInMillis() - jLongValue;
        if (-86399999 <= timeInMillis && timeInMillis < 1) {
            str = this.f9978c;
        } else if (1 > timeInMillis || timeInMillis >= 604800001) {
            str = simpleDateFormat2.format(l12) + ' ' + this.f9979d;
        } else {
            str = simpleDateFormat.format(l12);
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.f(cCharAt, locale) : String.valueOf(cCharAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
