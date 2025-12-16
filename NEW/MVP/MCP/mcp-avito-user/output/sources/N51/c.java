package N51;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f11205a = new Locale("RU");

    public static String a() {
        StringBuilder sb2 = new StringBuilder(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", f11205a).format(Calendar.getInstance().getTime()));
        sb2.insert(sb2.length() - 2, ":");
        return sb2.toString();
    }
}
