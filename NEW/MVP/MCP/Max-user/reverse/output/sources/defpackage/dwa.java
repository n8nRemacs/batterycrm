package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.Size;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.tamtam.themes.IncorrectThemeVersionException;
import ru.ok.tamtam.themes.ParseThemeJsonException;

/* loaded from: classes2.dex */
public abstract class dwa {
    public static volatile rl a;
    public static final nme b = new nme("CRASH_REPORT", 1);

    public static final qp6 a(Context context) throws Resources.NotFoundException {
        Size sizeA = i9j.a(context);
        imb imbVar = context.getResources().getConfiguration().orientation == 1 ? new imb(Integer.valueOf(sizeA.getWidth()), Integer.valueOf(sizeA.getHeight())) : new imb(Integer.valueOf(sizeA.getHeight()), Integer.valueOf(sizeA.getWidth()));
        int iIntValue = ((Number) imbVar.a).intValue();
        int iIntValue2 = ((Number) imbVar.b).intValue();
        int iMax = Math.max(3, iIntValue / context.getResources().getDimensionPixelSize(fab.a));
        int i = iIntValue / iMax;
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        int iC = kti.c(((sizeA.getWidth() / iMax) - ((iMax - 1) * iD)) * 0.7d);
        int iC2 = kti.c(Math.ceil(((iIntValue2 * iMax) / i) * 1.8d));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fab.b);
        return new qp6(i, iC2, iMax, iD, iC, dimensionPixelSize <= 0 ? null : new ynd(dimensionPixelSize, dimensionPixelSize));
    }

    public static int b(JSONObject jSONObject, String str, int i) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0) {
            return i;
        }
        try {
            if (strOptString.length() == 7) {
                strOptString = "#FF".concat(vmf.M(strOptString, "#"));
            }
            return Color.parseColor(strOptString);
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/color: error while parse color by key ".concat(str), th);
        }
    }

    public static q1g c(String str, String str2) throws JSONException {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("version");
            if (i > 1) {
                throw new IncorrectThemeVersionException();
            }
            boolean z = jSONObject.getBoolean("night");
            q1g q1gVar = z ? mha.e0 : bq4.e0;
            JSONObject jSONObject2 = jSONObject.getJSONObject("colors");
            String string = jSONObject.getString("title");
            sf3 sf3Var = new sf3(b(jSONObject2, "accent", q1gVar.k), b(jSONObject2, "accentText", q1gVar.l), b(jSONObject2, "background", q1gVar.m), b(jSONObject2, "bubbleBorder", q1gVar.p), b(jSONObject2, "bubbleBorderHighLight", q1gVar.n), b(jSONObject2, "bubbleClickableBackground", q1gVar.o), b(jSONObject2, "bubbleControlBackground", q1gVar.q), b(jSONObject2, "bubbleControlsText", q1gVar.s), b(jSONObject2, "bubbleDecoratorBackground", q1gVar.r), b(jSONObject2, "bubbleDecoratorText", q1gVar.t), b(jSONObject2, "bubbleOuterBorder", q1gVar.u), b(jSONObject2, "bubbleSecondaryText", q1gVar.v), b(jSONObject2, "buttonTint", q1gVar.w), b(jSONObject2, "chatBackground", q1gVar.x), b(jSONObject2, "destructive", q1gVar.y), b(jSONObject2, "lightBadgeBackground", q1gVar.z), b(jSONObject2, "highlightBackground", q1gVar.A), b(jSONObject2, "incomingBubbleBackground", q1gVar.B), b(jSONObject2, "incomingBubbleBackgroundHighlighted", q1gVar.C), b(jSONObject2, "outgoingBubbleBackground", q1gVar.D), b(jSONObject2, "outgoingBubbleBackgroundHighlighted", q1gVar.E), b(jSONObject2, "primaryText", q1gVar.F), b(jSONObject2, "profileBackground", q1gVar.G), b(jSONObject2, "secondaryBackground", q1gVar.H), b(jSONObject2, "secondaryButton", q1gVar.I), b(jSONObject2, "secondaryText", q1gVar.J), b(jSONObject2, "separatorBackground", q1gVar.K), b(jSONObject2, "statusBarBackground", q1gVar.L), b(jSONObject2, "tertiaryText", q1gVar.M), b(jSONObject2, "toolBarBackground", q1gVar.N), b(jSONObject2, "unreadBackground", q1gVar.O), b(jSONObject2, "unreadBackgroundMuted", q1gVar.P), b(jSONObject2, "unreadText", q1gVar.Q), b(jSONObject2, "callAccent", q1gVar.R), b(jSONObject2, "callBackground", q1gVar.S), b(jSONObject2, "callControl", q1gVar.T), b(jSONObject2, "groupCallBackground", q1gVar.U), e(jSONObject2, "switchThumb", q1gVar.V), e(jSONObject2, "switchThumbChecked", q1gVar.W), e(jSONObject2, "switchTrack", q1gVar.X), e(jSONObject2, "switchTrackChecked", q1gVar.Y), e(jSONObject2, "switchTint", q1gVar.Z));
            String string2 = jSONObject.getString("author");
            if (str2 == null) {
                str3 = string + ".ttstyle";
            } else {
                str3 = str2;
            }
            return new q1g(string, string2, z, i, str3, sf3Var, lcj.Y, lcj.X);
        } catch (JSONException e) {
            throw new ParseThemeJsonException(e);
        }
    }

    public static synchronized void d(rl rlVar) {
        if (a != null) {
            throw new IllegalStateException(dwa.class.getName().concat(" is already initialized"));
        }
        a = rlVar;
        OneLogImpl oneLogImpl = OneLogImpl.getInstance();
        oneLogImpl.attachApiClient(a);
        oneLogImpl.setUploadJobId(15261);
    }

    public static Integer e(JSONObject jSONObject, String str, Integer num) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0) {
            return num;
        }
        try {
            if (strOptString.length() == 7) {
                strOptString = "#FF".concat(vmf.M(strOptString, "#"));
            }
            return Integer.valueOf(Color.parseColor(strOptString));
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/optColor: error while parse color by key ".concat(str), th);
        }
    }
}
