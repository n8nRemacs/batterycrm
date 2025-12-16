package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.media3.common.S;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.common.base.C37257c;
import j.InterfaceC42156l;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ColorParser.java */
@J
/* renamed from: androidx.media3.common.util.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23117h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f47904a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f47905b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f47906c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f47907d;

    static {
        HashMap map = new HashMap();
        f47907d = map;
        S.e(-984833, map, "aliceblue", -332841, "antiquewhite");
        S.d(-8388652, -16711681, "aqua", "aquamarine", map);
        S.e(-983041, map, "azure", -657956, "beige");
        S.e(-6972, map, "bisque", -16777216, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        S.e(-5171, map, "blanchedalmond", -16776961, "blue");
        S.e(-7722014, map, "blueviolet", -5952982, "brown");
        S.e(-2180985, map, "burlywood", -10510688, "cadetblue");
        S.e(-8388864, map, "chartreuse", -2987746, "chocolate");
        S.e(-32944, map, "coral", -10185235, "cornflowerblue");
        S.e(-1828, map, "cornsilk", -2354116, "crimson");
        S.d(-16777077, -16711681, "cyan", "darkblue", map);
        S.e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        S.d(-16751616, -5658199, "darkgray", "darkgreen", map);
        S.d(-4343957, -5658199, "darkgrey", "darkkhaki", map);
        S.e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        S.e(-29696, map, "darkorange", -6737204, "darkorchid");
        S.e(-7667712, map, "darkred", -1468806, "darksalmon");
        S.e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        S.d(-7077677, -16724271, "darkturquoise", "darkviolet", map);
        S.e(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        S.d(-5103070, -14774017, "dodgerblue", "firebrick", map);
        S.e(-1296, map, "floralwhite", -14513374, "forestgreen");
        S.d(-2302756, -65281, "fuchsia", "gainsboro", map);
        S.e(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        S.e(-16744448, map, "green", -5374161, "greenyellow");
        S.d(-983056, -8355712, "grey", "honeydew", map);
        S.e(-38476, map, "hotpink", -3318692, "indianred");
        S.e(-11861886, map, "indigo", -16, "ivory");
        S.e(-989556, map, "khaki", -1644806, "lavender");
        S.e(-3851, map, "lavenderblush", -8586240, "lawngreen");
        S.e(-1331, map, "lemonchiffon", -5383962, "lightblue");
        S.e(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        S.e(-18751, map, "lightpink", -24454, "lightsalmon");
        S.e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        S.d(-32, -5192482, "lightsteelblue", "lightyellow", map);
        S.e(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        S.e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        S.e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        S.e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        S.e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        S.e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        S.e(-15132304, map, "midnightblue", -655366, "mintcream");
        S.e(-6943, map, "mistyrose", -6987, "moccasin");
        S.e(-8531, map, "navajowhite", -16777088, "navy");
        S.e(-133658, map, "oldlace", -8355840, "olive");
        S.e(-9728477, map, "olivedrab", -23296, "orange");
        S.e(-47872, map, "orangered", -2461482, "orchid");
        S.e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        S.e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        S.e(-4139, map, "papayawhip", -9543, "peachpuff");
        S.e(-3308225, map, "peru", -16181, "pink");
        S.e(-2252579, map, "plum", -5185306, "powderblue");
        S.e(-8388480, map, "purple", -10079335, "rebeccapurple");
        S.e(-65536, map, "red", -4419697, "rosybrown");
        S.e(-12490271, map, "royalblue", -7650029, "saddlebrown");
        S.e(-360334, map, "salmon", -744352, "sandybrown");
        S.e(-13726889, map, "seagreen", -2578, "seashell");
        S.e(-6270419, map, "sienna", -4144960, "silver");
        S.e(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        S.d(-16711809, -1286, "snow", "springgreen", map);
        S.e(-12156236, map, "steelblue", -2968436, "tan");
        S.e(-16744320, map, "teal", -2572328, "thistle");
        S.e(-40121, map, "tomato", 0, "transparent");
        S.e(-12525360, map, "turquoise", -1146130, "violet");
        S.e(-663885, map, "wheat", -1, "white");
        S.e(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    @InterfaceC42156l
    public static int a(String str, boolean z12) {
        int iB2;
        C23110a.b(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i12 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i12;
            }
            if (strReplace.length() == 9) {
                return ((i12 & 255) << 24) | (i12 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z12 ? f47906c : f47905b).matcher(strReplace);
            if (matcher.matches()) {
                if (z12) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    iB2 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    iB2 = S.b(matcher, 4, 10);
                }
                return Color.argb(iB2, S.b(matcher, 1, 10), S.b(matcher, 2, 10), S.b(matcher, 3, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f47904a.matcher(strReplace);
            if (matcher2.matches()) {
                int iB3 = S.b(matcher2, 1, 10);
                int iB4 = S.b(matcher2, 2, 10);
                String strGroup2 = matcher2.group(3);
                strGroup2.getClass();
                return Color.rgb(iB3, iB4, Integer.parseInt(strGroup2, 10));
            }
        } else {
            Integer num = (Integer) f47907d.get(C37257c.b(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
