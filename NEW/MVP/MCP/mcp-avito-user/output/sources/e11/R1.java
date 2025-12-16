package e11;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class R1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Context f394472a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39882k1 f394473b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39901r0 f394474c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final t2 f394475d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public String f394476e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f394477f = true;

    public R1(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394473b = c39882k1;
        this.f394474c = c39901r0;
        this.f394472a = context;
        this.f394475d = new t2(c39882k1, c39901r0, context);
    }

    @j.P
    public static String a(@j.P String str, @j.P String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(str2);
            if (sb2.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int iStart = matcher.start();
                    sb2.delete(iStart, matcher.end());
                    sb2.insert(iStart, "<script src=\"" + str + "\"></script>");
                    return sb2.toString();
                }
            }
        }
        return null;
    }

    @j.P
    public static String b(@j.N JSONObject jSONObject) {
        String strOptString = jSONObject.optString("src", "");
        String str = null;
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                str = new String(Base64.decode(strOptString, 0));
            } catch (Throwable unused) {
            }
            if (str != null) {
                return str;
            }
        }
        String strOptString2 = jSONObject.optString(SearchParamsConverterKt.SOURCE, "");
        return !TextUtils.isEmpty(strOptString2) ? F.a(strOptString2) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020d A[PHI: r4
  0x020d: PHI (r4v42 int) = (r4v41 int), (r4v47 int) binds: [B:77:0x01ea, B:82:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.N org.json.JSONObject r13, @j.N e11.AbstractC39895p r14) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.R1.c(org.json.JSONObject, e11.p):void");
    }

    public final void d(@j.N String str) {
        if (this.f394477f) {
            C39882k1 c39882k1 = this.f394473b;
            String str2 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0("Bad value");
            c39866f0.f394595b = str;
            c39866f0.f394596c = this.f394474c.f394772i;
            c39866f0.f394598e = this.f394476e;
            if (str2 == null) {
                str2 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str2;
            c39866f0.a(this.f394472a);
        }
    }
}
