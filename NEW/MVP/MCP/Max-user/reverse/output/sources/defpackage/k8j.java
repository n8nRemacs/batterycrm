package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public abstract class k8j {
    public static final Widget a(ytd ytdVar, String str, Widget widget) {
        Widget widgetM37findWidgetqk3jasM$arch_release;
        Iterator it = ytdVar.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            c54 c54Var = ((bud) f2Var.next()).a;
            Widget widget2 = c54Var instanceof Widget ? (Widget) c54Var : null;
            widgetM37findWidgetqk3jasM$arch_release = widget2 != null ? widget2.m37findWidgetqk3jasM$arch_release(str, widget) : null;
            if (widgetM37findWidgetqk3jasM$arch_release != null && widgetM37findWidgetqk3jasM$arch_release != widget) {
                break;
            }
        }
        return widgetM37findWidgetqk3jasM$arch_release;
    }

    public static final c54 b(ytd ytdVar) {
        bud budVarA = ytdVar.a.a();
        if (budVarA != null) {
            return budVarA.a;
        }
        return null;
    }

    public static String c(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }
}
