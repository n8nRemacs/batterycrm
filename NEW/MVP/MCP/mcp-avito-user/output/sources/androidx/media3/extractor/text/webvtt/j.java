package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import com.google.common.base.C37262f;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
@J
/* loaded from: classes.dex */
public final class j {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i12 = M.f47887a;
        String[] strArrSplit = str.split("\\.", 2);
        long j12 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j12 = (j12 * 60) + Long.parseLong(str2);
        }
        long j13 = j12 * 1000;
        if (strArrSplit.length == 2) {
            j13 += Long.parseLong(strArrSplit[1]);
        }
        return j13 * 1000;
    }

    public static void c(z zVar) throws ParserException {
        int i12 = zVar.f47963b;
        Charset charset = C37262f.f359034c;
        String strH = zVar.h(charset);
        if (strH == null || !strH.startsWith("WEBVTT")) {
            zVar.F(i12);
            throw ParserException.a("Expected WEBVTT. Got " + zVar.h(charset), null);
        }
    }
}
