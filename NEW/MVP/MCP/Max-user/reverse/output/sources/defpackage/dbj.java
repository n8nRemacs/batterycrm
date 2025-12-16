package defpackage;

import android.util.Log;
import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class dbj {
    public static void a(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static g6f b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        g6f g6fVar;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                Log.w("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
                cri.a("SoLoader", "Corrupted lib name detected");
                g6fVar = new e6f(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                g6fVar = new g6f(str, unsatisfiedLinkError.toString());
            }
        } else {
            cri.a("SoLoader", "Corrupted lib file detected");
            g6fVar = new e6f(str, unsatisfiedLinkError.toString());
        }
        g6fVar.initCause(unsatisfiedLinkError);
        return g6fVar;
    }

    public static int c(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return BuildConfig.FILE_LENGTH_TO_UPLOAD;
            case 11:
                return 16000;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return 7000;
            default:
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return 3062500;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return 8000;
                    case 16:
                        return 256000;
                    case LangUtils.HASH_SEED /* 17 */:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
